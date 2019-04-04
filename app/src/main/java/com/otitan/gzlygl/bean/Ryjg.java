package com.otitan.gzlygl.bean;

/**
 * Created by sp on 2019/4/1.
 * 人员结构基本情况
 */
public class Ryjg {

    private String city; // 市（州）

    private String county; // 县（区）

    private String department; // 单位名称

    private String num; // 总编制数

    private String agency; // 内设机构个数（含事业单位）

    private String jclyjgJgMc; // 基层林业机构-机构-机构名称

    private String jclyjgJgGs; // 基层林业机构-机构-机构个数

    private String jclyjgRyBz; // 基层林业机构-人员-编制人数

    private String jclyjgRyRs; // 基层林业机构-人员-在职人数

    private String rybzRybzXz; // 人员编制情况-行政

    private String rybzRybzCg; // 人员编制情况-参公

    private String rybzRybzSy; // 人员编制情况-事业

    private String rybzRybzGq; // 人员编制情况-工勤

    private String rybzSyryXz; // 实有人员情况-行政

    private String rybzSyryCg; // 实有人员情况-参公

    private String rybzSyrySy; // 实有人员情况-事业

    private String rybzSyryGq; // 实有人员情况-工勤

    private String zzryZjCj; // 职级情况-处级

    private String zzryZjKj; // 职级情况-科级

    private String zzryZjGj; // 职级情况-股级

    private String zzryXlBs; // 学历结构-博士

    private String zzryXlSs; // 学历结构-硕士

    private String zzryXlBk; // 学历结构-本科

    private String zzryXlZk; // 学历结构-专科及以下

    private String zzryZcZg; // 职称结构-正高

    private String zzryZcFg; // 职称结构-副高

    private String zzryZcZj; // 职称结构-中级

    private String zzryZcCj; // 职称结构-初级

    private String zzryNlWl; // 年龄结构-56岁以上

    private String zzryNlSw; // 年龄结构-46-55岁

    private String zzryNlSs; // 年龄结构-36-45岁

    private String zzryNlEs; // 年龄结构-35岁以下

    private String rjfwmj; // 人均服务面积

    private String bz; // 备注

