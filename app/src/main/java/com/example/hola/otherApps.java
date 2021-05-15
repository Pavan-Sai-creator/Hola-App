package com.example.hola;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class otherApps extends AppCompatActivity implements Adapter.OnAppListener {

    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;
    List<ModelClass> userList;
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other_apps);

        initData();
        initRecyclerView();
    }

    private void initRecyclerView() {
        recyclerView = findViewById(R.id.recyclerView);
        layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new Adapter(userList,this);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }

    private void initData() {
        userList = new ArrayList<>();
        userList.add(new ModelClass(R.drawable.instagram,"Instagram","_____________________________________"));
        userList.add(new ModelClass(R.drawable.facebook,"Facebook","_____________________________________"));
    }

    @Override
    public void onAppClick(int position) {

        // Toast.makeText(this,"You clicked on "+userList.get(position).getAppName(),Toast.LENGTH_SHORT).show();
        if(position==0){
            Toast.makeText(this,"Opening "+userList.get(position).getAppName(),Toast.LENGTH_SHORT).show();
            Intent browserIntent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/"));
            Intent browserChooserIntent = Intent.createChooser(browserIntent1 , "Choose browser of your choice");
            startActivity(browserChooserIntent );
        }
        if(position==1){
            Toast.makeText(this,"Opening "+userList.get(position).getAppName(),Toast.LENGTH_SHORT).show();
            Intent browserIntent2 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/"));
            Intent browserChooserIntent = Intent.createChooser(browserIntent2 , "Choose browser of your choice");
            startActivity(browserChooserIntent );
        }

    }
}