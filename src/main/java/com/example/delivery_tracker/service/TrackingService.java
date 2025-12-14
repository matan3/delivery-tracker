package com.example.delivery_tracker.service;

import com.example.delivery_tracker.model.TrackingResponse;
import org.springframework.stereotype.Service;

import java.time.Instant;

@Service
public class TrackingService {

    public TrackingResponse track(String trackingNumber) {
        return new TrackingResponse(
                trackingNumber,
                "EXELOT",
                "IN_TRANSIT",
                Instant.now()
        );
    }

}
