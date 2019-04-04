package com.otitan.gzlygl.bean;

/**
 * Created by sp on 2019/4/2.
 * 林业资金投入统计
 */
public class Lyzj {

    private String city; // 市（州）

    private String county; // 县（区）

    private String department; // 单位名称

    private String investment; // 年度林业投资

    private String gtlhCzZy; // 国土绿化投入-财政投入-中央财政

    private String gtlhCzSheng; // 国土绿化投入-财政投入-省级财政

    private String gtlhCzShi; // 国土绿化投入-财政投入-市级财政

    private String gtlhCzXian; // 国土绿化投入-财政投入-县级财政

    private String gtlhJr; // 国土绿化投入-金融资金

    private String gtlhQy; // 国土绿化投入-企业资金

    private String gtlhMj; // 国土绿化投入-民间资金

    private String zybhCzZy; // 资源保护投入-财政投入-中央财政

    private String zybhCzSheng; // 资源保护投入-财政投入-省级财政

    private String zybhCzShi; // 资源保护投入-财政投入-市级财政

    private String zybhCzXian; // 资源保护投入-财政投入-县级财政

    private String zybhJr; // 资源保护投入-金融资金

    private String zybhQy; // 资源保护投入-企业资金

    private String zybhMj; // 资源保护投入-民间资金

    private String cyfzCzZy; // 产业发展-财政投入-中央财政

    private String cyfzCzSheng; // 产业发展-财政投入-省级财政

    private String cyfzCzShi; // 产业发展-财政投入-市级财政

    private String cyfzCzXian; // 产业发展-财政投入-县级财政

    private String cyfzJr; // 产业发展-金融资金

    private String cyfzQy; // 产业发展-企业资金

    private String cyfzMj; // 产业发展-民间资金

    private String nljsCzZy; // 能力建设-财政投入-中央财政

    private String nljsCzSheng; // 能力建设-财政投入-省级财政

    private String nljsCzShi; // 能力建设-财政投入-市级财政

    private String nljsCzXian; // 能力建设-财政投入-县级财政

    private String nljsJr; // 能力建设-金融资金

    private String nljsQy; // 能力建设-企业资金

    private String nljsMj; // 能力建设-民间资金

    private String qtjsCzZy; // 其它建设-财政投入-中央财政

    private String qtjsCzSheng; // 其它建设-财政投入-省级财政

    private String qtjsCzShi; // 其它建设-财政投入-市级财政

    private String qtjsCzXian; // 其它建设-财政投入-县级财政

    private String qtjsJr; // 其它建设-金融资金

    private String qtjsQy; // 其它建设-企业资金

    private String qtjsMj; // 其它建设-民间资金

