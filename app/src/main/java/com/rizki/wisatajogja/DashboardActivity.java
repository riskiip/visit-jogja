package com.rizki.wisatajogja;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class DashboardActivity extends AppCompatActivity {

    Button kenalan, visit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        kenalan = findViewById(R.id.btnKenalan);
        visit = findViewById(R.id.btnVisit);

        mengenal();
        jalan();
    }

    private void jalan() {
        visit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(DashboardActivity.this, MainActivity.class);
                startActivity(b);
            }
        });
    }

    private void mengenal() {
        kenalan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(DashboardActivity.this, AboutActivity.class);
                startActivity(b);
            }
        });
    }
}
