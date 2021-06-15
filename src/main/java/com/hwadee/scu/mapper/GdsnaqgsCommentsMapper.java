package com.hwadee.scu.mapper;

import com.hwadee.scu.common.domain.GdsnaqgsComments;
import com.hwadee.scu.common.domain.GdsnaqgsCommentsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GdsnaqgsCommentsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gdsnaqgs_comments
     *
     * @mbg.generated Sat Jun 12 15:32:27 CST 2021
     */
    long countByExample(GdsnaqgsCommentsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gdsnaqgs_comments
     *
     * @mbg.generated Sat Jun 12 15:32:27 CST 2021
     */
    int deleteByExample(GdsnaqgsCommentsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gdsnaqgs_comments
     *
     * @mbg.generated Sat Jun 12 15:32:27 CST 2021
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gdsnaqgs_comments
     *
     * @mbg.generated Sat Jun 12 15:32:27 CST 2021
     */
    int insert(GdsnaqgsComments record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gdsnaqgs_comments
     *
     * @mbg.generated Sat Jun 12 15:32:27 CST 2021
     */
    int insertSelective(GdsnaqgsComments record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gdsnaqgs_comments
     *
     * @mbg.generated Sat Jun 12 15:32:27 CST 2021
     */
    List<GdsnaqgsComments> selectByExample(GdsnaqgsCommentsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gdsnaqgs_comments
     *
     * @mbg.generated Sat Jun 12 15:32:27 CST 2021
     */
    GdsnaqgsComments selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gdsnaqgs_comments
     *
     * @mbg.generated Sat Jun 12 15:32:27 CST 2021
     */
    int updateByExampleSelective(@Param("record") GdsnaqgsComments record, @Param("example") GdsnaqgsCommentsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gdsnaqgs_comments
     *
     * @mbg.generated Sat Jun 12 15:32:27 CST 2021
     */
    int updateByExample(@Param("record") GdsnaqgsComments record, @Param("example") GdsnaqgsCommentsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gdsnaqgs_comments
     *
     * @mbg.generated Sat Jun 12 15:32:27 CST 2021
     */
    int updateByPrimaryKeySelective(GdsnaqgsComments record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gdsnaqgs_comments
     *
     * @mbg.generated Sat Jun 12 15:32:27 CST 2021
     */
    int updateByPrimaryKey(GdsnaqgsComments record);
}