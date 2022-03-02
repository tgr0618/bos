package zjs.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import zjs.entity.User;

@Repository
public interface UserMapper {
    @Select("Select * from user where account=#{account}")
    User selectByAccount(@Param("account") String account);

}
