package HW_21_03_2023;

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
