package dasturlash.uz;

import java.time.LocalDateTime;

public class StudentDTO {
    private Integer id;
    private String name;
    private String surname;
    private LocalDateTime createdDate;

    public StudentDTO() {
    }

    public StudentDTO(String name, String surname, LocalDateTime createdDate) {
        this.name = name;
        this.surname = surname;
        this.createdDate = createdDate;
    }

    @Override
    public String toString() {
        return "StudentDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", createdDate=" + createdDate +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }
}
