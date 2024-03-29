package cn.edu.upc.manage.dao;

import cn.edu.upc.manage.model.ProjectList;
import cn.edu.upc.manage.model.ProjectListExample;
import cn.edu.upc.manage.model.User;
import cn.edu.upc.manage.vo.ProjectListVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProjectListMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_list
     *
     * @mbg.generated Fri Mar 26 19:59:42 CST 2021
     */
    long countByExample(ProjectListExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_list
     *
     * @mbg.generated Fri Mar 26 19:59:42 CST 2021
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_list
     *
     * @mbg.generated Fri Mar 26 19:59:42 CST 2021
     */
    int insert(ProjectList record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_list
     *
     * @mbg.generated Fri Mar 26 19:59:42 CST 2021
     */
    int insertSelective(ProjectList record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_list
     *
     * @mbg.generated Fri Mar 26 19:59:42 CST 2021
     */
    ProjectList selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_list
     *
     * @mbg.generated Fri Mar 26 19:59:42 CST 2021
     */
    int updateByPrimaryKeySelective(ProjectList record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_list
     *
     * @mbg.generated Fri Mar 26 19:59:42 CST 2021
     */
    int updateByPrimaryKey(ProjectList record);

    /**
     * 获取全部审价
     * @param user
     * @return
     */
    List<ProjectList> getAll(@Param("user") User user);

    /**
     * 根据id删除项目的审价
     * @param id
     * @return
     */
    void deleteVerification(@Param("id") Integer id);
}