package edu.jpa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Company {
    @Id
    private int id;
    private String name;
    @OneToMany(mappedBy = "company")
    private List<Department> departments;
}
