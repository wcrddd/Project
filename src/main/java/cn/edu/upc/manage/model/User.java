package cn.edu.upc.manage.model;

import java.util.Date;

public class User {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.id
     *
     * @mbg.generated Mon Dec 14 20:45:08 CST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.user_name
     *
     * @mbg.generated Mon Dec 14 20:45:08 CST 2020
     */
    private String userName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.password
     *
     * @mbg.generated Mon Dec 14 20:45:08 CST 2020
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.role_id
     *
     * @mbg.generated Mon Dec 14 20:45:08 CST 2020
     */
    private Integer roleId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.user_type
     *
     * @mbg.generated Mon Dec 14 20:45:08 CST 2020
     */
    private Integer userType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.department_unit_id
     *
     * @mbg.generated Mon Dec 14 20:45:08 CST 2020
     */
    private Integer departmentUnitId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.email
     *
     * @mbg.generated Mon Dec 14 20:45:08 CST 2020
     */
    private String email;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.telephone
     *
     * @mbg.generated Mon Dec 14 20:45:08 CST 2020
     */
    private String telephone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.approve_flag
     *
     * @mbg.generated Mon Dec 14 20:45:08 CST 2020
     */
    private Integer approveFlag;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.creat_time
     *
     * @mbg.generated Mon Dec 14 20:45:08 CST 2020
     */
    private Date creatTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.del_flag
     *
     * @mbg.generated Mon Dec 14 20:45:08 CST 2020
     */
    private Integer delFlag;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.operator
     *
     * @mbg.generated Mon Dec 14 20:45:08 CST 2020
     */
    private String operator;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.operator_ip
     *
     * @mbg.generated Mon Dec 14 20:45:08 CST 2020
     */
    private String operatorIp;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.operator_time
     *
     * @mbg.generated Mon Dec 14 20:45:08 CST 2020
     */
    private Date operatorTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.id
     *
     * @return the value of user.id
     *
     * @mbg.generated Mon Dec 14 20:45:08 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.id
     *
     * @param id the value for user.id
     *
     * @mbg.generated Mon Dec 14 20:45:08 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.user_name
     *
     * @return the value of user.user_name
     *
     * @mbg.generated Mon Dec 14 20:45:08 CST 2020
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.user_name
     *
     * @param userName the value for user.user_name
     *
     * @mbg.generated Mon Dec 14 20:45:08 CST 2020
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.password
     *
     * @return the value of user.password
     *
     * @mbg.generated Mon Dec 14 20:45:08 CST 2020
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.password
     *
     * @param password the value for user.password
     *
     * @mbg.generated Mon Dec 14 20:45:08 CST 2020
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.role_id
     *
     * @return the value of user.role_id
     *
     * @mbg.generated Mon Dec 14 20:45:08 CST 2020
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.role_id
     *
     * @param roleId the value for user.role_id
     *
     * @mbg.generated Mon Dec 14 20:45:08 CST 2020
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.user_type
     *
     * @return the value of user.user_type
     *
     * @mbg.generated Mon Dec 14 20:45:08 CST 2020
     */
    public Integer getUserType() {
        return userType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.user_type
     *
     * @param userType the value for user.user_type
     *
     * @mbg.generated Mon Dec 14 20:45:08 CST 2020
     */
    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.department_unit_id
     *
     * @return the value of user.department_unit_id
     *
     * @mbg.generated Mon Dec 14 20:45:08 CST 2020
     */
    public Integer getDepartmentUnitId() {
        return departmentUnitId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.department_unit_id
     *
     * @param departmentUnitId the value for user.department_unit_id
     *
     * @mbg.generated Mon Dec 14 20:45:08 CST 2020
     */
    public void setDepartmentUnitId(Integer departmentUnitId) {
        this.departmentUnitId = departmentUnitId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.email
     *
     * @return the value of user.email
     *
     * @mbg.generated Mon Dec 14 20:45:08 CST 2020
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.email
     *
     * @param email the value for user.email
     *
     * @mbg.generated Mon Dec 14 20:45:08 CST 2020
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.telephone
     *
     * @return the value of user.telephone
     *
     * @mbg.generated Mon Dec 14 20:45:08 CST 2020
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.telephone
     *
     * @param telephone the value for user.telephone
     *
     * @mbg.generated Mon Dec 14 20:45:08 CST 2020
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.approve_flag
     *
     * @return the value of user.approve_flag
     *
     * @mbg.generated Mon Dec 14 20:45:08 CST 2020
     */
    public Integer getApproveFlag() {
        return approveFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.approve_flag
     *
     * @param approveFlag the value for user.approve_flag
     *
     * @mbg.generated Mon Dec 14 20:45:08 CST 2020
     */
    public void setApproveFlag(Integer approveFlag) {
        this.approveFlag = approveFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.creat_time
     *
     * @return the value of user.creat_time
     *
     * @mbg.generated Mon Dec 14 20:45:08 CST 2020
     */
    public Date getCreatTime() {
        return creatTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.creat_time
     *
     * @param creatTime the value for user.creat_time
     *
     * @mbg.generated Mon Dec 14 20:45:08 CST 2020
     */
    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.del_flag
     *
     * @return the value of user.del_flag
     *
     * @mbg.generated Mon Dec 14 20:45:08 CST 2020
     */
    public Integer getDelFlag() {
        return delFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.del_flag
     *
     * @param delFlag the value for user.del_flag
     *
     * @mbg.generated Mon Dec 14 20:45:08 CST 2020
     */
    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.operator
     *
     * @return the value of user.operator
     *
     * @mbg.generated Mon Dec 14 20:45:08 CST 2020
     */
    public String getOperator() {
        return operator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.operator
     *
     * @param operator the value for user.operator
     *
     * @mbg.generated Mon Dec 14 20:45:08 CST 2020
     */
    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.operator_ip
     *
     * @return the value of user.operator_ip
     *
     * @mbg.generated Mon Dec 14 20:45:08 CST 2020
     */
    public String getOperatorIp() {
        return operatorIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.operator_ip
     *
     * @param operatorIp the value for user.operator_ip
     *
     * @mbg.generated Mon Dec 14 20:45:08 CST 2020
     */
    public void setOperatorIp(String operatorIp) {
        this.operatorIp = operatorIp == null ? null : operatorIp.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.operator_time
     *
     * @return the value of user.operator_time
     *
     * @mbg.generated Mon Dec 14 20:45:08 CST 2020
     */
    public Date getOperatorTime() {
        return operatorTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.operator_time
     *
     * @param operatorTime the value for user.operator_time
     *
     * @mbg.generated Mon Dec 14 20:45:08 CST 2020
     */
    public void setOperatorTime(Date operatorTime) {
        this.operatorTime = operatorTime;
    }
}