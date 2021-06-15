package com.hwadee.scu.common.domain;

public class userInformation {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_information.id
     *
     * @mbg.generated Tue Jun 15 11:22:48 CST 2021
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_information.uuId
     *
     * @mbg.generated Tue Jun 15 11:22:48 CST 2021
     */
    private Integer uuid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_information.area
     *
     * @mbg.generated Tue Jun 15 11:22:48 CST 2021
     */
    private String area;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_information.sex
     *
     * @mbg.generated Tue Jun 15 11:22:48 CST 2021
     */
    private String sex;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_information.level
     *
     * @mbg.generated Tue Jun 15 11:22:48 CST 2021
     */
    private Integer level;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_information
     *
     * @mbg.generated Tue Jun 15 11:22:48 CST 2021
     */
    public userInformation(Integer id, Integer uuid, String area, String sex, Integer level) {
        this.id = id;
        this.uuid = uuid;
        this.area = area;
        this.sex = sex;
        this.level = level;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_information
     *
     * @mbg.generated Tue Jun 15 11:22:48 CST 2021
     */
    public userInformation() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_information.id
     *
     * @return the value of user_information.id
     *
     * @mbg.generated Tue Jun 15 11:22:48 CST 2021
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_information.id
     *
     * @param id the value for user_information.id
     *
     * @mbg.generated Tue Jun 15 11:22:48 CST 2021
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_information.uuId
     *
     * @return the value of user_information.uuId
     *
     * @mbg.generated Tue Jun 15 11:22:48 CST 2021
     */
    public Integer getUuid() {
        return uuid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_information.uuId
     *
     * @param uuid the value for user_information.uuId
     *
     * @mbg.generated Tue Jun 15 11:22:48 CST 2021
     */
    public void setUuid(Integer uuid) {
        this.uuid = uuid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_information.area
     *
     * @return the value of user_information.area
     *
     * @mbg.generated Tue Jun 15 11:22:48 CST 2021
     */
    public String getArea() {
        return area;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_information.area
     *
     * @param area the value for user_information.area
     *
     * @mbg.generated Tue Jun 15 11:22:48 CST 2021
     */
    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_information.sex
     *
     * @return the value of user_information.sex
     *
     * @mbg.generated Tue Jun 15 11:22:48 CST 2021
     */
    public String getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_information.sex
     *
     * @param sex the value for user_information.sex
     *
     * @mbg.generated Tue Jun 15 11:22:48 CST 2021
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_information.level
     *
     * @return the value of user_information.level
     *
     * @mbg.generated Tue Jun 15 11:22:48 CST 2021
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_information.level
     *
     * @param level the value for user_information.level
     *
     * @mbg.generated Tue Jun 15 11:22:48 CST 2021
     */
    public void setLevel(Integer level) {
        this.level = level;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_information
     *
     * @mbg.generated Tue Jun 15 11:22:48 CST 2021
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        userInformation other = (userInformation) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUuid() == null ? other.getUuid() == null : this.getUuid().equals(other.getUuid()))
            && (this.getArea() == null ? other.getArea() == null : this.getArea().equals(other.getArea()))
            && (this.getSex() == null ? other.getSex() == null : this.getSex().equals(other.getSex()))
            && (this.getLevel() == null ? other.getLevel() == null : this.getLevel().equals(other.getLevel()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_information
     *
     * @mbg.generated Tue Jun 15 11:22:48 CST 2021
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUuid() == null) ? 0 : getUuid().hashCode());
        result = prime * result + ((getArea() == null) ? 0 : getArea().hashCode());
        result = prime * result + ((getSex() == null) ? 0 : getSex().hashCode());
        result = prime * result + ((getLevel() == null) ? 0 : getLevel().hashCode());
        return result;
    }
}