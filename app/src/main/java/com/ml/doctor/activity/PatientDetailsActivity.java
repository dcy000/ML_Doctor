package com.ml.doctor.activity;

import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.TextView;

import com.ml.doctor.R;
import com.ml.doctor.adapter.PatientDetailsAdapter;
import com.ml.doctor.bean.PatientDetailsBean;
import com.ml.doctor.bean.PatientListBean;
import com.ml.doctor.call2.NimCallActivity;
import com.ml.doctor.network.NetworkApi;
import com.ml.doctor.network.NetworkManager;
import com.ml.doctor.utils.LocalShared;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by gzq on 2017/11/22.
 * 患者详情页
 */

public class PatientDetailsActivity extends BaseActivity {
    private static String TAG = "PatientDetailsActivity";
    @BindView(R.id.list)
    RecyclerView list;

    @BindView(R.id.doctor)
    TextView doctor;
    @BindView(R.id.sufferer)
    TextView sufferer;
    @BindView(R.id.machine)
    TextView machine;
    @BindView(R.id.height)
    TextView height;
    @BindView(R.id.weight)
    TextView weight;
    @BindView(R.id.blood_type)
    TextView bloodType;
    @BindView(R.id.diet)
    TextView diet;
    @BindView(R.id.smoke)
    TextView smoke;
    @BindView(R.id.drink)
    TextView drink;
    @BindView(R.id.motion)
    TextView motion;

    private int limit = 10;
    private int start_index = 0, end_index = 9;
    private PatientListBean patient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_detail);
        ButterKnife.bind(this);
        patient = getIntent().getParcelableExtra("data");
        setHat();
        setData();
        getData();
    }

    private void setData() {
        doctor.setText("签约医生\n"+ LocalShared.getInstance(this).getUserNick());
        sufferer.setText("签约患者\n"+patient.getBname());
        machine.setText("签约机器\n"+patient.getEqid());
        height.setText("患者身高："+patient.getHeight()+"cm");
        weight.setText("患者体重："+patient.getWeight()+"Kg");
        bloodType.setText("患者血型："+patient.getBlood_type());
        String eating="",smoking="",drinking="",motioning="";
        switch (patient.getEating_habits()){
            case "1":
                eating="荤素搭配";
                break;
            case "2":
                eating="偏好吃荤";
                break;
            case "3":
                eating="偏好吃素";
                break;
            case "4":
                eating="偏好吃咸";
                break;
            case "5":
                eating="偏好油腻";
                break;
            case "6":
                eating="偏好甜食";
                break;
        }
        diet.setText("饮食\n"+eating);

        switch (patient.getSmoke()){
            case "1":
                smoking="经常抽烟";
                break;
            case "2":
                smoking="偶尔抽烟";
                break;
            case "3":
                smoking="从不抽烟";
                break;
        }
        smoke.setText("抽烟\n"+smoking);

        switch (patient.getDrink()){
            case "1":
                drinking="经常喝酒";
                break;
            case "2":
                drinking="偶尔喝酒";
                break;
            case "3":
                drinking="从不喝酒";
                break;
        }
        drink.setText("喝酒\n"+drinking);

        switch (patient.getExercise_habits()){
            case "1":
                motioning="每天一次";
                break;
            case "2":
                motioning="每周几次";
                break;
            case "3":
                motioning="偶尔运动";
                break;
            case "4":
                motioning="从不运动";
                break;
        }
        motion.setText("运动\n"+motioning);
    }

    private void getData() {
        showLoadingDialog();
        NetworkApi.patientDetails(patient.getBid(), start_index, end_index,
                new NetworkManager.SuccessCallback<List<PatientDetailsBean>>() {
                    @Override
                    public void onSuccess(List<PatientDetailsBean> response) {
                        Log.e(TAG, response.toString());
                        setAdapter(response);
                        hideLoadingDialog();
                    }
                }, new NetworkManager.FailedCallback() {
                    @Override
                    public void onFailed(String message) {
                        hideLoadingDialog();
                    }
                });
    }

    private void setAdapter(List<PatientDetailsBean> response) {
        list.setLayoutManager(new LinearLayoutManager(this));
        list.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        list.setAdapter(new PatientDetailsAdapter(R.layout.patient_details_item, response));
    }

    private void setHat() {
        setTopTitle("患者使用详情");
        setRightText("呼叫");
    }

    @Override
    protected void onLeftViewClick() {
        finish();
    }

    @Override
    protected void onRightTextClick() {
        //呼叫
        NimCallActivity.launch(this, "br_12345678912");
    }
}
