package id.lombokit.emarkethamzanwadi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DashboardActivity extends AppCompatActivity {

    CardView tentang, profil, sembako, medis, statistik, info, pengaturan;
    ImageView kembali, pemberitahuan;
    TextView judul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        tentang = findViewById(R.id.tentang);
        profil = findViewById(R.id.profil);
        sembako = findViewById(R.id.sembako);
        medis = findViewById(R.id.medis);
        statistik = findViewById(R.id.statistik);
        info = findViewById(R.id.info);

        kembali = findViewById(R.id.back);
        judul = findViewById(R.id.title);
        pemberitahuan = findViewById(R.id.notif);

        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), DashboardActivity.class));
            }
        });

        pemberitahuan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), NotificationActivity.class));
            }
        });

        judul.setText((CharSequence) "Dashboard");

        tentang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), AboutActivity.class));
            }
        });

        profil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), ProfileActivity.class));
            }
        });

        sembako.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), ListSembakoActivity.class));
            }
        });

        statistik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), StatisticActivity.class));
            }
        });

        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), InfoActivity.class));
            }
        });

    }
}
