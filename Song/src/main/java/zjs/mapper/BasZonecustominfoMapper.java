package zjs.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import zjs.entity.BasZonecustominfo;
import zjs.entity.BasZonecustominfoExample;
@Repository
public interface BasZonecustominfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bas_zonecustominfo
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    int countByExample(BasZonecustominfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bas_zonecustominfo
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    int deleteByExample(BasZonecustominfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bas_zonecustominfo
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    int deleteByPrimaryKey(Integer customcode);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bas_zonecustominfo
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    int insert(BasZonecustominfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bas_zonecustominfo
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    int insertSelective(BasZonecustominfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bas_zonecustominfo
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    List<BasZonecustominfo> selectByExample(BasZonecustominfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bas_zonecustominfo
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    BasZonecustominfo selectByPrimaryKey(Integer customcode);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bas_zonecustominfo
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    int updateByExampleSelective(@Param("record") BasZonecustominfo record, @Param("example") BasZonecustominfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bas_zonecustominfo
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    int updateByExample(@Param("record") BasZonecustominfo record, @Param("example") BasZonecustominfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bas_zonecustominfo
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    int updateByPrimaryKeySelective(BasZonecustominfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bas_zonecustominfo
     *
     * @mbggenerated Sat Jan 04 11:21:18 CST 2020
     */
    int updateByPrimaryKey(BasZonecustominfo record);
}