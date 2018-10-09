package com.example.lutfillahmafazi.hitungluasv2;

import android.renderscript.Sampler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SegitigaActivity extends AppCompatActivity {

    EditText edtAlas;
    EditText edtTinggi;
    TextView txtHasil;
    Button btnHitung;
    Double hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);

        edtAlas = findViewById(R.id.edtAlas);
        edtTinggi = findViewById(R.id.edtAlas);
        txtHasil = findViewById(R.id.txtHasil);
        btnHitung = findViewById(R.id.btnHitung);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer alas = Integer.valueOf(edtAlas.getText().toString());
                Integer tinggi = Integer.valueOf(edtTinggi.getText().toString());

                hitungLuasLingkaran(alas,tinggi);
            }
        });
    }

    private void hitungLuasLingkaran(Integer alas, Integer tinggi) {
        hasil = 0.5 * alas * tinggi;

        txtHasil.setText(String.valueOf(hasil));
    }
}
