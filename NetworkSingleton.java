package com.jscboy.meetandeat;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public class NetworkSingleton {

    private static NetworkSingleton network;
    private Context mContext;

    public static NetworkSingleton getNetworkInstance(Context mContext) {
        if (network == null) {
            network = new NetworkSingleton(mContext);
        }
        return network;
    }

    private NetworkSingleton(Context mContext) {
        this.mContext = mContext;
    }

    private static int[] NETWORK_TYPES = {ConnectivityManager.TYPE_WIFI,
            ConnectivityManager.TYPE_ETHERNET};

    private boolean isConnectedToNetwork() {
        ConnectivityManager connManager =
                (ConnectivityManager) mContext.getSystemService(Context.CONNECTIVITY_SERVICE);
        for (int networkType : NETWORK_TYPES) {
            NetworkInfo info = connManager.getNetworkInfo(networkType);
            if (info != null && info.isConnectedOrConnecting()) {
                return true;
            }
        }
        return false;
    }
}
