package com.bgs.examinationfront.pojo;

import lombok.Data;

@Data
public class User {

  private long id;
  private String name;
  private long jobNumber;
  private String identityUser;
  private long accountNumber;
  private String password;
  private String phone;
  private long roleId;



}
