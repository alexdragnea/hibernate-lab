package edu.jpa.entity.embeddables;

import jakarta.persistence.Embeddable;
import lombok.Data;

import java.io.Serializable;

@Embeddable
@Data
public class Project implements Serializable {
    private String name;
}
