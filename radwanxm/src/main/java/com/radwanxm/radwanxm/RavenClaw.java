package com.radwanxm.radwanxm;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class RavenClaw {
    private static final String TAG = "RavenClaw";

    public static void openApp(Context context){
//        Toast.makeText(context, "HI buddy", Toast.LENGTH_SHORT).show();

        Log.e(TAG, "openApp: "+ context.getClass());
        context.startActivity(new Intent(context, LaunchActivity.class));
        Log.e(TAG, "openApp: " );
    }
}
