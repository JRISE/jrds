package com.jrds.dao;

import com.jrds.pojo.Dic;

public interface DicMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_dic
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_dic
     *
     * @mbggenerated
     */
    int insert(Dic record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_dic
     *
     * @mbggenerated
     */
    int insertSelective(Dic record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_dic
     *
     * @mbggenerated
     */
    Dic selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_dic
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Dic record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_dic
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Dic record);
}