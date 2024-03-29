package cn.edu.upc.manage.dao;

import cn.edu.upc.manage.model.ViewRightsRole;
import cn.edu.upc.manage.vo.ViewRightsIdRole;

import java.util.List;

public interface ViewRightsRoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_rights_role
     *
     * @mbg.generated Sun Jun 14 16:36:14 CST 2020
     */
    int insert(ViewRightsRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_rights_role
     *
     * @mbg.generated Sun Jun 14 16:36:14 CST 2020
     */
    int insertSelective(ViewRightsRole record);

    List<ViewRightsRole> getAllRoleRights();

    List<ViewRightsRole> selectByName(String name);

    List<ViewRightsIdRole> getAllRoleRightsId();
}