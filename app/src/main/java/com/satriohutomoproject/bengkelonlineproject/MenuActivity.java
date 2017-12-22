package com.satriohutomoproject.bengkelonlineproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by aura comp on 5/26/2017.
 */

public class MenuActivity extends Activity {
    Button butonmaps,butonkeluhan,buttonlist;
    EditText etkeluhan;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        butonmaps=(Button)findViewById(R.id.button_map);
        butonkeluhan=(Button)findViewById(R.id.button_keluhan);
        etkeluhan=(EditText)findViewById(R.id.textedit_keluhan);
        buttonlist=(Button)findViewById(R.id.button_list);

        buttonlist.setOnClickListener(buttonlistclicked);
        butonmaps.setOnClickListener(buttonmapcliked);
        butonkeluhan.setOnClickListener(buttonkeluhancliked);
    }
    View.OnClickListener buttonkeluhancliked=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Toast.makeText(getBaseContext(),"Keluhan Akan Anda Segera di Tindak Lanjuti", Toast.LENGTH_SHORT).show();
            etkeluhan.setText("");
        }
    };
    View.OnClickListener buttonmapcliked=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            gotomaps();
        }
    };
    View.OnClickListener buttonlistclicked=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            gotolist();
        }
    };
    public void  gotomaps(){
        Intent intenttomaps=new Intent(this,MapsActivity.class);
        startActivity(intenttomaps);
    }
    public void gotolist(){
        Intent intenttolist=new Intent(this,MainActivity.class);
        startActivity(intenttolist);
    }
}
