package com.markysproject.parsedatatoanotheractivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView activity1Tv;
    Button nextActivityBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setIt();
    }

    public void goToNextActivity(View view){
        Intent senderIntent = new Intent(MainActivity.this, another_activity.class);
        senderIntent.putExtra("MyStringKey", "This String data Is parsed From activity 1");
        startActivity(senderIntent);
    }

    private void setIt(){
        activity1Tv = (TextView) findViewById(R.id.activity1Tv);
        nextActivityBtn = (Button) findViewById(R.id.nextActivityBtn);
    }
}