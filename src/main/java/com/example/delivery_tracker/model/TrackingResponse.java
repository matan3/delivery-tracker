package com.example.delivery_tracker.model;

import java.time.Instant;

public class TrackingResponse {
    private String trackingNumber;
    private String carrier;
    private String status;
    private Instant lastUpdate;

    public TrackingResponse(
            String trackingNumber,
            String carrier,
            String status,
            Instant lastUpdate
    ) {
        this.trackingNumber = trackingNumber;
        this.carrier = carrier;
        this.status = status;
        this.lastUpdate = lastUpdate;
    }

    public String getTrackingNumber() {
        return trackingNumber;
    }

    public String getCarrier() {
        return carrier;
    }

    public String getStatus() {
        return status;
    }

    public Instant getLastUpdate() {
        return lastUpdate;
    }
}
