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
import com.otitan.gzlygl.bean.Ryjg;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * 人员结构基本情况
 */
public class RyjgActivity extends AppCompatActivity {

    @BindView(R.id.st_ryjg)
    SmartTable mSt_ryjg;

    private Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ryjg);

        ButterKnife.bind(this);

        mContext = RyjgActivity.this;

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
        List<Ryjg> ryjgList = new ArrayList<>();
        ryjgList.add(new Ryjg("贵阳", "修文", "林业", "100", "300",
                "1", "2",
                "1", "2",
                "1", "2", "3", "4",
                "1", "2", "3", "4",
                "1", "2", "3",
                "1", "2", "3", "4",
                "1", "2", "3", "4",
                "1", "2", "3", "4",
                "1", "2"
        ));

        // 市（州）
        Column<String> city = new Column<>("市（州）", "city");
        // 县（区）
        Column<String> county = new Column<>("县（区）", "county");
        // 单位名称
        Column<String> department = new Column<>("单位名称", "department");
        // 总编制数
        Column<String> num = new Column<>("总编制数", "num");
        // 内设机构个数（含事业单位）
        Column<String> agency = new Column<>("内设机构个数（含事业单位）", "agency");

        // 基层林业机构-机构-机构名称
        Column<String> jclyjgJgMc = new Column<>("机构名称", "jclyjgJgMc");
        // 基层林业机构-机构-机构个数
        Column<String> jclyjgJgGs = new Column<>("机构个数", "jclyjgJgGs");
        // 基层林业机构-机构
        Column<String> jclyjgJg = new Column<>("机构", jclyjgJgMc, jclyjgJgGs);
        // 基层林业机构-人员-编制人数
        Column<String> jclyjgRyBz = new Column<>("编制人数", "jclyjgRyBz");
        // 基层林业机构-人员-在职人数
        Column<String> jclyjgRyRs = new Column<>("在职人数", "jclyjgRyRs");
        // 基层林业机构-人员
        Column<String> jclyjgRy = new Column<>("人员", jclyjgRyBz, jclyjgRyRs);
        // 基层林业机构
        Column<String> jclyjg = new Column<>("基层林业机构", jclyjgJg, jclyjgRy);

        // 人员编制情况-行政
        Column<String> rybzRybzXz = new Column<>("行政", "rybzRybzXz");
        // 人员编制情况-参公
        Column<String> rybzRybzCg = new Column<>("参公", "rybzRybzCg");
        // 人员编制情况-事业
        Column<String> rybzRybzSy = new Column<>("事业", "rybzRybzSy");
        // 人员编制情况-工勤
        Column<String> rybzRybzGq = new Column<>("工勤", "rybzRybzGq");
        // 人员编制情况
        Column<String> rybzRybz = new Column<>("人员编制情况", rybzRybzXz, rybzRybzCg, rybzRybzSy, rybzRybzGq);
        // 实有人员情况-行政
        Column<String> rybzSyryXz = new Column<>("行政", "rybzSyryXz");
        // 实有人员情况-参公
        Column<String> rybzSyryCg = new Column<>("参公", "rybzSyryCg");
        // 实有人员情况-事业
        Column<String> rybzSyrySy = new Column<>("事业", "rybzSyrySy");
        // 实有人员情况-工勤
        Column<String> rybzSyryGq = new Column<>("工勤", "rybzSyryGq");
        // 实有人员情况
        Column<String> rybzSyry = new Column<>("实有人员情况", rybzSyryXz, rybzSyryCg, rybzSyrySy, rybzSyryGq);
        // 人员编制情况
        Column<String> rybz = new Column<>("人员编制情况", rybzRybz, rybzSyry);

        // 职级情况-处级
        Column<String> zzryZjCj = new Column<>("处级", "zzryZjCj");
        // 职级情况-科级
        Column<String> zzryZjKj = new Column<>("科级", "zzryZjKj");
        // 职级情况-股级
        Column<String> zzryZjGj = new Column<>("股级", "zzryZjGj");
        // 职级情况
        Column<String> zzryZj = new Column<>("职级情况", zzryZjCj, zzryZjKj, zzryZjGj);
        // 学历结构-博士
        Column<String> zzryXlBs = new Column<>("博士", "zzryXlBs");
        // 学历结构-硕士
        Column<String> zzryXlSs = new Column<>("硕士", "zzryXlSs");
        // 学历结构-本科
        Column<String> zzryXlBk = new Column<>("本科", "zzryXlBk");
        // 学历结构-专科及以下
        Column<String> zzryXlZk = new Column<>("专科及以下", "zzryXlZk");
        // 学历结构
        Column<String> zzryXl = new Column<>("学历结构", zzryXlBs, zzryXlSs, zzryXlBk, zzryXlZk);
        // 职称结构-正高
        Column<String> zzryZcZg = new Column<>("正高", "zzryZcZg");
        // 职称结构-副高
        Column<String> zzryZcFg = new Column<>("副高", "zzryZcFg");
        // 职称结构-中级
        Column<String> zzryZcZj = new Column<>("中级", "zzryZcZj");
        // 职称结构-初级
        Column<String> zzryZcCj = new Column<>("初级", "zzryZcCj");
        // 职称结构
        Column<String> zzryZc = new Column<>("职称结构", zzryZcZg, zzryZcFg, zzryZcZj, zzryZcCj);
        // 年龄结构-56岁以上
        Column<String> zzryNlWl = new Column<>("56岁以上", "zzryNlWl");
        // 年龄结构-46-55岁
        Column<String> zzryNlSw = new Column<>("46-55岁", "zzryNlSw");
        // 年龄结构-36-45岁
        Column<String> zzryNlSs = new Column<>("36-45岁", "zzryNlSs");
        // 年龄结构-35岁以下
        Column<String> zzryNlEs = new Column<>("35岁以下", "zzryNlEs");
        // 年龄结构
        Column<String> zzryNl = new Column<>("年龄结构", zzryNlWl, zzryNlSw, zzryNlSs, zzryNlEs);
        // 在职人员结构情况
        Column<String> zzry = new Column<>("在职人员结构情况", zzryZj, zzryXl, zzryZc, zzryNl);

        // 人均服务面积
        Column<String> rjfwmj = new Column<>("人均服务面积", "rjfwmj");
        // 备注
        Column<String> bz = new Column<>("备注", "bz");

        TableData<Ryjg> tableData = new TableData<>("人员结构基本情况", ryjgList, city, county, department, num, agency, jclyjg, rybz, zzry, rjfwmj, bz);

        mSt_ryjg.setTableData(tableData);

        mSt_ryjg.getConfig().setContentStyle(new FontStyle(45, Color.DKGRAY));

        city.setAutoMerge(true);
        county.setAutoMerge(true);
        department.setAutoMerge(true);
        mSt_ryjg.getConfig().setShowXSequence(false); // X序号列不显示
        mSt_ryjg.getConfig().setFixedXSequence(true); // X序号列固定
        mSt_ryjg.getConfig().setShowYSequence(true);
        mSt_ryjg.getConfig().setFixedYSequence(true);

        mSt_ryjg.getConfig().setContentCellBackgroundFormat(new BaseCellBackgroundFormat<CellInfo>() {
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
