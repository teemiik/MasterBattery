package com.masterclean.system.app;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;

import com.system.app.R;

import com.masterclean.system.app.Fragments.PhoneBooster;

public final class BoosterAlarm extends BroadcastReceiver {
    SharedPreferences.Editor editor;
    SharedPreferences sharedpreferences;
    @Override
    public void onReceive(Context context, Intent intent) {

        sharedpreferences = context.getSharedPreferences("waseem", Context.MODE_PRIVATE);
//        Toast.makeText(context, "Alarm worked.", Toast.LENGTH_LONG).show();



        /// when memory is orveloaded or increased


        editor = sharedpreferences.edit();
        editor.putString("booster", "1");
        editor.commit();

        try {
            PhoneBooster.optimizebutton.setBackgroundResource(0);
            PhoneBooster.optimizebutton.setImageResource(0);
            PhoneBooster.optimizebutton.setImageResource(R.drawable.optimize);
        }
        catch(Exception e)
        {

        }

    }
}
