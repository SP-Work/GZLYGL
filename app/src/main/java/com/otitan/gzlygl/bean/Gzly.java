package com.otitan.gzlygl.bean;

/**
 * Created by sp on 2019/4/4.
 * 贵州林业横向对比情况
 */
public class Gzly {

    private String department; // 单位名称

    private String lygkGtmj; // 林业概况-国土面积

    private String lygkLyydmj; // 林业概况-林业用地面积

    private String lygkSlmj; // 林业概况-森林面积

    private String lygkSlxj; // 林业概况-森林蓄积

    private String lygkSlfgl; // 林业概况-森林覆盖率

    private String lygkLycz; // 林业概况-林业产值

    private String LytzZy; // 林业投资情况-中央投资

    private String LytzSj; // 林业投资情况-省级投资

    private String LytzSx; // 林业投资情况-市县投资

    private String LytzJr; // 林业投资情况-金融投资

    private String LytzSh; // 林业投资情况-社会投资

    private String lyczZcz; // 林业产值-总产值

    private String lyczYc; // 林业产值-一产

    private String lyczEc; // 林业产值-二产

    private String lyczSc; // 林业产值-三产

    private String zrbhdZmj; // 自然保护地建设-自然保护地总面积

    private String zrbhdZb; // 自然保护地建设-自然保护地占比

    private String zrbhdGjjsl; // 自然保护地建设-国家级保护地数量

    private String zrbhdGjjmj; // 自然保护地建设-国家级保护地面积

    private String zrbhdSjsl; // 自然保护地建设-省级保护地数量

    private String zrbhdSjmj; // 自然保护地建设-省级保护地面积

    private String zrbhdQtsl; // 自然保护地建设-其它保护地数量

    private String zrbhdQtmj; // 自然保护地建设-其它保护地面积

    private String jgryNsjg; // 机构人员结构概况-内设机构数

    private String jgryZsdw; // 机构人员结构概况-直属事业单位

    private String jgryXzbz; // 机构人员结构概况-行政编制数

    private String jgryCgbz; // 机构人员结构概况-参公编制数

    private String jgrySybz; // 机构人员结构概况-事业编制数

    private String jgryGqbz; // 机构人员结构概况-工勤编制数

    private String jgryRjmj; // 机构人员结构概况-人均服务面积

