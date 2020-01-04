package zjs.entity;

import lombok.Data;

import java.util.Date;
@Data
public class IaeArrival {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iae_arrival.ID
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iae_arrival.SendCompany
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private String sendcompany;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iae_arrival.CargoAddress
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private String cargoaddress;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iae_arrival.IssuePerson
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private String issueperson;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iae_arrival.IssueDate
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private Date issuedate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iae_arrival.WorkAddress
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private String workaddress;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iae_arrival.StorageDate
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private Date storagedate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iae_arrival.OutBoundDate
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private Date outbounddate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iae_arrival.TimeLimit
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private Date timelimit;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iae_arrival.Batch
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private Date batch;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iae_arrival.ID
     *
     * @return the value of iae_arrival.ID
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iae_arrival.ID
     *
     * @param id the value for iae_arrival.ID
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iae_arrival.SendCompany
     *
     * @return the value of iae_arrival.SendCompany
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public String getSendcompany() {
        return sendcompany;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iae_arrival.SendCompany
     *
     * @param sendcompany the value for iae_arrival.SendCompany
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setSendcompany(String sendcompany) {
        this.sendcompany = sendcompany == null ? null : sendcompany.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iae_arrival.CargoAddress
     *
     * @return the value of iae_arrival.CargoAddress
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public String getCargoaddress() {
        return cargoaddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iae_arrival.CargoAddress
     *
     * @param cargoaddress the value for iae_arrival.CargoAddress
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setCargoaddress(String cargoaddress) {
        this.cargoaddress = cargoaddress == null ? null : cargoaddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iae_arrival.IssuePerson
     *
     * @return the value of iae_arrival.IssuePerson
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public String getIssueperson() {
        return issueperson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iae_arrival.IssuePerson
     *
     * @param issueperson the value for iae_arrival.IssuePerson
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setIssueperson(String issueperson) {
        this.issueperson = issueperson == null ? null : issueperson.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iae_arrival.IssueDate
     *
     * @return the value of iae_arrival.IssueDate
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public Date getIssuedate() {
        return issuedate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iae_arrival.IssueDate
     *
     * @param issuedate the value for iae_arrival.IssueDate
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setIssuedate(Date issuedate) {
        this.issuedate = issuedate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iae_arrival.WorkAddress
     *
     * @return the value of iae_arrival.WorkAddress
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public String getWorkaddress() {
        return workaddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iae_arrival.WorkAddress
     *
     * @param workaddress the value for iae_arrival.WorkAddress
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setWorkaddress(String workaddress) {
        this.workaddress = workaddress == null ? null : workaddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iae_arrival.StorageDate
     *
     * @return the value of iae_arrival.StorageDate
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public Date getStoragedate() {
        return storagedate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iae_arrival.StorageDate
     *
     * @param storagedate the value for iae_arrival.StorageDate
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setStoragedate(Date storagedate) {
        this.storagedate = storagedate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iae_arrival.OutBoundDate
     *
     * @return the value of iae_arrival.OutBoundDate
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public Date getOutbounddate() {
        return outbounddate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iae_arrival.OutBoundDate
     *
     * @param outbounddate the value for iae_arrival.OutBoundDate
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setOutbounddate(Date outbounddate) {
        this.outbounddate = outbounddate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iae_arrival.TimeLimit
     *
     * @return the value of iae_arrival.TimeLimit
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public Date getTimelimit() {
        return timelimit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iae_arrival.TimeLimit
     *
     * @param timelimit the value for iae_arrival.TimeLimit
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setTimelimit(Date timelimit) {
        this.timelimit = timelimit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iae_arrival.Batch
     *
     * @return the value of iae_arrival.Batch
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public Date getBatch() {
        return batch;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iae_arrival.Batch
     *
     * @param batch the value for iae_arrival.Batch
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setBatch(Date batch) {
        this.batch = batch;
    }
}