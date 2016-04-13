package com.ctproject.iakjakartaselatan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class HitungActivity extends AppCompatActivity {

    private Button tombolHitung, tombolPindah;
    private EditText editPanjang, editLebar;
    private TextView textHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitung);

        editLebar = (EditText) findViewById(R.id.etLebar);
        editPanjang = (EditText) findViewById(R.id.etPanjang);
        tombolHitung = (Button) findViewById(R.id.btHitung);
        tombolPindah = (Button) findViewById(R.id.btPindah);
        textHasil = (TextView) findViewById(R.id.tvHasil);

        tombolHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(editPanjang.getText().length() == 0||editLebar.getText().length() == 0){
                    Toast.makeText(HitungActivity.this, "Silahkan isi dengan benar!", Toast.LENGTH_SHORT).show();
                }
                else {
                    String panjang = editPanjang.getText().toString();
                    String lebar = editLebar.getText().toString();

                    double p = Double.parseDouble(panjang);
                    double l = Double.parseDouble(lebar);
                    double luas = p * l;

                    textHasil.setText("Hasilnya = " + luas);
                    textHasil.setVisibility(textHasil.VISIBLE);
                }
            }
        });

        tombolPindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah;
                pindah = new Intent(HitungActivity.this, FragmentActivity.class);
                HitungActivity.this.startActivity(pindah);
                HitungActivity.this.finish();
            }
        });

    }
}
