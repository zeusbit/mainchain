package onight.act.ordbgens.act.entity;

import java.math.BigDecimal;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import onight.tfw.ojpa.api.annotations.Tab;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@Tab(name="T_ACT_TRANS_LOGS_HIS")
@AllArgsConstructor
@NoArgsConstructor
public class TActTransLogsHis extends TActTransLogsHisKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_ACT_TRANS_LOGS_HIS.SETT_DATE
     *
     * @mbggenerated Tue Jan 19 22:41:13 CST 2016
     */
    private String settDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_ACT_TRANS_LOGS_HIS.CONS_DATE
     *
     * @mbggenerated Tue Jan 19 22:41:13 CST 2016
     */
    private String consDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_ACT_TRANS_LOGS_HIS.TX_SNO
     *
     * @mbggenerated Tue Jan 19 22:41:13 CST 2016
     */
    private String txSno;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_ACT_TRANS_LOGS_HIS.TRANS_CODE
     *
     * @mbggenerated Tue Jan 19 22:41:13 CST 2016
     */
    private String transCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_ACT_TRANS_LOGS_HIS.SUB_TRANS_CODE
     *
     * @mbggenerated Tue Jan 19 22:41:13 CST 2016
     */
    private String subTransCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_ACT_TRANS_LOGS_HIS.BIZ_TYPE
     *
     * @mbggenerated Tue Jan 19 22:41:13 CST 2016
     */
    private String bizType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_ACT_TRANS_LOGS_HIS.BIZ_DTL_TYPE
     *
     * @mbggenerated Tue Jan 19 22:41:13 CST 2016
     */
    private String bizDtlType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_ACT_TRANS_LOGS_HIS.FROM_FUND_NO
     *
     * @mbggenerated Tue Jan 19 22:41:13 CST 2016
     */
    private String fromFundNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_ACT_TRANS_LOGS_HIS.TO_FUND_NO
     *
     * @mbggenerated Tue Jan 19 22:41:13 CST 2016
     */
    private String toFundNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_ACT_TRANS_LOGS_HIS.DC_TYPE
     *
     * @mbggenerated Tue Jan 19 22:41:13 CST 2016
     */
    private String dcType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_ACT_TRANS_LOGS_HIS.AMT
     *
     * @mbggenerated Tue Jan 19 22:41:13 CST 2016
     */
    private BigDecimal amt;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_ACT_TRANS_LOGS_HIS.CNT
     *
     * @mbggenerated Tue Jan 19 22:41:13 CST 2016
     */
    private Integer cnt;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_ACT_TRANS_LOGS_HIS.FLAG_CANCEL
     *
     * @mbggenerated Tue Jan 19 22:41:13 CST 2016
     */
    private String flagCancel;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_ACT_TRANS_LOGS_HIS.RELATED_TRANS_ID
     *
     * @mbggenerated Tue Jan 19 22:41:13 CST 2016
     */
    private String relatedTransId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_ACT_TRANS_LOGS_HIS.STATUS
     *
     * @mbggenerated Tue Jan 19 22:41:13 CST 2016
     */
    private String status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_ACT_TRANS_LOGS_HIS.ACT_BAL_AFTER
     *
     * @mbggenerated Tue Jan 19 22:41:13 CST 2016
     */
    private BigDecimal actBalAfter;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_ACT_TRANS_LOGS_HIS.ACT_BAL_BEFORE
     *
     * @mbggenerated Tue Jan 19 22:41:13 CST 2016
     */
    private BigDecimal actBalBefore;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_ACT_TRANS_LOGS_HIS.EXT_ID1
     *
     * @mbggenerated Tue Jan 19 22:41:13 CST 2016
     */
    private String extId1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_ACT_TRANS_LOGS_HIS.EXT_ID2
     *
     * @mbggenerated Tue Jan 19 22:41:13 CST 2016
     */
    private String extId2;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_ACT_TRANS_LOGS_HIS.EXT_COMMETS
     *
     * @mbggenerated Tue Jan 19 22:41:13 CST 2016
     */
    private String extCommets;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_ACT_TRANS_LOGS_HIS.CREATE_TIME
     *
     * @mbggenerated Tue Jan 19 22:41:13 CST 2016
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_ACT_TRANS_LOGS_HIS.UPDATE_TIME
     *
     * @mbggenerated Tue Jan 19 22:41:13 CST 2016
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_ACT_TRANS_LOGS_HIS.SETT_DATE
     *
     * @return the value of T_ACT_TRANS_LOGS_HIS.SETT_DATE
     *
     * @mbggenerated Tue Jan 19 22:41:13 CST 2016
     */
    public String getSettDate() {
        return settDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_ACT_TRANS_LOGS_HIS.SETT_DATE
     *
     * @param settDate the value for T_ACT_TRANS_LOGS_HIS.SETT_DATE
     *
     * @mbggenerated Tue Jan 19 22:41:13 CST 2016
     */
    public void setSettDate(String settDate) {
        this.settDate = settDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_ACT_TRANS_LOGS_HIS.CONS_DATE
     *
     * @return the value of T_ACT_TRANS_LOGS_HIS.CONS_DATE
     *
     * @mbggenerated Tue Jan 19 22:41:13 CST 2016
     */
    public String getConsDate() {
        return consDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_ACT_TRANS_LOGS_HIS.CONS_DATE
     *
     * @param consDate the value for T_ACT_TRANS_LOGS_HIS.CONS_DATE
     *
     * @mbggenerated Tue Jan 19 22:41:13 CST 2016
     */
    public void setConsDate(String consDate) {
        this.consDate = consDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_ACT_TRANS_LOGS_HIS.TX_SNO
     *
     * @return the value of T_ACT_TRANS_LOGS_HIS.TX_SNO
     *
     * @mbggenerated Tue Jan 19 22:41:13 CST 2016
     */
    public String getTxSno() {
        return txSno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_ACT_TRANS_LOGS_HIS.TX_SNO
     *
     * @param txSno the value for T_ACT_TRANS_LOGS_HIS.TX_SNO
     *
     * @mbggenerated Tue Jan 19 22:41:13 CST 2016
     */
    public void setTxSno(String txSno) {
        this.txSno = txSno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_ACT_TRANS_LOGS_HIS.TRANS_CODE
     *
     * @return the value of T_ACT_TRANS_LOGS_HIS.TRANS_CODE
     *
     * @mbggenerated Tue Jan 19 22:41:13 CST 2016
     */
    public String getTransCode() {
        return transCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_ACT_TRANS_LOGS_HIS.TRANS_CODE
     *
     * @param transCode the value for T_ACT_TRANS_LOGS_HIS.TRANS_CODE
     *
     * @mbggenerated Tue Jan 19 22:41:13 CST 2016
     */
    public void setTransCode(String transCode) {
        this.transCode = transCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_ACT_TRANS_LOGS_HIS.SUB_TRANS_CODE
     *
     * @return the value of T_ACT_TRANS_LOGS_HIS.SUB_TRANS_CODE
     *
     * @mbggenerated Tue Jan 19 22:41:13 CST 2016
     */
    public String getSubTransCode() {
        return subTransCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_ACT_TRANS_LOGS_HIS.SUB_TRANS_CODE
     *
     * @param subTransCode the value for T_ACT_TRANS_LOGS_HIS.SUB_TRANS_CODE
     *
     * @mbggenerated Tue Jan 19 22:41:13 CST 2016
     */
    public void setSubTransCode(String subTransCode) {
        this.subTransCode = subTransCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_ACT_TRANS_LOGS_HIS.BIZ_TYPE
     *
     * @return the value of T_ACT_TRANS_LOGS_HIS.BIZ_TYPE
     *
     * @mbggenerated Tue Jan 19 22:41:13 CST 2016
     */
    public String getBizType() {
        return bizType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_ACT_TRANS_LOGS_HIS.BIZ_TYPE
     *
     * @param bizType the value for T_ACT_TRANS_LOGS_HIS.BIZ_TYPE
     *
     * @mbggenerated Tue Jan 19 22:41:13 CST 2016
     */
    public void setBizType(String bizType) {
        this.bizType = bizType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_ACT_TRANS_LOGS_HIS.BIZ_DTL_TYPE
     *
     * @return the value of T_ACT_TRANS_LOGS_HIS.BIZ_DTL_TYPE
     *
     * @mbggenerated Tue Jan 19 22:41:13 CST 2016
     */
    public String getBizDtlType() {
        return bizDtlType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_ACT_TRANS_LOGS_HIS.BIZ_DTL_TYPE
     *
     * @param bizDtlType the value for T_ACT_TRANS_LOGS_HIS.BIZ_DTL_TYPE
     *
     * @mbggenerated Tue Jan 19 22:41:13 CST 2016
     */
    public void setBizDtlType(String bizDtlType) {
        this.bizDtlType = bizDtlType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_ACT_TRANS_LOGS_HIS.FROM_FUND_NO
     *
     * @return the value of T_ACT_TRANS_LOGS_HIS.FROM_FUND_NO
     *
     * @mbggenerated Tue Jan 19 22:41:13 CST 2016
     */
    public String getFromFundNo() {
        return fromFundNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_ACT_TRANS_LOGS_HIS.FROM_FUND_NO
     *
     * @param fromFundNo the value for T_ACT_TRANS_LOGS_HIS.FROM_FUND_NO
     *
     * @mbggenerated Tue Jan 19 22:41:13 CST 2016
     */
    public void setFromFundNo(String fromFundNo) {
        this.fromFundNo = fromFundNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_ACT_TRANS_LOGS_HIS.TO_FUND_NO
     *
     * @return the value of T_ACT_TRANS_LOGS_HIS.TO_FUND_NO
     *
     * @mbggenerated Tue Jan 19 22:41:13 CST 2016
     */
    public String getToFundNo() {
        return toFundNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_ACT_TRANS_LOGS_HIS.TO_FUND_NO
     *
     * @param toFundNo the value for T_ACT_TRANS_LOGS_HIS.TO_FUND_NO
     *
     * @mbggenerated Tue Jan 19 22:41:13 CST 2016
     */
    public void setToFundNo(String toFundNo) {
        this.toFundNo = toFundNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_ACT_TRANS_LOGS_HIS.DC_TYPE
     *
     * @return the value of T_ACT_TRANS_LOGS_HIS.DC_TYPE
     *
     * @mbggenerated Tue Jan 19 22:41:13 CST 2016
     */
    public String getDcType() {
        return dcType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_ACT_TRANS_LOGS_HIS.DC_TYPE
     *
     * @param dcType the value for T_ACT_TRANS_LOGS_HIS.DC_TYPE
     *
     * @mbggenerated Tue Jan 19 22:41:13 CST 2016
     */
    public void setDcType(String dcType) {
        this.dcType = dcType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_ACT_TRANS_LOGS_HIS.AMT
     *
     * @return the value of T_ACT_TRANS_LOGS_HIS.AMT
     *
     * @mbggenerated Tue Jan 19 22:41:13 CST 2016
     */
    public BigDecimal getAmt() {
        return amt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_ACT_TRANS_LOGS_HIS.AMT
     *
     * @param amt the value for T_ACT_TRANS_LOGS_HIS.AMT
     *
     * @mbggenerated Tue Jan 19 22:41:13 CST 2016
     */
    public void setAmt(BigDecimal amt) {
        this.amt = amt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_ACT_TRANS_LOGS_HIS.CNT
     *
     * @return the value of T_ACT_TRANS_LOGS_HIS.CNT
     *
     * @mbggenerated Tue Jan 19 22:41:13 CST 2016
     */
    public Integer getCnt() {
        return cnt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_ACT_TRANS_LOGS_HIS.CNT
     *
     * @param cnt the value for T_ACT_TRANS_LOGS_HIS.CNT
     *
     * @mbggenerated Tue Jan 19 22:41:13 CST 2016
     */
    public void setCnt(Integer cnt) {
        this.cnt = cnt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_ACT_TRANS_LOGS_HIS.FLAG_CANCEL
     *
     * @return the value of T_ACT_TRANS_LOGS_HIS.FLAG_CANCEL
     *
     * @mbggenerated Tue Jan 19 22:41:13 CST 2016
     */
    public String getFlagCancel() {
        return flagCancel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_ACT_TRANS_LOGS_HIS.FLAG_CANCEL
     *
     * @param flagCancel the value for T_ACT_TRANS_LOGS_HIS.FLAG_CANCEL
     *
     * @mbggenerated Tue Jan 19 22:41:13 CST 2016
     */
    public void setFlagCancel(String flagCancel) {
        this.flagCancel = flagCancel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_ACT_TRANS_LOGS_HIS.RELATED_TRANS_ID
     *
     * @return the value of T_ACT_TRANS_LOGS_HIS.RELATED_TRANS_ID
     *
     * @mbggenerated Tue Jan 19 22:41:13 CST 2016
     */
    public String getRelatedTransId() {
        return relatedTransId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_ACT_TRANS_LOGS_HIS.RELATED_TRANS_ID
     *
     * @param relatedTransId the value for T_ACT_TRANS_LOGS_HIS.RELATED_TRANS_ID
     *
     * @mbggenerated Tue Jan 19 22:41:13 CST 2016
     */
    public void setRelatedTransId(String relatedTransId) {
        this.relatedTransId = relatedTransId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_ACT_TRANS_LOGS_HIS.STATUS
     *
     * @return the value of T_ACT_TRANS_LOGS_HIS.STATUS
     *
     * @mbggenerated Tue Jan 19 22:41:13 CST 2016
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_ACT_TRANS_LOGS_HIS.STATUS
     *
     * @param status the value for T_ACT_TRANS_LOGS_HIS.STATUS
     *
     * @mbggenerated Tue Jan 19 22:41:13 CST 2016
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_ACT_TRANS_LOGS_HIS.ACT_BAL_AFTER
     *
     * @return the value of T_ACT_TRANS_LOGS_HIS.ACT_BAL_AFTER
     *
     * @mbggenerated Tue Jan 19 22:41:13 CST 2016
     */
    public BigDecimal getActBalAfter() {
        return actBalAfter;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_ACT_TRANS_LOGS_HIS.ACT_BAL_AFTER
     *
     * @param actBalAfter the value for T_ACT_TRANS_LOGS_HIS.ACT_BAL_AFTER
     *
     * @mbggenerated Tue Jan 19 22:41:13 CST 2016
     */
    public void setActBalAfter(BigDecimal actBalAfter) {
        this.actBalAfter = actBalAfter;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_ACT_TRANS_LOGS_HIS.ACT_BAL_BEFORE
     *
     * @return the value of T_ACT_TRANS_LOGS_HIS.ACT_BAL_BEFORE
     *
     * @mbggenerated Tue Jan 19 22:41:13 CST 2016
     */
    public BigDecimal getActBalBefore() {
        return actBalBefore;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_ACT_TRANS_LOGS_HIS.ACT_BAL_BEFORE
     *
     * @param actBalBefore the value for T_ACT_TRANS_LOGS_HIS.ACT_BAL_BEFORE
     *
     * @mbggenerated Tue Jan 19 22:41:13 CST 2016
     */
    public void setActBalBefore(BigDecimal actBalBefore) {
        this.actBalBefore = actBalBefore;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_ACT_TRANS_LOGS_HIS.EXT_ID1
     *
     * @return the value of T_ACT_TRANS_LOGS_HIS.EXT_ID1
     *
     * @mbggenerated Tue Jan 19 22:41:13 CST 2016
     */
    public String getExtId1() {
        return extId1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_ACT_TRANS_LOGS_HIS.EXT_ID1
     *
     * @param extId1 the value for T_ACT_TRANS_LOGS_HIS.EXT_ID1
     *
     * @mbggenerated Tue Jan 19 22:41:13 CST 2016
     */
    public void setExtId1(String extId1) {
        this.extId1 = extId1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_ACT_TRANS_LOGS_HIS.EXT_ID2
     *
     * @return the value of T_ACT_TRANS_LOGS_HIS.EXT_ID2
     *
     * @mbggenerated Tue Jan 19 22:41:13 CST 2016
     */
    public String getExtId2() {
        return extId2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_ACT_TRANS_LOGS_HIS.EXT_ID2
     *
     * @param extId2 the value for T_ACT_TRANS_LOGS_HIS.EXT_ID2
     *
     * @mbggenerated Tue Jan 19 22:41:13 CST 2016
     */
    public void setExtId2(String extId2) {
        this.extId2 = extId2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_ACT_TRANS_LOGS_HIS.EXT_COMMETS
     *
     * @return the value of T_ACT_TRANS_LOGS_HIS.EXT_COMMETS
     *
     * @mbggenerated Tue Jan 19 22:41:13 CST 2016
     */
    public String getExtCommets() {
        return extCommets;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_ACT_TRANS_LOGS_HIS.EXT_COMMETS
     *
     * @param extCommets the value for T_ACT_TRANS_LOGS_HIS.EXT_COMMETS
     *
     * @mbggenerated Tue Jan 19 22:41:13 CST 2016
     */
    public void setExtCommets(String extCommets) {
        this.extCommets = extCommets;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_ACT_TRANS_LOGS_HIS.CREATE_TIME
     *
     * @return the value of T_ACT_TRANS_LOGS_HIS.CREATE_TIME
     *
     * @mbggenerated Tue Jan 19 22:41:13 CST 2016
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_ACT_TRANS_LOGS_HIS.CREATE_TIME
     *
     * @param createTime the value for T_ACT_TRANS_LOGS_HIS.CREATE_TIME
     *
     * @mbggenerated Tue Jan 19 22:41:13 CST 2016
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_ACT_TRANS_LOGS_HIS.UPDATE_TIME
     *
     * @return the value of T_ACT_TRANS_LOGS_HIS.UPDATE_TIME
     *
     * @mbggenerated Tue Jan 19 22:41:13 CST 2016
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_ACT_TRANS_LOGS_HIS.UPDATE_TIME
     *
     * @param updateTime the value for T_ACT_TRANS_LOGS_HIS.UPDATE_TIME
     *
     * @mbggenerated Tue Jan 19 22:41:13 CST 2016
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_ACT_TRANS_LOGS_HIS
     *
     * @mbggenerated Tue Jan 19 22:41:13 CST 2016
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        TActTransLogsHis other = (TActTransLogsHis) that;
        return (this.getLogUuid() == null ? other.getLogUuid() == null : this.getLogUuid().equals(other.getLogUuid()))
            && (this.getSettDate() == null ? other.getSettDate() == null : this.getSettDate().equals(other.getSettDate()))
            && (this.getConsDate() == null ? other.getConsDate() == null : this.getConsDate().equals(other.getConsDate()))
            && (this.getTxSno() == null ? other.getTxSno() == null : this.getTxSno().equals(other.getTxSno()))
            && (this.getTransCode() == null ? other.getTransCode() == null : this.getTransCode().equals(other.getTransCode()))
            && (this.getSubTransCode() == null ? other.getSubTransCode() == null : this.getSubTransCode().equals(other.getSubTransCode()))
            && (this.getBizType() == null ? other.getBizType() == null : this.getBizType().equals(other.getBizType()))
            && (this.getBizDtlType() == null ? other.getBizDtlType() == null : this.getBizDtlType().equals(other.getBizDtlType()))
            && (this.getFromFundNo() == null ? other.getFromFundNo() == null : this.getFromFundNo().equals(other.getFromFundNo()))
            && (this.getToFundNo() == null ? other.getToFundNo() == null : this.getToFundNo().equals(other.getToFundNo()))
            && (this.getDcType() == null ? other.getDcType() == null : this.getDcType().equals(other.getDcType()))
            && (this.getAmt() == null ? other.getAmt() == null : this.getAmt().equals(other.getAmt()))
            && (this.getCnt() == null ? other.getCnt() == null : this.getCnt().equals(other.getCnt()))
            && (this.getFlagCancel() == null ? other.getFlagCancel() == null : this.getFlagCancel().equals(other.getFlagCancel()))
            && (this.getRelatedTransId() == null ? other.getRelatedTransId() == null : this.getRelatedTransId().equals(other.getRelatedTransId()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getActBalAfter() == null ? other.getActBalAfter() == null : this.getActBalAfter().equals(other.getActBalAfter()))
            && (this.getActBalBefore() == null ? other.getActBalBefore() == null : this.getActBalBefore().equals(other.getActBalBefore()))
            && (this.getExtId1() == null ? other.getExtId1() == null : this.getExtId1().equals(other.getExtId1()))
            && (this.getExtId2() == null ? other.getExtId2() == null : this.getExtId2().equals(other.getExtId2()))
            && (this.getExtCommets() == null ? other.getExtCommets() == null : this.getExtCommets().equals(other.getExtCommets()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_ACT_TRANS_LOGS_HIS
     *
     * @mbggenerated Tue Jan 19 22:41:13 CST 2016
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getLogUuid() == null) ? 0 : getLogUuid().hashCode());
        result = prime * result + ((getSettDate() == null) ? 0 : getSettDate().hashCode());
        result = prime * result + ((getConsDate() == null) ? 0 : getConsDate().hashCode());
        result = prime * result + ((getTxSno() == null) ? 0 : getTxSno().hashCode());
        result = prime * result + ((getTransCode() == null) ? 0 : getTransCode().hashCode());
        result = prime * result + ((getSubTransCode() == null) ? 0 : getSubTransCode().hashCode());
        result = prime * result + ((getBizType() == null) ? 0 : getBizType().hashCode());
        result = prime * result + ((getBizDtlType() == null) ? 0 : getBizDtlType().hashCode());
        result = prime * result + ((getFromFundNo() == null) ? 0 : getFromFundNo().hashCode());
        result = prime * result + ((getToFundNo() == null) ? 0 : getToFundNo().hashCode());
        result = prime * result + ((getDcType() == null) ? 0 : getDcType().hashCode());
        result = prime * result + ((getAmt() == null) ? 0 : getAmt().hashCode());
        result = prime * result + ((getCnt() == null) ? 0 : getCnt().hashCode());
        result = prime * result + ((getFlagCancel() == null) ? 0 : getFlagCancel().hashCode());
        result = prime * result + ((getRelatedTransId() == null) ? 0 : getRelatedTransId().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getActBalAfter() == null) ? 0 : getActBalAfter().hashCode());
        result = prime * result + ((getActBalBefore() == null) ? 0 : getActBalBefore().hashCode());
        result = prime * result + ((getExtId1() == null) ? 0 : getExtId1().hashCode());
        result = prime * result + ((getExtId2() == null) ? 0 : getExtId2().hashCode());
        result = prime * result + ((getExtCommets() == null) ? 0 : getExtCommets().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_ACT_TRANS_LOGS_HIS
     *
     * @mbggenerated Tue Jan 19 22:41:13 CST 2016
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", settDate=").append(settDate);
        sb.append(", consDate=").append(consDate);
        sb.append(", txSno=").append(txSno);
        sb.append(", transCode=").append(transCode);
        sb.append(", subTransCode=").append(subTransCode);
        sb.append(", bizType=").append(bizType);
        sb.append(", bizDtlType=").append(bizDtlType);
        sb.append(", fromFundNo=").append(fromFundNo);
        sb.append(", toFundNo=").append(toFundNo);
        sb.append(", dcType=").append(dcType);
        sb.append(", amt=").append(amt);
        sb.append(", cnt=").append(cnt);
        sb.append(", flagCancel=").append(flagCancel);
        sb.append(", relatedTransId=").append(relatedTransId);
        sb.append(", status=").append(status);
        sb.append(", actBalAfter=").append(actBalAfter);
        sb.append(", actBalBefore=").append(actBalBefore);
        sb.append(", extId1=").append(extId1);
        sb.append(", extId2=").append(extId2);
        sb.append(", extCommets=").append(extCommets);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append("]");
        return sb.toString();
    }
}