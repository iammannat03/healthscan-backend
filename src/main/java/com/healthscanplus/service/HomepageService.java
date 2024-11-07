package com.healthscanplus.service;

import com.healthscanplus.constants.HomepageConstants;
import com.healthscanplus.dto.HomepageDTO;
import org.springframework.stereotype.Service;

@Service
public class HomepageService {
    
    public HomepageDTO getHomepageData() {
        return new HomepageDTO(
            HomepageConstants.CATEGORIES,
            HomepageConstants.CAROUSEL_IMAGES
        );
    }
} 