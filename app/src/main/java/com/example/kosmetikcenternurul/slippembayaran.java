package com.example.kosmetikcenternurul;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class slippembayaran extends AppCompatActivity {

    String nm,nmr,almt,wkt,via,bank,ttl,barang,jumlah;

    TextView slip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slippembayaran);

        slip = findViewById(R.id.SPrint);

        Intent data = getIntent();
        nm = data.getStringExtra("nama");
        nmr = data.getStringExtra("nomor");
        almt = data.getStringExtra("alamat");
        wkt = data.getStringExtra("waktu");
        via = data.getStringExtra("via");
        bank = data.getStringExtra("bank");
        ttl = data.getStringExtra("total");
        barang = data.getStringExtra("barang");
        jumlah = data.getStringExtra("jumlah");

        slip.setText("BUKTI PEMBAYARAN \n"+
                "Kosmetik Center\n"+
                "\n"+
                "\n"+
                "\n"+
                "Nama : "+nm+"\n"+
                "Nomer : "+nmr+"\n"+
                "Alamat : "+almt+"\n"+
                "Waktu : "+wkt+"\n"+
                "VIA : "+via+"\n"+
                "Bank : "+bank+"\n"+
                "Total : "+ttl+"\n"+
                "Barang : "+barang+"\n"+
                "Jumlah : "+jumlah+"\n"+
                "\n"+
                "\n"+
                "Terima Kasih Telah Belanja :)");
    }
}
