package com.satriohutomoproject.bengkelonlineproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by aura comp on 12/2/2017.
 */

public class MainActivity extends AppCompatActivity {

    ListView listView;
    List<PojoJavaList> listString;
    PojoJavaList pojoJavaList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listString = new ArrayList<PojoJavaList>();

        listString.add(new PojoJavaList("Bengkel Maju Lancar", this.getResources().getColor(android.R.color.holo_blue_bright)));
        listString.add(new PojoJavaList("Bengkel Lancar Jaya", this.getResources().getColor(android.R.color.holo_blue_dark)));
        listString.add(new PojoJavaList("Bengkel Jaya Kusuma", this.getResources().getColor(android.R.color.holo_blue_light)));
        listString.add(new PojoJavaList("Bengkel Kusuma Negara", this.getResources().getColor(android.R.color.holo_orange_dark)));
        listString.add(new PojoJavaList("Bengkel Negara Motor", this.getResources().getColor(android.R.color.holo_orange_light)));
        listString.add(new PojoJavaList("Bengkel Motor Less", this.getResources().getColor(android.R.color.holo_red_dark)));

        listView = (ListView) findViewById(R.id.list_item_football);

        ListViewAdapter listViewAdapter = new ListViewAdapter(listString, getBaseContext());

        listView.setAdapter(listViewAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                switch (position){
                    case 0:
                        Toast.makeText(getBaseContext(),listString.get(position).getNamaClub() , Toast.LENGTH_SHORT).show();
                        gotodetail(listString.get(position).getNamaClub());
                        break;
                    case 1:
                        Toast.makeText(getBaseContext(), listString.get(position).getNamaClub(), Toast.LENGTH_SHORT).show();
                        gotodetail(listString.get(position).getNamaClub());
                        break;
                    case 2:
                        Toast.makeText(getBaseContext(), listString.get(position).getNamaClub(), Toast.LENGTH_SHORT).show();
                        gotodetail(listString.get(position).getNamaClub());
                        break;
                    case 3:
                        Toast.makeText(getBaseContext(), listString.get(position).getNamaClub(), Toast.LENGTH_SHORT).show();
                        gotodetail(listString.get(position).getNamaClub());
                        break;
                    case 4:
                        Toast.makeText(getBaseContext(), listString.get(position).getNamaClub(), Toast.LENGTH_SHORT).show();
                        gotodetail(listString.get(position).getNamaClub());
                        break;
                    case 5:
                        Toast.makeText(getBaseContext(), listString.get(position).getNamaClub(), Toast.LENGTH_SHORT).show();
                        gotodetail(listString.get(position).getNamaClub());
                        break;
                }
            }
        });
    }
    public void gotodetail(String kirimnama){
        Intent intenttodetail=new Intent(this,PenyediaActivity.class);
        intenttodetail.putExtra("key_nama",kirimnama);
        intenttodetail.putExtra("key_nama",kirimnama);
        startActivity(intenttodetail);
    }
}
