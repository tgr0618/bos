package zjs.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Info {
    private Integer id;
    private  String product;
    private String customer;
    private  String address;
    private  String context;
    private  String keyman1;
    private  String keyman2;
    private  String productLine;
    private  String remark;
    private  String progress;
    private  String nextPlan;
    private Integer creater;
    private Date createTime;
    private Integer updater;
    private  Date updateTime;
}
