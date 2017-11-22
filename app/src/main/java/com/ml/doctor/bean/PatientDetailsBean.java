package com.ml.doctor.bean;

/**
 * Created by gzq on 2017/11/22.
 */

public class PatientDetailsBean {
    private String zid,eq,user,time,temper_ature,high_pressure,low_pressure,
            heart_rate,blood_sugar,blood_oxygen,pulse,ecg,yz,diagnosis,eqid,bname,state,hl;

    public String getZid() {
        return zid;
    }

    public void setZid(String zid) {
        this.zid = zid;
    }

    public String getEq() {
        return eq;
    }

    public void setEq(String eq) {
        this.eq = eq;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTemper_ature() {
        return temper_ature;
    }

    public void setTemper_ature(String temper_ature) {
        this.temper_ature = temper_ature;
    }

    public String getHigh_pressure() {
        return high_pressure;
    }

    public void setHigh_pressure(String high_pressure) {
        this.high_pressure = high_pressure;
    }

    public String getLow_pressure() {
        return low_pressure;
    }

    public void setLow_pressure(String low_pressure) {
        this.low_pressure = low_pressure;
    }

    public String getHeart_rate() {
        return heart_rate;
    }

    public void setHeart_rate(String heart_rate) {
        this.heart_rate = heart_rate;
    }

    public String getBlood_sugar() {
        return blood_sugar;
    }

    public void setBlood_sugar(String blood_sugar) {
        this.blood_sugar = blood_sugar;
    }

    public String getBlood_oxygen() {
        return blood_oxygen;
    }

    public void setBlood_oxygen(String blood_oxygen) {
        this.blood_oxygen = blood_oxygen;
    }

    public String getPulse() {
        return pulse;
    }

    public void setPulse(String pulse) {
        this.pulse = pulse;
    }

    public String getEcg() {
        return ecg;
    }

    public void setEcg(String ecg) {
        this.ecg = ecg;
    }

    public String getYz() {
        return yz;
    }

    public void setYz(String yz) {
        this.yz = yz;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getEqid() {
        return eqid;
    }

    public void setEqid(String eqid) {
        this.eqid = eqid;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getHl() {
        return hl;
    }

    public void setHl(String hl) {
        this.hl = hl;
    }

    @Override
    public String toString() {
        return "PatientDetailsBean{" +
                "zid='" + zid + '\'' +
                ", eq='" + eq + '\'' +
                ", user='" + user + '\'' +
                ", time='" + time + '\'' +
                ", temper_ature='" + temper_ature + '\'' +
                ", high_pressure='" + high_pressure + '\'' +
                ", low_pressure='" + low_pressure + '\'' +
                ", heart_rate='" + heart_rate + '\'' +
                ", blood_sugar='" + blood_sugar + '\'' +
                ", blood_oxygen='" + blood_oxygen + '\'' +
                ", pulse='" + pulse + '\'' +
                ", ecg='" + ecg + '\'' +
                ", yz='" + yz + '\'' +
                ", diagnosis='" + diagnosis + '\'' +
                ", eqid='" + eqid + '\'' +
                ", bname='" + bname + '\'' +
                ", state='" + state + '\'' +
                ", hl='" + hl + '\'' +
                '}';
    }
}
