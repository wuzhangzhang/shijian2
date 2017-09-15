package com.example.wuzhangzhang.shijian2;
import android.content.Intent;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.w3c.dom.Text;

import static android.R.attr.button;
import static android.R.attr.name;
import static android.R.attr.text;
import static android.R.id.text1;
import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.asd);
        Button button1 = (Button) findViewById(R.id.gonext);
        final EditText text = (EditText) findViewById(R.id.firstText);
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent=
                        new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("zz",text.getText().toString());


                startActivityForResult(intent,0);

            }


        });
    }
    protected void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==0 && resultCode==0){
            String str=data.getStringExtra("result");
            Toast.makeText(this,str,Toast.LENGTH_LONG).show();
        }}






}