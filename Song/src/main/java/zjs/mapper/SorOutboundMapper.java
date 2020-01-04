package zjs.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import zjs.entity.SorOutbound;
import zjs.entity.SorOutboundExample;
@Repository
public interface SorOutboundMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sor_outbound
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    int countByExample(SorOutboundExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sor_outbound
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    int deleteByExample(SorOutboundExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sor_outbound
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    int deleteByPrimaryKey(String outboundid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sor_outbound
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    int insert(SorOutbound record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sor_outbound
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    int insertSelective(SorOutbound record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sor_outbound
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    List<SorOutbound> selectByExample(SorOutboundExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sor_outbound
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    SorOutbound selectByPrimaryKey(String outboundid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sor_outbound
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    int updateByExampleSelective(@Param("record") SorOutbound record, @Param("example") SorOutboundExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sor_outbound
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    int updateByExample(@Param("record") SorOutbound record, @Param("example") SorOutboundExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sor_outbound
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    int updateByPrimaryKeySelective(SorOutbound record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sor_outbound
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    int updateByPrimaryKey(SorOutbound record);
}