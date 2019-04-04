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
import com.otitan.gzlygl.bean.Lyaj;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * 林业案件统计
 */
public class LyajActivity extends AppCompatActivity {

    @BindView(R.id.st_lyaj)
    SmartTable mSt_lyaj;

    private Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lyaj);

        ButterKnife.bind(this);

        mContext = LyajActivity.this;

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
        List<Lyaj> lyajList = new ArrayList<>();
        lyajList.add(new Lyaj("贵阳", "修文", "林业",
                "1", "2", "3", "4",
                "1", "2", "3", "4",
                "1", "2", "3", "4",
                "1", "2", "3", "4",
                "1", "2", "3", "4",
                "1", "2", "3", "4",
                "1", "2", "3", "4",
                "1", "2", "3",
                "1", "2", "3",
                "1", "2", "3",
                "1", "2", "3",
                "1", "2", "3",
                "1", "2", "3"
        ));

        // 市（州）
        Column<String> city = new Column<>("市（州）", "city");
        // 县（区）
        Column<String> county = new Column<>("县（区）", "county");
        // 单位
        Column<String> department = new Column<>("单位", "department");

        // 林业刑事案件-案件数
        Column<String> criminalNum = new Column<>("案件数", "criminalNum");
        // 林业刑事案件-批捕人数
        Column<String> criminalArrestNum = new Column<>("批捕人数", "criminalArrestNum");
        // 林业刑事案件-起诉人数
        Column<String> criminalSueNum = new Column<>("起诉人数", "criminalSueNum");
        // 林业刑事案件-刑事处罚人数
        Column<String> criminalPunishNum = new Column<>("刑事处罚人数", "criminalPunishNum");

        // 林业刑事案件-林地案件-案件数
        Column<String> criminalWoodlandNum = new Column<>("案件数", "criminalWoodlandNum");
        // 林业刑事案件-林地案件-批捕人数
        Column<String> criminalWoodlandArrestNum = new Column<>("批捕人数", "criminalWoodlandArrestNum");
        // 林业刑事案件-林地案件-起诉人数
        Column<String> criminalWoodlandSueNum = new Column<>("起诉人数", "criminalWoodlandSueNum");
        // 林业刑事案件-林地案件-刑事处罚人数
        Column<String> criminalWoodlandPunishNum = new Column<>("刑事处罚人数", "criminalWoodlandPunishNum");
        // 林业刑事案件-林地案件
        Column<String> criminalWoodland = new Column<>("林地案件", criminalWoodlandNum, criminalWoodlandArrestNum, criminalWoodlandSueNum, criminalWoodlandPunishNum);

        // 林业刑事案件-林木案件-案件数
        Column<String> criminalForestNum = new Column<>("案件数", "criminalForestNum");
        // 林业刑事案件-林木案件-批捕人数
        Column<String> criminalForestArrestNum = new Column<>("批捕人数", "criminalForestArrestNum");
        // 林业刑事案件-林木案件-起诉人数
        Column<String> criminalForestSueNum = new Column<>("起诉人数", "criminalForestSueNum");
        // 林业刑事案件-林木案件-刑事处罚人数
        Column<String> criminalForestPunishNum = new Column<>("刑事处罚人数", "criminalForestPunishNum");
        // 林业刑事案件-林木案件
        Column<String> criminalForest = new Column<>("林木案件", criminalForestNum, criminalForestArrestNum, criminalForestSueNum,criminalForestPunishNum);

        // 林业刑事案件-野生动物案件-案件数
        Column<String> criminalAnimalNum = new Column<>("案件数", "criminalAnimalNum");
        // 林业刑事案件-野生动物案件-批捕人数
        Column<String> criminalAnimalArrestNum = new Column<>("批捕人数", "criminalAnimalArrestNum");
        // 林业刑事案件-野生动物案件-起诉人数
        Column<String> criminalAnimalSueNum = new Column<>("起诉人数", "criminalAnimalSueNum");
        // 林业刑事案件-野生动物案件-刑事处罚人数
        Column<String> criminalAnimalPunishNum = new Column<>("刑事处罚人数", "criminalAnimalPunishNum");
        // 林业刑事案件-野生动物案件
        Column<String> criminalAnimal = new Column<>("野生动物案件", criminalAnimalNum, criminalAnimalArrestNum, criminalAnimalSueNum, criminalAnimalPunishNum);

        // 林业刑事案件-森林火灾案件-案件数
        Column<String> criminalFireNum = new Column<>("案件数", "criminalFireNum");
        // 林业刑事案件-森林火灾案件-批捕人数
        Column<String> criminalFireArrestNum = new Column<>("批捕人数", "criminalFireArrestNum");
        // 林业刑事案件-森林火灾案件-起诉人数
        Column<String> criminalFireSueNum = new Column<>("起诉人数", "criminalFireSueNum");
        // 林业刑事案件-森林火灾案件-刑事处罚人数
        Column<String> criminalFirePunishNum = new Column<>("刑事处罚人数", "criminalFirePunishNum");
        // 林业刑事案件-森林火灾案件
        Column<String> criminalFire = new Column<>("森林火灾案件", criminalFireNum, criminalFireArrestNum, criminalFireSueNum, criminalFirePunishNum);

        // 林业刑事案件-林区治安案件-案件数
        Column<String> criminalSecurityNum = new Column<>("案件数", "criminalSecurityNum");
        // 林业刑事案件-林区治安案件-批捕人数
        Column<String> criminalSecurityArrestNum = new Column<>("批捕人数", "criminalSecurityArrestNum");
        // 林业刑事案件-林区治安案件-起诉人数
        Column<String> criminalSecuritySueNum = new Column<>("起诉人数", "criminalSecuritySueNum");
        // 林业刑事案件-林区治安案件-刑事处罚人数
        Column<String> criminalSecurityPunishNum = new Column<>("刑事处罚人数", "criminalSecurityPunishNum");
        // 林业刑事案件-林区治安案件
        Column<String> criminalSecurity = new Column<>("林区治安案件", criminalSecurityNum, criminalSecurityArrestNum, criminalSecuritySueNum, criminalSecurityPunishNum);

        // 林业刑事案件-其它刑事案件-案件数
        Column<String> criminalOtherNum = new Column<>("案件数", "criminalOtherNum");
        // 林业刑事案件-其它刑事案件-批捕人数
        Column<String> criminalOtherArrestNum = new Column<>("批捕人数", "criminalOtherArrestNum");
        // 林业刑事案件-其它刑事案件-起诉人数
        Column<String> criminalOtherSueNum = new Column<>("起诉人数", "criminalOtherSueNum");
        // 林业刑事案件-其它刑事案件-刑事处罚人数
        Column<String> criminalOtherPunishNum = new Column<>("刑事处罚人数", "criminalOtherPunishNum");
        // 林业刑事案件-其它刑事案件
        Column<String> criminalOther = new Column<>("其它刑事案件", criminalOtherNum, criminalOtherArrestNum, criminalOtherSueNum, criminalOtherPunishNum);

        // 林业刑事案件
        Column<String> criminal = new Column<>("林业刑事案件", criminalNum, criminalArrestNum, criminalSueNum, criminalPunishNum, criminalWoodland, criminalForest, criminalAnimal, criminalFire, criminalSecurity, criminalOther);

        // 林业行政案件-案件数
        Column<String> administrationNum = new Column<>("案件数", "administrationNum");
        // 林业行政案件-处罚人数
        Column<String> administrationPunish = new Column<>("处罚人数", "administrationPunish");
        // 林业行政案件-罚没金额
        Column<String> administrationMoney = new Column<>("罚没金额", "administrationMoney");

        // 林业行政案件-林地案件-案件数
        Column<String> administrationWoodlandNum = new Column<>("案件数", "administrationWoodlandNum");
        // 林业行政案件-林地案件-处罚人数
        Column<String> administrationWoodlandPunish = new Column<>("处罚人数", "administrationWoodlandPunish");
        // 林业行政案件-林地案件-罚没金额
        Column<String> administrationWoodlandMoney = new Column<>("罚没金额", "administrationWoodlandMoney");
        // 林业行政案件-林地案件
        Column<String> administrationWoodland = new Column<>("林地案件", administrationWoodlandNum, administrationWoodlandPunish, administrationWoodlandMoney);

        // 林业行政案件-林木案件-案件数
        Column<String> administrationForestNum = new Column<>("案件数", "administrationForestNum");
        // 林业行政案件-林木案件-处罚人数
        Column<String> administrationForestPunish = new Column<>("处罚人数", "administrationForestPunish");
        // 林业行政案件-林木案件-罚没金额
        Column<String> administrationForestMoney = new Column<>("罚没金额", "administrationForestMoney");
        // 林业行政案件-林木案件
        Column<String> administrationForest = new Column<>("林木案件", administrationForestNum, administrationForestPunish, administrationForestMoney);

        // 林业行政案件-野生动物案件-案件数
        Column<String> administrationAnimalNum = new Column<>("案件数", "administrationAnimalNum");
        // 林业行政案件-野生动物案件-处罚人数
        Column<String> administrationAnimalPunish = new Column<>("处罚人数", "administrationAnimalPunish");
        // 林业行政案件-野生动物案件-罚没金额
        Column<String> administrationAnimalMoney = new Column<>("罚没金额", "administrationAnimalMoney");
        // 林业行政案件-野生动物案件
        Column<String> administrationAnimal = new Column<>("野生动物案件", administrationAnimalNum, administrationAnimalPunish, administrationAnimalMoney);

        // 林业行政案件-森林火灾案件-案件数
        Column<String> administrationFireNum = new Column<>("案件数", "administrationFireNum");
        // 林业行政案件-森林火灾案件-处罚人数
        Column<String> administrationFirePunish = new Column<>("处罚人数", "administrationFirePunish");
        // 林业行政案件-森林火灾案件-罚没金额
        Column<String> administrationFireMoney = new Column<>("罚没金额", "administrationFireMoney");
        // 林业行政案件-森林火灾案件
        Column<String> administrationFire = new Column<>("森林火灾案件", administrationFireNum, administrationFirePunish, administrationFireMoney);

        // 林业行政案件-其它行政案件-案件数
        Column<String> administrationOtherNum = new Column<>("案件数", "administrationOtherNum");
        // 林业行政案件-其它行政案件-处罚人数
        Column<String> administrationOtherPunish = new Column<>("处罚人数", "administrationOtherPunish");
        // 林业行政案件-其它行政案件-罚没金额
        Column<String> administrationOtherMoney = new Column<>("罚没金额", "administrationOtherMoney");
        // 林业行政案件-其它行政案件
        Column<String> administrationOther = new Column<>("其它行政案件", administrationOtherNum, administrationOtherPunish, administrationOtherMoney);

        // 林业行政案件
        Column<String> administration = new Column<>("林业行政案件", administrationNum, administrationPunish, administrationMoney, administrationWoodland, administrationForest, administrationAnimal, administrationFire, administrationOther);

        TableData<Lyaj> tableData = new TableData<>("林业案件统计", lyajList, city, county, department, criminal, administration);

        mSt_lyaj.setTableData(tableData);

        mSt_lyaj.getConfig().setContentStyle(new FontStyle(45, Color.DKGRAY));

        city.setAutoMerge(true);
        county.setAutoMerge(true);
        department.setAutoMerge(true);
        mSt_lyaj.getConfig().setShowXSequence(false); // X序号列不显示
        mSt_lyaj.getConfig().setFixedXSequence(true); // X序号列固定
        mSt_lyaj.getConfig().setShowYSequence(true);
        mSt_lyaj.getConfig().setFixedYSequence(true);

        mSt_lyaj.getConfig().setContentCellBackgroundFormat(new BaseCellBackgroundFormat<CellInfo>() {
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
