package com.hwadee.scu.common.domain;

import java.util.Date;

public class QflComments {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column qfl_comments.id
     *
     * @mbg.generated Sat Jun 12 15:32:27 CST 2021
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column qfl_comments.user
     *
     * @mbg.generated Sat Jun 12 15:32:27 CST 2021
     */
    private String user;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column qfl_comments.time
     *
     * @mbg.generated Sat Jun 12 15:32:27 CST 2021
     */
    private Date time;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column qfl_comments.vip
     *
     * @mbg.generated Sat Jun 12 15:32:27 CST 2021
     */
    private Integer vip;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column qfl_comments.content
     *
     * @mbg.generated Sat Jun 12 15:32:27 CST 2021
     */
    private String content;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qfl_comments
     *
     * @mbg.generated Sat Jun 12 15:32:27 CST 2021
     */
    public QflComments(Integer id, String user, Date time, Integer vip, String content) {
        this.id = id;
        this.user = user;
        this.time = time;
        this.vip = vip;
        this.content = content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qfl_comments
     *
     * @mbg.generated Sat Jun 12 15:32:27 CST 2021
     */
    public QflComments() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column qfl_comments.id
     *
     * @return the value of qfl_comments.id
     *
     * @mbg.generated Sat Jun 12 15:32:27 CST 2021
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column qfl_comments.id
     *
     * @param id the value for qfl_comments.id
     *
     * @mbg.generated Sat Jun 12 15:32:27 CST 2021
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column qfl_comments.user
     *
     * @return the value of qfl_comments.user
     *
     * @mbg.generated Sat Jun 12 15:32:27 CST 2021
     */
    public String getUser() {
        return user;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column qfl_comments.user
     *
     * @param user the value for qfl_comments.user
     *
     * @mbg.generated Sat Jun 12 15:32:27 CST 2021
     */
    public void setUser(String user) {
        this.user = user == null ? null : user.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column qfl_comments.time
     *
     * @return the value of qfl_comments.time
     *
     * @mbg.generated Sat Jun 12 15:32:27 CST 2021
     */
    public Date getTime() {
        return time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column qfl_comments.time
     *
     * @param time the value for qfl_comments.time
     *
     * @mbg.generated Sat Jun 12 15:32:27 CST 2021
     */
    public void setTime(Date time) {
        this.time = time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column qfl_comments.vip
     *
     * @return the value of qfl_comments.vip
     *
     * @mbg.generated Sat Jun 12 15:32:27 CST 2021
     */
    public Integer getVip() {
        return vip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column qfl_comments.vip
     *
     * @param vip the value for qfl_comments.vip
     *
     * @mbg.generated Sat Jun 12 15:32:27 CST 2021
     */
    public void setVip(Integer vip) {
        this.vip = vip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column qfl_comments.content
     *
     * @return the value of qfl_comments.content
     *
     * @mbg.generated Sat Jun 12 15:32:27 CST 2021
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column qfl_comments.content
     *
     * @param content the value for qfl_comments.content
     *
     * @mbg.generated Sat Jun 12 15:32:27 CST 2021
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qfl_comments
     *
     * @mbg.generated Sat Jun 12 15:32:27 CST 2021
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
        QflComments other = (QflComments) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUser() == null ? other.getUser() == null : this.getUser().equals(other.getUser()))
            && (this.getTime() == null ? other.getTime() == null : this.getTime().equals(other.getTime()))
            && (this.getVip() == null ? other.getVip() == null : this.getVip().equals(other.getVip()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qfl_comments
     *
     * @mbg.generated Sat Jun 12 15:32:27 CST 2021
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUser() == null) ? 0 : getUser().hashCode());
        result = prime * result + ((getTime() == null) ? 0 : getTime().hashCode());
        result = prime * result + ((getVip() == null) ? 0 : getVip().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        return result;
    }
}