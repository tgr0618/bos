package zjs.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import zjs.entity.PacPackaging;
import zjs.entity.PacPackagingExample;
@Repository
public interface PacPackagingMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pac_packaging
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    int countByExample(PacPackagingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pac_packaging
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    int deleteByExample(PacPackagingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pac_packaging
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pac_packaging
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    int insert(PacPackaging record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pac_packaging
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    int insertSelective(PacPackaging record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pac_packaging
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    List<PacPackaging> selectByExample(PacPackagingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pac_packaging
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    PacPackaging selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pac_packaging
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    int updateByExampleSelective(@Param("record") PacPackaging record, @Param("example") PacPackagingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pac_packaging
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    int updateByExample(@Param("record") PacPackaging record, @Param("example") PacPackagingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pac_packaging
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    int updateByPrimaryKeySelective(PacPackaging record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pac_packaging
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    int updateByPrimaryKey(PacPackaging record);
}