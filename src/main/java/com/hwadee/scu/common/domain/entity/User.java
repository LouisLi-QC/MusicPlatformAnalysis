package com.hwadee.scu.common.domain.entity;

public class User {

    private UserCount VIP;
    private UserCount normal;
    private UserCount male;
    private UserCount female;

    public User() {
    }

    public User(UserCount VIP,
                UserCount normal,
                UserCount male,
                UserCount female) {
        this.VIP=VIP;
        this.normal=normal;
        this.male=male;
        this.female=female;
    }

    public UserCount getVIP() {
        return VIP;
    }

    public void setVIP(UserCount VIP) {
        this.VIP = VIP;
    }

    public UserCount getNormal() {
        return normal;
    }

    public void setNormal(UserCount normal) {
        this.normal = normal;
    }

    public UserCount getMale() {
        return male;
    }

    public void setMale(UserCount male) {
        this.male = male;
    }

    public UserCount getFemale() {
        return female;
    }

    public void setFemale(UserCount female) {
        this.female = female;
    }

    @Override
    public String toString() {
        return "User{" +
                "VIP=" + VIP +
                ", normal=" + normal +
                ", male=" + male +
                ", female=" + female +
                '}';
    }
}
