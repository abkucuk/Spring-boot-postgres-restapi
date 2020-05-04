package com.example.demo.service;

import com.example.demo.dto.ProductDto;
import org.springframework.data.domain.Page;

import java.awt.print.Pageable;
import java.util.List;

public interface ProductService {
    ProductDto save(ProductDto productDto);
    void delete(Long id);
    List<ProductDto> getall(ProductDto p);
    Page<ProductDto> getall(Pageable pageable);
}
