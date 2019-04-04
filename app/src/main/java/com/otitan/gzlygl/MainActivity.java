package com.otitan.gzlygl;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.otitan.gzlygl.activity.DqzzActivity;
import com.otitan.gzlygl.activity.GzlyActivity;
import com.otitan.gzlygl.activity.JbqkActivity;
import com.otitan.gzlygl.activity.LyajActivity;
import com.otitan.gzlygl.activity.LykjActivity;
import com.otitan.gzlygl.activity.LyppActivity;
import com.otitan.gzlygl.activity.LyzhActivity;
import com.otitan.gzlygl.activity.LyzjActivity;
import com.otitan.gzlygl.activity.RyjgActivity;
import com.otitan.gzlygl.activity.ZdgzActivity;
import com.otitan.gzlygl.adapter.RecycleAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.rv_btn)
    RecyclerView mRv_btn;

    private Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        mContext = MainActivity.this;

        initView();
    }

    private void initView() {
        List<String> titleList = new ArrayList<>();
        List<Integer> picList = new ArrayList<>();

        titleList.add("林业基本情况");
        picList.add(R.drawable.pic_index_jbqk);
        titleList.add("人员结构基本情况");
        picList.add(R.drawable.pic_index_ryjg);
        titleList.add("重点工作目标");
        picList.add(R.drawable.pic_index_zdgz);
        titleList.add("林业资金投入统计");
        picList.add(R.drawable.pic_index_zjtr);
        titleList.add("林业案件统计");
        picList.add(R.drawable.pic_index_ajtj);
        titleList.add("林业品牌建设");
        picList.add(R.drawable.pic_index_lypp);
        titleList.add("林业灾害情况");
        picList.add(R.drawable.pic_index_lyzh);
        titleList.add("林业科技情况");
        picList.add(R.drawable.pic_index_lykj);
        titleList.add("党群组织建设");
        picList.add(R.drawable.pic_index_dqzz);
        titleList.add("贵州林业横向对比情况");
        picList.add(R.drawable.pic_index_gzly);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(mContext, 2);
        mRv_btn.setLayoutManager(gridLayoutManager);
        mRv_btn.setHasFixedSize(true);
        RecycleAdapter recycleAdapter = new RecycleAdapter(mContext, titleList, picList);
        mRv_btn.setAdapter(recycleAdapter);
        DividerGridItemDecoration decoration = new DividerGridItemDecoration(mContext);
        mRv_btn.addItemDecoration(decoration);
        recycleAdapter.setOnItemClickListener(new RecycleAdapter.OnItemRecycleListener() {
            @Override
            public void onItemClick(View view, String str) {
                switch (view.getId()) {
                    case R.drawable.pic_index_jbqk: // 林业基本情况
                        startActivity(new Intent(mContext, JbqkActivity.class));
                        break;
                    case R.drawable.pic_index_ryjg: // 人员结构基本情况
                        startActivity(new Intent(mContext, RyjgActivity.class));
                        break;
                    case R.drawable.pic_index_zdgz: // 重点工作目标
                        startActivity(new Intent(mContext, ZdgzActivity.class));
                        break;
                    case R.drawable.pic_index_zjtr: // 林业资金投入统计
                        startActivity(new Intent(mContext, LyzjActivity.class));
                        break;
                    case R.drawable.pic_index_ajtj: // 林业案件统计
                        startActivity(new Intent(mContext, LyajActivity.class));
                        break;
                    case R.drawable.pic_index_lypp: // 林业品牌建设
                        startActivity(new Intent(mContext, LyppActivity.class));
                        break;
                    case R.drawable.pic_index_lyzh: // 林业灾害情况
                        startActivity(new Intent(mContext, LyzhActivity.class));
                        break;
                    case R.drawable.pic_index_lykj: // 林业科技情况
                        startActivity(new Intent(mContext, LykjActivity.class));
                        break;
                    case R.drawable.pic_index_dqzz: // 党群组织建设
                        startActivity(new Intent(mContext, DqzzActivity.class));
                        break;
                    case R.drawable.pic_index_gzly: // 贵州林业横向对比情况
                        startActivity(new Intent(mContext, GzlyActivity.class));
                        break;
                }
            }
        });
    }
}
