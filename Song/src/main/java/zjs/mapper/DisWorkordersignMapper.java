package zjs.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import zjs.entity.DisWorkordersign;
import zjs.entity.DisWorkordersignExample;
@Repository
public interface DisWorkordersignMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dis_workordersign
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    int countByExample(DisWorkordersignExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dis_workordersign
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    int deleteByExample(DisWorkordersignExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dis_workordersign
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dis_workordersign
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    int insert(DisWorkordersign record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dis_workordersign
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    int insertSelective(DisWorkordersign record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dis_workordersign
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    List<DisWorkordersign> selectByExample(DisWorkordersignExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dis_workordersign
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    DisWorkordersign selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dis_workordersign
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    int updateByExampleSelective(@Param("record") DisWorkordersign record, @Param("example") DisWorkordersignExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dis_workordersign
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    int updateByExample(@Param("record") DisWorkordersign record, @Param("example") DisWorkordersignExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dis_workordersign
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    int updateByPrimaryKeySelective(DisWorkordersign record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dis_workordersign
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    int updateByPrimaryKey(DisWorkordersign record);
}