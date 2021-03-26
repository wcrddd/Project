package cn.edu.upc.manage.model;

import java.util.Date;

public class ProjectEvaluate {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column project_evaluate.id
     *
     * @mbg.generated Mon Mar 08 21:12:45 CST 2021
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column project_evaluate.project_id
     *
     * @mbg.generated Mon Mar 08 21:12:45 CST 2021
     */
    private Integer projectId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column project_evaluate.evaluate
     *
     * @mbg.generated Mon Mar 08 21:12:45 CST 2021
     */
    private String evaluate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column project_evaluate.create_time
     *
     * @mbg.generated Mon Mar 08 21:12:45 CST 2021
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column project_evaluate.del_flag
     *
     * @mbg.generated Mon Mar 08 21:12:45 CST 2021
     */
    private Integer delFlag;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column project_evaluate.operator
     *
     * @mbg.generated Mon Mar 08 21:12:45 CST 2021
     */
    private String operator;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column project_evaluate.operator_time
     *
     * @mbg.generated Mon Mar 08 21:12:45 CST 2021
     */
    private Date operatorTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column project_evaluate.id
     *
     * @return the value of project_evaluate.id
     *
     * @mbg.generated Mon Mar 08 21:12:45 CST 2021
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column project_evaluate.id
     *
     * @param id the value for project_evaluate.id
     *
     * @mbg.generated Mon Mar 08 21:12:45 CST 2021
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column project_evaluate.project_id
     *
     * @return the value of project_evaluate.project_id
     *
     * @mbg.generated Mon Mar 08 21:12:45 CST 2021
     */
    public Integer getProjectId() {
        return projectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column project_evaluate.project_id
     *
     * @param projectId the value for project_evaluate.project_id
     *
     * @mbg.generated Mon Mar 08 21:12:45 CST 2021
     */
    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column project_evaluate.evaluate
     *
     * @return the value of project_evaluate.evaluate
     *
     * @mbg.generated Mon Mar 08 21:12:45 CST 2021
     */
    public String getEvaluate() {
        return evaluate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column project_evaluate.evaluate
     *
     * @param evaluate the value for project_evaluate.evaluate
     *
     * @mbg.generated Mon Mar 08 21:12:45 CST 2021
     */
    public void setEvaluate(String evaluate) {
        this.evaluate = evaluate == null ? null : evaluate.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column project_evaluate.create_time
     *
     * @return the value of project_evaluate.create_time
     *
     * @mbg.generated Mon Mar 08 21:12:45 CST 2021
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column project_evaluate.create_time
     *
     * @param createTime the value for project_evaluate.create_time
     *
     * @mbg.generated Mon Mar 08 21:12:45 CST 2021
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column project_evaluate.del_flag
     *
     * @return the value of project_evaluate.del_flag
     *
     * @mbg.generated Mon Mar 08 21:12:45 CST 2021
     */
    public Integer getDelFlag() {
        return delFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column project_evaluate.del_flag
     *
     * @param delFlag the value for project_evaluate.del_flag
     *
     * @mbg.generated Mon Mar 08 21:12:45 CST 2021
     */
    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column project_evaluate.operator
     *
     * @return the value of project_evaluate.operator
     *
     * @mbg.generated Mon Mar 08 21:12:45 CST 2021
     */
    public String getOperator() {
        return operator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column project_evaluate.operator
     *
     * @param operator the value for project_evaluate.operator
     *
     * @mbg.generated Mon Mar 08 21:12:45 CST 2021
     */
    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column project_evaluate.operator_time
     *
     * @return the value of project_evaluate.operator_time
     *
     * @mbg.generated Mon Mar 08 21:12:45 CST 2021
     */
    public Date getOperatorTime() {
        return operatorTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column project_evaluate.operator_time
     *
     * @param operatorTime the value for project_evaluate.operator_time
     *
     * @mbg.generated Mon Mar 08 21:12:45 CST 2021
     */
    public void setOperatorTime(Date operatorTime) {
        this.operatorTime = operatorTime;
    }
}