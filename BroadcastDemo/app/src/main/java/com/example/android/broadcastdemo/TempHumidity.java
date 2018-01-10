package com.example.android.broadcastdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class TempHumidity extends AppCompatActivity {

    public static String fan_status;
    public static String sprinkler_status;

    public static boolean flag = false;
    Button set, cancel;
    EditText temprature, humidity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temp_humidity);

        set=(Button)findViewById(R.id.button);
        cancel=(Button)findViewById(R.id.button2);

        temprature = (EditText)findViewById(R.id.editText);
        humidity = (EditText) findViewById(R.id.editText2);

        set.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction("android.intent.MY_INTENT_REQUEST");

                intent.putExtra("Temperature",temprature.getText().toString());
                intent.putExtra("Humidity",humidity.getText().toString());

                sendBroadcast(intent);
            }
        });
    }
}
