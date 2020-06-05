package cn.edu.upc.manage.dao;

import cn.edu.upc.manage.model.Right;

import java.util.List;

public interface RightMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table right
     *
     * @mbg.generated Sat May 30 21:04:18 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table right
     *
     * @mbg.generated Sat May 30 21:04:18 CST 2020
     */
    int insert(Right record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table right
     *
     * @mbg.generated Sat May 30 21:04:18 CST 2020
     */
    int insertSelective(Right record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table right
     *
     * @mbg.generated Sat May 30 21:04:18 CST 2020
     */
    Right selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table right
     *
     * @mbg.generated Sat May 30 21:04:18 CST 2020
     */
    int updateByPrimaryKeySelective(Right record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table right
     *
     * @mbg.generated Sat May 30 21:04:18 CST 2020
     */
    int updateByPrimaryKey(Right record);

    List<Right> getAllRight();

    void deleteRight(int rightId);


}