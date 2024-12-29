package edu.jpa.TABLE_PER_CLASS.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@MappedSuperclass
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Person {
    @Id
    private int id;
    private String name;
}
