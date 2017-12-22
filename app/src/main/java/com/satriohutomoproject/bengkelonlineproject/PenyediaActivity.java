package com.satriohutomoproject.bengkelonlineproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by aura comp on 5/26/2017.
 */

public class PenyediaActivity extends Activity {

    TextView NamaUserBengkel;
    TextView NamaBengkel;
    TextView AlamatBengkel;
    TextView NomerBengkel;
    ImageView ImageUser;

    int[] gambar={R.drawable.gambar1, R.drawable.gambar2, R.drawable.gambar3, R.drawable.gambar4, R.drawable.gambar5,R.drawable.gambar6};
    String[] Nama={"Hanindita Satrio","Bagus Andi","Caesar Malta","Amar Nuruddin","Ezra Uvidityan","Nindya Kharisma"};
    String[] Alamat={"Jl. KH Muhdi, Corongan, Depok, Sleman","Jl. HR.Benyamin, Pundong , Bantul","Jl. Raya Barat, Wangon, Gunung Kidul","Jl. Patriot, Godean, Bantul","Jl. Patimura, Kota Gede, Sleman","Jl. Ahmad Dahlan, Kota, Kraton"};
    String[] Nomer={"089666076780","087655123987","081227987665","0859298776009","089601941287","088866711443"};


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_penyedia);
        NamaUserBengkel=(TextView)findViewById(R.id.namauser_bengkel);
        NamaBengkel=(TextView)findViewById(R.id.nama_bengkel);
        AlamatBengkel=(TextView)findViewById(R.id.alamatuser_bengkel_lengkap);
        NomerBengkel=(TextView)findViewById(R.id.nomeruser_bengkel);
        ImageUser=(ImageView)findViewById(R.id.image_user_bengkel);

        Intent intentdata=getIntent();
        String ambilnamabengkel=intentdata.getExtras().getString("key_nama");

        NamaBengkel.setText(ambilnamabengkel);

        if (ambilnamabengkel.equals("Bengkel Maju Lancar")){
            NamaUserBengkel.setText(Nama[0]);
            AlamatBengkel.setText(Alamat[0]);
            NomerBengkel.setText(Nomer[0]);
            ImageUser.setImageDrawable(getResources().getDrawable(gambar[0]));
        }else if (ambilnamabengkel.equals("Bengkel Lancar Jaya")){
            NamaUserBengkel.setText(Nama[1]);
            AlamatBengkel.setText(Alamat[1]);
            NomerBengkel.setText(Nomer[1]);
            ImageUser.setImageDrawable(getResources().getDrawable(gambar[1]));
        }else if (ambilnamabengkel.equals("Bengkel Jaya Kusuma")){
            NamaUserBengkel.setText(Nama[2]);
            AlamatBengkel.setText(Alamat[2]);
            NomerBengkel.setText(Nomer[2]);
            ImageUser.setImageDrawable(getResources().getDrawable(gambar[2]));
        }else if (ambilnamabengkel.equals("Bengkel Kusuma Negara")){
            NamaUserBengkel.setText(Nama[3]);
            AlamatBengkel.setText(Alamat[3]);
            NomerBengkel.setText(Nomer[3]);
            ImageUser.setImageDrawable(getResources().getDrawable(gambar[3]));
        }else if (ambilnamabengkel.equals("Bengkel Negara Motor")){
            NamaUserBengkel.setText(Nama[4]);
            AlamatBengkel.setText(Alamat[4]);
            NomerBengkel.setText(Nomer[4]);
            ImageUser.setImageDrawable(getResources().getDrawable(gambar[4]));
        }else {
            NamaUserBengkel.setText(Nama[5]);
            AlamatBengkel.setText(Alamat[5]);
            NomerBengkel.setText(Nomer[5]);
            ImageUser.setImageDrawable(getResources().getDrawable(gambar[5]));
        }
    }
}
