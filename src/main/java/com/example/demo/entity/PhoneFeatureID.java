package com.example.demo.entity;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class PhoneFeatureID implements Serializable {

    private int phoneID;
    private int featureID;
}
