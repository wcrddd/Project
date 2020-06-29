package cn.edu.upc.manage.dao;

import cn.edu.upc.manage.model.ViewStudyReport;

import java.util.List;

public interface ViewStudyReportMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_study_report
     *
     * @mbg.generated Sat Jun 27 16:11:31 CST 2020
     */
    int insert(ViewStudyReport record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_study_report
     *
     * @mbg.generated Sat Jun 27 16:11:31 CST 2020
     */
    int insertSelective(ViewStudyReport record);

    List<ViewStudyReport> getReportByProjectId(int projectId);
}