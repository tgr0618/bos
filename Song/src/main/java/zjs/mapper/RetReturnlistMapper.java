package zjs.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import zjs.entity.RetReturnlist;
import zjs.entity.RetReturnlistExample;
@Repository
public interface RetReturnlistMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ret_returnlist
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    int countByExample(RetReturnlistExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ret_returnlist
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    int deleteByExample(RetReturnlistExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ret_returnlist
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ret_returnlist
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    int insert(RetReturnlist record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ret_returnlist
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    int insertSelective(RetReturnlist record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ret_returnlist
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    List<RetReturnlist> selectByExample(RetReturnlistExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ret_returnlist
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    RetReturnlist selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ret_returnlist
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    int updateByExampleSelective(@Param("record") RetReturnlist record, @Param("example") RetReturnlistExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ret_returnlist
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    int updateByExample(@Param("record") RetReturnlist record, @Param("example") RetReturnlistExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ret_returnlist
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    int updateByPrimaryKeySelective(RetReturnlist record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ret_returnlist
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    int updateByPrimaryKey(RetReturnlist record);
}