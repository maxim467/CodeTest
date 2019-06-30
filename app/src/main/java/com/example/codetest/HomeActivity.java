package com.example.codetest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Welcoming class to the App
 */
public class HomeActivity extends Activity {

    /**
     * Button To show the list
     */
    Button btnListVideos;

    /**
     * Exit Button
     */
    Button btnExit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        initViews();
    }

    /**
     * Initialize the views
     */
    private void initViews() {

        btnListVideos = findViewById(R.id.btn_list_videos);
        btnListVideos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HomeActivity.this, VideoListActivity.class);
                startActivity(i);
            }
        });

        btnExit = findViewById(R.id.btn_exit);
        btnExit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                finish();
                System.exit(0);
            }
        });
    }
}
