package zjs.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import zjs.entity.IaeExtract;
import zjs.entity.IaeExtractExample;
@Repository
public interface IaeExtractMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iae_extract
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    int countByExample(IaeExtractExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iae_extract
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    int deleteByExample(IaeExtractExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iae_extract
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iae_extract
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    int insert(IaeExtract record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iae_extract
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    int insertSelective(IaeExtract record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iae_extract
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    List<IaeExtract> selectByExample(IaeExtractExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iae_extract
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    IaeExtract selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iae_extract
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    int updateByExampleSelective(@Param("record") IaeExtract record, @Param("example") IaeExtractExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iae_extract
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    int updateByExample(@Param("record") IaeExtract record, @Param("example") IaeExtractExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iae_extract
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    int updateByPrimaryKeySelective(IaeExtract record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iae_extract
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    int updateByPrimaryKey(IaeExtract record);
}