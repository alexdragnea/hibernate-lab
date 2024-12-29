package edu.jpa.TABLE_PER_CLASS.entity;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class Customer extends Person {
    private double discount;
}
