package edu.jpa.entity;

import java.io.Serializable;
import lombok.Data;

@Data
public class DepartmentKey implements Serializable {
    private String companyName;
    private String departmentName;
}