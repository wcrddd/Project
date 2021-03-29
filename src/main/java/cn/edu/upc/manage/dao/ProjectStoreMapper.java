package cn.edu.upc.manage.dao;

import cn.edu.upc.manage.mo.ConstructUnitStatisticMo;
import cn.edu.upc.manage.mo.NumStatisticsMo;
import cn.edu.upc.manage.model.ProjectStore;
import cn.edu.upc.manage.model.User;
import cn.edu.upc.manage.vo.ProjectStoreApprove;
import cn.edu.upc.manage.vo.ProjectStoreFlagVo;
import cn.edu.upc.manage.vo.ProjectStoreVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProjectStoreMapper {

    List<ProjectStore> selectAllProject();

    List<ProjectStore> selectByProjectNameAndBuildYear(@Param("projectName") String projectName, @Param("buildYear") String buildYear);

    List<ProjectStore> selectByProjectName(@Param("projectName")String projectName);

    List<ProjectStore> selectByBuildYear(@Param("buildYear")String buildYear);

    /**
     * 新增项目申报
     *
     * @param projectStore
     * @return
     */
    int addProject(ProjectStore projectStore);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_store
     *
     * @mbg.generated Sat May 09 21:34:45 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_store
     *
     * @mbg.generated Sat May 09 21:34:45 CST 2020
     */
    int insert(ProjectStore record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_store
     *
     * @mbg.generated Sat May 09 21:34:45 CST 2020
     */
    int insertSelective(ProjectStore record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_store
     *
     * @mbg.generated Sat May 09 21:34:45 CST 2020
     */
    ProjectStore selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_store
     *
     * @mbg.generated Sat May 09 21:34:45 CST 2020
     */
    int updateByPrimaryKeySelective(ProjectStore record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_store
     *
     * @mbg.generated Sat May 09 21:34:45 CST 2020
     */
    int updateByPrimaryKey(ProjectStore record);

    List<ProjectStore> selectProjectStore(@Param("unitId")int unitId,@Param("projectName") String projectName);

    List<ProjectStore> searchProjectStore(ProjectStore projectStore);

    /**
     * 返回通过的项目
     * @return
     */
    List<ProjectStore> selectProjectPass();

    /**
     * 返回已经申报的项目
     * @param departmentUnitId
     * @return
     */
    List<ProjectStoreVo> selectProjectPlaned(@Param("departmentUnitId") Integer departmentUnitId);

    /**
     * 根据建设单位id获取通过审核的项目
     * @param departmentUnitId
     * @return
     */
    List<ProjectStoreVo> selectPassProjectByUnitId(@Param("departmentUnitId") Integer departmentUnitId);

    List<ProjectStore> selectPassProjectByUnitId2(@Param("departmentUnitId") Integer departmentUnitId);
    /**
     * 更新计划申报项目的标志位
     * @param id
     * @param planedFlag
     */
    void updatePlanedFlag(@Param("id") Integer id, @Param("planedFlag") Integer planedFlag, @Param("flag") Integer flag);

     List<ProjectStore> getCanTenderByUnitId(int unitId);

     List<ProjectStore> getCanContractByUnitId(int unitId);

     List<ProjectStore> getCanProgressByUnitId(int unitId);

     List<ProjectStoreApprove> getCanDesignByUnitId(int unitId);

    ProjectStore selectById(Integer id);

    List<ProjectStore> selectAllProject2(int unitId);

    List<ProjectStore> selectByProjectNameAndBuildYear2(@Param("projectName") String projectName, @Param("buildYear") String buildYear,@Param("unitId")int unitId);

    List<ProjectStore> selectByProjectName2(@Param("projectName")String projectName,@Param("unitId")int unitId);

    List<ProjectStore> selectByBuildYear2(@Param("buildYear")String buildYear,@Param("unitId")int unitId);

    List<ProjectStoreApprove> selectCanDesign(@Param("unitId") int unitId,@Param("projectName") String projectName);

    /**
     * 更新项目状态
     * @param projectStore 主要是三个参数
     * id ,approve, opinion
     * 0 未审核，1一级库 ,2二级库
     * @return
     */
    void updateStoreFlag(@Param("projectStore") ProjectStore projectStore);


    /**
     * 二级单位浏览本单位的全部项目
     * storeFlag = 1传一级库，storeFlag = 2传二级库，storeFlag = 99传回收站，
     * @param projectStoreFlagVo
     * @param unitId
     * @return
     */
    List<ProjectStore> getByUnitId(@Param("projectStoreFlagVo") ProjectStoreFlagVo projectStoreFlagVo, @Param("unitId") Integer unitId);

    /**
     * 二级单位浏览本单位的全部项目
     * storeFlag = 1传一级库，storeFlag = 2传二级库，storeFlag = 99传回收站，
     * @param projectStoreFlagVo
     * @return
     */
    List<ProjectStore> getAll(@Param("projectStoreFlagVo") ProjectStoreFlagVo projectStoreFlagVo,@Param("user") User user);

    /**
     * 根据项目id更新招标标志位为0
     * @param projectId
     */
    void updateTenderFlag(@Param("projectId") Integer projectId);

    /**
     * 获取合同显示界面
     * @param projectStoreFlagVo
     * @param unitId
     * @return
     */
    List<ProjectStore> getByUnitIdConstract(@Param("projectStoreFlagVo") ProjectStoreFlagVo projectStoreFlagVo, @Param("unitId") Integer unitId);

    /**
     * 更新项目标段数
     * @param projectId
     * @param sectionNum
     */
    void updateSectionNum(@Param("projectId") Integer projectId, @Param("sectionNum") Integer sectionNum);

    /**
     * 更新项目完成标段数
     * @param projectId
     */
    void updateSectionFinishNum(@Param("projectId") Integer projectId);


    /**
     * 获取竣工界面显示
     * @param projectStoreFlagVo
     * @param unitId
     * @return
     */
    List<ProjectStore> getByUnitIdFinish(@Param("projectStoreFlagVo") ProjectStoreFlagVo projectStoreFlagVo, @Param("unitId") Integer unitId);

    /**
     * 设置重点项目
     * @param projectId
     * @return
     */
    void updateImportant(@Param("projectId") Integer projectId);

    /**
     * 统计本单位项目数量（包括删除的）
     * @param unitId
     * @return
     */
    int countByUnitId(@Param("unitId") Integer unitId);

    /**
     * 更新项目建议
     * @param projectStore
     */
    void updateSuggestion(@Param("projectStore") ProjectStore projectStore);

    /**
     * 获取全部项目的数量统计
     * @return
     */
    NumStatisticsMo getNumStatistics();

    /**
     * 获取部分项目的坐标和部分信息（地图显示）
     * @param flag
     * @return
     */
    List<ProjectStore> getProjectLocationClass(@Param("flag") int flag);

    /**
     * 获取全部项目的坐标和部分信息（地图显示）
     * @return
     */
    List<ProjectStore> getProjectLocation();

    /**
     * 获取全部单位的项目统计
     * @return
     */
    List<ConstructUnitStatisticMo> getConstructUnitStatistic();

    /**
     * 审批项目的审价
     * @param projectStore
     * @return
     */
    void updateVerificationApprove(@Param("projectStore") ProjectStore projectStore);

    List<ProjectStore> getTest();

}