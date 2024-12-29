package edu.jpa.TABLE_PER_CLASS.entity;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class Executive extends Employee {
    private double bonus;
}
