package zjs.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import zjs.entity.BasAssociatemember;
import zjs.entity.BasAssociatememberExample;
@Repository
public interface BasAssociatememberMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bas_associatemember
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    int countByExample(BasAssociatememberExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bas_associatemember
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    int deleteByExample(BasAssociatememberExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bas_associatemember
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bas_associatemember
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    int insert(BasAssociatemember record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bas_associatemember
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    int insertSelective(BasAssociatemember record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bas_associatemember
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    List<BasAssociatemember> selectByExample(BasAssociatememberExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bas_associatemember
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    BasAssociatemember selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bas_associatemember
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    int updateByExampleSelective(@Param("record") BasAssociatemember record, @Param("example") BasAssociatememberExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bas_associatemember
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    int updateByExample(@Param("record") BasAssociatemember record, @Param("example") BasAssociatememberExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bas_associatemember
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    int updateByPrimaryKeySelective(BasAssociatemember record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bas_associatemember
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    int updateByPrimaryKey(BasAssociatemember record);
}