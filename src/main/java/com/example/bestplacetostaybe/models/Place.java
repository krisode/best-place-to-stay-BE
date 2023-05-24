package com.example.bestplacetostaybe.models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Place {
    private String latitude;
    private String longitude;
}
