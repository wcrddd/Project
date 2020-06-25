package cn.edu.upc.manage.model;

import java.util.Date;

public class StudyReport {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column study_report.id
     *
     * @mbg.generated Wed Jun 24 22:19:33 CST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column study_report.project_id
     *
     * @mbg.generated Wed Jun 24 22:19:33 CST 2020
     */
    private Integer projectId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column study_report.appendix_name
     *
     * @mbg.generated Wed Jun 24 22:19:33 CST 2020
     */
    private String appendixName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column study_report.appendix
     *
     * @mbg.generated Wed Jun 24 22:19:33 CST 2020
     */
    private String appendix;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column study_report.uploader
     *
     * @mbg.generated Wed Jun 24 22:19:33 CST 2020
     */
    private String uploader;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column study_report.create_time
     *
     * @mbg.generated Wed Jun 24 22:19:33 CST 2020
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column study_report.del_flag
     *
     * @mbg.generated Wed Jun 24 22:19:33 CST 2020
     */
    private Integer delFlag;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column study_report.operator
     *
     * @mbg.generated Wed Jun 24 22:19:33 CST 2020
     */
    private String operator;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column study_report.operator_ip
     *
     * @mbg.generated Wed Jun 24 22:19:33 CST 2020
     */
    private String operatorIp;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column study_report.operator_time
     *
     * @mbg.generated Wed Jun 24 22:19:33 CST 2020
     */
    private Date operatorTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column study_report.id
     *
     * @return the value of study_report.id
     *
     * @mbg.generated Wed Jun 24 22:19:33 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column study_report.id
     *
     * @param id the value for study_report.id
     *
     * @mbg.generated Wed Jun 24 22:19:33 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column study_report.project_id
     *
     * @return the value of study_report.project_id
     *
     * @mbg.generated Wed Jun 24 22:19:33 CST 2020
     */
    public Integer getProjectId() {
        return projectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column study_report.project_id
     *
     * @param projectId the value for study_report.project_id
     *
     * @mbg.generated Wed Jun 24 22:19:33 CST 2020
     */
    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column study_report.appendix_name
     *
     * @return the value of study_report.appendix_name
     *
     * @mbg.generated Wed Jun 24 22:19:33 CST 2020
     */
    public String getAppendixName() {
        return appendixName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column study_report.appendix_name
     *
     * @param appendixName the value for study_report.appendix_name
     *
     * @mbg.generated Wed Jun 24 22:19:33 CST 2020
     */
    public void setAppendixName(String appendixName) {
        this.appendixName = appendixName == null ? null : appendixName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column study_report.appendix
     *
     * @return the value of study_report.appendix
     *
     * @mbg.generated Wed Jun 24 22:19:33 CST 2020
     */
    public String getAppendix() {
        return appendix;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column study_report.appendix
     *
     * @param appendix the value for study_report.appendix
     *
     * @mbg.generated Wed Jun 24 22:19:33 CST 2020
     */
    public void setAppendix(String appendix) {
        this.appendix = appendix == null ? null : appendix.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column study_report.uploader
     *
     * @return the value of study_report.uploader
     *
     * @mbg.generated Wed Jun 24 22:19:33 CST 2020
     */
    public String getUploader() {
        return uploader;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column study_report.uploader
     *
     * @param uploader the value for study_report.uploader
     *
     * @mbg.generated Wed Jun 24 22:19:33 CST 2020
     */
    public void setUploader(String uploader) {
        this.uploader = uploader == null ? null : uploader.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column study_report.create_time
     *
     * @return the value of study_report.create_time
     *
     * @mbg.generated Wed Jun 24 22:19:33 CST 2020
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column study_report.create_time
     *
     * @param createTime the value for study_report.create_time
     *
     * @mbg.generated Wed Jun 24 22:19:33 CST 2020
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column study_report.del_flag
     *
     * @return the value of study_report.del_flag
     *
     * @mbg.generated Wed Jun 24 22:19:33 CST 2020
     */
    public Integer getDelFlag() {
        return delFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column study_report.del_flag
     *
     * @param delFlag the value for study_report.del_flag
     *
     * @mbg.generated Wed Jun 24 22:19:33 CST 2020
     */
    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column study_report.operator
     *
     * @return the value of study_report.operator
     *
     * @mbg.generated Wed Jun 24 22:19:33 CST 2020
     */
    public String getOperator() {
        return operator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column study_report.operator
     *
     * @param operator the value for study_report.operator
     *
     * @mbg.generated Wed Jun 24 22:19:33 CST 2020
     */
    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column study_report.operator_ip
     *
     * @return the value of study_report.operator_ip
     *
     * @mbg.generated Wed Jun 24 22:19:33 CST 2020
     */
    public String getOperatorIp() {
        return operatorIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column study_report.operator_ip
     *
     * @param operatorIp the value for study_report.operator_ip
     *
     * @mbg.generated Wed Jun 24 22:19:33 CST 2020
     */
    public void setOperatorIp(String operatorIp) {
        this.operatorIp = operatorIp == null ? null : operatorIp.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column study_report.operator_time
     *
     * @return the value of study_report.operator_time
     *
     * @mbg.generated Wed Jun 24 22:19:33 CST 2020
     */
    public Date getOperatorTime() {
        return operatorTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column study_report.operator_time
     *
     * @param operatorTime the value for study_report.operator_time
     *
     * @mbg.generated Wed Jun 24 22:19:33 CST 2020
     */
    public void setOperatorTime(Date operatorTime) {
        this.operatorTime = operatorTime;
    }
}