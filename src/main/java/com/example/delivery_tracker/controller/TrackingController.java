package com.example.delivery_tracker.controller;

import com.example.delivery_tracker.model.TrackingRequest;
import com.example.delivery_tracker.model.TrackingResponse;
import com.example.delivery_tracker.service.TrackingService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/tracking")
public class TrackingController {

    private final TrackingService trackingService;

    public TrackingController(TrackingService trackingService) {
        this.trackingService = trackingService;
    }

    @PostMapping
    public TrackingResponse track(@RequestBody TrackingRequest request) {
        return trackingService.track(request.getTrackingNumber());
    }

}
