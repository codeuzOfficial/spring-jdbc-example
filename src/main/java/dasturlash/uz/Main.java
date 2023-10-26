package dasturlash.uz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalDateTime;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        StudentRepository studentRepository = (StudentRepository) context.getBean("studentRepository");

        StudentDTO student1 = new StudentDTO("Ali", "Aliyev", LocalDateTime.now());
        StudentDTO student2 = new StudentDTO("Vali", "Valiyev", LocalDateTime.now());
        StudentDTO student3 = new StudentDTO("Toshmat", "Toshmatov", LocalDateTime.now());
        StudentDTO student4 = new StudentDTO("Eshmat", "Eshmatov", LocalDateTime.now());

        studentRepository.save(student1);
        studentRepository.save(student2);
        studentRepository.save(student3);
        studentRepository.save(student4);

        List<StudentDTO> studentList = studentRepository.getStudentList();
        studentList.forEach(dto -> System.out.println(dto));
    }

}