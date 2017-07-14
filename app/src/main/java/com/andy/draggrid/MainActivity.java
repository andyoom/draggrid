package com.andy.draggrid;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.andy.library.ChannelActivity;
import com.andy.library.ChannelBean;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onClick(View v) {
        List<ChannelBean> list=new ArrayList<>();
        for(int i=0;i<10;i++){
            ChannelBean bean1 = new ChannelBean("item-"+i,i<5?true:false);
            list.add(bean1);
        }

        ChannelActivity.startChannelActivity(this,list);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Log.e("onActivityResult", "onActivityResult: "+data.getStringExtra("json") );
    }
}
