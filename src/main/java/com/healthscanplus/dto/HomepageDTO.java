package com.healthscanplus.dto;

import lombok.Data;
import lombok.AllArgsConstructor;
import java.util.List;

@Data
@AllArgsConstructor
public class HomepageDTO {
    private List<String> categories;
    private List<String> carouselImg;
} 