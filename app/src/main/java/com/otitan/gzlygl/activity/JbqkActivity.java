package com.otitan.gzlygl.activity;

import android.content.Context;
import android.graphics.Color;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.bin.david.form.core.SmartTable;
import com.bin.david.form.core.TableConfig;
import com.bin.david.form.data.CellInfo;
import com.bin.david.form.data.column.Column;
import com.bin.david.form.data.format.bg.BaseCellBackgroundFormat;
import com.bin.david.form.data.style.FontStyle;
import com.bin.david.form.data.table.TableData;
import com.otitan.gzlygl.R;
import com.otitan.gzlygl.bean.Jbqk;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * 林业基本情况
 */
public class JbqkActivity extends AppCompatActivity {

    @BindView(R.id.st_jbqk)
    SmartTable mSt_jbqk;

    private Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jbqk);

        ButterKnife.bind(this);

        mContext = JbqkActivity.this;

        initView();
    }

    private void initView() {
        initSmart();
    }

    @OnClick({R.id.iv_back})
    public void myClick() {
        finish();
    }

    /**
     * 表格
     */
    private void initSmart() {
        List<Jbqk> jbqkList = new ArrayList<>();
        jbqkList.add(new Jbqk("贵阳", "修文", "林业", "100", "300",
                "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11",
                "1", "2", "3", "4", "5", "6",
                "1", "2", "3", "4",
                "1",
                "1", "2", "3",
                "1", "2", "3",
                "1", "2", "3",
                "1", "2", "3", "4",
                "1", "2", "3", "4", "5", "6",
                "1", "2", "3",
                "1", "2", "3", "4", "5",
                "1", "2",
                "1", "2", "3", "4",
                "1", "2", "3",
                "1", "2", "3", "4",
                "1", "2", "3",
                "1", "2", "3", "4", "5", "6"
                ));

        // 市（州）
        Column<String> city = new Column<>("市（州）", "city");
        // 县（区）
        Column<String> county = new Column<>("县（区）", "county");
        // 单位名称
        Column<String> department = new Column<>("单位名称", "department");
        // 乡镇林业站检查站个数
        Column<String> num = new Column<>("乡镇林业站检查站个数", "num");
        // 国土面积
        Column<String> area = new Column<>("国土面积", "area");

        // 林地资源现状-林业用地面积
        Column<String> ldzyxzLyydmj = new Column<>("林业用地面积", "ldzyxzLyydmj");
        // 林地资源现状-有林地
        Column<String> ldzyxzYld = new Column<>("有林地", "ldzyxzYld");
        // 林地资源现状-疏林地
        Column<String> ldzyxzSld = new Column<>("疏林地", "ldzyxzSld");
        // 林地资源现状-国家特别规定灌木林地
        Column<String> ldzyxzGjtbgdgmld = new Column<>("国家特别规定灌木林地", "ldzyxzGjtbgdgmld");
        // 林地资源现状-一般灌木林地
        Column<String> ldzyxzYbgml = new Column<>("一般灌木林地", "ldzyxzYbgml");
        // 林地资源现状-未成林造林地
        Column<String> ldzyxzWclzld = new Column<>("未成林造林地", "ldzyxzWclzld");
        // 林地资源现状-苗圃用地
        Column<String> ldzyxzMpyd = new Column<>("苗圃用地", "ldzyxzMpyd");
        // 林地资源现状-宜林荒山荒地
        Column<String> ldzyxzYlhshd = new Column<>("宜林荒山荒地", "ldzyxzYlhshd");
        // 林地资源现状-25度以上坡耕地
        Column<String> ldzyxzPgd = new Column<>("25度以上坡耕地", "ldzyxzPgd");
        // 林地资源现状-森林覆盖率
        Column<String> ldzyxzSlfgl = new Column<>("森林覆盖率", "ldzyxzSlfgl");
        // 林地资源现状-森林生态服务功能价值
        Column<String> ldzyxzSlstfwgnjz = new Column<>("森林生态服务功能价值", "ldzyxzSlstfwgnjz");
        // 林地资源现状
        Column<String> ldzyxzLdzyxz = new Column<>("林地资源现状", ldzyxzLyydmj, ldzyxzYld, ldzyxzSld, ldzyxzGjtbgdgmld, ldzyxzYbgml, ldzyxzWclzld, ldzyxzMpyd, ldzyxzYlhshd, ldzyxzPgd, ldzyxzSlfgl, ldzyxzSlstfwgnjz);

        // 森林蓄积现状-森林总蓄积量
        Column<String> slxjxzSlzxjl = new Column<>("森林总蓄积量", "slxjxzSlzxjl");
        // 森林蓄积现状-森林总单位面积蓄积量
        Column<String> slxjxzSlzdwmjxjl = new Column<>("森林总单位面积蓄积量", "slxjxzSlzdwmjxjl");
        // 森林蓄积现状-商品林总蓄积
        Column<String> slxjxzSplzxj = new Column<>("商品林总蓄积", "slxjxzSplzxj");
        // 森林蓄积现状-商品林单位面积蓄积量
        Column<String> slxjxzspldwmjxjl = new Column<>("商品林单位面积蓄积量", "slxjxzspldwmjxjl");
        // 森林蓄积现状-公益林总蓄积
        Column<String> slxjxzGylzxj = new Column<>("公益林总蓄积", "slxjxzGylzxj");
        // 森林蓄积现状-公益林单位面积蓄积量
        Column<String> slxjxzGyldwmjxjl = new Column<>("公益林单位面积蓄积量", "slxjxzGyldwmjxjl");
        // 森林蓄积现状
        Column<String> slxjxz = new Column<>("森林蓄积现状", slxjxzSlzxjl, slxjxzSlzdwmjxjl, slxjxzSplzxj, slxjxzspldwmjxjl, slxjxzGylzxj, slxjxzGyldwmjxjl);

        // 森林资源利用-年森林采伐限额
        Column<String> slzylyNslcfxe = new Column<>("年森林采伐限额", "slzylyNslcfxe");
        // 森林资源利用-年采伐量-计
        Column<String> slzylyNcflJ = new Column<>("计", "slzylyNcflJ");
        // 森林资源利用-年采伐量-商品林
        Column<String> slzylyNcflSpl = new Column<>("商品林", "slzylyNcflSpl");
        // 森林资源利用-年采伐量-公益林
        Column<String> slzylyNcflGyl = new Column<>("公益林", "slzylyNcflGyl");
        // 森林资源利用-年采伐量
        Column<String> slzylyNcfl = new Column<>("年采伐量", slzylyNcflJ, slzylyNcflSpl, slzylyNcflGyl);
        // 森林资源利用
        Column<String> slzyly = new Column<>("森林资源利用", slzylyNslcfxe, slzylyNcfl);

        // 林业产业-林业总产值
        Column<String> lyczLyzcz = new Column<>("林业总产值", "lyczLyzcz");
        // 林业产业-一产-名称
        Column<String> lyczYcMc = new Column<>("名称", "lyczYcMc");
        // 林业产业-一产-规模
        Column<String> lyczYcGm = new Column<>("规模", "lyczYcGm");
        // 林业产业-一产-产值
        Column<String> lyczYcCz = new Column<>("产值", "lyczYcCz");
        // 林业产业-一产
        Column<String> lyczYc = new Column<>("一产", lyczYcMc, lyczYcGm, lyczYcCz);
        // 林业产业-二产-名称
        Column<String> lyczEcMc = new Column<>("名称", "lyczEcMc");
        // 林业产业-二产-规模
        Column<String> lyczEcGm = new Column<>("规模", "lyczEcGm");
        // 林业产业-二产-产值
        Column<String> lyczEcCz = new Column<>("产值", "lyczEcCz");
        // 林业产业-二产
        Column<String> lyczEc = new Column<>("二产", lyczEcMc, lyczEcGm, lyczEcCz);
        // 林业产业-三产-名称
        Column<String> lyczScMc = new Column<>("名称", "lyczScMc");
        // 林业产业-三产-规模
        Column<String> lyczScGm = new Column<>("规模", "lyczScGm");
        // 林业产业-三产-产值
        Column<String> lyczScCz = new Column<>("产值", "lyczScCz");
        // 林业产业-三产
        Column<String> lyczSc = new Column<>("三产", lyczScMc, lyczScGm, lyczScCz);
        // 林业产业-龙头企业-企业名称
        Column<String> lyczLtqyQymc = new Column<>("企业名称", "lyczLtqyQymc");
        // 林业产业-龙头企业-经营类型
        Column<String> lyczLtqyJylx = new Column<>("经营类型", "lyczLtqyJylx");
        // 林业产业-龙头企业-年产值
        Column<String> lyczLtqyNcz = new Column<>("年产值", "lyczLtqyNcz");
        // 林业产业-龙头企业-企业性质
        Column<String> lyczLtqyQyxz = new Column<>("企业性质", "lyczLtqyQyxz");
        // 林业产业-龙头企业
        Column<String> lyczLtqy = new Column<>("龙头企业", lyczLtqyQymc, lyczLtqyJylx, lyczLtqyNcz, lyczLtqyQyxz);
        // 林业产业-主要产业基地现状-石斛基地面积
        Column<String> lyczJdSh = new Column<>("石斛基地面积", "lyczJdSh");
        // 林业产业-主要产业基地现状-刺梨基地面积
        Column<String> lyczJdCl = new Column<>("刺梨基地面积", "lyczJdCl");
        // 林业产业-主要产业基地现状-油茶基地面积
        Column<String> lyczJdYc = new Column<>("油茶基地面积", "lyczJdYc");
        // 林业产业-主要产业基地现状-竹产业基地面积
        Column<String> lyczJdZ = new Column<>("竹产业基地面积", "lyczJdZ");
        // 林业产业-主要产业基地现状-国家储备林面积
        Column<String> lyczJdCb = new Column<>("国家储备林面积", "lyczJdCb");
        // 林业产业-主要产业基地现状-其它产业基地面积
        Column<String> lyczJdQt = new Column<>("其它产业基地面积", "lyczJdQt");
        // 林业产业-主要产业基地现状
        Column<String> lyczJd = new Column<>("主要产业基地现状", lyczJdSh, lyczJdCl, lyczJdYc, lyczJdZ, lyczJdCb, lyczJdQt);
        // 林业产业
        Column<String> lycz = new Column<>("林业产业", lyczLyzcz, lyczYc, lyczEc, lyczSc, lyczLtqy, lyczJd);

        // 森林分类经营现状-国家公益林面积
        Column<String> fljyGjgyl = new Column<>("国家公益林面积", "fljyGjgyl");
        // 森林分类经营现状-地方公益林面积
        Column<String> fljyDfgyl = new Column<>("地方公益林面积", "fljyDfgyl");
        // 森林分类经营现状-商品林面积
        Column<String> fljySpl = new Column<>("商品林面积", "fljySpl");
        // 森林分类经营现状
        Column<String> fljy = new Column<>("森林分类经营现状", fljyGjgyl, fljyDfgyl, fljySpl);

        // 土地石漠化情况-计
        Column<String> smhJ = new Column<>("计", "smhJ");
        // 土地石漠化情况-极重度石漠化
        Column<String> smhJz = new Column<>("极重度石漠化", "smhJz");
        // 土地石漠化情况-重度石漠化
        Column<String> smhZd = new Column<>("重度石漠化", "smhZd");
        // 土地石漠化情况-中度石漠化
        Column<String> smhMd = new Column<>("中度石漠化", "smhMd");
        // 土地石漠化情况-轻度石漠化
        Column<String> smhQd = new Column<>("轻度石漠化", "smhQd");
        // 土地石漠化情况
        Column<String> smh = new Column<>("土地石漠化情况", smhJ, smhJz, smhZd, smhMd, smhQd);

        // 草地资源情况-天然草地
        Column<String> cdzyTrcd = new Column<>("天然草地", "cdzyTrcd");
        // 草地资源情况-人工草地
        Column<String> cdzyRgcd = new Column<>("人工草地", "cdzyRgcd");
        // 草地资源情况
        Column<String> cdzy = new Column<>("草地资源情况", cdzyTrcd, cdzyRgcd);

        // 自然保护地基本情况-自然保护区-名称
        Column<String> zrbhdZrbhqMc = new Column<>("名称", "zrbhdZrbhqMc");
        // 自然保护地基本情况-自然保护区-级别
        Column<String> zrbhdZrbhqJb = new Column<>("级别", "zrbhdZrbhqJb");
        // 自然保护地基本情况-自然保护区-面积
        Column<String> zrbhdZrbhqMj = new Column<>("面积", "zrbhdZrbhqMj");
        // 自然保护地基本情况-自然保护区-主要保护对象
        Column<String> zrbhdZrbhqBhdx = new Column<>("主要保护对象", "zrbhdZrbhqBhdx");
        // 自然保护地基本情况-自然保护区
        Column<String> zrbhdZrbhq = new Column<>("自然保护区", zrbhdZrbhqMc, zrbhdZrbhqJb, zrbhdZrbhqMj, zrbhdZrbhqBhdx);
        // 自然保护地基本情况-湿地公园-名称
        Column<String> zrbhdSdgyMc = new Column<>("名称", "zrbhdSdgyMc");
        // 自然保护地基本情况-湿地公园-级别
        Column<String> zrbhdSdgyJb = new Column<>("级别", "zrbhdSdgyJb");
        // 自然保护地基本情况-湿地公园-面积
        Column<String> zrbhdSdgyMj = new Column<>("面积", "zrbhdSdgyMj");
        // 自然保护地基本情况-湿地公园
        Column<String> zrbhdSdgy = new Column<>("湿地公园", zrbhdSdgyMc, zrbhdSdgyJb, zrbhdSdgyMj);
        // 自然保护地基本情况-风景名胜区-名称
        Column<String> zrbhdFjmsqMc = new Column<>("名称", "zrbhdFjmsqMc");
        // 自然保护地基本情况-风景名胜区-级别
        Column<String> zrbhdFjmsqJb = new Column<>("级别", "zrbhdFjmsqJb");
        // 自然保护地基本情况-风景名胜区-面积
        Column<String> zrbhdFjmsqMj = new Column<>("面积", "zrbhdFjmsqMj");
        // 自然保护地基本情况-风景名胜区-景观类型
        Column<String> zrbhdFjmsqLx = new Column<>("景观类型", "zrbhdFjmsqLx");
        // 自然保护地基本情况-风景名胜区
        Column<String> zrbhdFjmsq = new Column<>("风景名胜区", zrbhdFjmsqMc, zrbhdFjmsqJb, zrbhdFjmsqMj, zrbhdFjmsqLx);
        // 自然保护地基本情况-自然遗产地-名称
        Column<String> zrbhdZrycdMc = new Column<>("名称", "zrbhdZrycdMc");
        // 自然保护地基本情况-自然遗产地-级别
        Column<String> zrbhdZrycdJb = new Column<>("级别", "zrbhdZrycdJb");
        // 自然保护地基本情况-自然遗产地-面积
        Column<String> zrbhdZrycdMj = new Column<>("面积", "zrbhdZrycdMj");
        // 自然保护地基本情况-自然遗产地
        Column<String> zrbhdZrycd = new Column<>("自然遗产地", zrbhdZrycdMc, zrbhdZrycdJb, zrbhdZrycdMj);
        // 自然保护地基本情况-森林公园-类型
        Column<String> zrbhdSlgyLx = new Column<>("类型", "zrbhdSlgyLx");
        // 自然保护地基本情况-森林公园-名称
        Column<String> zrbhdSlgyMc = new Column<>("名称", "zrbhdSlgyMc");
        // 自然保护地基本情况-森林公园-级别
        Column<String> zrbhdSlgyJb = new Column<>("级别", "zrbhdSlgyJb");
        // 自然保护地基本情况-森林公园-面积
        Column<String> zrbhdSlgyMj = new Column<>("面积", "zrbhdSlgyMj");
        // 自然保护地基本情况-森林公园
        Column<String> zrbhdSlgy = new Column<>("森林公园", zrbhdSlgyLx, zrbhdSlgyMc, zrbhdSlgyJb, zrbhdSlgyMj);
        // 自然保护地基本情况-国有林场-名称
        Column<String> zrbhdGylcMc = new Column<>("名称", "zrbhdGylcMc");
        // 自然保护地基本情况-国有林场-面积
        Column<String> zrbhdGylcMj = new Column<>("面积", "zrbhdGylcMj");
        // 自然保护地基本情况-国有林场
        Column<String> zrbhdGylc = new Column<>("国有林场", zrbhdGylcMc, zrbhdGylcMj);

        // 自然保护地基本情况
        Column<String> zrbhd = new Column<>("自然保护地基本情况", zrbhdZrbhq, zrbhdSdgy, zrbhdFjmsq, zrbhdZrycd, zrbhdSlgy, zrbhdGylc);

        TableData<Jbqk> tableData = new TableData<>("林业基本情况", jbqkList, city, county, department, num, area, ldzyxzLdzyxz, slxjxz, slzyly, lycz, fljy, smh, cdzy, zrbhd);

        mSt_jbqk.setTableData(tableData);

        mSt_jbqk.getConfig().setContentStyle(new FontStyle(45, Color.DKGRAY));

        city.setAutoMerge(true);
        county.setAutoMerge(true);
        department.setAutoMerge(true);
        mSt_jbqk.getConfig().setShowXSequence(false); // X序号列不显示
        mSt_jbqk.getConfig().setFixedXSequence(true); // X序号列固定
        mSt_jbqk.getConfig().setShowYSequence(true);
        mSt_jbqk.getConfig().setFixedYSequence(true);

        mSt_jbqk.getConfig().setContentCellBackgroundFormat(new BaseCellBackgroundFormat<CellInfo>() {
            @Override
            public int getBackGroundColor(CellInfo cellInfo) {
                if (cellInfo.row % 2 == 0) {
                    return ContextCompat.getColor(mContext, R.color.tableBackground);
                } else {
                    return TableConfig.INVALID_COLOR;
                }
            }
        });
    }
}
