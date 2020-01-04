package zjs.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import zjs.entity.IaeLineresource;
import zjs.entity.IaeLineresourceExample;
@Repository
public interface IaeLineresourceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iae_lineresource
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    int countByExample(IaeLineresourceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iae_lineresource
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    int deleteByExample(IaeLineresourceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iae_lineresource
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iae_lineresource
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    int insert(IaeLineresource record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iae_lineresource
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    int insertSelective(IaeLineresource record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iae_lineresource
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    List<IaeLineresource> selectByExample(IaeLineresourceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iae_lineresource
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    IaeLineresource selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iae_lineresource
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    int updateByExampleSelective(@Param("record") IaeLineresource record, @Param("example") IaeLineresourceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iae_lineresource
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    int updateByExample(@Param("record") IaeLineresource record, @Param("example") IaeLineresourceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iae_lineresource
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    int updateByPrimaryKeySelective(IaeLineresource record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iae_lineresource
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    int updateByPrimaryKey(IaeLineresource record);
}