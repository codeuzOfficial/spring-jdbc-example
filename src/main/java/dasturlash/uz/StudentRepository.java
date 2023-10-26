package dasturlash.uz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<StudentDTO> getStudentList() {
        String sql = "select * from Student";
        List<StudentDTO> studentList = jdbcTemplate.query(sql, new BeanPropertyRowMapper(StudentDTO.class));
        return studentList;
    }

    public void save(StudentDTO dto) {
        String sql = "INSERT INTO student (name,surname,created_date) values('%s','%s','%s')";
        sql = String.format(sql, dto.getName(), dto.getSurname(), dto.getCreatedDate());
        jdbcTemplate.update(sql);
    }
}
