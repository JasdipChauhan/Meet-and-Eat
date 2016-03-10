package com.jscboy.meetandeat;

import android.content.Context;
import android.os.Bundle;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.nearby.connection.Connections;

public class NearbyClient implements GoogleApiClient.ConnectionCallbacks,
        GoogleApiClient.OnConnectionFailedListener,
        Connections.MessageListener {

    private static NearbyClient nearbyClient;
    private Context mContext;

    public static NearbyClient getClientInstance(Context mContext) {
        if (nearbyClient == null) {
            nearbyClient = new NearbyClient(mContext);
        }
        return nearbyClient;
    }

    private NearbyClient(Context mContext) {
        this.mContext = mContext;
    }

    @Override
    public void onConnected(Bundle bundle) {

    }

    @Override
    public void onConnectionSuspended(int i) {

    }

    @Override
    public void onMessageReceived(String s, byte[] bytes, boolean b) {

    }

    @Override
    public void onDisconnected(String s) {

    }

    @Override
    public void onConnectionFailed(ConnectionResult connectionResult) {

    }
}
