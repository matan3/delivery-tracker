package com.example.delivery_tracker.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.util.Map;

@RestController
@RequestMapping("/api/tracking")
public class TrackingController {

    @PostMapping
    public Map<String, Object> track(@RequestBody Map<String, String> request) {
        String carrier = request.get("carrier");
        String trackingNumber = request.get("trackingNumber");

        // למען ההתחלה – סטטוס מדומה
        return Map.of(
                "carrier", carrier,
                "trackingNumber", trackingNumber,
                "status", "IN_TRANSIT",
                "location", "Tel Aviv",
                "lastUpdated", Instant.now().toString()
        );
    }

}
