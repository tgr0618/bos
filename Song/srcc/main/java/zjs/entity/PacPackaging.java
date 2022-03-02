package zjs.entity;

import lombok.Data;

import java.util.Date;
@Data
public class PacPackaging {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pac_packaging.ID
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pac_packaging.ItemCode
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private String itemcode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pac_packaging.ItemName
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private String itemname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pac_packaging.PlannedPrice
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private Float plannedprice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pac_packaging.Specifications
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private String specifications;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pac_packaging.type
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private Boolean type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pac_packaging.Status
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private Boolean status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pac_packaging.OperatorID
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private Integer operatorid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pac_packaging.OperationUnitID
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private Integer operationunitid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pac_packaging.MeasurementUnit
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private String measurementunit;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pac_packaging.OperationTime
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private Date operationtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pac_packaging.InvalidateJobInt
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private Integer invalidatejobint;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pac_packaging.InvalidateName
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private Integer invalidatename;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pac_packaging.InvalidateTime
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private Date invalidatetime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pac_packaging.ID
     *
     * @return the value of pac_packaging.ID
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pac_packaging.ID
     *
     * @param id the value for pac_packaging.ID
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pac_packaging.ItemCode
     *
     * @return the value of pac_packaging.ItemCode
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public String getItemcode() {
        return itemcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pac_packaging.ItemCode
     *
     * @param itemcode the value for pac_packaging.ItemCode
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setItemcode(String itemcode) {
        this.itemcode = itemcode == null ? null : itemcode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pac_packaging.ItemName
     *
     * @return the value of pac_packaging.ItemName
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public String getItemname() {
        return itemname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pac_packaging.ItemName
     *
     * @param itemname the value for pac_packaging.ItemName
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setItemname(String itemname) {
        this.itemname = itemname == null ? null : itemname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pac_packaging.PlannedPrice
     *
     * @return the value of pac_packaging.PlannedPrice
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public Float getPlannedprice() {
        return plannedprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pac_packaging.PlannedPrice
     *
     * @param plannedprice the value for pac_packaging.PlannedPrice
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setPlannedprice(Float plannedprice) {
        this.plannedprice = plannedprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pac_packaging.Specifications
     *
     * @return the value of pac_packaging.Specifications
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public String getSpecifications() {
        return specifications;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pac_packaging.Specifications
     *
     * @param specifications the value for pac_packaging.Specifications
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setSpecifications(String specifications) {
        this.specifications = specifications == null ? null : specifications.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pac_packaging.type
     *
     * @return the value of pac_packaging.type
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public Boolean getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pac_packaging.type
     *
     * @param type the value for pac_packaging.type
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setType(Boolean type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pac_packaging.Status
     *
     * @return the value of pac_packaging.Status
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pac_packaging.Status
     *
     * @param status the value for pac_packaging.Status
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pac_packaging.OperatorID
     *
     * @return the value of pac_packaging.OperatorID
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public Integer getOperatorid() {
        return operatorid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pac_packaging.OperatorID
     *
     * @param operatorid the value for pac_packaging.OperatorID
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setOperatorid(Integer operatorid) {
        this.operatorid = operatorid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pac_packaging.OperationUnitID
     *
     * @return the value of pac_packaging.OperationUnitID
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public Integer getOperationunitid() {
        return operationunitid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pac_packaging.OperationUnitID
     *
     * @param operationunitid the value for pac_packaging.OperationUnitID
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setOperationunitid(Integer operationunitid) {
        this.operationunitid = operationunitid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pac_packaging.MeasurementUnit
     *
     * @return the value of pac_packaging.MeasurementUnit
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public String getMeasurementunit() {
        return measurementunit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pac_packaging.MeasurementUnit
     *
     * @param measurementunit the value for pac_packaging.MeasurementUnit
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setMeasurementunit(String measurementunit) {
        this.measurementunit = measurementunit == null ? null : measurementunit.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pac_packaging.OperationTime
     *
     * @return the value of pac_packaging.OperationTime
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public Date getOperationtime() {
        return operationtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pac_packaging.OperationTime
     *
     * @param operationtime the value for pac_packaging.OperationTime
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setOperationtime(Date operationtime) {
        this.operationtime = operationtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pac_packaging.InvalidateJobInt
     *
     * @return the value of pac_packaging.InvalidateJobInt
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public Integer getInvalidatejobint() {
        return invalidatejobint;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pac_packaging.InvalidateJobInt
     *
     * @param invalidatejobint the value for pac_packaging.InvalidateJobInt
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setInvalidatejobint(Integer invalidatejobint) {
        this.invalidatejobint = invalidatejobint;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pac_packaging.InvalidateName
     *
     * @return the value of pac_packaging.InvalidateName
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public Integer getInvalidatename() {
        return invalidatename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pac_packaging.InvalidateName
     *
     * @param invalidatename the value for pac_packaging.InvalidateName
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setInvalidatename(Integer invalidatename) {
        this.invalidatename = invalidatename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pac_packaging.InvalidateTime
     *
     * @return the value of pac_packaging.InvalidateTime
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public Date getInvalidatetime() {
        return invalidatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pac_packaging.InvalidateTime
     *
     * @param invalidatetime the value for pac_packaging.InvalidateTime
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setInvalidatetime(Date invalidatetime) {
        this.invalidatetime = invalidatetime;
    }
}