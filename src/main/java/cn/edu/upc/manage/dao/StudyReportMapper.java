package cn.edu.upc.manage.dao;

import cn.edu.upc.manage.model.StudyReport;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudyReportMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table study_report
     *
     * @mbg.generated Wed Jun 24 22:19:33 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table study_report
     *
     * @mbg.generated Wed Jun 24 22:19:33 CST 2020
     */
    int insert(StudyReport record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table study_report
     *
     * @mbg.generated Wed Jun 24 22:19:33 CST 2020
     */
    int insertSelective(StudyReport record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table study_report
     *
     * @mbg.generated Wed Jun 24 22:19:33 CST 2020
     */
    StudyReport selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table study_report
     *
     * @mbg.generated Wed Jun 24 22:19:33 CST 2020
     */
    int updateByPrimaryKeySelective(StudyReport record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table study_report
     *
     * @mbg.generated Wed Jun 24 22:19:33 CST 2020
     */
    int updateByPrimaryKey(StudyReport record);

    List<StudyReport> getAppendixBuProjectId(int projectId);

    void updateApprove(@Param("studyReport") StudyReport studyReport);

    /**
     * 根据项目id获取具体可研报告
     * @param projectId
     * @return
     */
    StudyReport getByProjectId(@Param("projectId") Integer projectId);

    List<StudyReport> getAllFeasibility(@Param("studyReport") StudyReport studyReport);
}