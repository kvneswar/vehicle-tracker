package com.akshar.vehicletracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View.OnClickListener driverOnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, DriverMapActivity.class));
            }
        };

        Button driverButton = (Button) findViewById(R.id.driverButton);
        driverButton.setOnClickListener(driverOnClickListener);




        View.OnClickListener trackerOnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, TrackerMapActivity.class));
            }
        };

        Button trackerButton = (Button) findViewById(R.id.trackerButton);
        trackerButton.setOnClickListener(trackerOnClickListener);
    }
}
