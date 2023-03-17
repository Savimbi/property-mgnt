package com.example.iwawe.dto;

import lombok.Data;

@Data
public class PropertyDTO {

    private String title;
    private String description;
    private String ownerName;
    private String ownerEmail;
    private Double price;
    private String address;
}
