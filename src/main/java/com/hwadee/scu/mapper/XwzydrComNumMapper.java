package com.hwadee.scu.mapper;

import com.hwadee.scu.common.domain.XwzydrComNum;
import com.hwadee.scu.common.domain.XwzydrComNumExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface XwzydrComNumMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xwzydr_com_num
     *
     * @mbg.generated Tue Jun 15 18:35:16 CST 2021
     */
    long countByExample(XwzydrComNumExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xwzydr_com_num
     *
     * @mbg.generated Tue Jun 15 18:35:16 CST 2021
     */
    int deleteByExample(XwzydrComNumExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xwzydr_com_num
     *
     * @mbg.generated Tue Jun 15 18:35:16 CST 2021
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xwzydr_com_num
     *
     * @mbg.generated Tue Jun 15 18:35:16 CST 2021
     */
    int insert(XwzydrComNum record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xwzydr_com_num
     *
     * @mbg.generated Tue Jun 15 18:35:16 CST 2021
     */
    int insertSelective(XwzydrComNum record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xwzydr_com_num
     *
     * @mbg.generated Tue Jun 15 18:35:16 CST 2021
     */
    List<XwzydrComNum> selectByExample(XwzydrComNumExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xwzydr_com_num
     *
     * @mbg.generated Tue Jun 15 18:35:16 CST 2021
     */
    XwzydrComNum selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xwzydr_com_num
     *
     * @mbg.generated Tue Jun 15 18:35:16 CST 2021
     */
    int updateByExampleSelective(@Param("record") XwzydrComNum record, @Param("example") XwzydrComNumExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xwzydr_com_num
     *
     * @mbg.generated Tue Jun 15 18:35:16 CST 2021
     */
    int updateByExample(@Param("record") XwzydrComNum record, @Param("example") XwzydrComNumExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xwzydr_com_num
     *
     * @mbg.generated Tue Jun 15 18:35:16 CST 2021
     */
    int updateByPrimaryKeySelective(XwzydrComNum record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xwzydr_com_num
     *
     * @mbg.generated Tue Jun 15 18:35:16 CST 2021
     */
    int updateByPrimaryKey(XwzydrComNum record);

    @Select("select *from xwzydr_com_num")
    List<XwzydrComNum> findAllMe();
}