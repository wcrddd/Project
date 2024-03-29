package cn.edu.upc.manage.dao;

import cn.edu.upc.manage.model.Post;

import java.util.List;

public interface PostMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table post
     *
     * @mbg.generated Mon May 18 15:48:58 CST 2020
     */
    int deleteByPrimaryKey(Integer id);
    List<Post> selectPost();
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table post
     *
     * @mbg.generated Mon May 18 15:48:58 CST 2020
     */
    int insert(Post record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table post
     *
     * @mbg.generated Mon May 18 15:48:58 CST 2020
     */
    int insertSelective(Post record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table post
     *
     * @mbg.generated Mon May 18 15:48:58 CST 2020
     */
    Post selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table post
     *
     * @mbg.generated Mon May 18 15:48:58 CST 2020
     */
    int updateByPrimaryKeySelective(Post record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table post
     *
     * @mbg.generated Mon May 18 15:48:58 CST 2020
     */
    int updateByPrimaryKey(Post record);
}