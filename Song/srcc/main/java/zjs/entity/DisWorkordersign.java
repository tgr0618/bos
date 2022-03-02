package zjs.entity;

import lombok.Data;

import java.util.Date;
@Data
public class DisWorkordersign {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dis_workordersign.ID
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dis_workordersign.WorkOrderID
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private Integer workorderid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dis_workordersign.WorkSheetNo
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private String worksheetno;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dis_workordersign.WorkOrderType
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private Boolean workordertype;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dis_workordersign.SignType
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private Boolean signtype;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dis_workordersign.CourierInt
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private Integer courierint;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dis_workordersign.CourierName
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private String couriername;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dis_workordersign.Recipient
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private String recipient;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dis_workordersign.SignUnit
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private Integer signunit;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dis_workordersign.SignTime
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private Date signtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dis_workordersign.InvalidateMark
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private Boolean invalidatemark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dis_workordersign.AbnormalMark
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private String abnormalmark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dis_workordersign.InputPersonCode
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private Integer inputpersoncode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dis_workordersign.InputPersonID
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private Integer inputpersonid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dis_workordersign.InputID
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private Integer inputid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dis_workordersign.InputTime
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private Date inputtime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dis_workordersign.ID
     *
     * @return the value of dis_workordersign.ID
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dis_workordersign.ID
     *
     * @param id the value for dis_workordersign.ID
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dis_workordersign.WorkOrderID
     *
     * @return the value of dis_workordersign.WorkOrderID
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public Integer getWorkorderid() {
        return workorderid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dis_workordersign.WorkOrderID
     *
     * @param workorderid the value for dis_workordersign.WorkOrderID
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setWorkorderid(Integer workorderid) {
        this.workorderid = workorderid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dis_workordersign.WorkSheetNo
     *
     * @return the value of dis_workordersign.WorkSheetNo
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public String getWorksheetno() {
        return worksheetno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dis_workordersign.WorkSheetNo
     *
     * @param worksheetno the value for dis_workordersign.WorkSheetNo
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setWorksheetno(String worksheetno) {
        this.worksheetno = worksheetno == null ? null : worksheetno.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dis_workordersign.WorkOrderType
     *
     * @return the value of dis_workordersign.WorkOrderType
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public Boolean getWorkordertype() {
        return workordertype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dis_workordersign.WorkOrderType
     *
     * @param workordertype the value for dis_workordersign.WorkOrderType
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setWorkordertype(Boolean workordertype) {
        this.workordertype = workordertype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dis_workordersign.SignType
     *
     * @return the value of dis_workordersign.SignType
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public Boolean getSigntype() {
        return signtype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dis_workordersign.SignType
     *
     * @param signtype the value for dis_workordersign.SignType
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setSigntype(Boolean signtype) {
        this.signtype = signtype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dis_workordersign.CourierInt
     *
     * @return the value of dis_workordersign.CourierInt
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public Integer getCourierint() {
        return courierint;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dis_workordersign.CourierInt
     *
     * @param courierint the value for dis_workordersign.CourierInt
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setCourierint(Integer courierint) {
        this.courierint = courierint;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dis_workordersign.CourierName
     *
     * @return the value of dis_workordersign.CourierName
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public String getCouriername() {
        return couriername;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dis_workordersign.CourierName
     *
     * @param couriername the value for dis_workordersign.CourierName
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setCouriername(String couriername) {
        this.couriername = couriername == null ? null : couriername.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dis_workordersign.Recipient
     *
     * @return the value of dis_workordersign.Recipient
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public String getRecipient() {
        return recipient;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dis_workordersign.Recipient
     *
     * @param recipient the value for dis_workordersign.Recipient
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setRecipient(String recipient) {
        this.recipient = recipient == null ? null : recipient.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dis_workordersign.SignUnit
     *
     * @return the value of dis_workordersign.SignUnit
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public Integer getSignunit() {
        return signunit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dis_workordersign.SignUnit
     *
     * @param signunit the value for dis_workordersign.SignUnit
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setSignunit(Integer signunit) {
        this.signunit = signunit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dis_workordersign.SignTime
     *
     * @return the value of dis_workordersign.SignTime
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public Date getSigntime() {
        return signtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dis_workordersign.SignTime
     *
     * @param signtime the value for dis_workordersign.SignTime
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setSigntime(Date signtime) {
        this.signtime = signtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dis_workordersign.InvalidateMark
     *
     * @return the value of dis_workordersign.InvalidateMark
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public Boolean getInvalidatemark() {
        return invalidatemark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dis_workordersign.InvalidateMark
     *
     * @param invalidatemark the value for dis_workordersign.InvalidateMark
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setInvalidatemark(Boolean invalidatemark) {
        this.invalidatemark = invalidatemark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dis_workordersign.AbnormalMark
     *
     * @return the value of dis_workordersign.AbnormalMark
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public String getAbnormalmark() {
        return abnormalmark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dis_workordersign.AbnormalMark
     *
     * @param abnormalmark the value for dis_workordersign.AbnormalMark
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setAbnormalmark(String abnormalmark) {
        this.abnormalmark = abnormalmark == null ? null : abnormalmark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dis_workordersign.InputPersonCode
     *
     * @return the value of dis_workordersign.InputPersonCode
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public Integer getInputpersoncode() {
        return inputpersoncode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dis_workordersign.InputPersonCode
     *
     * @param inputpersoncode the value for dis_workordersign.InputPersonCode
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setInputpersoncode(Integer inputpersoncode) {
        this.inputpersoncode = inputpersoncode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dis_workordersign.InputPersonID
     *
     * @return the value of dis_workordersign.InputPersonID
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public Integer getInputpersonid() {
        return inputpersonid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dis_workordersign.InputPersonID
     *
     * @param inputpersonid the value for dis_workordersign.InputPersonID
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setInputpersonid(Integer inputpersonid) {
        this.inputpersonid = inputpersonid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dis_workordersign.InputID
     *
     * @return the value of dis_workordersign.InputID
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public Integer getInputid() {
        return inputid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dis_workordersign.InputID
     *
     * @param inputid the value for dis_workordersign.InputID
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setInputid(Integer inputid) {
        this.inputid = inputid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dis_workordersign.InputTime
     *
     * @return the value of dis_workordersign.InputTime
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public Date getInputtime() {
        return inputtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dis_workordersign.InputTime
     *
     * @param inputtime the value for dis_workordersign.InputTime
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setInputtime(Date inputtime) {
        this.inputtime = inputtime;
    }
}