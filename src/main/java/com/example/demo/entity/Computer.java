package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Computer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int computerID;
    private String brand;
    private String model;
    private float screenSize;
    private float screenResolution;
    private String processor;
    private int memory;
    private float storageCapacity;
    private float price;




    @OneToMany(targetEntity = Review.class, cascade = CascadeType.ALL)
    private List<Review> reviews;

    @OneToMany(mappedBy= "computer", cascade= CascadeType.ALL)
    private List<ComputerFeature> computerFeatures;
}