    public Ryjg(String city, String county, String department, String num, String agency, String jclyjgJgMc, String jclyjgJgGs, String jclyjgRyBz, String jclyjgRyRs, String rybzRybzXz, String rybzRybzCg, String rybzRybzSy, String rybzRybzGq, String rybzSyryXz, String rybzSyryCg, String rybzSyrySy, String rybzSyryGq, String zzryZjCj, String zzryZjKj, String zzryZjGj, String zzryXlBs, String zzryXlSs, String zzryXlBk, String zzryXlZk, String zzryZcZg, String zzryZcFg, String zzryZcZj, String zzryZcCj, String zzryNlWl, String zzryNlSw, String zzryNlSs, String zzryNlEs, String rjfwmj, String bz) {
        this.city = city;
        this.county = county;
        this.department = department;
        this.num = num;
        this.agency = agency;
        this.jclyjgJgMc = jclyjgJgMc;
        this.jclyjgJgGs = jclyjgJgGs;
        this.jclyjgRyBz = jclyjgRyBz;
        this.jclyjgRyRs = jclyjgRyRs;
        this.rybzRybzXz = rybzRybzXz;
        this.rybzRybzCg = rybzRybzCg;
        this.rybzRybzSy = rybzRybzSy;
        this.rybzRybzGq = rybzRybzGq;
        this.rybzSyryXz = rybzSyryXz;
        this.rybzSyryCg = rybzSyryCg;
        this.rybzSyrySy = rybzSyrySy;
        this.rybzSyryGq = rybzSyryGq;
        this.zzryZjCj = zzryZjCj;
        this.zzryZjKj = zzryZjKj;
        this.zzryZjGj = zzryZjGj;
        this.zzryXlBs = zzryXlBs;
        this.zzryXlSs = zzryXlSs;
        this.zzryXlBk = zzryXlBk;
        this.zzryXlZk = zzryXlZk;
        this.zzryZcZg = zzryZcZg;
        this.zzryZcFg = zzryZcFg;
        this.zzryZcZj = zzryZcZj;
        this.zzryZcCj = zzryZcCj;
        this.zzryNlWl = zzryNlWl;
        this.zzryNlSw = zzryNlSw;
        this.zzryNlSs = zzryNlSs;
        this.zzryNlEs = zzryNlEs;
        this.rjfwmj = rjfwmj;
        this.bz = bz;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public String getJclyjgJgMc() {
        return jclyjgJgMc;
    }

    public void setJclyjgJgMc(String jclyjgJgMc) {
        this.jclyjgJgMc = jclyjgJgMc;
    }

    public String getJclyjgJgGs() {
        return jclyjgJgGs;
    }

    public void setJclyjgJgGs(String jclyjgJgGs) {
        this.jclyjgJgGs = jclyjgJgGs;
    }

    public String getJclyjgRyBz() {
        return jclyjgRyBz;
    }

    public void setJclyjgRyBz(String jclyjgRyBz) {
        this.jclyjgRyBz = jclyjgRyBz;
    }

    public String getJclyjgRyRs() {
        return jclyjgRyRs;
    }

    public void setJclyjgRyRs(String jclyjgRyRs) {
        this.jclyjgRyRs = jclyjgRyRs;
    }

    public String getRybzRybzXz() {
        return rybzRybzXz;
    }

    public void setRybzRybzXz(String rybzRybzXz) {
        this.rybzRybzXz = rybzRybzXz;
    }

    public String getRybzRybzCg() {
        return rybzRybzCg;
    }

    public void setRybzRybzCg(String rybzRybzCg) {
        this.rybzRybzCg = rybzRybzCg;
    }

    public String getRybzRybzSy() {
        return rybzRybzSy;
    }

    public void setRybzRybzSy(String rybzRybzSy) {
        this.rybzRybzSy = rybzRybzSy;
    }

    public String getRybzRybzGq() {
        return rybzRybzGq;
    }

    public void setRybzRybzGq(String rybzRybzGq) {
        this.rybzRybzGq = rybzRybzGq;
    }

    public String getRybzSyryXz() {
        return rybzSyryXz;
    }

    public void setRybzSyryXz(String rybzSyryXz) {
        this.rybzSyryXz = rybzSyryXz;
    }

    public String getRybzSyryCg() {
        return rybzSyryCg;
    }

    public void setRybzSyryCg(String rybzSyryCg) {
        this.rybzSyryCg = rybzSyryCg;
    }

    public String getRybzSyrySy() {
        return rybzSyrySy;
    }

    public void setRybzSyrySy(String rybzSyrySy) {
        this.rybzSyrySy = rybzSyrySy;
    }

    public String getRybzSyryGq() {
        return rybzSyryGq;
    }

    public void setRybzSyryGq(String rybzSyryGq) {
        this.rybzSyryGq = rybzSyryGq;
    }

    public String getZzryZjCj() {
        return zzryZjCj;
    }

    public void setZzryZjCj(String zzryZjCj) {
        this.zzryZjCj = zzryZjCj;
    }

    public String getZzryZjKj() {
        return zzryZjKj;
    }

    public void setZzryZjKj(String zzryZjKj) {
        this.zzryZjKj = zzryZjKj;
    }

    public String getZzryZjGj() {
        return zzryZjGj;
    }

    public void setZzryZjGj(String zzryZjGj) {
        this.zzryZjGj = zzryZjGj;
    }

    public String getZzryXlBs() {
        return zzryXlBs;
    }

    public void setZzryXlBs(String zzryXlBs) {
        this.zzryXlBs = zzryXlBs;
    }

    public String getZzryXlSs() {
        return zzryXlSs;
    }

    public void setZzryXlSs(String zzryXlSs) {
        this.zzryXlSs = zzryXlSs;
    }

    public String getZzryXlBk() {
        return zzryXlBk;
    }

    public void setZzryXlBk(String zzryXlBk) {
        this.zzryXlBk = zzryXlBk;
    }

    public String getZzryXlZk() {
        return zzryXlZk;
    }

    public void setZzryXlZk(String zzryXlZk) {
        this.zzryXlZk = zzryXlZk;
    }

    public String getZzryZcZg() {
        return zzryZcZg;
    }

    public void setZzryZcZg(String zzryZcZg) {
        this.zzryZcZg = zzryZcZg;
    }

    public String getZzryZcFg() {
        return zzryZcFg;
    }

    public void setZzryZcFg(String zzryZcFg) {
        this.zzryZcFg = zzryZcFg;
    }

    public String getZzryZcZj() {
        return zzryZcZj;
    }

    public void setZzryZcZj(String zzryZcZj) {
        this.zzryZcZj = zzryZcZj;
    }

    public String getZzryZcCj() {
        return zzryZcCj;
    }

    public void setZzryZcCj(String zzryZcCj) {
        this.zzryZcCj = zzryZcCj;
    }

    public String getZzryNlWl() {
        return zzryNlWl;
    }

    public void setZzryNlWl(String zzryNlWl) {
        this.zzryNlWl = zzryNlWl;
    }

    public String getZzryNlSw() {
        return zzryNlSw;
    }

    public void setZzryNlSw(String zzryNlSw) {
        this.zzryNlSw = zzryNlSw;
    }

    public String getZzryNlSs() {
        return zzryNlSs;
    }

    public void setZzryNlSs(String zzryNlSs) {
        this.zzryNlSs = zzryNlSs;
    }

    public String getZzryNlEs() {
        return zzryNlEs;
    }

    public void setZzryNlEs(String zzryNlEs) {
        this.zzryNlEs = zzryNlEs;
    }

    public String getRjfwmj() {
        return rjfwmj;
    }

    public void setRjfwmj(String rjfwmj) {
        this.rjfwmj = rjfwmj;
    }

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz;
    }
}
