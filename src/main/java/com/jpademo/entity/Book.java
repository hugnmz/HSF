package com.jpademo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "books", schema = "dbo")
public class Book {

    @EmbeddedId
    private BookPK id;

    @Column(name = "price")
    private double price;

    @Column(name = "published_date")
    private LocalDate publishDate;

    public BookPK getId() {
        return id;
    }

    public LocalDate getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(LocalDate publishDate) {
        this.publishDate = publishDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }



}
