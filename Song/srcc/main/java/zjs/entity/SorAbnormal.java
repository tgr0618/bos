package zjs.entity;

import lombok.Data;

import java.util.Date;
@Data
public class SorAbnormal {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sor_abnormal.ID
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sor_abnormal.LaunchDate
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private Date launchdate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sor_abnormal.LaunchPerson
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private String launchperson;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sor_abnormal.LaunchCompany
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private String launchcompany;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sor_abnormal.AbnormalType
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private Boolean abnormaltype;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sor_abnormal.TransferInt
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private String transferint;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sor_abnormal.CargoInt
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private String cargoint;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sor_abnormal.PackageInt
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private String packageint;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sor_abnormal.HedgeAbnInt
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private Integer hedgeabnint;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sor_abnormal.AboState
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private Boolean abostate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sor_abnormal.HandleDate
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private Date handledate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sor_abnormal.ID
     *
     * @return the value of sor_abnormal.ID
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sor_abnormal.ID
     *
     * @param id the value for sor_abnormal.ID
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sor_abnormal.LaunchDate
     *
     * @return the value of sor_abnormal.LaunchDate
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public Date getLaunchdate() {
        return launchdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sor_abnormal.LaunchDate
     *
     * @param launchdate the value for sor_abnormal.LaunchDate
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setLaunchdate(Date launchdate) {
        this.launchdate = launchdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sor_abnormal.LaunchPerson
     *
     * @return the value of sor_abnormal.LaunchPerson
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public String getLaunchperson() {
        return launchperson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sor_abnormal.LaunchPerson
     *
     * @param launchperson the value for sor_abnormal.LaunchPerson
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setLaunchperson(String launchperson) {
        this.launchperson = launchperson == null ? null : launchperson.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sor_abnormal.LaunchCompany
     *
     * @return the value of sor_abnormal.LaunchCompany
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public String getLaunchcompany() {
        return launchcompany;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sor_abnormal.LaunchCompany
     *
     * @param launchcompany the value for sor_abnormal.LaunchCompany
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setLaunchcompany(String launchcompany) {
        this.launchcompany = launchcompany == null ? null : launchcompany.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sor_abnormal.AbnormalType
     *
     * @return the value of sor_abnormal.AbnormalType
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public Boolean getAbnormaltype() {
        return abnormaltype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sor_abnormal.AbnormalType
     *
     * @param abnormaltype the value for sor_abnormal.AbnormalType
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setAbnormaltype(Boolean abnormaltype) {
        this.abnormaltype = abnormaltype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sor_abnormal.TransferInt
     *
     * @return the value of sor_abnormal.TransferInt
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public String getTransferint() {
        return transferint;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sor_abnormal.TransferInt
     *
     * @param transferint the value for sor_abnormal.TransferInt
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setTransferint(String transferint) {
        this.transferint = transferint == null ? null : transferint.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sor_abnormal.CargoInt
     *
     * @return the value of sor_abnormal.CargoInt
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public String getCargoint() {
        return cargoint;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sor_abnormal.CargoInt
     *
     * @param cargoint the value for sor_abnormal.CargoInt
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setCargoint(String cargoint) {
        this.cargoint = cargoint == null ? null : cargoint.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sor_abnormal.PackageInt
     *
     * @return the value of sor_abnormal.PackageInt
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public String getPackageint() {
        return packageint;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sor_abnormal.PackageInt
     *
     * @param packageint the value for sor_abnormal.PackageInt
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setPackageint(String packageint) {
        this.packageint = packageint == null ? null : packageint.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sor_abnormal.HedgeAbnInt
     *
     * @return the value of sor_abnormal.HedgeAbnInt
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public Integer getHedgeabnint() {
        return hedgeabnint;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sor_abnormal.HedgeAbnInt
     *
     * @param hedgeabnint the value for sor_abnormal.HedgeAbnInt
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setHedgeabnint(Integer hedgeabnint) {
        this.hedgeabnint = hedgeabnint;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sor_abnormal.AboState
     *
     * @return the value of sor_abnormal.AboState
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public Boolean getAbostate() {
        return abostate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sor_abnormal.AboState
     *
     * @param abostate the value for sor_abnormal.AboState
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setAbostate(Boolean abostate) {
        this.abostate = abostate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sor_abnormal.HandleDate
     *
     * @return the value of sor_abnormal.HandleDate
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public Date getHandledate() {
        return handledate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sor_abnormal.HandleDate
     *
     * @param handledate the value for sor_abnormal.HandleDate
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setHandledate(Date handledate) {
        this.handledate = handledate;
    }
}