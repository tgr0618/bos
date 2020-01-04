package zjs.entity;

import lombok.Data;

@Data
public class BasZonecustominfo {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bas_zonecustominfo.CustomCode
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private Integer customcode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bas_zonecustominfo.CustomName
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private String customname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bas_zonecustominfo.MobileNo
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private Integer mobileno;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bas_zonecustominfo.CityName
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private String cityname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bas_zonecustominfo.CstomAddress
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private String cstomaddress;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bas_zonecustominfo.ZoneInfoID
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private Integer zoneinfoid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bas_zonecustominfo.CustomCode
     *
     * @return the value of bas_zonecustominfo.CustomCode
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public Integer getCustomcode() {
        return customcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bas_zonecustominfo.CustomCode
     *
     * @param customcode the value for bas_zonecustominfo.CustomCode
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setCustomcode(Integer customcode) {
        this.customcode = customcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bas_zonecustominfo.CustomName
     *
     * @return the value of bas_zonecustominfo.CustomName
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public String getCustomname() {
        return customname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bas_zonecustominfo.CustomName
     *
     * @param customname the value for bas_zonecustominfo.CustomName
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setCustomname(String customname) {
        this.customname = customname == null ? null : customname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bas_zonecustominfo.MobileNo
     *
     * @return the value of bas_zonecustominfo.MobileNo
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public Integer getMobileno() {
        return mobileno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bas_zonecustominfo.MobileNo
     *
     * @param mobileno the value for bas_zonecustominfo.MobileNo
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setMobileno(Integer mobileno) {
        this.mobileno = mobileno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bas_zonecustominfo.CityName
     *
     * @return the value of bas_zonecustominfo.CityName
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public String getCityname() {
        return cityname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bas_zonecustominfo.CityName
     *
     * @param cityname the value for bas_zonecustominfo.CityName
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setCityname(String cityname) {
        this.cityname = cityname == null ? null : cityname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bas_zonecustominfo.CstomAddress
     *
     * @return the value of bas_zonecustominfo.CstomAddress
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public String getCstomaddress() {
        return cstomaddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bas_zonecustominfo.CstomAddress
     *
     * @param cstomaddress the value for bas_zonecustominfo.CstomAddress
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setCstomaddress(String cstomaddress) {
        this.cstomaddress = cstomaddress == null ? null : cstomaddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bas_zonecustominfo.ZoneInfoID
     *
     * @return the value of bas_zonecustominfo.ZoneInfoID
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public Integer getZoneinfoid() {
        return zoneinfoid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bas_zonecustominfo.ZoneInfoID
     *
     * @param zoneinfoid the value for bas_zonecustominfo.ZoneInfoID
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setZoneinfoid(Integer zoneinfoid) {
        this.zoneinfoid = zoneinfoid;
    }
}