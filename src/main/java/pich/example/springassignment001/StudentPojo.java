package pich.example.springassignment001;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class StudentPojo {
    private Integer id;
    private String fullName;
    private String gender;
    private Double score;
}
