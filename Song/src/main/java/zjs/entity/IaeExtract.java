package zjs.entity;

import lombok.Data;

import java.util.Date;
@Data
public class IaeExtract {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iae_extract.ID
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iae_extract.VehicleInt
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private String vehicleint;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iae_extract.TransportWay
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private String transportway;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iae_extract.WaybillID
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private String waybillid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iae_extract.EstimateDate
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private Date estimatedate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iae_extract.CargoN
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private Integer cargon;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column iae_extract.ImportantHints
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private String importanthints;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iae_extract.ID
     *
     * @return the value of iae_extract.ID
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iae_extract.ID
     *
     * @param id the value for iae_extract.ID
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iae_extract.VehicleInt
     *
     * @return the value of iae_extract.VehicleInt
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public String getVehicleint() {
        return vehicleint;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iae_extract.VehicleInt
     *
     * @param vehicleint the value for iae_extract.VehicleInt
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setVehicleint(String vehicleint) {
        this.vehicleint = vehicleint == null ? null : vehicleint.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iae_extract.TransportWay
     *
     * @return the value of iae_extract.TransportWay
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public String getTransportway() {
        return transportway;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iae_extract.TransportWay
     *
     * @param transportway the value for iae_extract.TransportWay
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setTransportway(String transportway) {
        this.transportway = transportway == null ? null : transportway.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iae_extract.WaybillID
     *
     * @return the value of iae_extract.WaybillID
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public String getWaybillid() {
        return waybillid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iae_extract.WaybillID
     *
     * @param waybillid the value for iae_extract.WaybillID
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setWaybillid(String waybillid) {
        this.waybillid = waybillid == null ? null : waybillid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iae_extract.EstimateDate
     *
     * @return the value of iae_extract.EstimateDate
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public Date getEstimatedate() {
        return estimatedate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iae_extract.EstimateDate
     *
     * @param estimatedate the value for iae_extract.EstimateDate
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setEstimatedate(Date estimatedate) {
        this.estimatedate = estimatedate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iae_extract.CargoN
     *
     * @return the value of iae_extract.CargoN
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public Integer getCargon() {
        return cargon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iae_extract.CargoN
     *
     * @param cargon the value for iae_extract.CargoN
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setCargon(Integer cargon) {
        this.cargon = cargon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column iae_extract.ImportantHints
     *
     * @return the value of iae_extract.ImportantHints
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public String getImportanthints() {
        return importanthints;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column iae_extract.ImportantHints
     *
     * @param importanthints the value for iae_extract.ImportantHints
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setImportanthints(String importanthints) {
        this.importanthints = importanthints == null ? null : importanthints.trim();
    }
}