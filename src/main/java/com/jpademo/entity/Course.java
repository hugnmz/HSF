package com.jpademo.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "courses", schema = "dbo")
public class Course {

    @Id
    @Column(name = "course_id")
    private Long id;

    @Column(name = "course_name")
    private String courseName;

    @ManyToMany
    @JoinTable(
            name = "courses_students",
            joinColumns = @JoinColumn(name = "course_id", referencedColumnName = "course_id"),
            inverseJoinColumns = @JoinColumn(name = "student_id", referencedColumnName = "student_id")
    )
    private List<Student> students;
    public Course() {

    }

    public Course(Long id, String courseName) {
        this.id = id;
        this.courseName = courseName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
}
