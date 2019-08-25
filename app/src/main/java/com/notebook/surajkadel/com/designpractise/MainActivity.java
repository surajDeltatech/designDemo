package com.notebook.surajkadel.com.designpractise;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.notebook.surajkadel.com.designpractise.Adapter.ActivityDesignAdapter;
import com.notebook.surajkadel.com.designpractise.Model.RecyclerDetail;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    Button go;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        go = findViewById(R.id.go);
        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,ActivityDesign.class));
            }
        });




    }
}
