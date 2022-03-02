package zjs.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import zjs.entity.SyEmp;
import zjs.entity.SyEmpExample;
@Repository
public interface SyEmpMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sy_emp
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    int countByExample(SyEmpExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sy_emp
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    int deleteByExample(SyEmpExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sy_emp
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sy_emp
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    int insert(SyEmp record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sy_emp
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    int insertSelective(SyEmp record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sy_emp
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    List<SyEmp> selectByExample(SyEmpExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sy_emp
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    SyEmp selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sy_emp
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    int updateByExampleSelective(@Param("record") SyEmp record, @Param("example") SyEmpExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sy_emp
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    int updateByExample(@Param("record") SyEmp record, @Param("example") SyEmpExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sy_emp
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    int updateByPrimaryKeySelective(SyEmp record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sy_emp
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    int updateByPrimaryKey(SyEmp record);
}