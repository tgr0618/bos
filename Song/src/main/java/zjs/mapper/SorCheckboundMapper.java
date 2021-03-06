package zjs.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import zjs.entity.SorCheckbound;
import zjs.entity.SorCheckboundExample;
@Repository
public interface SorCheckboundMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sor_checkbound
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    int countByExample(SorCheckboundExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sor_checkbound
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    int deleteByExample(SorCheckboundExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sor_checkbound
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sor_checkbound
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    int insert(SorCheckbound record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sor_checkbound
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    int insertSelective(SorCheckbound record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sor_checkbound
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    List<SorCheckbound> selectByExample(SorCheckboundExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sor_checkbound
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    SorCheckbound selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sor_checkbound
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    int updateByExampleSelective(@Param("record") SorCheckbound record, @Param("example") SorCheckboundExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sor_checkbound
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    int updateByExample(@Param("record") SorCheckbound record, @Param("example") SorCheckboundExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sor_checkbound
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    int updateByPrimaryKeySelective(SorCheckbound record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sor_checkbound
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    int updateByPrimaryKey(SorCheckbound record);
}