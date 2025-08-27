package com.example.avito.repositories;

import com.example.avito.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    //всякие базовые методы получаем типо получить что-то, сохранять
    //и вот такое делать- сам реализует методы наши
    List<Product> findByTitle(String title);

}
