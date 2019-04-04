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
import com.otitan.gzlygl.bean.Lyzh;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * 林业灾害情况
 */
public class LyzhActivity extends AppCompatActivity {

    @BindView(R.id.st_lyzh)
    SmartTable mSt_lyzh;

    private Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lyzh);

        ButterKnife.bind(this);

        mContext = LyzhActivity.this;

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
        List<Lyzh> lyzhList = new ArrayList<>();
        lyzhList.add(new Lyzh("贵阳", "修文", "林业", "1", "2", "3", "4",
                "1", "2", "3",
                "1",
                "1", "2", "3", "4",
                "1", "2", "3", "4", "5", "6",
                "1", "2", "3", "4", "5"
        ));

        // 市（州）
        Column<String> city = new Column<>("市（州）", "city");
        // 县（区）
        Column<String> county = new Column<>("县（区）", "county");
        // 单位名称
        Column<String> department = new Column<>("单位名称", "department");
        // 灾害面积
        Column<String> zhmj = new Column<>("灾害面积", "zhmj");
        // 损失金额
        Column<String> ssje = new Column<>("损失金额", "ssje");
        // 防控面积
        Column<String> fkmj = new Column<>("防控面积", "fkmj");
        // 防治率
        Column<String> fzl = new Column<>("防治率", "fzl");

        // 森林火灾-受灾面积
        Column<String> slhzSzmj = new Column<>("受灾面积", "slhzSzmj");
        // 森林火灾-损失金额
        Column<String> slhzSsje = new Column<>("损失金额", "slhzSsje");
        // 森林火灾-受害率
        Column<String> slhzShl = new Column<>("受害率", "slhzShl");
        // 森林火灾
        Column<String> slhz = new Column<>("森林火灾", slhzSzmj, slhzSsje, slhzShl);

        // 灾害类型
        Column<String> zhlx = new Column<>("灾害类型", "zhlx");

        // 林业有害生物-受害面积
        Column<String> lyyhswShmj = new Column<>("受害面积", "lyyhswShmj");
        // 林业有害生物-损失金额
        Column<String> lyyhswSsje = new Column<>("损失金额", "lyyhswSsje");
        // 林业有害生物-成灾率
        Column<String> lyyhswCzl = new Column<>("成灾率", "lyyhswCzl");
        // 林业有害生物-无公害防治率
        Column<String> lyyhswWghfzl = new Column<>("无公害防治率", "lyyhswWghfzl");
        // 林业有害生物
        Column<String> lyyhsw = new Column<>("林业有害生物", lyyhswShmj, lyyhswSsje, lyyhswCzl, lyyhswWghfzl);

        // 重大疫源疫病-灾害名称
        Column<String> zdyyybZhmc = new Column<>("灾害名称", "zdyyybZhmc");
        // 重大疫源疫病-受灾面积
        Column<String> zdyyybSzmj = new Column<>("受灾面积", "zdyyybSzmj");
        // 重大疫源疫病-灾害程度
        Column<String> zdyyybZhcd = new Column<>("灾害程度", "zdyyybZhcd");
        // 重大疫源疫病-损失金额
        Column<String> zdyyybSsje = new Column<>("损失金额", "zdyyybSsje");
        // 重大疫源疫病-防控措施
        Column<String> zdyyybFkcs = new Column<>("防控措施", "zdyyybFkcs");
        // 重大疫源疫病-防控成效
        Column<String> zdyyybFkcx = new Column<>("防控成效", "zdyyybFkcx");
        // 重大疫源疫病
        Column<String> zdyyyb = new Column<>("重大疫源疫病", zdyyybZhmc, zdyyybSzmj, zdyyybZhcd, zdyyybSsje, zdyyybFkcs, zdyyybFkcx);

        // 其它灾害-灾害类型
        Column<String> qtzhZhlx = new Column<>("灾害类型", "qtzhZhlx");
        // 其它灾害-受害面积
        Column<String> qtzhSzmj = new Column<>("受害面积", "qtzhSzmj");
        // 其它灾害-损失金额
        Column<String> qtzhSsje = new Column<>("损失金额", "qtzhSsje");
        // 其它灾害-防控措施
        Column<String> qtzhFkcs = new Column<>("防控措施", "qtzhFkcs");
        // 其它灾害-防控成效
        Column<String> qtzhFkcx = new Column<>("防控成效", "qtzhFkcx");
        // 其它灾害
        Column<String> qtzh = new Column<>("其它灾害", qtzhZhlx, qtzhSzmj, qtzhSsje, qtzhFkcs, qtzhFkcx);

        TableData<Lyzh> tableData = new TableData<>("林业灾害情况", lyzhList, city, county, department, zhmj, ssje, fkmj, fzl, slhz, zhlx, lyyhsw, zdyyyb, qtzh);

        mSt_lyzh.setTableData(tableData);

        mSt_lyzh.getConfig().setContentStyle(new FontStyle(45, Color.DKGRAY));

        city.setAutoMerge(true);
        county.setAutoMerge(true);
        department.setAutoMerge(true);
        mSt_lyzh.getConfig().setShowXSequence(false); // X序号列不显示
        mSt_lyzh.getConfig().setFixedXSequence(true); // X序号列固定
        mSt_lyzh.getConfig().setShowYSequence(true);
        mSt_lyzh.getConfig().setFixedYSequence(true);

        mSt_lyzh.getConfig().setContentCellBackgroundFormat(new BaseCellBackgroundFormat<CellInfo>() {
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
