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
import com.otitan.gzlygl.bean.Gzly;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * 贵州林业横向对比情况
 */
public class GzlyActivity extends AppCompatActivity {

    @BindView(R.id.st_gzly)
    SmartTable mSt_gzly;

    private Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gzly);

        ButterKnife.bind(this);

        mContext = GzlyActivity.this;

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
        List<Gzly> gzlyList = new ArrayList<>();
        gzlyList.add(new Gzly("贵州",
                "1", "2", "3", "4", "5", "6",
                "1", "2", "3", "4", "5",
                "1", "2", "3", "4",
                "1", "2", "3", "4", "5", "6", "7", "8",
                "1", "2", "3", "4", "5", "6", "7"
        ));

        // 单位名称
        Column<String> department = new Column<>("单位名称", "department");

        // 林业概况-国土面积
        Column<String> lygkGtmj = new Column<>("国土面积", "lygkGtmj");
        // 林业概况-林业用地面积
        Column<String> lygkLyydmj = new Column<>("林业用地面积", "lygkLyydmj");
        // 林业概况-森林面积
        Column<String> lygkSlmj = new Column<>("森林面积", "lygkSlmj");
        // 林业概况-森林蓄积
        Column<String> lygkSlxj = new Column<>("森林蓄积", "lygkSlxj");
        // 林业概况-森林覆盖率
        Column<String> lygkSlfgl = new Column<>("森林覆盖率", "lygkSlfgl");
        // 林业概况-林业产值
        Column<String> lygkLycz = new Column<>("林业产值", "lygkLycz");
        // 林业概况
        Column<String> lygk = new Column<>("林业概况", lygkGtmj, lygkLyydmj, lygkSlmj, lygkSlxj, lygkSlfgl, lygkLycz);

        // 林业投资情况-中央投资
        Column<String> LytzZy = new Column<>("中央投资", "LytzZy");
        // 林业投资情况-省级投资
        Column<String> LytzSj = new Column<>("省级投资", "LytzSj");
        // 林业投资情况-市县投资
        Column<String> LytzSx = new Column<>("市县投资", "LytzSx");
        // 林业投资情况-金融投资
        Column<String> LytzJr = new Column<>("金融投资", "LytzJr");
        // 林业投资情况-社会投资
        Column<String> LytzSh = new Column<>("社会投资", "LytzSh");
        // 林业投资情况
        Column<String> Lytz = new Column<>("林业投资情况", LytzZy, LytzSj, LytzSx, LytzJr, LytzSh);

        // 林业产值-总产值
        Column<String> lyczZcz = new Column<>("总产值", "lyczZcz");
        // 林业产值-一产
        Column<String> lyczYc = new Column<>("一产", "lyczYc");
        // 林业产值-二产
        Column<String> lyczEc = new Column<>("二产", "lyczEc");
        // 林业产值-三产
        Column<String> lyczSc = new Column<>("三产", "lyczSc");
        // 林业产值
        Column<String> lycz = new Column<>("林业产值", lyczZcz, lyczYc, lyczEc, lyczSc);

        // 自然保护地建设-自然保护地总面积
        Column<String> zrbhdZmj = new Column<>("自然保护地总面积", "zrbhdZmj");
        // 自然保护地建设-自然保护地占比
        Column<String> zrbhdZb = new Column<>("自然保护地占比", "zrbhdZb");
        // 自然保护地建设-国家级保护地数量
        Column<String> zrbhdGjjsl = new Column<>("国家级保护地数量", "zrbhdGjjsl");
        // 自然保护地建设-国家级保护地面积
        Column<String> zrbhdGjjmj = new Column<>("国家级保护地面积", "zrbhdGjjmj");
        // 自然保护地建设-省级保护地数量
        Column<String> zrbhdSjsl = new Column<>("省级保护地数量", "zrbhdSjsl");
        // 自然保护地建设-省级保护地面积
        Column<String> zrbhdSjmj = new Column<>("省级保护地面积", "zrbhdSjmj");
        // 自然保护地建设-其它保护地数量
        Column<String> zrbhdQtsl = new Column<>("其它保护地数量", "zrbhdQtsl");
        // 自然保护地建设-其它保护地面积
        Column<String> zrbhdQtmj = new Column<>("其它保护地面积", "zrbhdQtmj");
        // 自然保护地建设
        Column<String> zrbhd = new Column<>("自然保护地建设", zrbhdZmj, zrbhdZb, zrbhdGjjsl, zrbhdGjjmj, zrbhdSjsl, zrbhdSjmj, zrbhdQtsl, zrbhdQtmj);

        // 机构人员结构概况-内设机构数
        Column<String> jgryNsjg = new Column<>("内设机构数", "jgryNsjg");
        // 机构人员结构概况-直属事业单位
        Column<String> jgryZsdw = new Column<>("直属事业单位", "jgryZsdw");
        // 机构人员结构概况-行政编制数
        Column<String> jgryXzbz = new Column<>("行政编制数", "jgryXzbz");
        // 机构人员结构概况-参公编制数
        Column<String> jgryCgbz = new Column<>("参公编制数", "jgryCgbz");
        // 机构人员结构概况-事业编制数
        Column<String> jgrySybz = new Column<>("事业编制数", "jgrySybz");
        // 机构人员结构概况-工勤编制数
        Column<String> jgryGqbz = new Column<>("工勤编制数", "jgryGqbz");
        // 机构人员结构概况-人均服务面积
        Column<String> jgryRjmj = new Column<>("人均服务面积", "jgryRjmj");
        // 机构人员结构概况
        Column<String> jgry = new Column<>("机构人员结构概况", jgryNsjg, jgryZsdw, jgryXzbz, jgryCgbz, jgrySybz, jgryGqbz, jgryRjmj);

        TableData<Gzly> tableData = new TableData<>("贵州林业横向对比情况", gzlyList, department, lygk, Lytz, lycz, zrbhd, jgry);

        mSt_gzly.setTableData(tableData);

        mSt_gzly.getConfig().setContentStyle(new FontStyle(45, Color.DKGRAY));

        department.setAutoMerge(true);
        mSt_gzly.getConfig().setShowXSequence(false); // X序号列不显示
        mSt_gzly.getConfig().setFixedXSequence(true); // X序号列固定
        mSt_gzly.getConfig().setShowYSequence(true);
        mSt_gzly.getConfig().setFixedYSequence(true);

        mSt_gzly.getConfig().setContentCellBackgroundFormat(new BaseCellBackgroundFormat<CellInfo>() {
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
