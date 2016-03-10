package com.jscboy.meetandeat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.facebook.FacebookSdk;

public class MainActivity extends AppCompatActivity {

    private NeabyHost nearbyHost;
    private NearbyClient nearbyClient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nearbyHost = NeabyHost.getHostInstance(this);
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
