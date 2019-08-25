package com.notebook.surajkadel.com.designpractise;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ActionBar;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import com.notebook.surajkadel.com.designpractise.Adapter.ActivityDesignAdapter;
import com.notebook.surajkadel.com.designpractise.Model.RecyclerDetail;

import java.util.ArrayList;
import java.util.List;

public class ActivityDesign extends AppCompatActivity {
    Toolbar toolbar;
    private List<RecyclerDetail> recyclerDetails = new ArrayList<>();
    private ActivityDesignAdapter activityDesignAdapter;
    private RecyclerView recyclerView;
    private LinearLayoutManager linearLayoutManager;
    private TextView mytitle;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_design);
        toolbar = findViewById(R.id.toolbar);
        mytitle = toolbar.findViewById(R.id.mytitle);
        mytitle.setText("Bangauluru to chennai");


        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);




        recyclerView = findViewById(R.id.rvRecyclerview);
        activityDesignAdapter = new ActivityDesignAdapter(recyclerDetails);

        linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(activityDesignAdapter);
        addTravelDetail();

    }


    public void addTravelDetail(){

        RecyclerDetail recyclerDetail = new RecyclerDetail("Rest Stop","11:30 pm - 4:40 am"," Travels","Volvo a/c Delux","Express bus","1280","1000");
        recyclerDetails.add(recyclerDetail);

        recyclerDetail = new RecyclerDetail("Second Stop","12:30 pm - 4:40 am"," Travels and Tour","Volvo a/c Delux with better sleeper","Express bus","1280","1000");
        recyclerDetails.add(recyclerDetail);


        recyclerDetail = new RecyclerDetail("Starts at Hyderabad","12:30 pm - 4:40 am"," Travels and Tour","Volvo a/c Delux with better sleeper","Express bus","1280","1000");
        recyclerDetails.add(recyclerDetail);

        recyclerDetail = new RecyclerDetail("Second Stop","12:30 pm - 4:40 am"," Travels and Tour","Volvo a/c Delux with better sleeper","Express bus","1280","1000");
        recyclerDetails.add(recyclerDetail);

        recyclerDetail = new RecyclerDetail("Starts at Hyderabad","12:30 pm - 4:40 am"," Travels and Tour","Volvo a/c Delux with better sleeper","Express bus","1280","1000");
        recyclerDetails.add(recyclerDetail);





    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int items=item.getItemId();
        switch (items) {
            case R.id.next:
                Toast.makeText(this, "next", Toast.LENGTH_SHORT).show();
                break;

            case R.id.previous:
                Toast.makeText(this, "Previous", Toast.LENGTH_SHORT).show();
                break;
            default:

                finish();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }
}

