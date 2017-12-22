package com.satriohutomoproject.bengkelonlineproject;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by aura comp on 5/26/2017.
 */

public class LoginActivity extends Activity {
    DatabaseHelper myDb;
    EditText usernamelogin, sandiuserlogin;
    Button buttonuserlogin, buttonpenyedialogin, buttondaftar;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        myDb=new DatabaseHelper(this);

        usernamelogin=(EditText)findViewById(R.id.username_login);
        sandiuserlogin=(EditText)findViewById(R.id.sandiuser_login);
        buttonuserlogin=(Button)findViewById(R.id.buttonuser_login);
        //buttonpenyedialogin=(Button)findViewById(R.id.buttonuserbengkel_login);
        buttondaftar=(Button)findViewById(R.id.button_daftar);

        buttonuserlogin.setOnClickListener(buttonuserloginclicked);
        //buttonpenyedialogin.setOnClickListener(buttonpenyedialoginclicked);
        buttondaftar.setOnClickListener(buttondaftarclicked);

    }
    View.OnClickListener buttonuserloginclicked=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            validasiform();
        }
    };
    /*View.OnClickListener buttonpenyedialoginclicked=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            validasipenyedia();
        }
    };*/
    View.OnClickListener buttondaftarclicked=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            gotodaftar();
        }
    };
    public  void validasiform(){

        String user=usernamelogin.getText().toString();
        String password=sandiuserlogin.getText().toString();

        Cursor res= myDb.getdata();
        if (res.getCount()==0) {
            return;
        }
        while(res.moveToNext()){
            if(user.equals(res.getString(1))&&password.equals(res.getString(5)))
            {
                gotomenu();
            }
            else
            {
                Toast.makeText(this, "Username dan password tidak sesuai", Toast.LENGTH_LONG).show();
            }
        }
    }
    /*public void validasipenyedia(){
        String userpenyedia=usernamelogin.getText().toString();
        String passwordpenyedia=sandiuserlogin.getText().toString();

        if (userpenyedia.equals("admin") && passwordpenyedia.equals("123456")) {
            gotopenyedia();
        } else {
            Toast.makeText(this, "Username dan password tidak sesuai", Toast.LENGTH_SHORT).show();
        }
    }*/
    public void  gotomenu(){
        Intent intenttomenu=new Intent(this,MenuActivity.class);
        startActivity(intenttomenu);
    }
    /*public void  gotopenyedia(){
        Intent intenttopenyedia=new Intent(this,PenyediaActivity.class);
        startActivity(intenttopenyedia);
    }*/
    public void  gotodaftar(){
        Intent intenttodaftar=new Intent(this,DaftarActivity.class);
        startActivity(intenttodaftar);
    }
}
