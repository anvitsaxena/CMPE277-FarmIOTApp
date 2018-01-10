package com.example.android.farmmanager;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by Anvit on 3/13/2017.
 */

public class FarmMaintenance extends AppCompatActivity {

    Button fan, sprinkler;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.farm_maintenance);

        Intent i = getIntent();

        fan = (Button) findViewById(R.id.button);
        sprinkler = (Button) findViewById(R.id.button2);

        Toast.makeText(getApplication(), " " + i.getStringExtra("fan") + " " + i.getStringExtra("sprinkler"), Toast.LENGTH_LONG).show();

        fan.setText("Fan "+i.getStringExtra("fan"));
        sprinkler.setText("Sprinkler "+i.getStringExtra("sprinkler"));

    }
}
