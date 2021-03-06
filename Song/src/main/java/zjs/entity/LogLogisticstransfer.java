package zjs.entity;

import lombok.Data;

import java.util.Date;
@Data
public class LogLogisticstransfer {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column log_logisticstransfer.ID
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column log_logisticstransfer.TransferInt
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private String transferint;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column log_logisticstransfer.StartStation
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private String startstation;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column log_logisticstransfer.EndStation
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private String endstation;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column log_logisticstransfer.Dispatcher
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private String dispatcher;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column log_logisticstransfer.Driver
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private String driver;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column log_logisticstransfer.DeliveryPerson
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private Integer deliveryperson;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column log_logisticstransfer.DeliveryDate
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private Date deliverydate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column log_logisticstransfer.ID
     *
     * @return the value of log_logisticstransfer.ID
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column log_logisticstransfer.ID
     *
     * @param id the value for log_logisticstransfer.ID
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column log_logisticstransfer.TransferInt
     *
     * @return the value of log_logisticstransfer.TransferInt
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public String getTransferint() {
        return transferint;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column log_logisticstransfer.TransferInt
     *
     * @param transferint the value for log_logisticstransfer.TransferInt
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setTransferint(String transferint) {
        this.transferint = transferint == null ? null : transferint.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column log_logisticstransfer.StartStation
     *
     * @return the value of log_logisticstransfer.StartStation
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public String getStartstation() {
        return startstation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column log_logisticstransfer.StartStation
     *
     * @param startstation the value for log_logisticstransfer.StartStation
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setStartstation(String startstation) {
        this.startstation = startstation == null ? null : startstation.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column log_logisticstransfer.EndStation
     *
     * @return the value of log_logisticstransfer.EndStation
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public String getEndstation() {
        return endstation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column log_logisticstransfer.EndStation
     *
     * @param endstation the value for log_logisticstransfer.EndStation
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setEndstation(String endstation) {
        this.endstation = endstation == null ? null : endstation.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column log_logisticstransfer.Dispatcher
     *
     * @return the value of log_logisticstransfer.Dispatcher
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public String getDispatcher() {
        return dispatcher;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column log_logisticstransfer.Dispatcher
     *
     * @param dispatcher the value for log_logisticstransfer.Dispatcher
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setDispatcher(String dispatcher) {
        this.dispatcher = dispatcher == null ? null : dispatcher.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column log_logisticstransfer.Driver
     *
     * @return the value of log_logisticstransfer.Driver
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public String getDriver() {
        return driver;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column log_logisticstransfer.Driver
     *
     * @param driver the value for log_logisticstransfer.Driver
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setDriver(String driver) {
        this.driver = driver == null ? null : driver.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column log_logisticstransfer.DeliveryPerson
     *
     * @return the value of log_logisticstransfer.DeliveryPerson
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public Integer getDeliveryperson() {
        return deliveryperson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column log_logisticstransfer.DeliveryPerson
     *
     * @param deliveryperson the value for log_logisticstransfer.DeliveryPerson
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setDeliveryperson(Integer deliveryperson) {
        this.deliveryperson = deliveryperson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column log_logisticstransfer.DeliveryDate
     *
     * @return the value of log_logisticstransfer.DeliveryDate
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public Date getDeliverydate() {
        return deliverydate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column log_logisticstransfer.DeliveryDate
     *
     * @param deliverydate the value for log_logisticstransfer.DeliveryDate
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setDeliverydate(Date deliverydate) {
        this.deliverydate = deliverydate;
    }
}