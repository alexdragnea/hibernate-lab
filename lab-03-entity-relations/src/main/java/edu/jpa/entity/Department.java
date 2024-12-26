package edu.jpa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Department {
    @Id
    private int id;
    private String name;
    @ManyToOne
    private Company company;
    @OneToMany(mappedBy = "department")
    private List<Employee> employees;
}
