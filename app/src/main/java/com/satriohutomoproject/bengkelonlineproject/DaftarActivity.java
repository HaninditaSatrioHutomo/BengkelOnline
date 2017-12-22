package com.satriohutomoproject.bengkelonlineproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by aura comp on 5/26/2017.
 */

public class DaftarActivity extends Activity {
    DatabaseHelper myDb;
    EditText editnama, editalamat, editnomer, editemail, editsandi;
    Button buttoninsertpengguna;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar);
        myDb=new DatabaseHelper(this);

        editnama=(EditText)findViewById(R.id.nama_user);
        editalamat=(EditText)findViewById(R.id.alamat_user);
        editnomer=(EditText)findViewById(R.id.no_user);
        editemail=(EditText)findViewById(R.id.email_user);
        editsandi=(EditText)findViewById(R.id.sandi_user);
        buttoninsertpengguna=(Button)findViewById(R.id.button_daftarpengguna);

        insertpengguna();
    }
    public void insertpengguna(){
        buttoninsertpengguna.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        boolean isInserted = myDb.insertData(editnama.getText().toString(),
                                editalamat.getText().toString(),
                                editnomer.getText().toString(),
                                editemail.getText().toString(),
                                editsandi.getText().toString());
                        if(isInserted==true) {
                            Toast.makeText(DaftarActivity.this, "Data Inserted", Toast.LENGTH_LONG).show();
                            gotomenu();
                        }
                        else
                            Toast.makeText(DaftarActivity.this,"Data Not Inserted",Toast.LENGTH_LONG).show();
                    }
                }

        );
    }
    public void  gotomenu(){
        Intent intenttomenu=new Intent(this,MenuActivity.class);
        startActivity(intenttomenu);
        finish();
    }
}
