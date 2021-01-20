package com.markysproject.parsedatatoanotheractivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class another_activity extends AppCompatActivity {

    TextView parsedDataTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.another_activity);
        receiveData();
    }

    private void receiveData(){
        parsedDataTv = (TextView) findViewById(R.id.parsedDataTv);
        Intent receiveData = getIntent();
        String text = receiveData.getStringExtra("MyStringKey");
        parsedDataTv.setVisibility(View.VISIBLE);
        parsedDataTv.setText("parsed data is:\n"+text);
    }

}