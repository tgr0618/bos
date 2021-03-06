package zjs.entity;

import lombok.Data;

import java.util.Date;
@Data
public class PacStock {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pac_stock.ID
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pac_stock.WarehouseNo
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private String warehouseno;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pac_stock.ReservoirType
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private Boolean reservoirtype;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pac_stock.Transport
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private String transport;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pac_stock.SubordinateUnit
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private String subordinateunit;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pac_stock.DrawerNo
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private Integer drawerno;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pac_stock.DrawerName
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private String drawername;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pac_stock.DrawerTime
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private Date drawertime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pac_stock.Remark
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private String remark;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pac_stock.ID
     *
     * @return the value of pac_stock.ID
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pac_stock.ID
     *
     * @param id the value for pac_stock.ID
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pac_stock.WarehouseNo
     *
     * @return the value of pac_stock.WarehouseNo
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public String getWarehouseno() {
        return warehouseno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pac_stock.WarehouseNo
     *
     * @param warehouseno the value for pac_stock.WarehouseNo
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setWarehouseno(String warehouseno) {
        this.warehouseno = warehouseno == null ? null : warehouseno.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pac_stock.ReservoirType
     *
     * @return the value of pac_stock.ReservoirType
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public Boolean getReservoirtype() {
        return reservoirtype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pac_stock.ReservoirType
     *
     * @param reservoirtype the value for pac_stock.ReservoirType
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setReservoirtype(Boolean reservoirtype) {
        this.reservoirtype = reservoirtype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pac_stock.Transport
     *
     * @return the value of pac_stock.Transport
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public String getTransport() {
        return transport;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pac_stock.Transport
     *
     * @param transport the value for pac_stock.Transport
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setTransport(String transport) {
        this.transport = transport == null ? null : transport.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pac_stock.SubordinateUnit
     *
     * @return the value of pac_stock.SubordinateUnit
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public String getSubordinateunit() {
        return subordinateunit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pac_stock.SubordinateUnit
     *
     * @param subordinateunit the value for pac_stock.SubordinateUnit
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setSubordinateunit(String subordinateunit) {
        this.subordinateunit = subordinateunit == null ? null : subordinateunit.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pac_stock.DrawerNo
     *
     * @return the value of pac_stock.DrawerNo
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public Integer getDrawerno() {
        return drawerno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pac_stock.DrawerNo
     *
     * @param drawerno the value for pac_stock.DrawerNo
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setDrawerno(Integer drawerno) {
        this.drawerno = drawerno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pac_stock.DrawerName
     *
     * @return the value of pac_stock.DrawerName
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public String getDrawername() {
        return drawername;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pac_stock.DrawerName
     *
     * @param drawername the value for pac_stock.DrawerName
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setDrawername(String drawername) {
        this.drawername = drawername == null ? null : drawername.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pac_stock.DrawerTime
     *
     * @return the value of pac_stock.DrawerTime
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public Date getDrawertime() {
        return drawertime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pac_stock.DrawerTime
     *
     * @param drawertime the value for pac_stock.DrawerTime
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setDrawertime(Date drawertime) {
        this.drawertime = drawertime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pac_stock.Remark
     *
     * @return the value of pac_stock.Remark
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pac_stock.Remark
     *
     * @param remark the value for pac_stock.Remark
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}