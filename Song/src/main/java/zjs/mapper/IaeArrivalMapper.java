package zjs.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import zjs.entity.IaeArrival;
import zjs.entity.IaeArrivalExample;
@Repository
public interface IaeArrivalMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iae_arrival
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    int countByExample(IaeArrivalExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iae_arrival
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    int deleteByExample(IaeArrivalExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iae_arrival
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iae_arrival
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    int insert(IaeArrival record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iae_arrival
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    int insertSelective(IaeArrival record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iae_arrival
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    List<IaeArrival> selectByExample(IaeArrivalExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iae_arrival
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    IaeArrival selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iae_arrival
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    int updateByExampleSelective(@Param("record") IaeArrival record, @Param("example") IaeArrivalExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iae_arrival
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    int updateByExample(@Param("record") IaeArrival record, @Param("example") IaeArrivalExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iae_arrival
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    int updateByPrimaryKeySelective(IaeArrival record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iae_arrival
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    int updateByPrimaryKey(IaeArrival record);
}