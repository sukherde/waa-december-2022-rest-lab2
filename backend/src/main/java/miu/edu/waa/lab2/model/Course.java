package miu.edu.waa.lab2.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Course {
    private int id;
    private String name;
    private String code;
}
