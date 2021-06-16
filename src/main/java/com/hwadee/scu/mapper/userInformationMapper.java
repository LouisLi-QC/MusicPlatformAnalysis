package com.hwadee.scu.mapper;

import com.hwadee.scu.common.domain.entity.UserLevel;
import com.hwadee.scu.common.domain.userInformation;
import com.hwadee.scu.common.domain.userInformationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface userInformationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_information
     *
     * @mbg.generated Tue Jun 15 11:22:48 CST 2021
     */
    long countByExample(userInformationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_information
     *
     * @mbg.generated Tue Jun 15 11:22:48 CST 2021
     */
    int deleteByExample(userInformationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_information
     *
     * @mbg.generated Tue Jun 15 11:22:48 CST 2021
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_information
     *
     * @mbg.generated Tue Jun 15 11:22:48 CST 2021
     */
    int insert(userInformation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_information
     *
     * @mbg.generated Tue Jun 15 11:22:48 CST 2021
     */
    int insertSelective(userInformation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_information
     *
     * @mbg.generated Tue Jun 15 11:22:48 CST 2021
     */
    List<userInformation> selectByExample(userInformationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_information
     *
     * @mbg.generated Tue Jun 15 11:22:48 CST 2021
     */
    userInformation selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_information
     *
     * @mbg.generated Tue Jun 15 11:22:48 CST 2021
     */
    int updateByExampleSelective(@Param("record") userInformation record, @Param("example") userInformationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_information
     *
     * @mbg.generated Tue Jun 15 11:22:48 CST 2021
     */
    int updateByExample(@Param("record") userInformation record, @Param("example") userInformationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_information
     *
     * @mbg.generated Tue Jun 15 11:22:48 CST 2021
     */
    int updateByPrimaryKeySelective(userInformation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_information
     *
     * @mbg.generated Tue Jun 15 11:22:48 CST 2021
     */
    int updateByPrimaryKey(userInformation record);

    @Select("select level ,count(level) as number from user_information group by level")
    List<UserLevel> getAllUserLevel();
}