package com.example.android.farmmanager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static String temp;
    public static String hum;
    public static float return_text;
    public static boolean flag = false;
    Button fan, sprinkler;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fan = (Button) findViewById(R.id.button);
        sprinkler = (Button) findViewById(R.id.button2);

        text = (TextView) findViewById(R.id.textView1);

        text.setText("Temperature : "+temp+" & Humidity : "+hum);

        fan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),FarmMaintenance.class);

                intent.putExtra("fan","ON");
                intent.putExtra("sprinkler","OFF");

                startActivity(intent);
            }
        });

        sprinkler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),FarmMaintenance.class);

                intent.putExtra("fan","ON");
                intent.putExtra("sprinkler","ON");

                startActivity(intent);
            }
        });

    }
}
