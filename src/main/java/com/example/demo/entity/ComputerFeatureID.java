package com.example.demo.entity;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class ComputerFeatureID implements Serializable {
    private int computerID;
    private int featureID;
}
