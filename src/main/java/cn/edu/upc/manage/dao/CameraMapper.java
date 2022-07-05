package cn.edu.upc.manage.dao;

import cn.edu.upc.manage.model.Camera;
import cn.edu.upc.manage.model.CameraExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CameraMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table camera
     *
     * @mbg.generated Thu Apr 08 17:11:06 CST 2021
     */
    long countByExample(CameraExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table camera
     *
     * @mbg.generated Thu Apr 08 17:11:06 CST 2021
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table camera
     *
     * @mbg.generated Thu Apr 08 17:11:06 CST 2021
     */
    int insert(Camera record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table camera
     *
     * @mbg.generated Thu Apr 08 17:11:06 CST 2021
     */
    int insertSelective(Camera record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table camera
     *
     * @mbg.generated Thu Apr 08 17:11:06 CST 2021
     */
    Camera selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table camera
     *
     * @mbg.generated Thu Apr 08 17:11:06 CST 2021
     */
    int updateByPrimaryKeySelective(Camera record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table camera
     *
     * @mbg.generated Thu Apr 08 17:11:06 CST 2021
     */
    int updateByPrimaryKey(Camera record);

    /**
     * 删除摄像头
     * @param id
     * @return
     */
    void deleteCamera(@Param("id") Integer id);

    /**
     * 获取摄像头
     * @param projectId
     * @return
     */
    List<Camera> getCameraByProjectId(@Param("projectId") Integer projectId);
}