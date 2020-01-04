package zjs.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import zjs.entity.BasPartition;
import zjs.entity.BasPartitionExample;
@Repository
public interface BasPartitionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bas_partition
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    int countByExample(BasPartitionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bas_partition
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    int deleteByExample(BasPartitionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bas_partition
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bas_partition
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    int insert(BasPartition record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bas_partition
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    int insertSelective(BasPartition record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bas_partition
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    List<BasPartition> selectByExample(BasPartitionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bas_partition
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    BasPartition selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bas_partition
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    int updateByExampleSelective(@Param("record") BasPartition record, @Param("example") BasPartitionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bas_partition
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    int updateByExample(@Param("record") BasPartition record, @Param("example") BasPartitionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bas_partition
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    int updateByPrimaryKeySelective(BasPartition record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bas_partition
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    int updateByPrimaryKey(BasPartition record);
}