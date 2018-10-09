package com.example.lutfillahmafazi.hitungluasv2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LuasLingkaranActivity extends AppCompatActivity {

    EditText edtJari;
    TextView txtHasil;
    Button btnHitung;
    Double hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luas_lingkaran);

        edtJari = findViewById(R.id.edtJari);
        txtHasil = findViewById(R.id.txtHasil);
        btnHitung = findViewById(R.id.btnHitung);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer jari = Integer.valueOf(edtJari.getText().toString());

                hitungLuasLingkaran(jari);
            }
        });
    }

    private void hitungLuasLingkaran(Integer jari) {
        hasil = 0.5 * jari * jari;

        txtHasil.setText(String.valueOf(hasil));
    }
}
