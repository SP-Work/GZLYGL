package com.otitan.gzlygl.bean;

/**
 * Created by sp on 2019/4/3.
 * 林业灾害情况
 */
public class Lyzh {

    private String city; // 市（州）

    private String county; // 县（区）

    private String department; // 单位名称

    private String zhmj; // 灾害面积

    private String ssje; // 损失金额

    private String fkmj; // 防控面积

    private String fzl; // 防治率

    private String slhzSzmj; // 森林火灾-受灾面积

    private String slhzSsje; // 森林火灾-损失金额

    private String slhzShl; // 森林火灾-受害率

    private String zhlx; // 灾害类型

    private String lyyhswShmj; // 林业有害生物-受害面积

    private String lyyhswSsje; // 林业有害生物-损失金额

    private String lyyhswCzl; // 林业有害生物-成灾率

    private String lyyhswWghfzl; // 林业有害生物-无公害防治率

    private String zdyyybZhmc; // 重大疫源疫病-灾害名称

    private String zdyyybSzmj; // 重大疫源疫病-受灾面积

    private String zdyyybZhcd; // 重大疫源疫病-灾害程度

    private String zdyyybSsje; // 重大疫源疫病-损失金额

    private String zdyyybFkcs; // 重大疫源疫病-防控措施

    private String zdyyybFkcx; // 重大疫源疫病-防控成效

    private String qtzhZhlx; // 其它灾害-灾害类型

    private String qtzhSzmj; // 其它灾害-受害面积

    private String qtzhSsje; // 其它灾害-损失金额

    private String qtzhFkcs; // 其它灾害-防控措施

    private String qtzhFkcx; // 其它灾害-防控成效

