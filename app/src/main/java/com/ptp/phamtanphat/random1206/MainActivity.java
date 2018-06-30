package com.ptp.phamtanphat.random1206;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    EditText edtSomin, edtSomax;
    Button btnRandom, btnAdd;
    TextView txtketqua;
    ArrayList<Integer> mangnumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtSomax = findViewById(R.id.edittextSomax);
        edtSomin = findViewById(R.id.edittextSomin);
        btnRandom = findViewById(R.id.buttonRandom);
        txtketqua = findViewById(R.id.textviewKetqua);
        btnAdd = findViewById(R.id.buttonAddArray);

        mangnumber = new ArrayList<>();

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textsomin = edtSomin.getText().toString();
                String textsomax = edtSomax.getText().toString();

                int somin = Integer.valueOf(textsomin);
                int somax = Integer.valueOf(textsomax);

                if (somin >= somax) {
                    somax = somin + 1;
                }

                for (int i = somin; i <= somax; i++) {
                    mangnumber.add(i);
                }
            }
        });

        btnRandom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random random = new Random();

                int index = random.nextInt(mangnumber.size());
                int value = mangnumber.get(index);
                txtketqua.append(value + " - ");
                mangnumber.remove(index);
            }
        });

    }
}
