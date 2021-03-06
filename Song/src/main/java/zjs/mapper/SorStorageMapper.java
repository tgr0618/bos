package zjs.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import zjs.entity.SorStorage;
import zjs.entity.SorStorageExample;
@Repository
public interface SorStorageMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sor_storage
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    int countByExample(SorStorageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sor_storage
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    int deleteByExample(SorStorageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sor_storage
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sor_storage
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    int insert(SorStorage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sor_storage
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    int insertSelective(SorStorage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sor_storage
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    List<SorStorage> selectByExample(SorStorageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sor_storage
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    SorStorage selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sor_storage
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    int updateByExampleSelective(@Param("record") SorStorage record, @Param("example") SorStorageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sor_storage
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    int updateByExample(@Param("record") SorStorage record, @Param("example") SorStorageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sor_storage
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    int updateByPrimaryKeySelective(SorStorage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sor_storage
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    int updateByPrimaryKey(SorStorage record);
}