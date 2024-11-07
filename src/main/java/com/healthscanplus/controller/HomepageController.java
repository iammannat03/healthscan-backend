package com.healthscanplus.controller;

import com.healthscanplus.dto.HomepageDTO;
import com.healthscanplus.service.HomepageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomepageController {

    @Autowired
    private HomepageService homepageService;

    @GetMapping("/homepage")
    public HomepageDTO getHomepage() {
        return homepageService.getHomepageData();
    }
} 