    public Lyzj(String city, String county, String department, String investment, String gtlhCzZy, String gtlhCzSheng, String gtlhCzShi, String gtlhCzXian, String gtlhJr, String gtlhQy, String gtlhMj, String zybhCzZy, String zybhCzSheng, String zybhCzShi, String zybhCzXian, String zybhJr, String zybhQy, String zybhMj, String cyfzCzZy, String cyfzCzSheng, String cyfzCzShi, String cyfzCzXian, String cyfzJr, String cyfzQy, String cyfzMj, String nljsCzZy, String nljsCzSheng, String nljsCzShi, String nljsCzXian, String nljsJr, String nljsQy, String nljsMj, String qtjsCzZy, String qtjsCzSheng, String qtjsCzShi, String qtjsCzXian, String qtjsJr, String qtjsQy, String qtjsMj) {
        this.city = city;
        this.county = county;
        this.department = department;
        this.investment = investment;
        this.gtlhCzZy = gtlhCzZy;
        this.gtlhCzSheng = gtlhCzSheng;
        this.gtlhCzShi = gtlhCzShi;
        this.gtlhCzXian = gtlhCzXian;
        this.gtlhJr = gtlhJr;
        this.gtlhQy = gtlhQy;
        this.gtlhMj = gtlhMj;
        this.zybhCzZy = zybhCzZy;
        this.zybhCzSheng = zybhCzSheng;
        this.zybhCzShi = zybhCzShi;
        this.zybhCzXian = zybhCzXian;
        this.zybhJr = zybhJr;
        this.zybhQy = zybhQy;
        this.zybhMj = zybhMj;
        this.cyfzCzZy = cyfzCzZy;
        this.cyfzCzSheng = cyfzCzSheng;
        this.cyfzCzShi = cyfzCzShi;
        this.cyfzCzXian = cyfzCzXian;
        this.cyfzJr = cyfzJr;
        this.cyfzQy = cyfzQy;
        this.cyfzMj = cyfzMj;
        this.nljsCzZy = nljsCzZy;
        this.nljsCzSheng = nljsCzSheng;
        this.nljsCzShi = nljsCzShi;
        this.nljsCzXian = nljsCzXian;
        this.nljsJr = nljsJr;
        this.nljsQy = nljsQy;
        this.nljsMj = nljsMj;
        this.qtjsCzZy = qtjsCzZy;
        this.qtjsCzSheng = qtjsCzSheng;
        this.qtjsCzShi = qtjsCzShi;
        this.qtjsCzXian = qtjsCzXian;
        this.qtjsJr = qtjsJr;
        this.qtjsQy = qtjsQy;
        this.qtjsMj = qtjsMj;
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

    public String getInvestment() {
        return investment;
    }

    public void setInvestment(String investment) {
        this.investment = investment;
    }

    public String getGtlhCzZy() {
        return gtlhCzZy;
    }

    public void setGtlhCzZy(String gtlhCzZy) {
        this.gtlhCzZy = gtlhCzZy;
    }

    public String getGtlhCzSheng() {
        return gtlhCzSheng;
    }

    public void setGtlhCzSheng(String gtlhCzSheng) {
        this.gtlhCzSheng = gtlhCzSheng;
    }

    public String getGtlhCzShi() {
        return gtlhCzShi;
    }

    public void setGtlhCzShi(String gtlhCzShi) {
        this.gtlhCzShi = gtlhCzShi;
    }

    public String getGtlhCzXian() {
        return gtlhCzXian;
    }

    public void setGtlhCzXian(String gtlhCzXian) {
        this.gtlhCzXian = gtlhCzXian;
    }

    public String getGtlhJr() {
        return gtlhJr;
    }

    public void setGtlhJr(String gtlhJr) {
        this.gtlhJr = gtlhJr;
    }

    public String getGtlhQy() {
        return gtlhQy;
    }

    public void setGtlhQy(String gtlhQy) {
        this.gtlhQy = gtlhQy;
    }

    public String getGtlhMj() {
        return gtlhMj;
    }

    public void setGtlhMj(String gtlhMj) {
        this.gtlhMj = gtlhMj;
    }

    public String getZybhCzZy() {
        return zybhCzZy;
    }

    public void setZybhCzZy(String zybhCzZy) {
        this.zybhCzZy = zybhCzZy;
    }

    public String getZybhCzSheng() {
        return zybhCzSheng;
    }

    public void setZybhCzSheng(String zybhCzSheng) {
        this.zybhCzSheng = zybhCzSheng;
    }

    public String getZybhCzShi() {
        return zybhCzShi;
    }

    public void setZybhCzShi(String zybhCzShi) {
        this.zybhCzShi = zybhCzShi;
    }

    public String getZybhCzXian() {
        return zybhCzXian;
    }

    public void setZybhCzXian(String zybhCzXian) {
        this.zybhCzXian = zybhCzXian;
    }

    public String getZybhJr() {
        return zybhJr;
    }

    public void setZybhJr(String zybhJr) {
        this.zybhJr = zybhJr;
    }

    public String getZybhQy() {
        return zybhQy;
    }

    public void setZybhQy(String zybhQy) {
        this.zybhQy = zybhQy;
    }

    public String getZybhMj() {
        return zybhMj;
    }

    public void setZybhMj(String zybhMj) {
        this.zybhMj = zybhMj;
    }

    public String getCyfzCzZy() {
        return cyfzCzZy;
    }

    public void setCyfzCzZy(String cyfzCzZy) {
        this.cyfzCzZy = cyfzCzZy;
    }

    public String getCyfzCzSheng() {
        return cyfzCzSheng;
    }

    public void setCyfzCzSheng(String cyfzCzSheng) {
        this.cyfzCzSheng = cyfzCzSheng;
    }

    public String getCyfzCzShi() {
        return cyfzCzShi;
    }

    public void setCyfzCzShi(String cyfzCzShi) {
        this.cyfzCzShi = cyfzCzShi;
    }

    public String getCyfzCzXian() {
        return cyfzCzXian;
    }

    public void setCyfzCzXian(String cyfzCzXian) {
        this.cyfzCzXian = cyfzCzXian;
    }

    public String getCyfzJr() {
        return cyfzJr;
    }

    public void setCyfzJr(String cyfzJr) {
        this.cyfzJr = cyfzJr;
    }

    public String getCyfzQy() {
        return cyfzQy;
    }

    public void setCyfzQy(String cyfzQy) {
        this.cyfzQy = cyfzQy;
    }

    public String getCyfzMj() {
        return cyfzMj;
    }

    public void setCyfzMj(String cyfzMj) {
        this.cyfzMj = cyfzMj;
    }

    public String getNljsCzZy() {
        return nljsCzZy;
    }

    public void setNljsCzZy(String nljsCzZy) {
        this.nljsCzZy = nljsCzZy;
    }

    public String getNljsCzSheng() {
        return nljsCzSheng;
    }

    public void setNljsCzSheng(String nljsCzSheng) {
        this.nljsCzSheng = nljsCzSheng;
    }

    public String getNljsCzShi() {
        return nljsCzShi;
    }

    public void setNljsCzShi(String nljsCzShi) {
        this.nljsCzShi = nljsCzShi;
    }

    public String getNljsCzXian() {
        return nljsCzXian;
    }

    public void setNljsCzXian(String nljsCzXian) {
        this.nljsCzXian = nljsCzXian;
    }

    public String getNljsJr() {
        return nljsJr;
    }

    public void setNljsJr(String nljsJr) {
        this.nljsJr = nljsJr;
    }

    public String getNljsQy() {
        return nljsQy;
    }

    public void setNljsQy(String nljsQy) {
        this.nljsQy = nljsQy;
    }

    public String getNljsMj() {
        return nljsMj;
    }

    public void setNljsMj(String nljsMj) {
        this.nljsMj = nljsMj;
    }

    public String getQtjsCzZy() {
        return qtjsCzZy;
    }

    public void setQtjsCzZy(String qtjsCzZy) {
        this.qtjsCzZy = qtjsCzZy;
    }

    public String getQtjsCzSheng() {
        return qtjsCzSheng;
    }

    public void setQtjsCzSheng(String qtjsCzSheng) {
        this.qtjsCzSheng = qtjsCzSheng;
    }

    public String getQtjsCzShi() {
        return qtjsCzShi;
    }

    public void setQtjsCzShi(String qtjsCzShi) {
        this.qtjsCzShi = qtjsCzShi;
    }

    public String getQtjsCzXian() {
        return qtjsCzXian;
    }

    public void setQtjsCzXian(String qtjsCzXian) {
        this.qtjsCzXian = qtjsCzXian;
    }

    public String getQtjsJr() {
        return qtjsJr;
    }

    public void setQtjsJr(String qtjsJr) {
        this.qtjsJr = qtjsJr;
    }

    public String getQtjsQy() {
        return qtjsQy;
    }

    public void setQtjsQy(String qtjsQy) {
        this.qtjsQy = qtjsQy;
    }

    public String getQtjsMj() {
        return qtjsMj;
    }

    public void setQtjsMj(String qtjsMj) {
        this.qtjsMj = qtjsMj;
    }
}
