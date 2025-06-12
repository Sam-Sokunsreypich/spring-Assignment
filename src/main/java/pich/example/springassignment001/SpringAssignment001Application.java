package pich.example.springassignment001;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringAssignment001Application implements CommandLineRunner {

    StudentService studentService = new StudentService();
    @Override
    public void run(String args[]) throws Exception{
        System.out.println("============ All Student ==========");
        studentService.selectAllStudent().stream().forEach(System.out::println);
        System.out.println("============ Select Student ==========");
        System.out.println(studentService.selectById(5));
        System.out.println("============ Update Student ==========");
        System.out.println(studentService.updateStudentById(1,"MAMA","F",80.0));
        System.out.println("============ Delete Student ==========");
        if(studentService.deleteStudentById(5)){
            System.out.println("Student deleted successfully");
        }else{
            System.out.println("Student deletion failed");
        }

        System.out.println("============ All Student ==========");
        studentService.selectAllStudent().stream().forEach(System.out::println);
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringAssignment001Application.class, args);
    }

}
