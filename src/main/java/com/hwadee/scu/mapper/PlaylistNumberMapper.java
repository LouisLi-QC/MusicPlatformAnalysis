package com.hwadee.scu.mapper;

import com.hwadee.scu.common.domain.PlaylistNumber;
import com.hwadee.scu.common.domain.PlaylistNumberExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PlaylistNumberMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table playlist_number
     *
     * @mbg.generated Sat Jun 12 15:32:27 CST 2021
     */
    long countByExample(PlaylistNumberExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table playlist_number
     *
     * @mbg.generated Sat Jun 12 15:32:27 CST 2021
     */
    int deleteByExample(PlaylistNumberExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table playlist_number
     *
     * @mbg.generated Sat Jun 12 15:32:27 CST 2021
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table playlist_number
     *
     * @mbg.generated Sat Jun 12 15:32:27 CST 2021
     */
    int insert(PlaylistNumber record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table playlist_number
     *
     * @mbg.generated Sat Jun 12 15:32:27 CST 2021
     */
    int insertSelective(PlaylistNumber record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table playlist_number
     *
     * @mbg.generated Sat Jun 12 15:32:27 CST 2021
     */
    List<PlaylistNumber> selectByExample(PlaylistNumberExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table playlist_number
     *
     * @mbg.generated Sat Jun 12 15:32:27 CST 2021
     */
    PlaylistNumber selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table playlist_number
     *
     * @mbg.generated Sat Jun 12 15:32:27 CST 2021
     */
    int updateByExampleSelective(@Param("record") PlaylistNumber record, @Param("example") PlaylistNumberExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table playlist_number
     *
     * @mbg.generated Sat Jun 12 15:32:27 CST 2021
     */
    int updateByExample(@Param("record") PlaylistNumber record, @Param("example") PlaylistNumberExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table playlist_number
     *
     * @mbg.generated Sat Jun 12 15:32:27 CST 2021
     */
    int updateByPrimaryKeySelective(PlaylistNumber record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table playlist_number
     *
     * @mbg.generated Sat Jun 12 15:32:27 CST 2021
     */
    int updateByPrimaryKey(PlaylistNumber record);
}