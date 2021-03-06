package zjs.entity;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
@Data
public class IaeLineresource {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iae_lineresource.ID
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iae_lineresource.ResourceType
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private String resourcetype;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iae_lineresource.Port
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private String port;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iae_lineresource.Demand
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private Boolean demand;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iae_lineresource.VehicleInt
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private String vehicleint;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iae_lineresource.Capacity
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private String capacity;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iae_lineresource.WaybillID
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private String waybillid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iae_lineresource.Carrier
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private String carrier;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iae_lineresource.ExpectArrivalDate
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private Date expectarrivaldate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iae_lineresource.ExpectDepartureDate
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private Date expectdeparturedate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iae_lineresource.Ticket
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private Integer ticket;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iae_lineresource.Cargo
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private Integer cargo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iae_lineresource.Weight
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private BigDecimal weight;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iae_lineresource.Volume
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private BigDecimal volume;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iae_lineresource.HandlePerson
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private String handleperson;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iae_lineresource.HandleDate
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private Date handledate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iae_lineresource.EnterPerson
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private Integer enterperson;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iae_lineresource.EnterDate
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private Date enterdate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iae_lineresource.EnterCompany
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private String entercompany;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iae_lineresource.AcceptPerson
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private Integer acceptperson;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iae_lineresource.AcceptDate
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private Date acceptdate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iae_lineresource.AcceptCompany
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private String acceptcompany;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iae_lineresource.AbnormalRemarks
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private String abnormalremarks;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iae_lineresource.WorkInt
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private String workint;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iae_lineresource.Transfer
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private Boolean transfer;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iae_lineresource.ActualCount
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private Integer actualcount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iae_lineresource.Destination
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private String destination;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iae_lineresource.WareName
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private String warename;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iae_lineresource.ActualVolume
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private BigDecimal actualvolume;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iae_lineresource.TimeLimit
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private Date timelimit;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iae_lineresource.Ask
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private String ask;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iae_lineresource.TakeCargoPerson
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private String takecargoperson;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iae_lineresource.TackCargoAddress
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private String tackcargoaddress;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iae_lineresource.Payment
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private Integer payment;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iae_lineresource.SpecialEnsure
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private String specialensure;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iae_lineresource.DeliveryType
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private Boolean deliverytype;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iae_lineresource.ImportantHints
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private String importanthints;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iae_lineresource.SurplusTime
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private Date surplustime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iae_lineresource.ID
     *
     * @return the value of iae_lineresource.ID
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iae_lineresource.ID
     *
     * @param id the value for iae_lineresource.ID
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iae_lineresource.ResourceType
     *
     * @return the value of iae_lineresource.ResourceType
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public String getResourcetype() {
        return resourcetype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iae_lineresource.ResourceType
     *
     * @param resourcetype the value for iae_lineresource.ResourceType
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setResourcetype(String resourcetype) {
        this.resourcetype = resourcetype == null ? null : resourcetype.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iae_lineresource.Port
     *
     * @return the value of iae_lineresource.Port
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public String getPort() {
        return port;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iae_lineresource.Port
     *
     * @param port the value for iae_lineresource.Port
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setPort(String port) {
        this.port = port == null ? null : port.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iae_lineresource.Demand
     *
     * @return the value of iae_lineresource.Demand
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public Boolean getDemand() {
        return demand;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iae_lineresource.Demand
     *
     * @param demand the value for iae_lineresource.Demand
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setDemand(Boolean demand) {
        this.demand = demand;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iae_lineresource.VehicleInt
     *
     * @return the value of iae_lineresource.VehicleInt
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public String getVehicleint() {
        return vehicleint;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iae_lineresource.VehicleInt
     *
     * @param vehicleint the value for iae_lineresource.VehicleInt
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setVehicleint(String vehicleint) {
        this.vehicleint = vehicleint == null ? null : vehicleint.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iae_lineresource.Capacity
     *
     * @return the value of iae_lineresource.Capacity
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public String getCapacity() {
        return capacity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iae_lineresource.Capacity
     *
     * @param capacity the value for iae_lineresource.Capacity
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setCapacity(String capacity) {
        this.capacity = capacity == null ? null : capacity.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iae_lineresource.WaybillID
     *
     * @return the value of iae_lineresource.WaybillID
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public String getWaybillid() {
        return waybillid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iae_lineresource.WaybillID
     *
     * @param waybillid the value for iae_lineresource.WaybillID
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setWaybillid(String waybillid) {
        this.waybillid = waybillid == null ? null : waybillid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iae_lineresource.Carrier
     *
     * @return the value of iae_lineresource.Carrier
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public String getCarrier() {
        return carrier;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iae_lineresource.Carrier
     *
     * @param carrier the value for iae_lineresource.Carrier
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setCarrier(String carrier) {
        this.carrier = carrier == null ? null : carrier.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iae_lineresource.ExpectArrivalDate
     *
     * @return the value of iae_lineresource.ExpectArrivalDate
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public Date getExpectarrivaldate() {
        return expectarrivaldate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iae_lineresource.ExpectArrivalDate
     *
     * @param expectarrivaldate the value for iae_lineresource.ExpectArrivalDate
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setExpectarrivaldate(Date expectarrivaldate) {
        this.expectarrivaldate = expectarrivaldate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iae_lineresource.ExpectDepartureDate
     *
     * @return the value of iae_lineresource.ExpectDepartureDate
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public Date getExpectdeparturedate() {
        return expectdeparturedate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iae_lineresource.ExpectDepartureDate
     *
     * @param expectdeparturedate the value for iae_lineresource.ExpectDepartureDate
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setExpectdeparturedate(Date expectdeparturedate) {
        this.expectdeparturedate = expectdeparturedate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iae_lineresource.Ticket
     *
     * @return the value of iae_lineresource.Ticket
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public Integer getTicket() {
        return ticket;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iae_lineresource.Ticket
     *
     * @param ticket the value for iae_lineresource.Ticket
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setTicket(Integer ticket) {
        this.ticket = ticket;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iae_lineresource.Cargo
     *
     * @return the value of iae_lineresource.Cargo
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public Integer getCargo() {
        return cargo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iae_lineresource.Cargo
     *
     * @param cargo the value for iae_lineresource.Cargo
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setCargo(Integer cargo) {
        this.cargo = cargo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iae_lineresource.Weight
     *
     * @return the value of iae_lineresource.Weight
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public BigDecimal getWeight() {
        return weight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iae_lineresource.Weight
     *
     * @param weight the value for iae_lineresource.Weight
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iae_lineresource.Volume
     *
     * @return the value of iae_lineresource.Volume
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public BigDecimal getVolume() {
        return volume;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iae_lineresource.Volume
     *
     * @param volume the value for iae_lineresource.Volume
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setVolume(BigDecimal volume) {
        this.volume = volume;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iae_lineresource.HandlePerson
     *
     * @return the value of iae_lineresource.HandlePerson
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public String getHandleperson() {
        return handleperson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iae_lineresource.HandlePerson
     *
     * @param handleperson the value for iae_lineresource.HandlePerson
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setHandleperson(String handleperson) {
        this.handleperson = handleperson == null ? null : handleperson.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iae_lineresource.HandleDate
     *
     * @return the value of iae_lineresource.HandleDate
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public Date getHandledate() {
        return handledate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iae_lineresource.HandleDate
     *
     * @param handledate the value for iae_lineresource.HandleDate
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setHandledate(Date handledate) {
        this.handledate = handledate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iae_lineresource.EnterPerson
     *
     * @return the value of iae_lineresource.EnterPerson
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public Integer getEnterperson() {
        return enterperson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iae_lineresource.EnterPerson
     *
     * @param enterperson the value for iae_lineresource.EnterPerson
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setEnterperson(Integer enterperson) {
        this.enterperson = enterperson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iae_lineresource.EnterDate
     *
     * @return the value of iae_lineresource.EnterDate
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public Date getEnterdate() {
        return enterdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iae_lineresource.EnterDate
     *
     * @param enterdate the value for iae_lineresource.EnterDate
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setEnterdate(Date enterdate) {
        this.enterdate = enterdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iae_lineresource.EnterCompany
     *
     * @return the value of iae_lineresource.EnterCompany
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public String getEntercompany() {
        return entercompany;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iae_lineresource.EnterCompany
     *
     * @param entercompany the value for iae_lineresource.EnterCompany
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setEntercompany(String entercompany) {
        this.entercompany = entercompany == null ? null : entercompany.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iae_lineresource.AcceptPerson
     *
     * @return the value of iae_lineresource.AcceptPerson
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public Integer getAcceptperson() {
        return acceptperson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iae_lineresource.AcceptPerson
     *
     * @param acceptperson the value for iae_lineresource.AcceptPerson
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setAcceptperson(Integer acceptperson) {
        this.acceptperson = acceptperson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iae_lineresource.AcceptDate
     *
     * @return the value of iae_lineresource.AcceptDate
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public Date getAcceptdate() {
        return acceptdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iae_lineresource.AcceptDate
     *
     * @param acceptdate the value for iae_lineresource.AcceptDate
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setAcceptdate(Date acceptdate) {
        this.acceptdate = acceptdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iae_lineresource.AcceptCompany
     *
     * @return the value of iae_lineresource.AcceptCompany
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public String getAcceptcompany() {
        return acceptcompany;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iae_lineresource.AcceptCompany
     *
     * @param acceptcompany the value for iae_lineresource.AcceptCompany
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setAcceptcompany(String acceptcompany) {
        this.acceptcompany = acceptcompany == null ? null : acceptcompany.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iae_lineresource.AbnormalRemarks
     *
     * @return the value of iae_lineresource.AbnormalRemarks
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public String getAbnormalremarks() {
        return abnormalremarks;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iae_lineresource.AbnormalRemarks
     *
     * @param abnormalremarks the value for iae_lineresource.AbnormalRemarks
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setAbnormalremarks(String abnormalremarks) {
        this.abnormalremarks = abnormalremarks == null ? null : abnormalremarks.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iae_lineresource.WorkInt
     *
     * @return the value of iae_lineresource.WorkInt
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public String getWorkint() {
        return workint;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iae_lineresource.WorkInt
     *
     * @param workint the value for iae_lineresource.WorkInt
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setWorkint(String workint) {
        this.workint = workint == null ? null : workint.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iae_lineresource.Transfer
     *
     * @return the value of iae_lineresource.Transfer
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public Boolean getTransfer() {
        return transfer;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iae_lineresource.Transfer
     *
     * @param transfer the value for iae_lineresource.Transfer
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setTransfer(Boolean transfer) {
        this.transfer = transfer;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iae_lineresource.ActualCount
     *
     * @return the value of iae_lineresource.ActualCount
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public Integer getActualcount() {
        return actualcount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iae_lineresource.ActualCount
     *
     * @param actualcount the value for iae_lineresource.ActualCount
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setActualcount(Integer actualcount) {
        this.actualcount = actualcount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iae_lineresource.Destination
     *
     * @return the value of iae_lineresource.Destination
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public String getDestination() {
        return destination;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iae_lineresource.Destination
     *
     * @param destination the value for iae_lineresource.Destination
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setDestination(String destination) {
        this.destination = destination == null ? null : destination.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iae_lineresource.WareName
     *
     * @return the value of iae_lineresource.WareName
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public String getWarename() {
        return warename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iae_lineresource.WareName
     *
     * @param warename the value for iae_lineresource.WareName
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setWarename(String warename) {
        this.warename = warename == null ? null : warename.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iae_lineresource.ActualVolume
     *
     * @return the value of iae_lineresource.ActualVolume
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public BigDecimal getActualvolume() {
        return actualvolume;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iae_lineresource.ActualVolume
     *
     * @param actualvolume the value for iae_lineresource.ActualVolume
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setActualvolume(BigDecimal actualvolume) {
        this.actualvolume = actualvolume;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iae_lineresource.TimeLimit
     *
     * @return the value of iae_lineresource.TimeLimit
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public Date getTimelimit() {
        return timelimit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iae_lineresource.TimeLimit
     *
     * @param timelimit the value for iae_lineresource.TimeLimit
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setTimelimit(Date timelimit) {
        this.timelimit = timelimit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iae_lineresource.Ask
     *
     * @return the value of iae_lineresource.Ask
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public String getAsk() {
        return ask;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iae_lineresource.Ask
     *
     * @param ask the value for iae_lineresource.Ask
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setAsk(String ask) {
        this.ask = ask == null ? null : ask.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iae_lineresource.TakeCargoPerson
     *
     * @return the value of iae_lineresource.TakeCargoPerson
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public String getTakecargoperson() {
        return takecargoperson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iae_lineresource.TakeCargoPerson
     *
     * @param takecargoperson the value for iae_lineresource.TakeCargoPerson
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setTakecargoperson(String takecargoperson) {
        this.takecargoperson = takecargoperson == null ? null : takecargoperson.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iae_lineresource.TackCargoAddress
     *
     * @return the value of iae_lineresource.TackCargoAddress
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public String getTackcargoaddress() {
        return tackcargoaddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iae_lineresource.TackCargoAddress
     *
     * @param tackcargoaddress the value for iae_lineresource.TackCargoAddress
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setTackcargoaddress(String tackcargoaddress) {
        this.tackcargoaddress = tackcargoaddress == null ? null : tackcargoaddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iae_lineresource.Payment
     *
     * @return the value of iae_lineresource.Payment
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public Integer getPayment() {
        return payment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iae_lineresource.Payment
     *
     * @param payment the value for iae_lineresource.Payment
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setPayment(Integer payment) {
        this.payment = payment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iae_lineresource.SpecialEnsure
     *
     * @return the value of iae_lineresource.SpecialEnsure
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public String getSpecialensure() {
        return specialensure;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iae_lineresource.SpecialEnsure
     *
     * @param specialensure the value for iae_lineresource.SpecialEnsure
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setSpecialensure(String specialensure) {
        this.specialensure = specialensure == null ? null : specialensure.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iae_lineresource.DeliveryType
     *
     * @return the value of iae_lineresource.DeliveryType
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public Boolean getDeliverytype() {
        return deliverytype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iae_lineresource.DeliveryType
     *
     * @param deliverytype the value for iae_lineresource.DeliveryType
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setDeliverytype(Boolean deliverytype) {
        this.deliverytype = deliverytype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iae_lineresource.ImportantHints
     *
     * @return the value of iae_lineresource.ImportantHints
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public String getImportanthints() {
        return importanthints;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iae_lineresource.ImportantHints
     *
     * @param importanthints the value for iae_lineresource.ImportantHints
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setImportanthints(String importanthints) {
        this.importanthints = importanthints == null ? null : importanthints.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iae_lineresource.SurplusTime
     *
     * @return the value of iae_lineresource.SurplusTime
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public Date getSurplustime() {
        return surplustime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iae_lineresource.SurplusTime
     *
     * @param surplustime the value for iae_lineresource.SurplusTime
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setSurplustime(Date surplustime) {
        this.surplustime = surplustime;
    }
}