package com.univ.yanbua;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.view.View;
import android.widget.Button;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    private RecycleAdapter rAdapter;


    private ArrayList<String> listGambar;
    Button btnJilid1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView rView = (RecyclerView) findViewById(R.id.my_recycler_view);
        rView.setHasFixedSize(true);

        LinearLayoutManager aini = new LinearLayoutManager(this);

        aini.setOrientation(LinearLayoutManager.VERTICAL);

        rView.setLayoutManager(aini);

        ambidata();
        rAdapter=new RecycleAdapter(this,listGambar);
        rView.setAdapter(rAdapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void ambidata(){
        listGambar= new ArrayList<String>();

        listGambar.add("cover1");


        btnJilid1 = (Button) findViewById(R.id.jilid1);

        btnJilid1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(MainActivity.this,JilidSatuActivity.class);
                startActivity(i);

            }


    public void btn_jld1(View view) {
    }
        }

