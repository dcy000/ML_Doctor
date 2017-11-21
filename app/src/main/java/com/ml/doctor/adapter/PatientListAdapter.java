package com.ml.doctor.adapter;

import android.support.annotation.Nullable;
import android.widget.BaseAdapter;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
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

    }
}
