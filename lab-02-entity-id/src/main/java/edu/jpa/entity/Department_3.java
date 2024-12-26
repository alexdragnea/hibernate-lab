package edu.jpa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import lombok.Data;

@Entity
@IdClass(DepartmentKey.class)
@Data
public class Department_3 {
    @Id
    private String companyName;
    @Id
    private String departmentName;
    private String description;
}