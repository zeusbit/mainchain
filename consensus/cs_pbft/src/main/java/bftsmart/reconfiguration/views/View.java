
package bftsmart.reconfiguration.views;

import java.io.Serializable;
import java.util.Arrays;
import java.net.InetSocketAddress;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author eduardo
 */
public class View implements Serializable {
	
	private static final long serialVersionUID = 4052550874674512359L;
	
	private int id;
 	private int f;
 	private int[] processes;
 	private Map<Integer,InetSocketAddress> addresses;

 	public View(int id, int[] processes, int f, InetSocketAddress[] addresses){
 		this.id = id;
 		this.processes = processes;
 		this.addresses = new HashMap<Integer, InetSocketAddress>();

 		for(int i = 0; i < this.processes.length;i++)
 			this.addresses.put(processes[i],addresses[i]);
 		Arrays.sort(this.processes);
 		this.f = f;
 	}

 	public boolean isMember(int id){
 		for(int i = 0; i < this.processes.length;i++){
 			if(this.processes[i] == id){
 				return true;
 			}
 		}
 		return false;
 	}


 	public int getPos(int id){
 		for(int i = 0; i < this.processes.length;i++){
 			if(this.processes[i] == id){
 				return i;
 			}
 		}
 		return -1;
 	}

 	public int getId() {
 		return id;
 	}

 	public int getF() {
 		return f;
 	}

 	public int getN(){
 		return this.processes.length;
 	}

 	public int[] getProcesses() {
 		return processes;
 	}

 	@Override
 	public String toString(){
 		String ret = "ID:"+id+"; F:"+f+"; Processes:";
 		for(int i = 0; i < processes.length;i++){
 			ret = ret+processes[i]+"("+addresses.get(processes[i])+"),";
 		}

 		return ret;
 	}
 	public InetSocketAddress getAddress(int id) {
 		return addresses.get(id);
 	}
        
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof View) {
            View v = (View) obj;
//            return (this.addresses.equals(v.addresses) &&
            return (this.addresses.keySet().equals(v.addresses.keySet()) &&
                    Arrays.equals(this.processes, v.processes)
                    && this.id == v.id && this.f == v.f);
            
        }
        return false;
    }
    
    public int hashCode() {
        int hash = 1;
        hash = hash * 31 + this.id;
        hash = hash * 31 + this.f;
        if (this.processes != null) {
            for (int i = 0; i < this.processes.length; i++) hash = hash * 31 + this.processes[i];
        } else {
            hash = hash * 31 + 0;
        }
        hash = hash * 31 + this.addresses.hashCode();
        return hash;
    }
}
