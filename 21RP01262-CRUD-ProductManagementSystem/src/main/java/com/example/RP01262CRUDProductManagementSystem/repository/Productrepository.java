package com.example.RP01262CRUDProductManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.RP01262CRUDProductManagementSystem.entity.Product;



public interface Productrepository extends JpaRepository<Product, Long> {

}
