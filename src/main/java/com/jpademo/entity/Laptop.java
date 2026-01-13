package com.jpademo.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "laptops", schema = "dbo")
public class Laptop {

    @Id
    @Column(name = "laptop_id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private double price;

    @ManyToOne()
    @JoinColumn(name = "student_id", referencedColumnName = "student_id")
    private Student student;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
