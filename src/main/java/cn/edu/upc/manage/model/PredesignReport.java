package cn.edu.upc.manage.model;

import java.util.Date;

public class PredesignReport {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column predesign_report.id
     *
     * @mbg.generated Sun Dec 06 15:18:53 CST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column predesign_report.project_id
     *
     * @mbg.generated Sun Dec 06 15:18:53 CST 2020
     */
    private Integer projectId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column predesign_report.project_name
     *
     * @mbg.generated Sun Dec 06 15:18:53 CST 2020
     */
    private String projectName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column predesign_report.create_time
     *
     * @mbg.generated Sun Dec 06 15:18:53 CST 2020
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column predesign_report.del_flag
     *
     * @mbg.generated Sun Dec 06 15:18:53 CST 2020
     */
    private Integer delFlag;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column predesign_report.operator
     *
     * @mbg.generated Sun Dec 06 15:18:53 CST 2020
     */
    private String operator;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column predesign_report.operator_ip
     *
     * @mbg.generated Sun Dec 06 15:18:53 CST 2020
     */
    private String operatorIp;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column predesign_report.operator_time
     *
     * @mbg.generated Sun Dec 06 15:18:53 CST 2020
     */
    private Date operatorTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column predesign_report.approve
     *
     * @mbg.generated Sun Dec 06 15:18:53 CST 2020
     */
    private Integer approve;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column predesign_report.approve_opinion
     *
     * @mbg.generated Sun Dec 06 15:18:53 CST 2020
     */
    private String approveOpinion;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column predesign_report.approve_time
     *
     * @mbg.generated Sun Dec 06 15:18:53 CST 2020
     */
    private Date approveTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column predesign_report.examine
     *
     * @mbg.generated Sun Dec 06 15:18:53 CST 2020
     */
    private Integer examine;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column predesign_report.examine_opinion
     *
     * @mbg.generated Sun Dec 06 15:18:53 CST 2020
     */
    private String examineOpinion;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column predesign_report.invest_scale
     *
     * @mbg.generated Sun Dec 06 15:18:53 CST 2020
     */
    private String investScale;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column predesign_report.construction_content
     *
     * @mbg.generated Sun Dec 06 15:18:53 CST 2020
     */
    private String constructionContent;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column predesign_report.keep_record_appendix
     *
     * @mbg.generated Sun Dec 06 15:18:53 CST 2020
     */
    private String keepRecordAppendix;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column predesign_report.appendix
     *
     * @mbg.generated Sun Dec 06 15:18:53 CST 2020
     */
    private String appendix;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column predesign_report.keep_approve
     *
     * @mbg.generated Sun Dec 06 15:18:53 CST 2020
     */
    private Integer keepApprove;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column predesign_report.keep_approve_opinion
     *
     * @mbg.generated Sun Dec 06 15:18:53 CST 2020
     */
    private String keepApproveOpinion;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column predesign_report.keep_approve_time
     *
     * @mbg.generated Sun Dec 06 15:18:53 CST 2020
     */
    private Date keepApproveTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column predesign_report.tender_flag
     *
     * @mbg.generated Sun Dec 06 15:18:53 CST 2020
     */
    private Integer tenderFlag;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column predesign_report.id
     *
     * @return the value of predesign_report.id
     *
     * @mbg.generated Sun Dec 06 15:18:53 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column predesign_report.id
     *
     * @param id the value for predesign_report.id
     *
     * @mbg.generated Sun Dec 06 15:18:53 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column predesign_report.project_id
     *
     * @return the value of predesign_report.project_id
     *
     * @mbg.generated Sun Dec 06 15:18:53 CST 2020
     */
    public Integer getProjectId() {
        return projectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column predesign_report.project_id
     *
     * @param projectId the value for predesign_report.project_id
     *
     * @mbg.generated Sun Dec 06 15:18:53 CST 2020
     */
    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column predesign_report.project_name
     *
     * @return the value of predesign_report.project_name
     *
     * @mbg.generated Sun Dec 06 15:18:53 CST 2020
     */
    public String getProjectName() {
        return projectName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column predesign_report.project_name
     *
     * @param projectName the value for predesign_report.project_name
     *
     * @mbg.generated Sun Dec 06 15:18:53 CST 2020
     */
    public void setProjectName(String projectName) {
        this.projectName = projectName == null ? null : projectName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column predesign_report.create_time
     *
     * @return the value of predesign_report.create_time
     *
     * @mbg.generated Sun Dec 06 15:18:53 CST 2020
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column predesign_report.create_time
     *
     * @param createTime the value for predesign_report.create_time
     *
     * @mbg.generated Sun Dec 06 15:18:53 CST 2020
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column predesign_report.del_flag
     *
     * @return the value of predesign_report.del_flag
     *
     * @mbg.generated Sun Dec 06 15:18:53 CST 2020
     */
    public Integer getDelFlag() {
        return delFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column predesign_report.del_flag
     *
     * @param delFlag the value for predesign_report.del_flag
     *
     * @mbg.generated Sun Dec 06 15:18:53 CST 2020
     */
    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column predesign_report.operator
     *
     * @return the value of predesign_report.operator
     *
     * @mbg.generated Sun Dec 06 15:18:53 CST 2020
     */
    public String getOperator() {
        return operator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column predesign_report.operator
     *
     * @param operator the value for predesign_report.operator
     *
     * @mbg.generated Sun Dec 06 15:18:53 CST 2020
     */
    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column predesign_report.operator_ip
     *
     * @return the value of predesign_report.operator_ip
     *
     * @mbg.generated Sun Dec 06 15:18:53 CST 2020
     */
    public String getOperatorIp() {
        return operatorIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column predesign_report.operator_ip
     *
     * @param operatorIp the value for predesign_report.operator_ip
     *
     * @mbg.generated Sun Dec 06 15:18:53 CST 2020
     */
    public void setOperatorIp(String operatorIp) {
        this.operatorIp = operatorIp == null ? null : operatorIp.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column predesign_report.operator_time
     *
     * @return the value of predesign_report.operator_time
     *
     * @mbg.generated Sun Dec 06 15:18:53 CST 2020
     */
    public Date getOperatorTime() {
        return operatorTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column predesign_report.operator_time
     *
     * @param operatorTime the value for predesign_report.operator_time
     *
     * @mbg.generated Sun Dec 06 15:18:53 CST 2020
     */
    public void setOperatorTime(Date operatorTime) {
        this.operatorTime = operatorTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column predesign_report.approve
     *
     * @return the value of predesign_report.approve
     *
     * @mbg.generated Sun Dec 06 15:18:53 CST 2020
     */
    public Integer getApprove() {
        return approve;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column predesign_report.approve
     *
     * @param approve the value for predesign_report.approve
     *
     * @mbg.generated Sun Dec 06 15:18:53 CST 2020
     */
    public void setApprove(Integer approve) {
        this.approve = approve;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column predesign_report.approve_opinion
     *
     * @return the value of predesign_report.approve_opinion
     *
     * @mbg.generated Sun Dec 06 15:18:53 CST 2020
     */
    public String getApproveOpinion() {
        return approveOpinion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column predesign_report.approve_opinion
     *
     * @param approveOpinion the value for predesign_report.approve_opinion
     *
     * @mbg.generated Sun Dec 06 15:18:53 CST 2020
     */
    public void setApproveOpinion(String approveOpinion) {
        this.approveOpinion = approveOpinion == null ? null : approveOpinion.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column predesign_report.approve_time
     *
     * @return the value of predesign_report.approve_time
     *
     * @mbg.generated Sun Dec 06 15:18:53 CST 2020
     */
    public Date getApproveTime() {
        return approveTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column predesign_report.approve_time
     *
     * @param approveTime the value for predesign_report.approve_time
     *
     * @mbg.generated Sun Dec 06 15:18:53 CST 2020
     */
    public void setApproveTime(Date approveTime) {
        this.approveTime = approveTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column predesign_report.examine
     *
     * @return the value of predesign_report.examine
     *
     * @mbg.generated Sun Dec 06 15:18:53 CST 2020
     */
    public Integer getExamine() {
        return examine;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column predesign_report.examine
     *
     * @param examine the value for predesign_report.examine
     *
     * @mbg.generated Sun Dec 06 15:18:53 CST 2020
     */
    public void setExamine(Integer examine) {
        this.examine = examine;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column predesign_report.examine_opinion
     *
     * @return the value of predesign_report.examine_opinion
     *
     * @mbg.generated Sun Dec 06 15:18:53 CST 2020
     */
    public String getExamineOpinion() {
        return examineOpinion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column predesign_report.examine_opinion
     *
     * @param examineOpinion the value for predesign_report.examine_opinion
     *
     * @mbg.generated Sun Dec 06 15:18:53 CST 2020
     */
    public void setExamineOpinion(String examineOpinion) {
        this.examineOpinion = examineOpinion == null ? null : examineOpinion.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column predesign_report.invest_scale
     *
     * @return the value of predesign_report.invest_scale
     *
     * @mbg.generated Sun Dec 06 15:18:53 CST 2020
     */
    public String getInvestScale() {
        return investScale;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column predesign_report.invest_scale
     *
     * @param investScale the value for predesign_report.invest_scale
     *
     * @mbg.generated Sun Dec 06 15:18:53 CST 2020
     */
    public void setInvestScale(String investScale) {
        this.investScale = investScale == null ? null : investScale.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column predesign_report.construction_content
     *
     * @return the value of predesign_report.construction_content
     *
     * @mbg.generated Sun Dec 06 15:18:53 CST 2020
     */
    public String getConstructionContent() {
        return constructionContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column predesign_report.construction_content
     *
     * @param constructionContent the value for predesign_report.construction_content
     *
     * @mbg.generated Sun Dec 06 15:18:53 CST 2020
     */
    public void setConstructionContent(String constructionContent) {
        this.constructionContent = constructionContent == null ? null : constructionContent.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column predesign_report.keep_record_appendix
     *
     * @return the value of predesign_report.keep_record_appendix
     *
     * @mbg.generated Sun Dec 06 15:18:53 CST 2020
     */
    public String getKeepRecordAppendix() {
        return keepRecordAppendix;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column predesign_report.keep_record_appendix
     *
     * @param keepRecordAppendix the value for predesign_report.keep_record_appendix
     *
     * @mbg.generated Sun Dec 06 15:18:53 CST 2020
     */
    public void setKeepRecordAppendix(String keepRecordAppendix) {
        this.keepRecordAppendix = keepRecordAppendix == null ? null : keepRecordAppendix.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column predesign_report.appendix
     *
     * @return the value of predesign_report.appendix
     *
     * @mbg.generated Sun Dec 06 15:18:53 CST 2020
     */
    public String getAppendix() {
        return appendix;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column predesign_report.appendix
     *
     * @param appendix the value for predesign_report.appendix
     *
     * @mbg.generated Sun Dec 06 15:18:53 CST 2020
     */
    public void setAppendix(String appendix) {
        this.appendix = appendix == null ? null : appendix.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column predesign_report.keep_approve
     *
     * @return the value of predesign_report.keep_approve
     *
     * @mbg.generated Sun Dec 06 15:18:53 CST 2020
     */
    public Integer getKeepApprove() {
        return keepApprove;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column predesign_report.keep_approve
     *
     * @param keepApprove the value for predesign_report.keep_approve
     *
     * @mbg.generated Sun Dec 06 15:18:53 CST 2020
     */
    public void setKeepApprove(Integer keepApprove) {
        this.keepApprove = keepApprove;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column predesign_report.keep_approve_opinion
     *
     * @return the value of predesign_report.keep_approve_opinion
     *
     * @mbg.generated Sun Dec 06 15:18:53 CST 2020
     */
    public String getKeepApproveOpinion() {
        return keepApproveOpinion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column predesign_report.keep_approve_opinion
     *
     * @param keepApproveOpinion the value for predesign_report.keep_approve_opinion
     *
     * @mbg.generated Sun Dec 06 15:18:53 CST 2020
     */
    public void setKeepApproveOpinion(String keepApproveOpinion) {
        this.keepApproveOpinion = keepApproveOpinion == null ? null : keepApproveOpinion.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column predesign_report.keep_approve_time
     *
     * @return the value of predesign_report.keep_approve_time
     *
     * @mbg.generated Sun Dec 06 15:18:53 CST 2020
     */
    public Date getKeepApproveTime() {
        return keepApproveTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column predesign_report.keep_approve_time
     *
     * @param keepApproveTime the value for predesign_report.keep_approve_time
     *
     * @mbg.generated Sun Dec 06 15:18:53 CST 2020
     */
    public void setKeepApproveTime(Date keepApproveTime) {
        this.keepApproveTime = keepApproveTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column predesign_report.tender_flag
     *
     * @return the value of predesign_report.tender_flag
     *
     * @mbg.generated Sun Dec 06 15:18:53 CST 2020
     */
    public Integer getTenderFlag() {
        return tenderFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column predesign_report.tender_flag
     *
     * @param tenderFlag the value for predesign_report.tender_flag
     *
     * @mbg.generated Sun Dec 06 15:18:53 CST 2020
     */
    public void setTenderFlag(Integer tenderFlag) {
        this.tenderFlag = tenderFlag;
    }
}