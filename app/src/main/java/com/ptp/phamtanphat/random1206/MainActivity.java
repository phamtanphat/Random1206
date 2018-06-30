package com.ptp.phamtanphat.random1206;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    EditText edtSomin, edtSomax;
    Button btnRandom;
    TextView txtketqua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtSomax = findViewById(R.id.edittextSomax);
        edtSomin = findViewById(R.id.edittextSomin);
        btnRandom = findViewById(R.id.buttonRandom);
        txtketqua = findViewById(R.id.textviewKetqua);

        btnRandom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String textsomin = edtSomin.getText().toString();
                String textsomax = edtSomax.getText().toString();

                int somin = Integer.valueOf(textsomin);
                int somax = Integer.valueOf(textsomax);

                if (somin >= somax) {
                    somax = somin + 1;
                }

                Random random = new Random();

                int ketqua = random.nextInt(somax - somin + 1) + somin;
                txtketqua.append(ketqua + " - ");
            }
        });

    }
}
