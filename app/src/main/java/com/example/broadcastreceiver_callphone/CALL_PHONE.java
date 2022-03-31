package com.example.broadcastreceiver_callphone;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;

import java.net.URL;

public class CALL_PHONE extends BroadcastReceiver {
    private boolean mUsbConnected;
    @Override
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();

        System.out.println(action);
        boolean conectado = intent.getBooleanExtra("connected", false);

        String number="113";
        Uri call = Uri.parse("tel:" + number);
        if (conectado == true) {

            Intent i = new Intent(Intent.ACTION_CALL, call);
            context.startActivity(i);
            Toast.makeText(context, "ha conectado un USB", Toast.LENGTH_LONG).show();
        }
        else{

            Toast.makeText(context, "ha desconectado un USB", Toast.LENGTH_LONG).show();
        }



    }
}
