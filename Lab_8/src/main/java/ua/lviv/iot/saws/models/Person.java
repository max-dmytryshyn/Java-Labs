package ua.lviv.iot.saws.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    private Integer id;
    private String name;
    private Integer age;
}
