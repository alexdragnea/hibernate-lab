package edu.jpa.TABLE_PER_SUBCLASS.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Person {
    @Id
    private int id;
    private String name;
}
