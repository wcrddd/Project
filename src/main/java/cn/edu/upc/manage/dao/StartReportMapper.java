package cn.edu.upc.manage.dao;

import cn.edu.upc.manage.model.StartReport;
import cn.edu.upc.manage.model.StartReportExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StartReportMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table start_report
     *
     * @mbg.generated Sun Nov 29 21:16:14 CST 2020
     */
    long countByExample(StartReportExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table start_report
     *
     * @mbg.generated Sun Nov 29 21:16:14 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table start_report
     *
     * @mbg.generated Sun Nov 29 21:16:14 CST 2020
     */
    int insert(StartReport record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table start_report
     *
     * @mbg.generated Sun Nov 29 21:16:14 CST 2020
     */
    int insertSelective(StartReport record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table start_report
     *
     * @mbg.generated Sun Nov 29 21:16:14 CST 2020
     */
    StartReport selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table start_report
     *
     * @mbg.generated Sun Nov 29 21:16:14 CST 2020
     */
    int updateByPrimaryKeySelective(StartReport record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table start_report
     *
     * @mbg.generated Sun Nov 29 21:16:14 CST 2020
     */
    int updateByPrimaryKey(StartReport record);

    /**
     * 审批开工报告
     * @param startReport
     */
    void updateApprove(@Param("startReport") StartReport startReport);

    /**
     * 获取全部
     * @return
     */
    List<StartReport> getAllReport();

    /**
     * 根据项目id获取开工报告
     * @param projectId
     * @return
     */
    StartReport getByProjectId(@Param("projectId") Integer projectId);
}