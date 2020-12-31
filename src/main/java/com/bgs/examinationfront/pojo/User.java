package com.bgs.examinationfront.pojo;

//员工
public class User {
    private Integer id;//员工ID
    private String name;//员工名字
    private Integer jobNumber;//员工工号
    private String identityUser;//员工身份
    private Integer accountNumber;//账号
    private String password;//密码
    private String phone;//手机号
    private Integer roleId;//角色

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getJobNumber() {
        return jobNumber;
    }

    public void setJobNumber(Integer jobNumber) {
        this.jobNumber = jobNumber;
    }

    public String getIdentityUser() {
        return identityUser;
    }

    public void setIdentityUser(String identityUser) {
        this.identityUser = identityUser;
    }

    public Integer getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", jobNumber=" + jobNumber +
                ", identityUser='" + identityUser + '\'' +
                ", accountNumber=" + accountNumber +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                ", roleId=" + roleId +
                '}';
    }
}
