package com.otitan.gzlygl.bean;

/**
 * Created by sp on 2019/4/2.
 * 林业品牌建设
 */
public class Lypp {

    private String city; // 市（州）

    private String county; // 县（区）

    private String department; // 单位名称

    private String gjpp; // 国家级品牌个数

    private String sjpp; // 省级涉林品牌个数

    private String zrbhdGj; // 自然保护地-国家级

    private String zrbhdSj; // 自然保护地-省级

    private String slcsGj; // 森林城市-国家级

    private String slcsSj; // 森林城市-省级

    private String rychGj; // 涉林荣誉称号-世界级

    private String rychSj; // 涉林荣誉称号-国家级

    private String kysfGj; // 涉林科研、示范基地-国家级

    private String kysfSj; // 涉林科研、示范基地-省级

    private String slpp; // 涉林地理标志产品

    private String qtpp; // 其它林业知名品牌

    public Lypp(String city, String county, String department, String gjpp, String sjpp, String zrbhdGj, String zrbhdSj, String slcsGj, String slcsSj, String rychGj, String rychSj, String kysfGj, String kysfSj, String slpp, String qtpp) {
        this.city = city;
        this.county = county;
        this.department = department;
        this.gjpp = gjpp;
        this.sjpp = sjpp;
        this.zrbhdGj = zrbhdGj;
        this.zrbhdSj = zrbhdSj;
        this.slcsGj = slcsGj;
        this.slcsSj = slcsSj;
        this.rychGj = rychGj;
        this.rychSj = rychSj;
        this.kysfGj = kysfGj;
        this.kysfSj = kysfSj;
        this.slpp = slpp;
        this.qtpp = qtpp;
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

    public String getGjpp() {
        return gjpp;
    }

    public void setGjpp(String gjpp) {
        this.gjpp = gjpp;
    }

    public String getSjpp() {
        return sjpp;
    }

    public void setSjpp(String sjpp) {
        this.sjpp = sjpp;
    }

    public String getZrbhdGj() {
        return zrbhdGj;
    }

    public void setZrbhdGj(String zrbhdGj) {
        this.zrbhdGj = zrbhdGj;
    }

    public String getZrbhdSj() {
        return zrbhdSj;
    }

    public void setZrbhdSj(String zrbhdSj) {
        this.zrbhdSj = zrbhdSj;
    }

    public String getSlcsGj() {
        return slcsGj;
    }

    public void setSlcsGj(String slcsGj) {
        this.slcsGj = slcsGj;
    }

    public String getSlcsSj() {
        return slcsSj;
    }

    public void setSlcsSj(String slcsSj) {
        this.slcsSj = slcsSj;
    }

    public String getRychGj() {
        return rychGj;
    }

    public void setRychGj(String rychGj) {
        this.rychGj = rychGj;
    }

    public String getRychSj() {
        return rychSj;
    }

    public void setRychSj(String rychSj) {
        this.rychSj = rychSj;
    }

    public String getKysfGj() {
        return kysfGj;
    }

    public void setKysfGj(String kysfGj) {
        this.kysfGj = kysfGj;
    }

    public String getKysfSj() {
        return kysfSj;
    }

    public void setKysfSj(String kysfSj) {
        this.kysfSj = kysfSj;
    }

    public String getSlpp() {
        return slpp;
    }

    public void setSlpp(String slpp) {
        this.slpp = slpp;
    }

    public String getQtpp() {
        return qtpp;
    }

    public void setQtpp(String qtpp) {
        this.qtpp = qtpp;
    }
}
