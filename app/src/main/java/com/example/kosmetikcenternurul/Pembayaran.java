package com.example.kosmetikcenternurul;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class Pembayaran extends AppCompatActivity {

    Spinner bank;
    TextView rek;
    Button bayar;

    String itemBank;
    String nm,nmr,almt,wkt,via,ttl,barang,jumlah,ukuran;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pembayaran);

        bank = findViewById(R.id.PBank);
        rek = findViewById(R.id.PNoRekening);
        bayar = findViewById(R.id.PBayar);

        Intent data = getIntent();
        nm = data.getStringExtra("nama");
        nmr = data.getStringExtra("nomor");
        almt = data.getStringExtra("alamat");
        wkt = data.getStringExtra("waktu");
        via = data.getStringExtra("via");
        ttl = data.getStringExtra("total");
        barang = data.getStringExtra("barang");
        jumlah = data.getStringExtra("jumlah");
        ukuran = data.getStringExtra("ukuran");

        bank.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                itemBank = (String) parent.getItemAtPosition(position);
                //Toast.makeText(mukena1.this,""+item,Toast.LENGTH_LONG).show();
                if(itemBank.equals("BRI")){
                    rek.setText("008899007700 ( Nurul Pradani)");
                } else if(itemBank.equals("BNI")){
                    rek.setText("008899007711 ( Nurul Pradani)");
                } else if(itemBank.equals("MANDIRI")){
                    rek.setText("008899007722 ( Nurul Pradani)");
                }
            }
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        bayar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(Pembayaran.this, selesai.class);
                intent.putExtra("nama",nm);
                intent.putExtra("nomor",nmr);
                intent.putExtra("alamat",almt);
                intent.putExtra("waktu",wkt);
                intent.putExtra("via",via);
                intent.putExtra("bank",itemBank);
                intent.putExtra("total",ttl);
                intent.putExtra("barang",barang);
                intent.putExtra("ukuran",ukuran);
                intent.putExtra("jumlah",jumlah);
                startActivity(intent);
            }


        });

    }
}
