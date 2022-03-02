package zjs.mapper;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InfoMapper {

    int selectById(String account,String password);
    List getList(String account, String password);

}
