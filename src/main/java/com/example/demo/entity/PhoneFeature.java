package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class PhoneFeature {

    @EmbeddedId
    PhoneFeatureID id;

    @ManyToOne
    private Phone phone;

    @ManyToOne
    private AdditionalFeature feature;
}
