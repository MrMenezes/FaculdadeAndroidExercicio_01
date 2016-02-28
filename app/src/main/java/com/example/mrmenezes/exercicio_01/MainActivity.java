package com.example.mrmenezes.exercicio_01;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView codeOp = (TextView) findViewById (R.id.textViewCod_op);
        TextView idCod = (TextView) findViewById (R.id.textViewIdCod);
        TextView nameOp = (TextView) findViewById (R.id.textViewNameOp);


        codeOp.setText(getCodeArea());
        idCod.setText(getIdDevice());
        nameOp.setText(getOperatorName());

    }

    private String getCodeArea(){

        TelephonyManager telephonyManager = (TelephonyManager) this.getSystemService(Context.TELEPHONY_SERVICE);

        String number = telephonyManager.getSimOperator();
        Log.d("Number", number);
        return number;
    }

    private String getIdDevice(){

        TelephonyManager telephonyManager = (TelephonyManager) this.getSystemService(Context.TELEPHONY_SERVICE);

        String number = telephonyManager.getDeviceId();
        Log.d("Device",number);
        return number;
    }

    private String getOperatorName(){

        TelephonyManager telephonyManager = (TelephonyManager) this.getSystemService(Context.TELEPHONY_SERVICE);

        String name = telephonyManager.getSimOperatorName();
        Log.d("Sim",name);
        return name;
    }
}
