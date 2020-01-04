package zjs.entity;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
@Data
public class SorOutbounddetails {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sor_outbounddetails.ID
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sor_outbounddetails.PackageID
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private String packageid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sor_outbounddetails.Weight
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private BigDecimal weight;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sor_outbounddetails.Volume
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private BigDecimal volume;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sor_outbounddetails.ScanDate
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private Date scandate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sor_outbounddetails.IsScan
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private Boolean isscan;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sor_outbounddetails.IsNextStorage
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private Boolean isnextstorage;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sor_outbounddetails.IsDoubleStorage
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private Boolean isdoublestorage;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sor_outbounddetails.ID
     *
     * @return the value of sor_outbounddetails.ID
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sor_outbounddetails.ID
     *
     * @param id the value for sor_outbounddetails.ID
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sor_outbounddetails.PackageID
     *
     * @return the value of sor_outbounddetails.PackageID
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public String getPackageid() {
        return packageid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sor_outbounddetails.PackageID
     *
     * @param packageid the value for sor_outbounddetails.PackageID
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setPackageid(String packageid) {
        this.packageid = packageid == null ? null : packageid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sor_outbounddetails.Weight
     *
     * @return the value of sor_outbounddetails.Weight
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public BigDecimal getWeight() {
        return weight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sor_outbounddetails.Weight
     *
     * @param weight the value for sor_outbounddetails.Weight
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sor_outbounddetails.Volume
     *
     * @return the value of sor_outbounddetails.Volume
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public BigDecimal getVolume() {
        return volume;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sor_outbounddetails.Volume
     *
     * @param volume the value for sor_outbounddetails.Volume
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setVolume(BigDecimal volume) {
        this.volume = volume;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sor_outbounddetails.ScanDate
     *
     * @return the value of sor_outbounddetails.ScanDate
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public Date getScandate() {
        return scandate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sor_outbounddetails.ScanDate
     *
     * @param scandate the value for sor_outbounddetails.ScanDate
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setScandate(Date scandate) {
        this.scandate = scandate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sor_outbounddetails.IsScan
     *
     * @return the value of sor_outbounddetails.IsScan
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public Boolean getIsscan() {
        return isscan;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sor_outbounddetails.IsScan
     *
     * @param isscan the value for sor_outbounddetails.IsScan
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setIsscan(Boolean isscan) {
        this.isscan = isscan;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sor_outbounddetails.IsNextStorage
     *
     * @return the value of sor_outbounddetails.IsNextStorage
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public Boolean getIsnextstorage() {
        return isnextstorage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sor_outbounddetails.IsNextStorage
     *
     * @param isnextstorage the value for sor_outbounddetails.IsNextStorage
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setIsnextstorage(Boolean isnextstorage) {
        this.isnextstorage = isnextstorage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sor_outbounddetails.IsDoubleStorage
     *
     * @return the value of sor_outbounddetails.IsDoubleStorage
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public Boolean getIsdoublestorage() {
        return isdoublestorage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sor_outbounddetails.IsDoubleStorage
     *
     * @param isdoublestorage the value for sor_outbounddetails.IsDoubleStorage
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setIsdoublestorage(Boolean isdoublestorage) {
        this.isdoublestorage = isdoublestorage;
    }
}