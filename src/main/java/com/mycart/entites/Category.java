/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycart.entites;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


/**
 *
 * @author rohit
 */
@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int categoryId;

    private String categoryTittle;

    private String categoryDesecription;

    @OneToMany(mappedBy = "category")
    private List<Product> products = new ArrayList<>();

    public Category() {
    }

    public Category(int categoryId, String categoryTittle, String categoryDesecription) {
        this.categoryId = categoryId;
        this.categoryTittle = categoryTittle;
        this.categoryDesecription = categoryDesecription;
    }

    public Category(String categoryTittle, String categoryDesecription) {
        this.categoryTittle = categoryTittle;
        this.categoryDesecription = categoryDesecription;
    }

    public Category(String categoryTittle, String categoryDesecription, List<Product> products) {
        this.categoryTittle = categoryTittle;
        this.categoryDesecription = categoryDesecription;
        this.products = products;
    }

    @Override
    public String toString() {
        return "Category{" + "categoryId=" + categoryId + ", categoryTittle=" + categoryTittle + ", categoryDesecription=" + categoryDesecription + '}';
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryTittle() {
        return categoryTittle;
    }

    public void setCategoryTittle(String categoryTittle) {
        this.categoryTittle = categoryTittle;
    }

    public String getCategoryDesecription() {
        return categoryDesecription;
    }

    public void setCategoryDesecription(String categoryDesecription) {
        this.categoryDesecription = categoryDesecription;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public static class list {

        public list() {
        }
    }
    

}
