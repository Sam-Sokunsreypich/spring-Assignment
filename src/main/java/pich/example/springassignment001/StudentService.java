package pich.example.springassignment001;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Scanner;

@Service
public class StudentService {
    private InMemoryDatabase inMemoryDatabase = new InMemoryDatabase();
    public StudentPojo insertStudent (StudentPojo studentPojo) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Insert Student Id: ");
//        studentPojo
        return studentPojo;
    }
    public List<StudentPojo> selectAllStudent () {
        return inMemoryDatabase.studentPojoList()
                .stream().toList();
    }
    public StudentPojo selectById(int id){
        return inMemoryDatabase.studentPojoList()
                .stream()
                .filter(student -> student.getId() == id)
                .findFirst()
                .orElse(null);
    }
    public StudentPojo updateStudentById(int id, String fullName, String gender, Double score) {
        StudentPojo studentPojo1 = selectById(id);
        studentPojo1.setFullName(fullName);
        studentPojo1.setGender(gender);
        studentPojo1.setScore(score);
        return studentPojo1;
    }
    public boolean deleteStudentById(int id) {
        StudentPojo studentPojo = selectById(id);
        if (studentPojo == null) {
            return false;
        }
        return inMemoryDatabase.studentPojoList().remove(studentPojo);
    }


}
