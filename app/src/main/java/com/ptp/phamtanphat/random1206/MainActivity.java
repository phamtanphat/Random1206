package com.ptp.phamtanphat.random1206;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random random = new Random();

        //Bieu thuc su dung toan tu cong thi se hieu rang bieu thuc noi chuoi voi nhau
//        0 10;
//        5 -10;
//        0 - (kc - 1);
//        String ketqua = random.nextInt(16) + 5 + "";


        for (int i = 0 ; i < 20 ; i++){
            String ketqua2 = random.nextInt(15) + 5 + "";
            Log.d("BBB",ketqua2);
        }
//        Toast.makeText(this, ketqua , Toast.LENGTH_SHORT).show();
//
//        Log.d("BBB",ketqua2);
    }
}
