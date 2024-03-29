package cn.edu.upc.manage.model;

import java.util.Date;

public class StartReport {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column start_report.id
     *
     * @mbg.generated Mon Nov 30 10:27:26 CST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column start_report.project_id
     *
     * @mbg.generated Mon Nov 30 10:27:26 CST 2020
     */
    private Integer projectId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column start_report.project_name
     *
     * @mbg.generated Mon Nov 30 10:27:26 CST 2020
     */
    private String projectName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column start_report.appendix
     *
     * @mbg.generated Mon Nov 30 10:27:26 CST 2020
     */
    private String appendix;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column start_report.approve
     *
     * @mbg.generated Mon Nov 30 10:27:26 CST 2020
     */
    private Integer approve;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column start_report.approve_opinion
     *
     * @mbg.generated Mon Nov 30 10:27:26 CST 2020
     */
    private String approveOpinion;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column start_report.approve_time
     *
     * @mbg.generated Mon Nov 30 10:27:26 CST 2020
     */
    private Date approveTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column start_report.create_time
     *
     * @mbg.generated Mon Nov 30 10:27:26 CST 2020
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column start_report.del_flag
     *
     * @mbg.generated Mon Nov 30 10:27:26 CST 2020
     */
    private Integer delFlag;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column start_report.operator
     *
     * @mbg.generated Mon Nov 30 10:27:26 CST 2020
     */
    private String operator;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column start_report.operator_ip
     *
     * @mbg.generated Mon Nov 30 10:27:26 CST 2020
     */
    private String operatorIp;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column start_report.operator_time
     *
     * @mbg.generated Mon Nov 30 10:27:26 CST 2020
     */
    private Date operatorTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column start_report.id
     *
     * @return the value of start_report.id
     *
     * @mbg.generated Mon Nov 30 10:27:26 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column start_report.id
     *
     * @param id the value for start_report.id
     *
     * @mbg.generated Mon Nov 30 10:27:26 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column start_report.project_id
     *
     * @return the value of start_report.project_id
     *
     * @mbg.generated Mon Nov 30 10:27:26 CST 2020
     */
    public Integer getProjectId() {
        return projectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column start_report.project_id
     *
     * @param projectId the value for start_report.project_id
     *
     * @mbg.generated Mon Nov 30 10:27:26 CST 2020
     */
    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column start_report.project_name
     *
     * @return the value of start_report.project_name
     *
     * @mbg.generated Mon Nov 30 10:27:26 CST 2020
     */
    public String getProjectName() {
        return projectName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column start_report.project_name
     *
     * @param projectName the value for start_report.project_name
     *
     * @mbg.generated Mon Nov 30 10:27:26 CST 2020
     */
    public void setProjectName(String projectName) {
        this.projectName = projectName == null ? null : projectName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column start_report.appendix
     *
     * @return the value of start_report.appendix
     *
     * @mbg.generated Mon Nov 30 10:27:26 CST 2020
     */
    public String getAppendix() {
        return appendix;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column start_report.appendix
     *
     * @param appendix the value for start_report.appendix
     *
     * @mbg.generated Mon Nov 30 10:27:26 CST 2020
     */
    public void setAppendix(String appendix) {
        this.appendix = appendix == null ? null : appendix.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column start_report.approve
     *
     * @return the value of start_report.approve
     *
     * @mbg.generated Mon Nov 30 10:27:26 CST 2020
     */
    public Integer getApprove() {
        return approve;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column start_report.approve
     *
     * @param approve the value for start_report.approve
     *
     * @mbg.generated Mon Nov 30 10:27:26 CST 2020
     */
    public void setApprove(Integer approve) {
        this.approve = approve;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column start_report.approve_opinion
     *
     * @return the value of start_report.approve_opinion
     *
     * @mbg.generated Mon Nov 30 10:27:26 CST 2020
     */
    public String getApproveOpinion() {
        return approveOpinion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column start_report.approve_opinion
     *
     * @param approveOpinion the value for start_report.approve_opinion
     *
     * @mbg.generated Mon Nov 30 10:27:26 CST 2020
     */
    public void setApproveOpinion(String approveOpinion) {
        this.approveOpinion = approveOpinion == null ? null : approveOpinion.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column start_report.approve_time
     *
     * @return the value of start_report.approve_time
     *
     * @mbg.generated Mon Nov 30 10:27:26 CST 2020
     */
    public Date getApproveTime() {
        return approveTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column start_report.approve_time
     *
     * @param approveTime the value for start_report.approve_time
     *
     * @mbg.generated Mon Nov 30 10:27:26 CST 2020
     */
    public void setApproveTime(Date approveTime) {
        this.approveTime = approveTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column start_report.create_time
     *
     * @return the value of start_report.create_time
     *
     * @mbg.generated Mon Nov 30 10:27:26 CST 2020
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column start_report.create_time
     *
     * @param createTime the value for start_report.create_time
     *
     * @mbg.generated Mon Nov 30 10:27:26 CST 2020
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column start_report.del_flag
     *
     * @return the value of start_report.del_flag
     *
     * @mbg.generated Mon Nov 30 10:27:26 CST 2020
     */
    public Integer getDelFlag() {
        return delFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column start_report.del_flag
     *
     * @param delFlag the value for start_report.del_flag
     *
     * @mbg.generated Mon Nov 30 10:27:26 CST 2020
     */
    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column start_report.operator
     *
     * @return the value of start_report.operator
     *
     * @mbg.generated Mon Nov 30 10:27:26 CST 2020
     */
    public String getOperator() {
        return operator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column start_report.operator
     *
     * @param operator the value for start_report.operator
     *
     * @mbg.generated Mon Nov 30 10:27:26 CST 2020
     */
    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column start_report.operator_ip
     *
     * @return the value of start_report.operator_ip
     *
     * @mbg.generated Mon Nov 30 10:27:26 CST 2020
     */
    public String getOperatorIp() {
        return operatorIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column start_report.operator_ip
     *
     * @param operatorIp the value for start_report.operator_ip
     *
     * @mbg.generated Mon Nov 30 10:27:26 CST 2020
     */
    public void setOperatorIp(String operatorIp) {
        this.operatorIp = operatorIp == null ? null : operatorIp.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column start_report.operator_time
     *
     * @return the value of start_report.operator_time
     *
     * @mbg.generated Mon Nov 30 10:27:26 CST 2020
     */
    public Date getOperatorTime() {
        return operatorTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column start_report.operator_time
     *
     * @param operatorTime the value for start_report.operator_time
     *
     * @mbg.generated Mon Nov 30 10:27:26 CST 2020
     */
    public void setOperatorTime(Date operatorTime) {
        this.operatorTime = operatorTime;
    }
}