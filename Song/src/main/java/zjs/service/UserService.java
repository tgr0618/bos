package zjs.service;

import org.springframework.stereotype.Service;
import zjs.entity.User;


public interface UserService {
    User selectByAccount(String account);
}
