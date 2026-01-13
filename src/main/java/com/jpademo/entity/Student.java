package com.jpademo.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Table(name = "students", schema = "dbo")
@Entity
public class Student {
    @Id
    @Column(name = "student_id")
    private Long id;

    @Column(name = "first_name", columnDefinition = "NVARCHAR(50)")
    private String firstName;

        @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

    @Temporal(TemporalType.DATE) // cả ngày và giờ/ ko giờ thì dùng Date / Chỉ giờ thì dùng TIME
    @Column(name = "dob")
    private Date dob;

    @Column(name = "hired_date")
    private LocalDate hiredDate;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Enumerated(EnumType.ORDINAL) // mặc định ORDINAL là 0, 1, 2.
    @Column(name = "gender")
    private Gender gender;


    @OneToMany(mappedBy = "student")
    private List<Laptop> laptops;

    @OneToOne(mappedBy = "student")
    private Teacher teacher;

    public Student() {
    }

    public Student(Long id, String firstName, String lastName, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
