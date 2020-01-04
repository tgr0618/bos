package zjs.entity;

import lombok.Data;

import java.util.Date;
@Data
public class LogTrack {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column log_track.ID
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column log_track.LineType
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private String linetype;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column log_track.LineName
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private String linename;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column log_track.LogisticsCar
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private String logisticscar;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column log_track.LineState
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private Boolean linestate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column log_track.NodeName
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private String nodename;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column log_track.StartTime
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private Date starttime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column log_track.ArrivalTime
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private Date arrivaltime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column log_track.CarInt
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private String carint;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column log_track.NextNodeLoad
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private String nextnodeload;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column log_track.Describe
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    private String describe;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column log_track.ID
     *
     * @return the value of log_track.ID
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column log_track.ID
     *
     * @param id the value for log_track.ID
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column log_track.LineType
     *
     * @return the value of log_track.LineType
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public String getLinetype() {
        return linetype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column log_track.LineType
     *
     * @param linetype the value for log_track.LineType
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setLinetype(String linetype) {
        this.linetype = linetype == null ? null : linetype.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column log_track.LineName
     *
     * @return the value of log_track.LineName
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public String getLinename() {
        return linename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column log_track.LineName
     *
     * @param linename the value for log_track.LineName
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setLinename(String linename) {
        this.linename = linename == null ? null : linename.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column log_track.LogisticsCar
     *
     * @return the value of log_track.LogisticsCar
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public String getLogisticscar() {
        return logisticscar;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column log_track.LogisticsCar
     *
     * @param logisticscar the value for log_track.LogisticsCar
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setLogisticscar(String logisticscar) {
        this.logisticscar = logisticscar == null ? null : logisticscar.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column log_track.LineState
     *
     * @return the value of log_track.LineState
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public Boolean getLinestate() {
        return linestate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column log_track.LineState
     *
     * @param linestate the value for log_track.LineState
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setLinestate(Boolean linestate) {
        this.linestate = linestate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column log_track.NodeName
     *
     * @return the value of log_track.NodeName
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public String getNodename() {
        return nodename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column log_track.NodeName
     *
     * @param nodename the value for log_track.NodeName
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setNodename(String nodename) {
        this.nodename = nodename == null ? null : nodename.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column log_track.StartTime
     *
     * @return the value of log_track.StartTime
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public Date getStarttime() {
        return starttime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column log_track.StartTime
     *
     * @param starttime the value for log_track.StartTime
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column log_track.ArrivalTime
     *
     * @return the value of log_track.ArrivalTime
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public Date getArrivaltime() {
        return arrivaltime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column log_track.ArrivalTime
     *
     * @param arrivaltime the value for log_track.ArrivalTime
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setArrivaltime(Date arrivaltime) {
        this.arrivaltime = arrivaltime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column log_track.CarInt
     *
     * @return the value of log_track.CarInt
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public String getCarint() {
        return carint;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column log_track.CarInt
     *
     * @param carint the value for log_track.CarInt
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setCarint(String carint) {
        this.carint = carint == null ? null : carint.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column log_track.NextNodeLoad
     *
     * @return the value of log_track.NextNodeLoad
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public String getNextnodeload() {
        return nextnodeload;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column log_track.NextNodeLoad
     *
     * @param nextnodeload the value for log_track.NextNodeLoad
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setNextnodeload(String nextnodeload) {
        this.nextnodeload = nextnodeload == null ? null : nextnodeload.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column log_track.Describe
     *
     * @return the value of log_track.Describe
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public String getDescribe() {
        return describe;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column log_track.Describe
     *
     * @param describe the value for log_track.Describe
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    public void setDescribe(String describe) {
        this.describe = describe == null ? null : describe.trim();
    }
}