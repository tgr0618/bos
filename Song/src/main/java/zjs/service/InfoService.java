package zjs.service;

import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface InfoService   {
    int selectById(String account, String password);
    List getList(String account, String password);
}
