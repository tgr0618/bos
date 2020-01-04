package zjs.entity;

import lombok.Data;

import java.util.Date;
@Data
public class BasBasicarchivesentry {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bas_basicarchivesentry.ID
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bas_basicarchivesentry.Name
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bas_basicarchivesentry.ParentID
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private Integer parentid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bas_basicarchivesentry.MnemonicCode
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private String mnemoniccode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bas_basicarchivesentry.Available
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private Boolean available;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bas_basicarchivesentry.Remarks
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private String remarks;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bas_basicarchivesentry.OperatorID
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private Integer operatorid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bas_basicarchivesentry.OperationUnitID
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private Integer operationunitid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bas_basicarchivesentry.OperationTime
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private Date operationtime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bas_basicarchivesentry.ID
     *
     * @return the value of bas_basicarchivesentry.ID
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bas_basicarchivesentry.ID
     *
     * @param id the value for bas_basicarchivesentry.ID
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bas_basicarchivesentry.Name
     *
     * @return the value of bas_basicarchivesentry.Name
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bas_basicarchivesentry.Name
     *
     * @param name the value for bas_basicarchivesentry.Name
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bas_basicarchivesentry.ParentID
     *
     * @return the value of bas_basicarchivesentry.ParentID
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public Integer getParentid() {
        return parentid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bas_basicarchivesentry.ParentID
     *
     * @param parentid the value for bas_basicarchivesentry.ParentID
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bas_basicarchivesentry.MnemonicCode
     *
     * @return the value of bas_basicarchivesentry.MnemonicCode
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public String getMnemoniccode() {
        return mnemoniccode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bas_basicarchivesentry.MnemonicCode
     *
     * @param mnemoniccode the value for bas_basicarchivesentry.MnemonicCode
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setMnemoniccode(String mnemoniccode) {
        this.mnemoniccode = mnemoniccode == null ? null : mnemoniccode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bas_basicarchivesentry.Available
     *
     * @return the value of bas_basicarchivesentry.Available
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public Boolean getAvailable() {
        return available;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bas_basicarchivesentry.Available
     *
     * @param available the value for bas_basicarchivesentry.Available
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setAvailable(Boolean available) {
        this.available = available;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bas_basicarchivesentry.Remarks
     *
     * @return the value of bas_basicarchivesentry.Remarks
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bas_basicarchivesentry.Remarks
     *
     * @param remarks the value for bas_basicarchivesentry.Remarks
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bas_basicarchivesentry.OperatorID
     *
     * @return the value of bas_basicarchivesentry.OperatorID
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public Integer getOperatorid() {
        return operatorid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bas_basicarchivesentry.OperatorID
     *
     * @param operatorid the value for bas_basicarchivesentry.OperatorID
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setOperatorid(Integer operatorid) {
        this.operatorid = operatorid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bas_basicarchivesentry.OperationUnitID
     *
     * @return the value of bas_basicarchivesentry.OperationUnitID
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public Integer getOperationunitid() {
        return operationunitid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bas_basicarchivesentry.OperationUnitID
     *
     * @param operationunitid the value for bas_basicarchivesentry.OperationUnitID
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setOperationunitid(Integer operationunitid) {
        this.operationunitid = operationunitid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bas_basicarchivesentry.OperationTime
     *
     * @return the value of bas_basicarchivesentry.OperationTime
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public Date getOperationtime() {
        return operationtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bas_basicarchivesentry.OperationTime
     *
     * @param operationtime the value for bas_basicarchivesentry.OperationTime
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setOperationtime(Date operationtime) {
        this.operationtime = operationtime;
    }
}