package com.ml.doctor.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import com.ml.doctor.R;
import com.ml.doctor.bean.LoginBean;
import com.ml.doctor.network.NetworkApi;
import com.ml.doctor.network.NetworkManager;
import com.ml.doctor.utils.LocalShared;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    private int limit=10;
    private int start_index=1,end_index=10;
    @BindView(R.id.list)
    RecyclerView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        setAdapter();
        getData();
    }
    //请求网络数据
    private void getData() {
        NetworkApi.patientList(LocalShared.getInstance(this).getUserId(), "", start_index, end_index, new NetworkManager.SuccessCallback<LoginBean>() {
            @Override
            public void onSuccess(LoginBean response) {
                start_index+=limit;
                end_index+=limit;

            }
        }, new NetworkManager.FailedCallback() {
            @Override
            public void onFailed(String message) {

            }
        });
    }

    private void setAdapter() {
//        list.setAdapter(new PatientListAdapter());
    }
}
