package com.example.aldi.adventureticketing;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import adapter.DisplayList;
import model.Ticket;

public class AdventureMenuActivity extends AppCompatActivity {
    Ticket ticket = new Ticket();
    RecyclerView recyclerView;
    ArrayList<Ticket> tickets;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adventure_menu);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        recyclerView = (RecyclerView) findViewById(R.id.listTicketMotoAdventure);
        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        tickets = new ArrayList<Ticket>();
        String[] images = {"http://cdn2.tstatic.net/style/foto/bank/images/tes-kepribadian-mengetahui-ukuran-kecemasan-dalam-percintaan-lewat-gambar-pertama-yang-dilihat_20180826_141212.jpg","https://cdn0-production-images-kly.akamaized.net/lx4frCrNhu-tEOreV_69_kccAjo=/640x360/smart/filters:quality(75):strip_icc():format(webp)/kly-media-production/medias/2362989/original/033001900_1537355462-apa_yang_salah_dari_foto_ini.jpg6.jpg","https://www.gettyimages.ie/gi-resources/images/Homepage/Hero/UK/CMS_Creative_164657191_Kingfisher.jpg"};

        ticket.setIdTicket("1");
        ticket.setEventName("Tracekcek Event");
        ticket.setCommunity("tracekcek");
        ticket.setLocation("Cicalengka");
        ticket.setDateHeld("19 Februai 2019");
        ticket.setDuration(2);
        ticket.setPrice((long) 300000);
        ticket.setImageEvent(images);

        for (int i = 0; i < 5;i++){
            tickets.add(ticket);
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        DisplayList adapter = new DisplayList(this,tickets);
        recyclerView.setAdapter(adapter);
        recyclerView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(AdventureMenuActivity.this, "clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        finish();
    }
}
