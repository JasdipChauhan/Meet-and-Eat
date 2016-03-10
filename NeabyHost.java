package com.jscboy.meetandeat;

public class NeabyHost {

    private static NeabyHost nearbyHost;

    public static NeabyHost getNearbyHost() {
        if (nearbyHost == null) {
            nearbyHost = new NeabyHost();
        }
        return nearbyHost;
    }

    private NeabyHost() {

    }
}
