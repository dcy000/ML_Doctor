package com.ml.doctor.adapter;

import android.support.annotation.Nullable;
import android.widget.BaseAdapter;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.ml.doctor.R;
import com.ml.doctor.bean.PatientListBean;

import java.util.List;

/**
 * Created by gzq on 2017/11/21.
 */

public class PatientListAdapter extends BaseQuickAdapter<PatientListBean,BaseViewHolder>{
    public PatientListAdapter(int layoutResId, @Nullable List<PatientListBean> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, PatientListBean item) {
        helper.setText(R.id.name,item.getBname());
        helper.setText(R.id.number,"编号："+item.getBid());
        helper.setText(R.id.disease_history,"病史："+item.getMh());
        helper.setText(R.id.sex,"性别："+item.getSex());
        helper.setText(R.id.age,"年龄："+item.getAge());
        helper.setText(R.id.phone,"电话"+item.getTel());
        helper.setText(R.id.address,"地址："+item.getDz());
        helper.setText(R.id.idcard,"身份证号码："+item.getSfz());
        helper.setText(R.id.instrument_number,"使用仪器编号："+item.getEqid());
    }
}
