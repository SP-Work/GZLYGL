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
import com.otitan.gzlygl.bean.Lypp;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * 林业品牌建设
 */
public class LyppActivity extends AppCompatActivity {

    @BindView(R.id.st_lypp)
    SmartTable mSt_lypp;

    private Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lypp);

        ButterKnife.bind(this);

        mContext = LyppActivity.this;

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
        List<Lypp> lyppList = new ArrayList<>();
        lyppList.add(new Lypp("贵阳", "修文", "林业", "100", "200",
                "1", "2",
                "1", "2",
                "1", "2",
                "1", "2",
                "1", "2"
        ));

        // 市（州）
        Column<String> city = new Column<>("市（州）", "city");
        // 县（区）
        Column<String> county = new Column<>("县（区）", "county");
        // 单位名称
        Column<String> department = new Column<>("单位名称", "department");
        // 国家级品牌个数
        Column<String> gjpp = new Column<>("国家级品牌个数", "gjpp");
        // 省级涉林品牌个数
        Column<String> sjpp = new Column<>("省级涉林品牌个数", "sjpp");

        // 自然保护地-国家级
        Column<String> zrbhdGj = new Column<>("国家级", "zrbhdGj");
        // 自然保护地-省级
        Column<String> zrbhdSj = new Column<>("省级", "zrbhdSj");
        // 自然保护地
        Column<String> zrbhd = new Column<>("自然保护地", zrbhdGj, zrbhdSj);

        // 森林城市-国家级
        Column<String> slcsGj = new Column<>("国家级", "slcsGj");
        // 森林城市-省级
        Column<String> slcsSj = new Column<>("省级", "slcsSj");
        // 森林城市
        Column<String> slcs = new Column<>("森林城市", slcsGj, slcsSj);

        // 涉林荣誉称号-世界级
        Column<String> rychGj = new Column<>("世界级", "rychGj");
        // 涉林荣誉称号-国家级
        Column<String> rychSj = new Column<>("国家级", "rychSj");
        // 涉林荣誉称号
        Column<String> rych = new Column<>("涉林荣誉称号", rychGj, rychSj);

        // 涉林科研、示范基地-国家级
        Column<String> kysfGj = new Column<>("国家级", "kysfGj");
        // 涉林科研、示范基地-省级
        Column<String> kysfSj = new Column<>("省级", "kysfSj");
        // 涉林科研、示范基地
        Column<String> kysf = new Column<>("涉林科研、示范基地", kysfGj, kysfSj);

        // 涉林地理标志产品
        Column<String> slpp = new Column<>("涉林地理标志产品", "slpp");

        // 其它林业知名品牌
        Column<String> qtpp = new Column<>("其它林业知名品牌", "qtpp");

        TableData<Lypp> tableData = new TableData<>("林业品牌建设", lyppList, city, county, department, gjpp, sjpp, zrbhd, slcs, rych, kysf, slpp, qtpp);

        mSt_lypp.setTableData(tableData);

        mSt_lypp.getConfig().setContentStyle(new FontStyle(45, Color.DKGRAY));

        city.setAutoMerge(true);
        county.setAutoMerge(true);
        department.setAutoMerge(true);
        mSt_lypp.getConfig().setShowXSequence(false); // X序号列不显示
        mSt_lypp.getConfig().setFixedXSequence(true); // X序号列固定
        mSt_lypp.getConfig().setShowYSequence(true);
        mSt_lypp.getConfig().setFixedYSequence(true);

        mSt_lypp.getConfig().setContentCellBackgroundFormat(new BaseCellBackgroundFormat<CellInfo>() {
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
