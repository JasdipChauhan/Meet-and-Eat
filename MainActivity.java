package com.jscboy.meetandeat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private NearbyHost nearbyHost;
    private NearbyClient nearbyClient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nearbyHost = NearbyHost.getHostInstance(this);
        nearbyClient = NearbyClient.getClientInstance(this);
    }

    @Override
    protected void onStop() {
        super.onStop();
        if (nearbyHost != null) {
            nearbyHost.disconnectGoogleAPI();
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        if (nearbyHost != null) {
            nearbyHost.connectGoogleAPI();
        }
    }
}
