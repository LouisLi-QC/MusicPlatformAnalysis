package com.hwadee.scu.mapper;

import com.hwadee.scu.common.domain.XwzydrComments;
import com.hwadee.scu.common.domain.XwzydrCommentsExample;
import java.util.List;

import com.hwadee.scu.common.domain.entity.Comment;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface XwzydrCommentsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xwzydr_comments
     *
     * @mbg.generated Tue Jun 15 11:22:48 CST 2021
     */
    long countByExample(XwzydrCommentsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xwzydr_comments
     *
     * @mbg.generated Tue Jun 15 11:22:48 CST 2021
     */
    int deleteByExample(XwzydrCommentsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xwzydr_comments
     *
     * @mbg.generated Tue Jun 15 11:22:48 CST 2021
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xwzydr_comments
     *
     * @mbg.generated Tue Jun 15 11:22:48 CST 2021
     */
    int insert(XwzydrComments record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xwzydr_comments
     *
     * @mbg.generated Tue Jun 15 11:22:48 CST 2021
     */
    int insertSelective(XwzydrComments record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xwzydr_comments
     *
     * @mbg.generated Tue Jun 15 11:22:48 CST 2021
     */
    List<XwzydrComments> selectByExample(XwzydrCommentsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xwzydr_comments
     *
     * @mbg.generated Tue Jun 15 11:22:48 CST 2021
     */
    XwzydrComments selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xwzydr_comments
     *
     * @mbg.generated Tue Jun 15 11:22:48 CST 2021
     */
    int updateByExampleSelective(@Param("record") XwzydrComments record, @Param("example") XwzydrCommentsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xwzydr_comments
     *
     * @mbg.generated Tue Jun 15 11:22:48 CST 2021
     */
    int updateByExample(@Param("record") XwzydrComments record, @Param("example") XwzydrCommentsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xwzydr_comments
     *
     * @mbg.generated Tue Jun 15 11:22:48 CST 2021
     */
    int updateByPrimaryKeySelective(XwzydrComments record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xwzydr_comments
     *
     * @mbg.generated Tue Jun 15 11:22:48 CST 2021
     */
    int updateByPrimaryKey(XwzydrComments record);
    @Select("SELECT Hour(time) as Hour,count(*) as Count FROM xwzydr_comments GROUP BY HOUR ORDER BY Hour")
    List<Comment> getComments();
}