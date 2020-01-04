package zjs.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import zjs.entity.SorStoragedetails;
import zjs.entity.SorStoragedetailsExample;
@Repository
public interface SorStoragedetailsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sor_storagedetails
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    int countByExample(SorStoragedetailsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sor_storagedetails
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    int deleteByExample(SorStoragedetailsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sor_storagedetails
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sor_storagedetails
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    int insert(SorStoragedetails record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sor_storagedetails
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    int insertSelective(SorStoragedetails record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sor_storagedetails
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    List<SorStoragedetails> selectByExample(SorStoragedetailsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sor_storagedetails
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    SorStoragedetails selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sor_storagedetails
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    int updateByExampleSelective(@Param("record") SorStoragedetails record, @Param("example") SorStoragedetailsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sor_storagedetails
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    int updateByExample(@Param("record") SorStoragedetails record, @Param("example") SorStoragedetailsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sor_storagedetails
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    int updateByPrimaryKeySelective(SorStoragedetails record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sor_storagedetails
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    int updateByPrimaryKey(SorStoragedetails record);
}