package zjs.entity;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
@Data
public class IaeDeparture {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iae_departure.ID
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iae_departure.PackingID
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private String packingid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iae_departure.Transfer
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private Boolean transfer;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iae_departure.ActualCount
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private Integer actualcount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iae_departure.Destination
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private String destination;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iae_departure.WareName
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private Integer warename;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iae_departure.CargoCount
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private Integer cargocount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iae_departure.Weight
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private BigDecimal weight;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iae_departure.Volume
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private BigDecimal volume;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iae_departure.ActualVolume
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private BigDecimal actualvolume;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iae_departure.TimeLimit
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private Date timelimit;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iae_departure.Ask
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private String ask;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iae_departure.TakeCargoPerson
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private String takecargoperson;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iae_departure.TackCargoAddress
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private String tackcargoaddress;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iae_departure.Payment
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private Integer payment;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iae_departure.ImportantHints
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private String importanthints;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iae_departure.SurplusTime
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private Date surplustime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iae_departure.EntrustCompany
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private String entrustcompany;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iae_departure.ID
     *
     * @return the value of iae_departure.ID
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iae_departure.ID
     *
     * @param id the value for iae_departure.ID
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iae_departure.PackingID
     *
     * @return the value of iae_departure.PackingID
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public String getPackingid() {
        return packingid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iae_departure.PackingID
     *
     * @param packingid the value for iae_departure.PackingID
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setPackingid(String packingid) {
        this.packingid = packingid == null ? null : packingid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iae_departure.Transfer
     *
     * @return the value of iae_departure.Transfer
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public Boolean getTransfer() {
        return transfer;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iae_departure.Transfer
     *
     * @param transfer the value for iae_departure.Transfer
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setTransfer(Boolean transfer) {
        this.transfer = transfer;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iae_departure.ActualCount
     *
     * @return the value of iae_departure.ActualCount
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public Integer getActualcount() {
        return actualcount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iae_departure.ActualCount
     *
     * @param actualcount the value for iae_departure.ActualCount
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setActualcount(Integer actualcount) {
        this.actualcount = actualcount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iae_departure.Destination
     *
     * @return the value of iae_departure.Destination
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public String getDestination() {
        return destination;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iae_departure.Destination
     *
     * @param destination the value for iae_departure.Destination
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setDestination(String destination) {
        this.destination = destination == null ? null : destination.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iae_departure.WareName
     *
     * @return the value of iae_departure.WareName
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public Integer getWarename() {
        return warename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iae_departure.WareName
     *
     * @param warename the value for iae_departure.WareName
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setWarename(Integer warename) {
        this.warename = warename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iae_departure.CargoCount
     *
     * @return the value of iae_departure.CargoCount
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public Integer getCargocount() {
        return cargocount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iae_departure.CargoCount
     *
     * @param cargocount the value for iae_departure.CargoCount
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setCargocount(Integer cargocount) {
        this.cargocount = cargocount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iae_departure.Weight
     *
     * @return the value of iae_departure.Weight
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public BigDecimal getWeight() {
        return weight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iae_departure.Weight
     *
     * @param weight the value for iae_departure.Weight
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iae_departure.Volume
     *
     * @return the value of iae_departure.Volume
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public BigDecimal getVolume() {
        return volume;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iae_departure.Volume
     *
     * @param volume the value for iae_departure.Volume
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setVolume(BigDecimal volume) {
        this.volume = volume;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iae_departure.ActualVolume
     *
     * @return the value of iae_departure.ActualVolume
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public BigDecimal getActualvolume() {
        return actualvolume;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iae_departure.ActualVolume
     *
     * @param actualvolume the value for iae_departure.ActualVolume
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setActualvolume(BigDecimal actualvolume) {
        this.actualvolume = actualvolume;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iae_departure.TimeLimit
     *
     * @return the value of iae_departure.TimeLimit
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public Date getTimelimit() {
        return timelimit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iae_departure.TimeLimit
     *
     * @param timelimit the value for iae_departure.TimeLimit
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setTimelimit(Date timelimit) {
        this.timelimit = timelimit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iae_departure.Ask
     *
     * @return the value of iae_departure.Ask
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public String getAsk() {
        return ask;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iae_departure.Ask
     *
     * @param ask the value for iae_departure.Ask
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setAsk(String ask) {
        this.ask = ask == null ? null : ask.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iae_departure.TakeCargoPerson
     *
     * @return the value of iae_departure.TakeCargoPerson
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public String getTakecargoperson() {
        return takecargoperson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iae_departure.TakeCargoPerson
     *
     * @param takecargoperson the value for iae_departure.TakeCargoPerson
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setTakecargoperson(String takecargoperson) {
        this.takecargoperson = takecargoperson == null ? null : takecargoperson.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iae_departure.TackCargoAddress
     *
     * @return the value of iae_departure.TackCargoAddress
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public String getTackcargoaddress() {
        return tackcargoaddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iae_departure.TackCargoAddress
     *
     * @param tackcargoaddress the value for iae_departure.TackCargoAddress
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setTackcargoaddress(String tackcargoaddress) {
        this.tackcargoaddress = tackcargoaddress == null ? null : tackcargoaddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iae_departure.Payment
     *
     * @return the value of iae_departure.Payment
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public Integer getPayment() {
        return payment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iae_departure.Payment
     *
     * @param payment the value for iae_departure.Payment
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setPayment(Integer payment) {
        this.payment = payment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iae_departure.ImportantHints
     *
     * @return the value of iae_departure.ImportantHints
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public String getImportanthints() {
        return importanthints;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iae_departure.ImportantHints
     *
     * @param importanthints the value for iae_departure.ImportantHints
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setImportanthints(String importanthints) {
        this.importanthints = importanthints == null ? null : importanthints.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iae_departure.SurplusTime
     *
     * @return the value of iae_departure.SurplusTime
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public Date getSurplustime() {
        return surplustime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iae_departure.SurplusTime
     *
     * @param surplustime the value for iae_departure.SurplusTime
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setSurplustime(Date surplustime) {
        this.surplustime = surplustime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iae_departure.EntrustCompany
     *
     * @return the value of iae_departure.EntrustCompany
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public String getEntrustcompany() {
        return entrustcompany;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iae_departure.EntrustCompany
     *
     * @param entrustcompany the value for iae_departure.EntrustCompany
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setEntrustcompany(String entrustcompany) {
        this.entrustcompany = entrustcompany == null ? null : entrustcompany.trim();
    }
}