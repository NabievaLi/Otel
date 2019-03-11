package com.example.otel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
    }
    public void catalogclick(View view)
    {
        Intent intent = new Intent(this,Catalog.class);
        startActivity(intent);
    }
    public void clickset(View view)
    {
        Intent intent = new Intent(this,Setting.class);
        startActivity(intent);
    }
}
