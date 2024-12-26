package edu.jpa.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class Department_2 {
    @EmbeddedId
    private DepartmentKey id;
    private String description;
}