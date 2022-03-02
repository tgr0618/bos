package zjs.entity;

import lombok.Data;

import java.util.Date;
@Data
public class SorCheckbound {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sor_checkbound.ID
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sor_checkbound.ScanID
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private String scanid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sor_checkbound.CargoSum
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private Integer cargosum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sor_checkbound.CheckPerson
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private Integer checkperson;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sor_checkbound.CheckDate
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private Date checkdate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sor_checkbound.CheckCompany
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private String checkcompany;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sor_checkbound.ID
     *
     * @return the value of sor_checkbound.ID
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sor_checkbound.ID
     *
     * @param id the value for sor_checkbound.ID
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sor_checkbound.ScanID
     *
     * @return the value of sor_checkbound.ScanID
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public String getScanid() {
        return scanid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sor_checkbound.ScanID
     *
     * @param scanid the value for sor_checkbound.ScanID
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setScanid(String scanid) {
        this.scanid = scanid == null ? null : scanid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sor_checkbound.CargoSum
     *
     * @return the value of sor_checkbound.CargoSum
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public Integer getCargosum() {
        return cargosum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sor_checkbound.CargoSum
     *
     * @param cargosum the value for sor_checkbound.CargoSum
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setCargosum(Integer cargosum) {
        this.cargosum = cargosum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sor_checkbound.CheckPerson
     *
     * @return the value of sor_checkbound.CheckPerson
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public Integer getCheckperson() {
        return checkperson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sor_checkbound.CheckPerson
     *
     * @param checkperson the value for sor_checkbound.CheckPerson
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setCheckperson(Integer checkperson) {
        this.checkperson = checkperson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sor_checkbound.CheckDate
     *
     * @return the value of sor_checkbound.CheckDate
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public Date getCheckdate() {
        return checkdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sor_checkbound.CheckDate
     *
     * @param checkdate the value for sor_checkbound.CheckDate
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setCheckdate(Date checkdate) {
        this.checkdate = checkdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sor_checkbound.CheckCompany
     *
     * @return the value of sor_checkbound.CheckCompany
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public String getCheckcompany() {
        return checkcompany;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sor_checkbound.CheckCompany
     *
     * @param checkcompany the value for sor_checkbound.CheckCompany
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setCheckcompany(String checkcompany) {
        this.checkcompany = checkcompany == null ? null : checkcompany.trim();
    }
}