    public Lyzh(String city, String county, String department, String zhmj, String ssje, String fkmj, String fzl, String slhzSzmj, String slhzSsje, String slhzShl, String zhlx, String lyyhswShmj, String lyyhswSsje, String lyyhswCzl, String lyyhswWghfzl, String zdyyybZhmc, String zdyyybSzmj, String zdyyybZhcd, String zdyyybSsje, String zdyyybFkcs, String zdyyybFkcx, String qtzhZhlx, String qtzhSzmj, String qtzhSsje, String qtzhFkcs, String qtzhFkcx) {
        this.city = city;
        this.county = county;
        this.department = department;
        this.zhmj = zhmj;
        this.ssje = ssje;
        this.fkmj = fkmj;
        this.fzl = fzl;
        this.slhzSzmj = slhzSzmj;
        this.slhzSsje = slhzSsje;
        this.slhzShl = slhzShl;
        this.zhlx = zhlx;
        this.lyyhswShmj = lyyhswShmj;
        this.lyyhswSsje = lyyhswSsje;
        this.lyyhswCzl = lyyhswCzl;
        this.lyyhswWghfzl = lyyhswWghfzl;
        this.zdyyybZhmc = zdyyybZhmc;
        this.zdyyybSzmj = zdyyybSzmj;
        this.zdyyybZhcd = zdyyybZhcd;
        this.zdyyybSsje = zdyyybSsje;
        this.zdyyybFkcs = zdyyybFkcs;
        this.zdyyybFkcx = zdyyybFkcx;
        this.qtzhZhlx = qtzhZhlx;
        this.qtzhSzmj = qtzhSzmj;
        this.qtzhSsje = qtzhSsje;
        this.qtzhFkcs = qtzhFkcs;
        this.qtzhFkcx = qtzhFkcx;
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

    public String getZhmj() {
        return zhmj;
    }

    public void setZhmj(String zhmj) {
        this.zhmj = zhmj;
    }

    public String getSsje() {
        return ssje;
    }

    public void setSsje(String ssje) {
        this.ssje = ssje;
    }

    public String getFkmj() {
        return fkmj;
    }

    public void setFkmj(String fkmj) {
        this.fkmj = fkmj;
    }

    public String getFzl() {
        return fzl;
    }

    public void setFzl(String fzl) {
        this.fzl = fzl;
    }

    public String getSlhzSzmj() {
        return slhzSzmj;
    }

    public void setSlhzSzmj(String slhzSzmj) {
        this.slhzSzmj = slhzSzmj;
    }

    public String getSlhzSsje() {
        return slhzSsje;
    }

    public void setSlhzSsje(String slhzSsje) {
        this.slhzSsje = slhzSsje;
    }

    public String getSlhzShl() {
        return slhzShl;
    }

    public void setSlhzShl(String slhzShl) {
        this.slhzShl = slhzShl;
    }

    public String getZhlx() {
        return zhlx;
    }

    public void setZhlx(String zhlx) {
        this.zhlx = zhlx;
    }

    public String getLyyhswShmj() {
        return lyyhswShmj;
    }

    public void setLyyhswShmj(String lyyhswShmj) {
        this.lyyhswShmj = lyyhswShmj;
    }

    public String getLyyhswSsje() {
        return lyyhswSsje;
    }

    public void setLyyhswSsje(String lyyhswSsje) {
        this.lyyhswSsje = lyyhswSsje;
    }

    public String getLyyhswCzl() {
        return lyyhswCzl;
    }

    public void setLyyhswCzl(String lyyhswCzl) {
        this.lyyhswCzl = lyyhswCzl;
    }

    public String getLyyhswWghfzl() {
        return lyyhswWghfzl;
    }

    public void setLyyhswWghfzl(String lyyhswWghfzl) {
        this.lyyhswWghfzl = lyyhswWghfzl;
    }

    public String getZdyyybZhmc() {
        return zdyyybZhmc;
    }

    public void setZdyyybZhmc(String zdyyybZhmc) {
        this.zdyyybZhmc = zdyyybZhmc;
    }

    public String getZdyyybSzmj() {
        return zdyyybSzmj;
    }

    public void setZdyyybSzmj(String zdyyybSzmj) {
        this.zdyyybSzmj = zdyyybSzmj;
    }

    public String getZdyyybZhcd() {
        return zdyyybZhcd;
    }

    public void setZdyyybZhcd(String zdyyybZhcd) {
        this.zdyyybZhcd = zdyyybZhcd;
    }

    public String getZdyyybSsje() {
        return zdyyybSsje;
    }

    public void setZdyyybSsje(String zdyyybSsje) {
        this.zdyyybSsje = zdyyybSsje;
    }

    public String getZdyyybFkcs() {
        return zdyyybFkcs;
    }

    public void setZdyyybFkcs(String zdyyybFkcs) {
        this.zdyyybFkcs = zdyyybFkcs;
    }

    public String getZdyyybFkcx() {
        return zdyyybFkcx;
    }

    public void setZdyyybFkcx(String zdyyybFkcx) {
        this.zdyyybFkcx = zdyyybFkcx;
    }

    public String getQtzhZhlx() {
        return qtzhZhlx;
    }

    public void setQtzhZhlx(String qtzhZhlx) {
        this.qtzhZhlx = qtzhZhlx;
    }

    public String getQtzhSzmj() {
        return qtzhSzmj;
    }

    public void setQtzhSzmj(String qtzhSzmj) {
        this.qtzhSzmj = qtzhSzmj;
    }

    public String getQtzhSsje() {
        return qtzhSsje;
    }

    public void setQtzhSsje(String qtzhSsje) {
        this.qtzhSsje = qtzhSsje;
    }

    public String getQtzhFkcs() {
        return qtzhFkcs;
    }

    public void setQtzhFkcs(String qtzhFkcs) {
        this.qtzhFkcs = qtzhFkcs;
    }

    public String getQtzhFkcx() {
        return qtzhFkcx;
    }

    public void setQtzhFkcx(String qtzhFkcx) {
        this.qtzhFkcx = qtzhFkcx;
    }
}
