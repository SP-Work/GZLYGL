package com.otitan.gzlygl.activity;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;

import com.bin.david.form.core.SmartTable;
import com.bin.david.form.core.TableConfig;
import com.bin.david.form.data.CellInfo;
import com.bin.david.form.data.column.Column;
import com.bin.david.form.data.format.bg.BaseCellBackgroundFormat;
import com.bin.david.form.data.style.FontStyle;
import com.bin.david.form.data.table.TableData;
import com.otitan.gzlygl.R;
import com.otitan.gzlygl.bean.Lyzj;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * 林业资金投入统计
 */
public class LyzjActivity extends AppCompatActivity {

    @BindView(R.id.st_lyzj)
    SmartTable mSt_lyzj;

    private Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lyzj);

        ButterKnife.bind(this);

        mContext = LyzjActivity.this;

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
        List<Lyzj> lyzjList = new ArrayList<>();
        lyzjList.add(new Lyzj("贵阳", "修文", "林业", "100",
                "1", "2", "3", "4",
                "1", "2", "3",
                "1", "2", "3", "4",
                "1", "2", "3",
                "1", "2", "3", "4",
                "1", "2", "3",
                "1", "2", "3", "4",
                "1", "2", "3",
                "1", "2", "3", "4",
                "1", "2", "3"
        ));

        // 市（州）
        Column<String> city = new Column<>("市（州）", "city");
        // 县（区）
        Column<String> county = new Column<>("县（区）", "county");
        // 单位名称
        Column<String> department = new Column<>("单位名称", "department");
        // 年度林业投资
        Column<String> investment = new Column<>("年度林业投资", "investment");

        // 国土绿化投入-财政投入-中央财政
        Column<String> gtlhCzZy = new Column<>("中央财政", "gtlhCzZy");
        // 国土绿化投入-财政投入-省级财政
        Column<String> gtlhCzSheng = new Column<>("省级财政", "gtlhCzSheng");
        // 国土绿化投入-财政投入-市级财政
        Column<String> gtlhCzShi = new Column<>("市级财政", "gtlhCzShi");
        // 国土绿化投入-财政投入-县级财政
        Column<String> gtlhCzXian = new Column<>("县级财政", "gtlhCzXian");
        // 国土绿化投入-财政投入
        Column<String> gtlhCz = new Column<>("财政投入", gtlhCzZy, gtlhCzSheng, gtlhCzShi, gtlhCzXian);
        // 国土绿化投入-金融资金
        Column<String> gtlhJr = new Column<>("金融资金", "gtlhJr");
        // 国土绿化投入-企业资金
        Column<String> gtlhQy = new Column<>("企业资金", "gtlhQy");
        // 国土绿化投入-民间资金
        Column<String> gtlhMj = new Column<>("民间资金", "gtlhMj");
        // 国土绿化投入
        Column<String> gtlh = new Column<>("国土绿化投入", gtlhCz, gtlhJr, gtlhQy, gtlhMj);

        // 资源保护投入-财政投入-中央财政
        Column<String> zybhCzZy = new Column<>("中央财政", "zybhCzZy");
        // 资源保护投入-财政投入-省级财政
        Column<String> zybhCzSheng = new Column<>("省级财政", "zybhCzSheng");
        // 资源保护投入-财政投入-市级财政
        Column<String> zybhCzShi = new Column<>("市级财政", "zybhCzShi");
        // 资源保护投入-财政投入-县级财政
        Column<String> zybhCzXian = new Column<>("县级财政", "zybhCzXian");
        // 资源保护投入-财政投入
        Column<String> zybhCz = new Column<>("财政投入", zybhCzZy, zybhCzSheng, zybhCzShi, zybhCzXian);
        // 资源保护投入-金融资金
        Column<String> zybhJr = new Column<>("金融资金", "zybhJr");
        // 资源保护投入-企业资金
        Column<String> zybhQy = new Column<>("企业资金", "zybhQy");
        // 资源保护投入-民间资金
        Column<String> zybhMj = new Column<>("民间资金", "zybhMj");
        // 资源保护投入
        Column<String> zybh = new Column<>("资源保护投入", zybhCz, zybhJr, zybhQy, zybhMj);

        // 产业发展-财政投入-中央财政
        Column<String> cyfzCzZy = new Column<>("中央财政", "cyfzCzZy");
        // 产业发展-财政投入-省级财政
        Column<String> cyfzCzSheng = new Column<>("省级财政", "cyfzCzSheng");
        // 产业发展-财政投入-市级财政
        Column<String> cyfzCzShi = new Column<>("市级财政", "cyfzCzShi");
        // 产业发展-财政投入-县级财政
        Column<String> cyfzCzXian = new Column<>("县级财政", "cyfzCzXian");
        // 产业发展-财政投入
        Column<String> cyfzCz = new Column<>("财政投入", cyfzCzZy, cyfzCzSheng, cyfzCzShi, cyfzCzXian);
        // 产业发展-金融资金
        Column<String> cyfzJr = new Column<>("金融资金", "cyfzJr");
        // 产业发展-企业资金
        Column<String> cyfzQy = new Column<>("企业资金", "cyfzQy");
        // 产业发展-民间资金
        Column<String> cyfzMj = new Column<>("民间资金", "cyfzMj");
        // 产业发展
        Column<String> cyfz = new Column<>("产业发展", cyfzCz, cyfzJr, cyfzQy, cyfzMj);

        // 能力建设-财政投入-中央财政
        Column<String> nljsCzZy = new Column<>("中央财政", "nljsCzZy");
        // 能力建设-财政投入-省级财政
        Column<String> nljsCzSheng = new Column<>("省级财政", "nljsCzSheng");
        // 能力建设-财政投入-市级财政
        Column<String> nljsCzShi = new Column<>("市级财政", "nljsCzShi");
        // 能力建设-财政投入-县级财政
        Column<String> nljsCzXian = new Column<>("县级财政", "nljsCzXian");
        // 能力建设-财政投入
        Column<String> nljsCz = new Column<>("能力建设", nljsCzZy, nljsCzSheng, nljsCzShi, nljsCzXian);
        // 能力建设-金融资金
        Column<String> nljsJr = new Column<>("金融资金", "nljsJr");
        // 能力建设-企业资金
        Column<String> nljsQy = new Column<>("企业资金", "nljsQy");
        // 能力建设-民间资金
        Column<String> nljsMj = new Column<>("民间资金", "nljsMj");
        // 能力建设
        Column<String> nljs = new Column<>("能力建设", nljsCz, nljsJr, nljsQy, nljsMj);

        // 其它建设-财政投入-中央财政
        Column<String> qtjsCzZy = new Column<>("中央财政", "qtjsCzZy");
        // 其它建设-财政投入-省级财政
        Column<String> qtjsCzSheng = new Column<>("省级财政", "qtjsCzSheng");
        // 其它建设-财政投入-市级财政
        Column<String> qtjsCzShi = new Column<>("市级财政", "qtjsCzShi");
        // 其它建设-财政投入-县级财政
        Column<String> qtjsCzXian = new Column<>("县级财政", "qtjsCzXian");
        // 其它建设-财政投入
        Column<String> qtjsCz = new Column<>("财政投入", qtjsCzZy, qtjsCzSheng, qtjsCzShi, qtjsCzXian);
        // 其它建设-金融资金
        Column<String> qtjsJr = new Column<>("金融资金", "qtjsJr");
        // 其它建设-企业资金
        Column<String> qtjsQy = new Column<>("企业资金", "qtjsQy");
        // 其它建设-民间资金
        Column<String> qtjsMj = new Column<>("民间资金", "qtjsMj");
        // 其它建设
        Column<String> qtjs = new Column<>("其它建设", qtjsCz, qtjsJr, qtjsQy, qtjsMj);

        TableData<Lyzj> tableData = new TableData<>("林业资金投入统计", lyzjList, city, county, department, investment, gtlh, zybh, cyfz, nljs, qtjs);

        mSt_lyzj.setTableData(tableData);

        mSt_lyzj.getConfig().setContentStyle(new FontStyle(45, Color.DKGRAY));

        city.setAutoMerge(true);
        county.setAutoMerge(true);
        department.setAutoMerge(true);
        mSt_lyzj.getConfig().setShowXSequence(false); // X序号列不显示
        mSt_lyzj.getConfig().setFixedXSequence(true); // X序号列固定
        mSt_lyzj.getConfig().setShowYSequence(true);
        mSt_lyzj.getConfig().setFixedYSequence(true);

        mSt_lyzj.getConfig().setContentCellBackgroundFormat(new BaseCellBackgroundFormat<CellInfo>() {
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
