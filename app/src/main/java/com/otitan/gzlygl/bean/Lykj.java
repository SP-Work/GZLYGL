package com.otitan.gzlygl.bean;

/**
 * Created by sp on 2019/4/3.
 * 林业科技情况
 */
public class Lykj {

    private String city; // 市（州）

    private String county; // 县（区）

    private String department; // 单位名称

    private String organization; // 机构名称

    private String kyryZg; // 科研人员-正高

    private String kyryFg; // 科研人员-副高

    private String kyryZj; // 科研人员-中级

    private String kyryCj; // 科研人员-初级

    private String kyktMc; // 科研课题-名称

    private String kyktKtly; // 科研课题-课题来源

    private String kyktKtjf; // 科研课题-课题经费

    private String kyktYjfx; // 科研课题-研究方向

    private String kyktKyfzr; // 科研课题-课题负责人

    private String kyktYjsx; // 科研课题-研究时限

    private String zyyjcgMc; // 主要研究成果-名称

    private String zyyjcgLx; // 主要研究成果-类型

    private String zyyjcgKtly; // 主要研究成果-课题来源

    private String zyyjcgCgzhqk; // 主要研究成果-成果转化情况

    private String bz; // 备注

    public Lykj(String city, String county, String department, String organization, String kyryZg, String kyryFg, String kyryZj, String kyryCj, String kyktMc, String kyktKtly, String kyktKtjf, String kyktYjfx, String kyktKyfzr, String kyktYjsx, String zyyjcgMc, String zyyjcgLx, String zyyjcgKtly, String zyyjcgCgzhqk, String bz) {
        this.city = city;
        this.county = county;
        this.department = department;
        this.organization = organization;
        this.kyryZg = kyryZg;
        this.kyryFg = kyryFg;
        this.kyryZj = kyryZj;
        this.kyryCj = kyryCj;
        this.kyktMc = kyktMc;
        this.kyktKtly = kyktKtly;
        this.kyktKtjf = kyktKtjf;
        this.kyktYjfx = kyktYjfx;
        this.kyktKyfzr = kyktKyfzr;
        this.kyktYjsx = kyktYjsx;
        this.zyyjcgMc = zyyjcgMc;
        this.zyyjcgLx = zyyjcgLx;
        this.zyyjcgKtly = zyyjcgKtly;
        this.zyyjcgCgzhqk = zyyjcgCgzhqk;
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

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public String getKyryZg() {
        return kyryZg;
    }

    public void setKyryZg(String kyryZg) {
        this.kyryZg = kyryZg;
    }

    public String getKyryFg() {
        return kyryFg;
    }

    public void setKyryFg(String kyryFg) {
        this.kyryFg = kyryFg;
    }

    public String getKyryZj() {
        return kyryZj;
    }

    public void setKyryZj(String kyryZj) {
        this.kyryZj = kyryZj;
    }

    public String getKyryCj() {
        return kyryCj;
    }

    public void setKyryCj(String kyryCj) {
        this.kyryCj = kyryCj;
    }

    public String getKyktMc() {
        return kyktMc;
    }

    public void setKyktMc(String kyktMc) {
        this.kyktMc = kyktMc;
    }

    public String getKyktKtly() {
        return kyktKtly;
    }

    public void setKyktKtly(String kyktKtly) {
        this.kyktKtly = kyktKtly;
    }

    public String getKyktKtjf() {
        return kyktKtjf;
    }

    public void setKyktKtjf(String kyktKtjf) {
        this.kyktKtjf = kyktKtjf;
    }

    public String getKyktYjfx() {
        return kyktYjfx;
    }

    public void setKyktYjfx(String kyktYjfx) {
        this.kyktYjfx = kyktYjfx;
    }

    public String getKyktKyfzr() {
        return kyktKyfzr;
    }

    public void setKyktKyfzr(String kyktKyfzr) {
        this.kyktKyfzr = kyktKyfzr;
    }

    public String getKyktYjsx() {
        return kyktYjsx;
    }

    public void setKyktYjsx(String kyktYjsx) {
        this.kyktYjsx = kyktYjsx;
    }

    public String getZyyjcgMc() {
        return zyyjcgMc;
    }

    public void setZyyjcgMc(String zyyjcgMc) {
        this.zyyjcgMc = zyyjcgMc;
    }

    public String getZyyjcgLx() {
        return zyyjcgLx;
    }

    public void setZyyjcgLx(String zyyjcgLx) {
        this.zyyjcgLx = zyyjcgLx;
    }

    public String getZyyjcgKtly() {
        return zyyjcgKtly;
    }

    public void setZyyjcgKtly(String zyyjcgKtly) {
        this.zyyjcgKtly = zyyjcgKtly;
    }

    public String getZyyjcgCgzhqk() {
        return zyyjcgCgzhqk;
    }

    public void setZyyjcgCgzhqk(String zyyjcgCgzhqk) {
        this.zyyjcgCgzhqk = zyyjcgCgzhqk;
    }

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz;
    }
}
