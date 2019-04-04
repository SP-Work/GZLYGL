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
import com.otitan.gzlygl.bean.Lykj;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * 林业科技情况
 */
public class LykjActivity extends AppCompatActivity {

    @BindView(R.id.st_lykj)
    SmartTable mSt_lykj;

    private Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lykj);

        ButterKnife.bind(this);

        mContext = LykjActivity.this;

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
        List<Lykj> lykjList = new ArrayList<>();
        lykjList.add(new Lykj("贵阳", "修文", "林业", "科技",
                "1", "2", "3", "4",
                "1", "2", "3", "4", "5", "6",
                "1", "2", "3", "4",
                "1"
        ));

        // 市（州）
        Column<String> city = new Column<>("市（州）", "city");
        // 县（区）
        Column<String> county = new Column<>("县（区）", "county");
        // 单位名称
        Column<String> department = new Column<>("单位名称", "department");
        // 机构名称
        Column<String> organization = new Column<>("机构名称", "organization");

        // 科研人员-正高
        Column<String> kyryZg = new Column<>("正高", "kyryZg");
        // 科研人员-副高
        Column<String> kyryFg = new Column<>("副高", "kyryFg");
        // 科研人员-中级
        Column<String> kyryZj = new Column<>("中级", "kyryZj");
        // 科研人员-初级
        Column<String> kyryCj = new Column<>("初级", "kyryCj");
        // 科研人员
        Column<String> kyry = new Column<>("科研人员", kyryZg, kyryFg, kyryZj, kyryCj);

        // 科研课题-名称
        Column<String> kyktMc = new Column<>("名称", "kyktMc");
        // 科研课题-课题来源
        Column<String> kyktKtly = new Column<>("课题来源", "kyktKtly");
        // 科研课题-课题经费
        Column<String> kyktKtjf = new Column<>("课题经费", "kyktKtjf");
        // 科研课题-研究方向
        Column<String> kyktYjfx = new Column<>("研究方向", "kyktYjfx");
        // 科研课题-课题负责人
        Column<String> kyktKyfzr = new Column<>("课题负责人", "kyktKyfzr");
        // 科研课题-研究时限
        Column<String> kyktYjsx = new Column<>("研究时限", "kyktYjsx");
        // 科研课题
        Column<String> kykt = new Column<>("科研课题", kyktMc, kyktKtly, kyktKtjf, kyktYjfx, kyktKyfzr, kyktYjsx);

        // 主要研究成果-名称
        Column<String> zyyjcgMc = new Column<>("名称", "zyyjcgMc");
        // 主要研究成果-类型
        Column<String> zyyjcgLx = new Column<>("类型", "zyyjcgLx");
        // 主要研究成果-课题来源
        Column<String> zyyjcgKtly = new Column<>("课题来源", "zyyjcgKtly");
        // 主要研究成果-成果转化情况
        Column<String> zyyjcgCgzhqk = new Column<>("成果转化情况", "zyyjcgCgzhqk");
        // 主要研究成果
        Column<String> zyyjcg = new Column<>("主要研究成果", zyyjcgMc, zyyjcgLx, zyyjcgKtly, zyyjcgCgzhqk);

        // 备注
        Column<String> bz = new Column<>("备注", "bz");

        TableData<Lykj> tableData = new TableData<>("林业科技情况", lykjList, city, county, department, organization, kyry, kykt, zyyjcg, bz);

        mSt_lykj.setTableData(tableData);

        mSt_lykj.getConfig().setContentStyle(new FontStyle(45, Color.DKGRAY));

        city.setAutoMerge(true);
        county.setAutoMerge(true);
        department.setAutoMerge(true);
        mSt_lykj.getConfig().setShowXSequence(false); // X序号列不显示
        mSt_lykj.getConfig().setFixedXSequence(true); // X序号列固定
        mSt_lykj.getConfig().setShowYSequence(true);
        mSt_lykj.getConfig().setFixedYSequence(true);

        mSt_lykj.getConfig().setContentCellBackgroundFormat(new BaseCellBackgroundFormat<CellInfo>() {
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
