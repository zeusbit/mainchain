package onight.act.ordbgens.act.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class TActLogsHisKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_ACT_LOGS_HIS.LOG_UUID
     *
     * @mbggenerated Tue Jan 12 21:56:03 CST 2016
     */
    private String logUuid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_ACT_LOGS_HIS.LOG_UUID
     *
     * @return the value of T_ACT_LOGS_HIS.LOG_UUID
     *
     * @mbggenerated Tue Jan 12 21:56:03 CST 2016
     */
    public String getLogUuid() {
        return logUuid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_ACT_LOGS_HIS.LOG_UUID
     *
     * @param logUuid the value for T_ACT_LOGS_HIS.LOG_UUID
     *
     * @mbggenerated Tue Jan 12 21:56:03 CST 2016
     */
    public void setLogUuid(String logUuid) {
        this.logUuid = logUuid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_ACT_LOGS_HIS
     *
     * @mbggenerated Tue Jan 12 21:56:03 CST 2016
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
        TActLogsHisKey other = (TActLogsHisKey) that;
        return (this.getLogUuid() == null ? other.getLogUuid() == null : this.getLogUuid().equals(other.getLogUuid()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_ACT_LOGS_HIS
     *
     * @mbggenerated Tue Jan 12 21:56:03 CST 2016
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getLogUuid() == null) ? 0 : getLogUuid().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_ACT_LOGS_HIS
     *
     * @mbggenerated Tue Jan 12 21:56:03 CST 2016
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", logUuid=").append(logUuid);
        sb.append("]");
        return sb.toString();
    }
}