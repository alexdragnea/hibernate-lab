package edu.jpa.TABLE_PER_SUBCLASS.entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class Executive extends Employee {
    private double bonus;
}
