package com.jscboy.meetandeat;

public class NearbyClient {

    private static NearbyClient nearbyClient;

    public static NearbyClient getNearbyClient() {
        if (nearbyClient == null) {
            nearbyClient = new NearbyClient();
        }
        return nearbyClient;
    }

    private NearbyClient() {

    }
}
