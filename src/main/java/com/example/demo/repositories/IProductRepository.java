package com.example.demo.repositories;

import com.example.demo.entity.*;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductRepository extends JpaRepository<Product,Long> {
    // normalde buraya getAll, save, update, delete gibi imzaları yazıp
    // daha sonra bunları class ile gerçekleştirmemiz gerekirdi lakin
    // jpaRepository bizim için bütün bunları hallediyor.
}
