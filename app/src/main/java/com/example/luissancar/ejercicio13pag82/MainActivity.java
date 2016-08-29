package com.example.luissancar.ejercicio13pag82;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText et1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1=(EditText)findViewById(R.id.editText);

        SharedPreferences prefe=getSharedPreferences("datos", Context.MODE_PRIVATE);
        et1.setText((prefe.getString("mail","")));
    }



    public void ejecutar(View view){

        SharedPreferences prefe=getSharedPreferences("datos", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor=prefe.edit();
        editor.putString("mail",et1.getText().toString());
        editor.commit();
        finish();
    }
}
