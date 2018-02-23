package org.fc.brewchain.p22p.tasks

import java.util.concurrent.TimeUnit
import onight.oapi.scala.traits.OLog
import org.fc.brewchain.p22p.node.NodeInstance
import org.fc.brewchain.p22p.pbgens.P22P.PMNodeInfo
import org.fc.brewchain.p22p.pbgens.P22P.PBVoteNodeIdx
import java.math.BigInteger
import org.fc.brewchain.p22p.node.LinkNode
import org.apache.commons.lang3.StringUtils
import org.fc.brewchain.p22p.core.MessageSender
import org.fc.brewchain.p22p.pbgens.P22P.PSJoin
import onight.tfw.otransio.api.beans.FramePacket
import onight.tfw.async.CallBack
import org.fc.brewchain.p22p.pbgens.P22P.PRetJoin
import java.net.URL
import org.apache.felix.framework.URLHandlers
import org.fc.brewchain.bcapi.URLHelper
import org.fc.brewchain.p22p.action.PMNodeHelper
import org.fc.brewchain.bcapi.crypto.BitMap

//投票决定当前的节点
object VoteNodeMap extends Runnable with OLog with PMNodeHelper {
  def run() = {
    log.debug("VoteNodeMap :Run----Try to Vote Node Maps");
    Thread.currentThread().setName("VoteNodeMap");
    log.info("CurrentLinkNodes:PendingSize=" + NodeInstance.curnode.pendingNodes.size + ",DirectNodeSize=" + NodeInstance.curnode.directNode.size);
    val vbody = PBVoteNodeIdx.newBuilder();
    var bits = NodeInstance.curnode.node_bits;
    val votebody = PBVoteNodeIdx.newBuilder(); //

    NodeInstance.curnode.pendingNodes.values.map(n =>
      if (bits.testBit(n.try_node_idx)) {
        log.debug("error in try_node_idx @n=" + n.name + ",try=" + n.try_node_idx + ",bits=" + bits);
      } else { //no pub keys
        bits = bits.setBit(n.try_node_idx);
        votebody.addNodes(toPMNode(n));
      })

    votebody.setNodeBitsEnc(BitMap.hexToMapping(bits))
    log.info("vote -- Nodes:" + votebody);
    NodeInstance.curnode.directNode.values.map { pn =>
      val n = pn.asInstanceOf[LinkNode];
      MessageSender.sendMessage("Vote PZP", votebody.build(), n, new CallBack[FramePacket] {
        def onSuccess(fp: FramePacket) = {
          log.debug("send JINPZP success:to " + n.uri + ",body=" + fp.getBody)
          val retjoin = PRetJoin.newBuilder().mergeFrom(fp.getBody);
          log.debug("get nodes:" + retjoin);
        }
        def onFailed(e: java.lang.Exception, fp: FramePacket) {

        }
      });
    }
    //vbody.setNodeBitsEnc(bits.toString(16));

    Thread.sleep((Math.random() * 10000).asInstanceOf[Int]);

    log.debug("LayerNodeTask:Run-----[END]"); //256台机器，
  }
  //Scheduler.scheduleWithFixedDelay(new Runnable, initialDelay, delay, unit)
  def main(args: Array[String]): Unit = {
    URLHelper.init()
    //System.setProperty("java.protocol.handler.pkgs", "org.fc.brewchain.bcapi.url");
    println(new URL("tcp://127.0.0.1:5100").getHost);
  }
}