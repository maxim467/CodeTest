package com.example.codetest;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class DetailVideoActivity extends AppCompatActivity {


    String videoId;

    String videoText;

    TextView tvTitle;

    TextView tvDate;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_video);

        Bundle extras = getIntent().getExtras();

        if(extras != null) {
            videoId = extras.getString("id");
            videoText = extras.getString("name");
        }

        initviews();

    }

    private void initviews() {

        tvTitle  = findViewById(R.id.tv_title_identifier);
        tvTitle.setText(videoText);


    }

}
