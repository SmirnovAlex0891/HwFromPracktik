package hw_2023_03_21;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@Getter
@Setter
public class Company {
    private String name;
    private List<Department> departments;
}
