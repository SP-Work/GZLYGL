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
import com.otitan.gzlygl.bean.Dqzz;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * 党群组织建设
 */
public class DqzzActivity extends AppCompatActivity {

    @BindView(R.id.st_dqzz)
    SmartTable mSt_dqzz;

    private Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dqzz);

        ButterKnife.bind(this);

        mContext = DqzzActivity.this;

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
        List<Dqzz> dqzzList = new ArrayList<>();
        dqzzList.add(new Dqzz("贵阳", "修文", "林业",
                "1", "2",
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

        // 党组织-支部数
        Column<String> dzzZbs = new Column<>("支部数", "dzzZbs");
        // 党组织-党员数
        Column<String> dzzDys = new Column<>("党员数", "dzzDys");
        // 党组织
        Column<String> dzz = new Column<>("党组织", dzzZbs, dzzDys);

        // 团组织-支部数
        Column<String> tzzZbs = new Column<>("支部数", "tzzZbs");
        // 团组织-团员数
        Column<String> tzzTys = new Column<>("团员数", "tzzTys");
        // 团组织
        Column<String> tzz = new Column<>("团组织", tzzZbs, tzzTys);

        // 工会组织-个数
        Column<String> ghzzGs = new Column<>("个数", "ghzzGs");
        // 工会组织-会员数
        Column<String> ghzzHys = new Column<>("会员数", "ghzzHys");
        // 工会组织
        Column<String> ghzz = new Column<>("工会组织", ghzzGs, ghzzHys);

        // 妇女组织-个数
        Column<String> fnzzGs = new Column<>("个数", "fnzzGs");
        // 妇女组织-成员数
        Column<String> fnzzCys = new Column<>("成员数", "fnzzCys");
        // 妇女组织
        Column<String> fnzz = new Column<>("妇女组织", fnzzGs, fnzzCys);

        // 协会学会-名称
        Column<String> xhxhMc = new Column<>("名称", "xhxhMc");
        // 协会学会-会员数
        Column<String> xhxhHys = new Column<>("会员数", "xhxhHys");
        // 协会学会
        Column<String> xhxh = new Column<>("协会学会", xhxhMc, xhxhHys);

        // 其它组织-名称
        Column<String> qtzzMc = new Column<>("名称", "qtzzMc");
        // 其它组织-会员数
        Column<String> qtzzHys = new Column<>("会员数", "qtzzHys");
        // 其它组织
        Column<String> qtzz = new Column<>("其它组织", qtzzMc, qtzzHys);

        TableData<Dqzz> tableData = new TableData<>("党群组织建设", dqzzList, city, county, department, dzz, tzz, ghzz, fnzz, xhxh, qtzz);

        mSt_dqzz.setTableData(tableData);

        mSt_dqzz.getConfig().setContentStyle(new FontStyle(45, Color.DKGRAY));

        city.setAutoMerge(true);
        county.setAutoMerge(true);
        department.setAutoMerge(true);
        mSt_dqzz.getConfig().setShowXSequence(false); // X序号列不显示
        mSt_dqzz.getConfig().setFixedXSequence(true); // X序号列固定
        mSt_dqzz.getConfig().setShowYSequence(true);
        mSt_dqzz.getConfig().setFixedYSequence(true);

        mSt_dqzz.getConfig().setContentCellBackgroundFormat(new BaseCellBackgroundFormat<CellInfo>() {
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
