package com.news.gymnast.controllers;

import com.news.gymnast.dtos.ActivityDto;
import com.news.gymnast.models.Activity;
import com.news.gymnast.services.ActivityService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class ActivityController {
    @Autowired
    private ActivityService activityService;

    @Operation(summary = "Create an activity.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Activity created successfully.",
                    content = {@Content(mediaType = "application/json", schema = @Schema(implementation = Activity.class))}),
            @ApiResponse(responseCode = "400", description = "Something went wrong.", content = @Content)
    })
    @PostMapping("/activity")
    public ResponseEntity<?> postActivity(ActivityDto dto) {
        ActivityDto created = activityService.postActivity(dto);
        if(created != null) {
            return ResponseEntity.status(HttpStatus.CREATED).body(created);
        }
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Something went wrong.");
    }
}
