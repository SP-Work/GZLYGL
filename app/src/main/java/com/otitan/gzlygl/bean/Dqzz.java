package com.otitan.gzlygl.bean;

/**
 * Created by sp on 2019/4/4.
 * 党群组织建设
 */
public class Dqzz {

    private String city; // 市（州）

    private String county; // 县（区）

    private String department; // 单位名称

    private String dzzZbs; // 党组织-支部数

    private String dzzDys; // 党组织-党员数

    private String tzzZbs; // 团组织-支部数

    private String tzzTys; // 团组织-团员数

    private String ghzzGs; // 工会组织-个数

    private String ghzzHys; // 工会组织-会员数

    private String fnzzGs; // 妇女组织-个数

    private String fnzzCys; // 妇女组织-成员数

    private String xhxhMc; // 协会学会-名称

    private String xhxhHys; // 协会学会-会员数

    private String qtzzMc; // 其它组织-名称

    private String qtzzHys; // 其它组织-会员数

    public Dqzz(String city, String county, String department, String dzzZbs, String dzzDys, String tzzZbs, String tzzTys, String ghzzGs, String ghzzHys, String fnzzGs, String fnzzCys, String xhxhMc, String xhxhHys, String qtzzMc, String qtzzHys) {
        this.city = city;
        this.county = county;
        this.department = department;
        this.dzzZbs = dzzZbs;
        this.dzzDys = dzzDys;
        this.tzzZbs = tzzZbs;
        this.tzzTys = tzzTys;
        this.ghzzGs = ghzzGs;
        this.ghzzHys = ghzzHys;
        this.fnzzGs = fnzzGs;
        this.fnzzCys = fnzzCys;
        this.xhxhMc = xhxhMc;
        this.xhxhHys = xhxhHys;
        this.qtzzMc = qtzzMc;
        this.qtzzHys = qtzzHys;
    }

    public String getCity() {
        return city;
    }

    public String getCounty() {
        return county;
    }

    public String getDepartment() {
        return department;
    }

    public String getDzzZbs() {
        return dzzZbs;
    }

    public String getDzzDys() {
        return dzzDys;
    }

    public String getTzzZbs() {
        return tzzZbs;
    }

    public String getTzzTys() {
        return tzzTys;
    }

    public String getGhzzGs() {
        return ghzzGs;
    }

    public String getGhzzHys() {
        return ghzzHys;
    }

    public String getFnzzGs() {
        return fnzzGs;
    }

    public String getFnzzCys() {
        return fnzzCys;
    }

    public String getXhxhMc() {
        return xhxhMc;
    }

    public String getXhxhHys() {
        return xhxhHys;
    }

    public String getQtzzMc() {
        return qtzzMc;
    }

    public String getQtzzHys() {
        return qtzzHys;
    }
}
