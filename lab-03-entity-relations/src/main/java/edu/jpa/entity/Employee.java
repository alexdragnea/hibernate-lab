package edu.jpa.entity;

import edu.jpa.entity.embeddables.Project;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Employee {
    @Id
    private int id;
    private String name;
    @ManyToOne
    private Department department;
    @ElementCollection
    private List<Project> projects;
}
