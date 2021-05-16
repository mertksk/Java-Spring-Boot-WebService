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
public class Phone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int phoneID;
    private String brand;
    private String model;
    private float screenSize;
    private float internalMemory;
    private float price;


    @OneToMany(targetEntity = Review.class, cascade = CascadeType.ALL)
    private List<Review> reviews;


    @OneToMany(mappedBy= "phone", cascade= CascadeType.ALL)
    private List<PhoneFeature> phoneFeatures;

}