    public Gzly(String department, String lygkGtmj, String lygkLyydmj, String lygkSlmj, String lygkSlxj, String lygkSlfgl, String lygkLycz, String lytzZy, String lytzSj, String lytzSx, String lytzJr, String lytzSh, String lyczZcz, String lyczYc, String lyczEc, String lyczSc, String zrbhdZmj, String zrbhdZb, String zrbhdGjjsl, String zrbhdGjjmj, String zrbhdSjsl, String zrbhdSjmj, String zrbhdQtsl, String zrbhdQtmj, String jgryNsjg, String jgryZsdw, String jgryXzbz, String jgryCgbz, String jgrySybz, String jgryGqbz, String jgryRjmj) {
        this.department = department;
        this.lygkGtmj = lygkGtmj;
        this.lygkLyydmj = lygkLyydmj;
        this.lygkSlmj = lygkSlmj;
        this.lygkSlxj = lygkSlxj;
        this.lygkSlfgl = lygkSlfgl;
        this.lygkLycz = lygkLycz;
        LytzZy = lytzZy;
        LytzSj = lytzSj;
        LytzSx = lytzSx;
        LytzJr = lytzJr;
        LytzSh = lytzSh;
        this.lyczZcz = lyczZcz;
        this.lyczYc = lyczYc;
        this.lyczEc = lyczEc;
        this.lyczSc = lyczSc;
        this.zrbhdZmj = zrbhdZmj;
        this.zrbhdZb = zrbhdZb;
        this.zrbhdGjjsl = zrbhdGjjsl;
        this.zrbhdGjjmj = zrbhdGjjmj;
        this.zrbhdSjsl = zrbhdSjsl;
        this.zrbhdSjmj = zrbhdSjmj;
        this.zrbhdQtsl = zrbhdQtsl;
        this.zrbhdQtmj = zrbhdQtmj;
        this.jgryNsjg = jgryNsjg;
        this.jgryZsdw = jgryZsdw;
        this.jgryXzbz = jgryXzbz;
        this.jgryCgbz = jgryCgbz;
        this.jgrySybz = jgrySybz;
        this.jgryGqbz = jgryGqbz;
        this.jgryRjmj = jgryRjmj;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getLygkGtmj() {
        return lygkGtmj;
    }

    public void setLygkGtmj(String lygkGtmj) {
        this.lygkGtmj = lygkGtmj;
    }

    public String getLygkLyydmj() {
        return lygkLyydmj;
    }

    public void setLygkLyydmj(String lygkLyydmj) {
        this.lygkLyydmj = lygkLyydmj;
    }

    public String getLygkSlmj() {
        return lygkSlmj;
    }

    public void setLygkSlmj(String lygkSlmj) {
        this.lygkSlmj = lygkSlmj;
    }

    public String getLygkSlxj() {
        return lygkSlxj;
    }

    public void setLygkSlxj(String lygkSlxj) {
        this.lygkSlxj = lygkSlxj;
    }

    public String getLygkSlfgl() {
        return lygkSlfgl;
    }

    public void setLygkSlfgl(String lygkSlfgl) {
        this.lygkSlfgl = lygkSlfgl;
    }

    public String getLygkLycz() {
        return lygkLycz;
    }

    public void setLygkLycz(String lygkLycz) {
        this.lygkLycz = lygkLycz;
    }

    public String getLytzZy() {
        return LytzZy;
    }

    public void setLytzZy(String lytzZy) {
        LytzZy = lytzZy;
    }

    public String getLytzSj() {
        return LytzSj;
    }

    public void setLytzSj(String lytzSj) {
        LytzSj = lytzSj;
    }

    public String getLytzSx() {
        return LytzSx;
    }

    public void setLytzSx(String lytzSx) {
        LytzSx = lytzSx;
    }

    public String getLytzJr() {
        return LytzJr;
    }

    public void setLytzJr(String lytzJr) {
        LytzJr = lytzJr;
    }

    public String getLytzSh() {
        return LytzSh;
    }

    public void setLytzSh(String lytzSh) {
        LytzSh = lytzSh;
    }

    public String getLyczZcz() {
        return lyczZcz;
    }

    public void setLyczZcz(String lyczZcz) {
        this.lyczZcz = lyczZcz;
    }

    public String getLyczYc() {
        return lyczYc;
    }

    public void setLyczYc(String lyczYc) {
        this.lyczYc = lyczYc;
    }

    public String getLyczEc() {
        return lyczEc;
    }

    public void setLyczEc(String lyczEc) {
        this.lyczEc = lyczEc;
    }

    public String getLyczSc() {
        return lyczSc;
    }

    public void setLyczSc(String lyczSc) {
        this.lyczSc = lyczSc;
    }

    public String getZrbhdZmj() {
        return zrbhdZmj;
    }

    public void setZrbhdZmj(String zrbhdZmj) {
        this.zrbhdZmj = zrbhdZmj;
    }

    public String getZrbhdZb() {
        return zrbhdZb;
    }

    public void setZrbhdZb(String zrbhdZb) {
        this.zrbhdZb = zrbhdZb;
    }

    public String getZrbhdGjjsl() {
        return zrbhdGjjsl;
    }

    public void setZrbhdGjjsl(String zrbhdGjjsl) {
        this.zrbhdGjjsl = zrbhdGjjsl;
    }

    public String getZrbhdGjjmj() {
        return zrbhdGjjmj;
    }

    public void setZrbhdGjjmj(String zrbhdGjjmj) {
        this.zrbhdGjjmj = zrbhdGjjmj;
    }

    public String getZrbhdSjsl() {
        return zrbhdSjsl;
    }

    public void setZrbhdSjsl(String zrbhdSjsl) {
        this.zrbhdSjsl = zrbhdSjsl;
    }

    public String getZrbhdSjmj() {
        return zrbhdSjmj;
    }

    public void setZrbhdSjmj(String zrbhdSjmj) {
        this.zrbhdSjmj = zrbhdSjmj;
    }

    public String getZrbhdQtsl() {
        return zrbhdQtsl;
    }

    public void setZrbhdQtsl(String zrbhdQtsl) {
        this.zrbhdQtsl = zrbhdQtsl;
    }

    public String getZrbhdQtmj() {
        return zrbhdQtmj;
    }

    public void setZrbhdQtmj(String zrbhdQtmj) {
        this.zrbhdQtmj = zrbhdQtmj;
    }

    public String getJgryNsjg() {
        return jgryNsjg;
    }

    public void setJgryNsjg(String jgryNsjg) {
        this.jgryNsjg = jgryNsjg;
    }

    public String getJgryZsdw() {
        return jgryZsdw;
    }

    public void setJgryZsdw(String jgryZsdw) {
        this.jgryZsdw = jgryZsdw;
    }

    public String getJgryXzbz() {
        return jgryXzbz;
    }

    public void setJgryXzbz(String jgryXzbz) {
        this.jgryXzbz = jgryXzbz;
    }

    public String getJgryCgbz() {
        return jgryCgbz;
    }

    public void setJgryCgbz(String jgryCgbz) {
        this.jgryCgbz = jgryCgbz;
    }

    public String getJgrySybz() {
        return jgrySybz;
    }

    public void setJgrySybz(String jgrySybz) {
        this.jgrySybz = jgrySybz;
    }

    public String getJgryGqbz() {
        return jgryGqbz;
    }

    public void setJgryGqbz(String jgryGqbz) {
        this.jgryGqbz = jgryGqbz;
    }

    public String getJgryRjmj() {
        return jgryRjmj;
    }

    public void setJgryRjmj(String jgryRjmj) {
        this.jgryRjmj = jgryRjmj;
    }
}
