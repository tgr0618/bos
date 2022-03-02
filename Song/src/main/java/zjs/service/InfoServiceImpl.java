package zjs.service;

import org.springframework.stereotype.Service;
import zjs.mapper.InfoMapper;
import zjs.mapper.UserMapper;

import java.util.List;

public class InfoServiceImpl implements InfoService {

    @Override
    public int selectById(String account, String password) {
        return 0;
    }

    @Override
    public List getList(String account, String password) {

        return null;
    }
}
