package pich.example.springassignment001;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


public class InMemoryDatabase {

    private StudentPojo studentPojo = new StudentPojo();
    @Bean
    public List<StudentPojo> studentPojoList(){
        return new ArrayList<>(Arrays.asList(new StudentPojo(1, "KOKO", "F", 80.0),
                new StudentPojo(2, "Kaka","M",85.0),
                new StudentPojo(3,"Koka","M",88.0),
                new StudentPojo(4,"Ana","F",78.0),
                new StudentPojo(5,"Jame","M",70.0),
                new StudentPojo(6,"Jim","M",92.0),
                new StudentPojo(7,"Anny","F",89.0),
                new StudentPojo(8,"Lyda","F",92.0),
                new StudentPojo(9,"Rith","M",81.0),
                new StudentPojo(10,"Nak","M",93.0)
                ));
    }
}
