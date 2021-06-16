package com.hwadee.scu.mapper;

import com.hwadee.scu.common.domain.QflComments;
import com.hwadee.scu.common.domain.QflCommentsExample;
import java.util.List;

import com.hwadee.scu.common.domain.entity.Comment;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface QflCommentsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qfl_comments
     *
     * @mbg.generated Tue Jun 15 11:22:48 CST 2021
     */
    long countByExample(QflCommentsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qfl_comments
     *
     * @mbg.generated Tue Jun 15 11:22:48 CST 2021
     */
    int deleteByExample(QflCommentsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qfl_comments
     *
     * @mbg.generated Tue Jun 15 11:22:48 CST 2021
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qfl_comments
     *
     * @mbg.generated Tue Jun 15 11:22:48 CST 2021
     */
    int insert(QflComments record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qfl_comments
     *
     * @mbg.generated Tue Jun 15 11:22:48 CST 2021
     */
    int insertSelective(QflComments record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qfl_comments
     *
     * @mbg.generated Tue Jun 15 11:22:48 CST 2021
     */
    List<QflComments> selectByExample(QflCommentsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qfl_comments
     *
     * @mbg.generated Tue Jun 15 11:22:48 CST 2021
     */
    QflComments selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qfl_comments
     *
     * @mbg.generated Tue Jun 15 11:22:48 CST 2021
     */
    int updateByExampleSelective(@Param("record") QflComments record, @Param("example") QflCommentsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qfl_comments
     *
     * @mbg.generated Tue Jun 15 11:22:48 CST 2021
     */
    int updateByExample(@Param("record") QflComments record, @Param("example") QflCommentsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qfl_comments
     *
     * @mbg.generated Tue Jun 15 11:22:48 CST 2021
     */
    int updateByPrimaryKeySelective(QflComments record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qfl_comments
     *
     * @mbg.generated Tue Jun 15 11:22:48 CST 2021
     */
    int updateByPrimaryKey(QflComments record);
    @Select("SELECT Hour(time) as Hour,count(*) as Count FROM qfl_comments GROUP BY HOUR ORDER BY Hour")
    List<Comment> getComments();
}