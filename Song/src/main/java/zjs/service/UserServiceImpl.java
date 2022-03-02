package zjs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zjs.entity.User;
import zjs.mapper.UserMapper;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;
    @Override
    public User selectByAccount(String account) {
        return userMapper.selectByAccount(account) ;
    }
}
