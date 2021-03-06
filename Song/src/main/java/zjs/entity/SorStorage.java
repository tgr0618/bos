package zjs.entity;

import lombok.Data;

import java.util.Date;
@Data
public class SorStorage {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sor_storage.ID
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sor_storage.AcceptDate
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private Date acceptdate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sor_storage.AcceptPerson
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private Integer acceptperson;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sor_storage.AcceptCompany
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private String acceptcompany;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sor_storage.DeliveryPerson
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private Integer deliveryperson;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sor_storage.DeliveryCompany
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private String deliverycompany;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sor_storage.ID
     *
     * @return the value of sor_storage.ID
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sor_storage.ID
     *
     * @param id the value for sor_storage.ID
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sor_storage.AcceptDate
     *
     * @return the value of sor_storage.AcceptDate
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public Date getAcceptdate() {
        return acceptdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sor_storage.AcceptDate
     *
     * @param acceptdate the value for sor_storage.AcceptDate
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setAcceptdate(Date acceptdate) {
        this.acceptdate = acceptdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sor_storage.AcceptPerson
     *
     * @return the value of sor_storage.AcceptPerson
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public Integer getAcceptperson() {
        return acceptperson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sor_storage.AcceptPerson
     *
     * @param acceptperson the value for sor_storage.AcceptPerson
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setAcceptperson(Integer acceptperson) {
        this.acceptperson = acceptperson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sor_storage.AcceptCompany
     *
     * @return the value of sor_storage.AcceptCompany
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public String getAcceptcompany() {
        return acceptcompany;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sor_storage.AcceptCompany
     *
     * @param acceptcompany the value for sor_storage.AcceptCompany
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setAcceptcompany(String acceptcompany) {
        this.acceptcompany = acceptcompany == null ? null : acceptcompany.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sor_storage.DeliveryPerson
     *
     * @return the value of sor_storage.DeliveryPerson
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public Integer getDeliveryperson() {
        return deliveryperson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sor_storage.DeliveryPerson
     *
     * @param deliveryperson the value for sor_storage.DeliveryPerson
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setDeliveryperson(Integer deliveryperson) {
        this.deliveryperson = deliveryperson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sor_storage.DeliveryCompany
     *
     * @return the value of sor_storage.DeliveryCompany
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public String getDeliverycompany() {
        return deliverycompany;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sor_storage.DeliveryCompany
     *
     * @param deliverycompany the value for sor_storage.DeliveryCompany
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setDeliverycompany(String deliverycompany) {
        this.deliverycompany = deliverycompany == null ? null : deliverycompany.trim();
    }
}