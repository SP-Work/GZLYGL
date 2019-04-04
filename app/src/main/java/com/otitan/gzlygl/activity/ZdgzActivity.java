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
import com.otitan.gzlygl.bean.Zdgz;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * 重点工作目标
 */
public class ZdgzActivity extends AppCompatActivity {

    @BindView(R.id.st_zdgz)
    SmartTable mSt_zdgz;

    private Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zdgz);

        ButterKnife.bind(this);

        mContext = ZdgzActivity.this;

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
        List<Zdgz> zdgzList = new ArrayList<>();
        zdgzList.add(new Zdgz("贵阳", "修文", "林业",
                "1", "2", "3", "4", "5", "6", "7", "8", "9",
                "1", "2", "3", "4", "5", "6", "7",
                "1", "2", "3", "4", "5",
                "1",
                "1", "2",
                "1", "2",
                "1", "2",
                "1", "2",
                "1", "2",
                "1", "2",
                "1", "2",
                "1", "2",
                "1", "2",
                "1", "2",
                "1", "2",
                "1", "2",
                "1"
        ));

        // 市（州）
        Column<String> city = new Column<>("市（州）", "city");
        // 县（区）
        Column<String> county = new Column<>("县（区）", "county");
        // 单位名称
        Column<String> department = new Column<>("单位名称", "department");

        // 国土绿化目标-森林覆盖率
        Column<String> gtlhSlfgl = new Column<>("森林覆盖率", "gtlhSlfgl");
        // 国土绿化目标-人工造林总面积
        Column<String> gtlhRgzl = new Column<>("人工造林总面积", "gtlhRgzl");
        // 国土绿化目标-退耕还林面积
        Column<String> gtlhTghl = new Column<>("退耕还林面积", "gtlhTghl");
        // 国土绿化目标-两江防护林造林面积
        Column<String> gtlhLjfhl = new Column<>("两江防护林造林面积", "gtlhLjfhl");
        // 国土绿化目标-天保公益林建设面积
        Column<String> gtlhTbgyl = new Column<>("天保公益林建设面积", "gtlhTbgyl");
        // 国土绿化目标-植被恢复费造林
        Column<String> gtlhZnhf = new Column<>("植被恢复费造林", "gtlhZnhf");
        // 国土绿化目标-石漠化治理面积
        Column<String> gtlhSmhzl = new Column<>("石漠化治理面积", "gtlhSmhzl");
        // 国土绿化目标-国家储备林面积
        Column<String> gtlhGjcbl = new Column<>("国家储备林面积", "gtlhGjcbl");
        // 国土绿化目标-其它造林面积
        Column<String> gtlhQt = new Column<>("国家储备林面积", "gtlhQt");
        // 国土绿化目标
        Column<String> gtlh = new Column<>("国土绿化目标", gtlhSlfgl, gtlhRgzl, gtlhTghl, gtlhLjfhl, gtlhTbgyl, gtlhZnhf, gtlhSmhzl, gtlhGjcbl, gtlhQt);

        // 资源保护目标-森林管护人员
        Column<String> zybhSlghry = new Column<>("森林管护人员", "zybhSlghry");
        // 资源保护目标-生态护林员
        Column<String> zybhSthly = new Column<>("生态护林员", "zybhSthly");
        // 资源保护目标-管护总面积
        Column<String> zybhGhzmj = new Column<>("管护总面积", "zybhGhzmj");
        // 资源保护目标-国家公益林
        Column<String> zybhGjgyl = new Column<>("国家公益林", "zybhGjgyl");
        // 资源保护目标-地方公益林
        Column<String> zybhDfgyl = new Column<>("地方公益林", "zybhDfgyl");
        // 资源保护目标-天然林
        Column<String> zybhTrl = new Column<>("天然林", "zybhTrl");
        // 资源保护目标-其它林地
        Column<String> zybhQt = new Column<>("其它林地", "zybhQt");
        // 资源保护目标
        Column<String> zybh = new Column<>("资源保护目标", zybhSlghry, zybhSthly, zybhGhzmj, zybhGjgyl, zybhDfgyl, zybhTrl, zybhQt);

        // 森林城市体系建设-国家级森林城市
        Column<String> slcsGj = new Column<>("国家级森林城市", "slcsGj");
        // 森林城市体系建设-省级森林城市
        Column<String> slcsSj = new Column<>("省级森林城市", "slcsSj");
        // 森林城市体系建设-森林乡镇
        Column<String> slcsXz = new Column<>("森林乡镇", "slcsXz");
        // 森林城市体系建设-森林村寨
        Column<String> slcsCz = new Column<>("森林村寨", "slcsCz");
        // 森林城市体系建设-森林人家
        Column<String> slcsRj = new Column<>("森林人家", "slcsRj");
        // 森林城市体系建设
        Column<String> slcs = new Column<>("森林城市体系建设", slcsGj, slcsSj, slcsXz, slcsCz, slcsRj);

        // 总产值
        Column<String> lyczZcz = new Column<>("总产值", "lyczZcz");

        // 林业产业发展目标-木材生产-合计-数量
        Column<String> lyczMcscHjSl = new Column<>("数量", "lyczZcz");
        // 林业产业发展目标-木材生产-合计-产值
        Column<String> lyczMcscHjCz = new Column<>("产值", "lyczMcscHjCz");
        // 林业产业发展目标-木材生产-合计
        Column<String> lyczMcscHj = new Column<>("合计", lyczMcscHjSl, lyczMcscHjCz);

        // 林业产业发展目标-木材生产-菌材生产-数量
        Column<String> lyczMcscJcSl = new Column<>("数量", "lyczMcscJcSl");
        // 林业产业发展目标-木材生产-菌材生产-产值
        Column<String> lyczMcscJcCz = new Column<>("产值", "lyczMcscJcCz");
        // 林业产业发展目标-木材生产-菌材生产
        Column<String> lyczMcscJc = new Column<>("菌材生产", lyczMcscJcSl, lyczMcscJcCz);

        // 林业产业发展目标-木材生产
        Column<String> lyczMcsc = new Column<>("木材生产", lyczMcscHj, lyczMcscJc);

        // 林业产业发展目标-林产品加工-规模
        Column<String> lyczLczjgGm = new Column<>("规模", "lyczLczjgGm");
        // 林业产业发展目标-林产品加工-	产值
        Column<String> lyczLczjgCz = new Column<>("产值", "lyczLczjgCz");
        // 林业产业发展目标-林产品加工
        Column<String> lyczLczjg = new Column<>("林产品加工", lyczLczjgGm, lyczLczjgCz);

        // 林业产业发展目标-油茶-面积
        Column<String> lyczYcMj = new Column<>("面积", "lyczYcMj");
        // 林业产业发展目标-油茶-产值
        Column<String> lyczYcCz = new Column<>("产值", "lyczYcCz");
        // 林业产业发展目标-油茶
        Column<String> lyczYc = new Column<>("油茶", lyczYcMj, lyczYcCz);

        // 林业产业发展目标-石斛-面积
        Column<String> lyczShMj = new Column<>("面积", "lyczShMj");
        // 林业产业发展目标-石斛-产值
        Column<String> lyczShCz = new Column<>("产值", "lyczShCz");
        // 林业产业发展目标-石斛
        Column<String> lyczSh = new Column<>("石斛", lyczShMj, lyczShCz);

        // 林业产业发展目标-竹类-面积
        Column<String> lyczZlMj = new Column<>("面积", "lyczZlMj");
        // 林业产业发展目标-竹类-产值
        Column<String> lyczZlCz = new Column<>("产值", "lyczZlCz");
        // 林业产业发展目标-竹类
        Column<String> lyczZl = new Column<>("竹类", lyczZlMj, lyczZlCz);

        // 林业产业发展目标-刺梨-面积
        Column<String> lyczClMj = new Column<>("面积", "lyczClMj");
        // 林业产业发展目标-刺梨-产值
        Column<String> lyczClCz = new Column<>("产值", "lyczClCz");
        // 林业产业发展目标-刺梨
        Column<String> lyczCl = new Column<>("刺梨", lyczClMj, lyczClCz);

        // 林业产业发展目标-其它经济林-面积
        Column<String> lyczQtjjlMj = new Column<>("面积", "lyczQtjjlMj");
        // 林业产业发展目标-其它经济林-产值
        Column<String> lyczQtjjlCz = new Column<>("产值", "lyczQtjjlCz");
        // 林业产业发展目标-其它经济林
        Column<String> lyczQtjjl = new Column<>("其它经济林", lyczQtjjlMj, lyczQtjjlCz);

        // 林业产业发展目标-森林旅游-人次
        Column<String> lyczSllyRc = new Column<>("人次", "lyczSllyRc");
        // 林业产业发展目标-森林旅游-总收入
        Column<String> lyczSllyZsr = new Column<>("总收入", "lyczSllyZsr");
        // 林业产业发展目标-森林旅游
        Column<String> lyczSlly = new Column<>("森林旅游", lyczSllyRc, lyczSllyZsr);

        // 林业产业发展目标-森林康养-人次
        Column<String> lyczSlkyRc = new Column<>("人次", "lyczSlkyRc");
        // 林业产业发展目标-森林康养-总收入
        Column<String> lyczSlkyZsr = new Column<>("总收入", "lyczSlkyZsr");
        // 林业产业发展目标-森林康养
        Column<String> lyczSlky = new Column<>("森林康养", lyczSlkyRc, lyczSlkyZsr);

        // 林业产业发展目标-林下经济-面积
        Column<String> lyczLxjjMj = new Column<>("面积", "lyczLxjjMj");
        // 林业产业发展目标-林下经济-产值
        Column<String> lyczLxjjCz = new Column<>("产值", "lyczLxjjCz");
        // 林业产业发展目标-林下经济
        Column<String> lyczLxjj = new Column<>("林下经济", lyczLxjjMj, lyczLxjjCz);

        // 林业产业发展目标-其它产业-规模
        Column<String> lyczQtcyGm = new Column<>("规模", "lyczQtcyGm");
        // 林业产业发展目标-其它产业-产值
        Column<String> lyczQtcyCz = new Column<>("产值", "lyczQtcyCz");
        // 林业产业发展目标-其它产业
        Column<String> lyczQtcy = new Column<>("其它产业", lyczQtcyGm, lyczQtcyCz);

        // 林业产业发展目标
        Column<String> lycz = new Column<>("林业产业发展目标", lyczZcz, lyczMcsc, lyczLczjg, lyczYc, lyczSh, lyczZl, lyczCl, lyczQtjjl, lyczSlly, lyczSlky, lyczLxjj, lyczQtcy);

        // 主要工作目标
        Column<String> zygzmb = new Column<>("主要工作目标", gtlh, zybh, slcs, lycz);

        // 备注
        Column<String> bz = new Column<>("备注", "bz");

        TableData<Zdgz> tableData = new TableData<>("重点工作目标", zdgzList, city, county, department, zygzmb, bz);

        mSt_zdgz.setTableData(tableData);

        mSt_zdgz.getConfig().setContentStyle(new FontStyle(45, Color.DKGRAY));

        city.setAutoMerge(true);
        county.setAutoMerge(true);
        department.setAutoMerge(true);
        mSt_zdgz.getConfig().setShowXSequence(false); // X序号列不显示
        mSt_zdgz.getConfig().setFixedXSequence(true); // X序号列固定
        mSt_zdgz.getConfig().setShowYSequence(true);
        mSt_zdgz.getConfig().setFixedYSequence(true);

        mSt_zdgz.getConfig().setContentCellBackgroundFormat(new BaseCellBackgroundFormat<CellInfo>() {
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
