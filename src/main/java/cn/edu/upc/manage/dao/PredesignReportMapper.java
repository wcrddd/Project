package cn.edu.upc.manage.dao;

import cn.edu.upc.manage.model.PredesignReport;

public interface PredesignReportMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table predesign_report
     *
     * @mbg.generated Sat Jun 27 11:26:58 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table predesign_report
     *
     * @mbg.generated Sat Jun 27 11:26:58 CST 2020
     */
    int insert(PredesignReport record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table predesign_report
     *
     * @mbg.generated Sat Jun 27 11:26:58 CST 2020
     */
    int insertSelective(PredesignReport record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table predesign_report
     *
     * @mbg.generated Sat Jun 27 11:26:58 CST 2020
     */
    PredesignReport selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table predesign_report
     *
     * @mbg.generated Sat Jun 27 11:26:58 CST 2020
     */
    int updateByPrimaryKeySelective(PredesignReport record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table predesign_report
     *
     * @mbg.generated Sat Jun 27 11:26:58 CST 2020
     */
    int updateByPrimaryKey(PredesignReport record);
}