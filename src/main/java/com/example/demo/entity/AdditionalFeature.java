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
@Table(name="AdditionalFeature")
public class AdditionalFeature {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name="featureID")
    private int featureID;
    private String featureName;



    @OneToMany(mappedBy = "feature", cascade = CascadeType.ALL)
    private List<ComputerFeature> computers;

    @OneToMany(mappedBy = "feature", cascade = CascadeType.ALL)
    private List<PhoneFeature> phones;


}
