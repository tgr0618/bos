package zjs.entity;

import lombok.Data;

import java.util.Date;
@Data
public class BasBasicarchives {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bas_basicarchives.ID
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bas_basicarchives.Name
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bas_basicarchives.Grade
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private Boolean grade;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bas_basicarchives.Remarks
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private String remarks;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bas_basicarchives.OperatorID
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private Integer operatorid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bas_basicarchives.OperationUnitID
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private Integer operationunitid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bas_basicarchives.OperationTime
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private Date operationtime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bas_basicarchives.ID
     *
     * @return the value of bas_basicarchives.ID
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bas_basicarchives.ID
     *
     * @param id the value for bas_basicarchives.ID
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bas_basicarchives.Name
     *
     * @return the value of bas_basicarchives.Name
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bas_basicarchives.Name
     *
     * @param name the value for bas_basicarchives.Name
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bas_basicarchives.Grade
     *
     * @return the value of bas_basicarchives.Grade
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public Boolean getGrade() {
        return grade;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bas_basicarchives.Grade
     *
     * @param grade the value for bas_basicarchives.Grade
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setGrade(Boolean grade) {
        this.grade = grade;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bas_basicarchives.Remarks
     *
     * @return the value of bas_basicarchives.Remarks
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bas_basicarchives.Remarks
     *
     * @param remarks the value for bas_basicarchives.Remarks
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bas_basicarchives.OperatorID
     *
     * @return the value of bas_basicarchives.OperatorID
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public Integer getOperatorid() {
        return operatorid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bas_basicarchives.OperatorID
     *
     * @param operatorid the value for bas_basicarchives.OperatorID
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setOperatorid(Integer operatorid) {
        this.operatorid = operatorid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bas_basicarchives.OperationUnitID
     *
     * @return the value of bas_basicarchives.OperationUnitID
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public Integer getOperationunitid() {
        return operationunitid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bas_basicarchives.OperationUnitID
     *
     * @param operationunitid the value for bas_basicarchives.OperationUnitID
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setOperationunitid(Integer operationunitid) {
        this.operationunitid = operationunitid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bas_basicarchives.OperationTime
     *
     * @return the value of bas_basicarchives.OperationTime
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public Date getOperationtime() {
        return operationtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bas_basicarchives.OperationTime
     *
     * @param operationtime the value for bas_basicarchives.OperationTime
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setOperationtime(Date operationtime) {
        this.operationtime = operationtime;
    }
}