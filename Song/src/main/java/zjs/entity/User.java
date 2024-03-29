package zjs.entity;

import lombok.Data;

@Data
public class User {
    private  Integer id;
    private  String userName;
    private  String account;
    private  String password;
    private String salt;
    private  int isAdmin;
}
