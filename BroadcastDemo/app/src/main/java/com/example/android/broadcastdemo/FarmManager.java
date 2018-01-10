package com.example.android.broadcastdemo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Created by Anvit on 3/13/2017.
 */

public class FarmManager extends BroadcastReceiver{
    @Override
    public void onReceive(Context context, Intent intent) {

        if(intent.getAction().equals("android.intent.MY_INTENT_RESPONSE")) {

            TempHumidity.flag = true;
            TempHumidity.fan_status = intent.getExtras().getString("fan");
            TempHumidity.sprinkler_status = intent.getExtras().getString("sprinkler");

        }

    }
}
