package cn.htl.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class Student {
    int sid;
    String sname;
    String sclass;
    String teacher;
    Date creattime;
    Date updatetime;
    char status;


}
