package zjs.entity;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
@Data
public class AccBusinessadmissibility {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column acc_businessadmissibility.ID
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column acc_businessadmissibility.BusinessNoticeNo
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private String businessnoticeno;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column acc_businessadmissibility.ReservationTime
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private Date reservationtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column acc_businessadmissibility.CustomName
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private String customname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column acc_businessadmissibility.PickupAddress
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private String pickupaddress;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column acc_businessadmissibility.CustomCode
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private String customcode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column acc_businessadmissibility.Linkman
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private String linkman;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column acc_businessadmissibility.TelPhone
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private String telphone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column acc_businessadmissibility.Weight
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private BigDecimal weight;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column acc_businessadmissibility.Volume
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private BigDecimal volume;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column acc_businessadmissibility.ImportantHints
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private String importanthints;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column acc_businessadmissibility.ArriveCity
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private String arrivecity;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column acc_businessadmissibility.PickerInfo
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private Integer pickerinfo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column acc_businessadmissibility.SendAddress
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private String sendaddress;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column acc_businessadmissibility.ProcessingUnit
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private Integer processingunit;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column acc_businessadmissibility.NotificationSource
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private Boolean notificationsource;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column acc_businessadmissibility.CustomNoModifyFlag
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private Boolean customnomodifyflag;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column acc_businessadmissibility.SingleType
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private String singletype;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column acc_businessadmissibility.PackagesNum
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private Integer packagesnum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column acc_businessadmissibility.ActualWeight
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private BigDecimal actualweight;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column acc_businessadmissibility.BillingWeight
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private BigDecimal billingweight;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column acc_businessadmissibility.PackingFee
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private BigDecimal packingfee;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column acc_businessadmissibility.ActualPacking
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private Boolean actualpacking;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column acc_businessadmissibility.ID
     *
     * @return the value of acc_businessadmissibility.ID
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column acc_businessadmissibility.ID
     *
     * @param id the value for acc_businessadmissibility.ID
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column acc_businessadmissibility.BusinessNoticeNo
     *
     * @return the value of acc_businessadmissibility.BusinessNoticeNo
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public String getBusinessnoticeno() {
        return businessnoticeno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column acc_businessadmissibility.BusinessNoticeNo
     *
     * @param businessnoticeno the value for acc_businessadmissibility.BusinessNoticeNo
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setBusinessnoticeno(String businessnoticeno) {
        this.businessnoticeno = businessnoticeno == null ? null : businessnoticeno.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column acc_businessadmissibility.ReservationTime
     *
     * @return the value of acc_businessadmissibility.ReservationTime
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public Date getReservationtime() {
        return reservationtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column acc_businessadmissibility.ReservationTime
     *
     * @param reservationtime the value for acc_businessadmissibility.ReservationTime
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setReservationtime(Date reservationtime) {
        this.reservationtime = reservationtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column acc_businessadmissibility.CustomName
     *
     * @return the value of acc_businessadmissibility.CustomName
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public String getCustomname() {
        return customname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column acc_businessadmissibility.CustomName
     *
     * @param customname the value for acc_businessadmissibility.CustomName
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setCustomname(String customname) {
        this.customname = customname == null ? null : customname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column acc_businessadmissibility.PickupAddress
     *
     * @return the value of acc_businessadmissibility.PickupAddress
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public String getPickupaddress() {
        return pickupaddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column acc_businessadmissibility.PickupAddress
     *
     * @param pickupaddress the value for acc_businessadmissibility.PickupAddress
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setPickupaddress(String pickupaddress) {
        this.pickupaddress = pickupaddress == null ? null : pickupaddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column acc_businessadmissibility.CustomCode
     *
     * @return the value of acc_businessadmissibility.CustomCode
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public String getCustomcode() {
        return customcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column acc_businessadmissibility.CustomCode
     *
     * @param customcode the value for acc_businessadmissibility.CustomCode
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setCustomcode(String customcode) {
        this.customcode = customcode == null ? null : customcode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column acc_businessadmissibility.Linkman
     *
     * @return the value of acc_businessadmissibility.Linkman
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public String getLinkman() {
        return linkman;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column acc_businessadmissibility.Linkman
     *
     * @param linkman the value for acc_businessadmissibility.Linkman
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setLinkman(String linkman) {
        this.linkman = linkman == null ? null : linkman.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column acc_businessadmissibility.TelPhone
     *
     * @return the value of acc_businessadmissibility.TelPhone
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public String getTelphone() {
        return telphone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column acc_businessadmissibility.TelPhone
     *
     * @param telphone the value for acc_businessadmissibility.TelPhone
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setTelphone(String telphone) {
        this.telphone = telphone == null ? null : telphone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column acc_businessadmissibility.Weight
     *
     * @return the value of acc_businessadmissibility.Weight
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public BigDecimal getWeight() {
        return weight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column acc_businessadmissibility.Weight
     *
     * @param weight the value for acc_businessadmissibility.Weight
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column acc_businessadmissibility.Volume
     *
     * @return the value of acc_businessadmissibility.Volume
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public BigDecimal getVolume() {
        return volume;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column acc_businessadmissibility.Volume
     *
     * @param volume the value for acc_businessadmissibility.Volume
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setVolume(BigDecimal volume) {
        this.volume = volume;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column acc_businessadmissibility.ImportantHints
     *
     * @return the value of acc_businessadmissibility.ImportantHints
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public String getImportanthints() {
        return importanthints;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column acc_businessadmissibility.ImportantHints
     *
     * @param importanthints the value for acc_businessadmissibility.ImportantHints
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setImportanthints(String importanthints) {
        this.importanthints = importanthints == null ? null : importanthints.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column acc_businessadmissibility.ArriveCity
     *
     * @return the value of acc_businessadmissibility.ArriveCity
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public String getArrivecity() {
        return arrivecity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column acc_businessadmissibility.ArriveCity
     *
     * @param arrivecity the value for acc_businessadmissibility.ArriveCity
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setArrivecity(String arrivecity) {
        this.arrivecity = arrivecity == null ? null : arrivecity.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column acc_businessadmissibility.PickerInfo
     *
     * @return the value of acc_businessadmissibility.PickerInfo
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public Integer getPickerinfo() {
        return pickerinfo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column acc_businessadmissibility.PickerInfo
     *
     * @param pickerinfo the value for acc_businessadmissibility.PickerInfo
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setPickerinfo(Integer pickerinfo) {
        this.pickerinfo = pickerinfo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column acc_businessadmissibility.SendAddress
     *
     * @return the value of acc_businessadmissibility.SendAddress
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public String getSendaddress() {
        return sendaddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column acc_businessadmissibility.SendAddress
     *
     * @param sendaddress the value for acc_businessadmissibility.SendAddress
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setSendaddress(String sendaddress) {
        this.sendaddress = sendaddress == null ? null : sendaddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column acc_businessadmissibility.ProcessingUnit
     *
     * @return the value of acc_businessadmissibility.ProcessingUnit
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public Integer getProcessingunit() {
        return processingunit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column acc_businessadmissibility.ProcessingUnit
     *
     * @param processingunit the value for acc_businessadmissibility.ProcessingUnit
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setProcessingunit(Integer processingunit) {
        this.processingunit = processingunit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column acc_businessadmissibility.NotificationSource
     *
     * @return the value of acc_businessadmissibility.NotificationSource
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public Boolean getNotificationsource() {
        return notificationsource;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column acc_businessadmissibility.NotificationSource
     *
     * @param notificationsource the value for acc_businessadmissibility.NotificationSource
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setNotificationsource(Boolean notificationsource) {
        this.notificationsource = notificationsource;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column acc_businessadmissibility.CustomNoModifyFlag
     *
     * @return the value of acc_businessadmissibility.CustomNoModifyFlag
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public Boolean getCustomnomodifyflag() {
        return customnomodifyflag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column acc_businessadmissibility.CustomNoModifyFlag
     *
     * @param customnomodifyflag the value for acc_businessadmissibility.CustomNoModifyFlag
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setCustomnomodifyflag(Boolean customnomodifyflag) {
        this.customnomodifyflag = customnomodifyflag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column acc_businessadmissibility.SingleType
     *
     * @return the value of acc_businessadmissibility.SingleType
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public String getSingletype() {
        return singletype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column acc_businessadmissibility.SingleType
     *
     * @param singletype the value for acc_businessadmissibility.SingleType
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setSingletype(String singletype) {
        this.singletype = singletype == null ? null : singletype.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column acc_businessadmissibility.PackagesNum
     *
     * @return the value of acc_businessadmissibility.PackagesNum
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public Integer getPackagesnum() {
        return packagesnum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column acc_businessadmissibility.PackagesNum
     *
     * @param packagesnum the value for acc_businessadmissibility.PackagesNum
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setPackagesnum(Integer packagesnum) {
        this.packagesnum = packagesnum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column acc_businessadmissibility.ActualWeight
     *
     * @return the value of acc_businessadmissibility.ActualWeight
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public BigDecimal getActualweight() {
        return actualweight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column acc_businessadmissibility.ActualWeight
     *
     * @param actualweight the value for acc_businessadmissibility.ActualWeight
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setActualweight(BigDecimal actualweight) {
        this.actualweight = actualweight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column acc_businessadmissibility.BillingWeight
     *
     * @return the value of acc_businessadmissibility.BillingWeight
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public BigDecimal getBillingweight() {
        return billingweight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column acc_businessadmissibility.BillingWeight
     *
     * @param billingweight the value for acc_businessadmissibility.BillingWeight
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setBillingweight(BigDecimal billingweight) {
        this.billingweight = billingweight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column acc_businessadmissibility.PackingFee
     *
     * @return the value of acc_businessadmissibility.PackingFee
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public BigDecimal getPackingfee() {
        return packingfee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column acc_businessadmissibility.PackingFee
     *
     * @param packingfee the value for acc_businessadmissibility.PackingFee
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setPackingfee(BigDecimal packingfee) {
        this.packingfee = packingfee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column acc_businessadmissibility.ActualPacking
     *
     * @return the value of acc_businessadmissibility.ActualPacking
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public Boolean getActualpacking() {
        return actualpacking;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column acc_businessadmissibility.ActualPacking
     *
     * @param actualpacking the value for acc_businessadmissibility.ActualPacking
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setActualpacking(Boolean actualpacking) {
        this.actualpacking = actualpacking;
    }
}