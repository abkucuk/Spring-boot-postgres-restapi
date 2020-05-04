package com.example.demo.service.Impl;

import com.example.demo.dto.ProductDto;
import com.example.demo.entity.Comment;
import com.example.demo.entity.Product;
import com.example.demo.repositories.IProductRepository;
import com.example.demo.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.hibernate.dialect.function.AbstractAnsiTrimEmulationFunction;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import javax.lang.model.type.ArrayType;
import java.awt.print.Pageable;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    // normalde bunu constructor içinde doldurmamız lazımdı fakat
    // bunu bizim yerimize @RequiredArgsConstructor yapıyor.
    // peki nereden anlıyor? final anahtar kelimesinden
    // eğer biz bir atama yapmamışsak o atamayı Annotation yapıyor.
    private final IProductRepository _productRepository;

    @Override
    public ProductDto save(ProductDto productDto) {
        Product product = new Product();
        product.setDescription(productDto.getDescription());
        product.setImageName(productDto.getImageName());
        product.setName(productDto.getName());
        product.setPrice(productDto.getPrice());
        final Product productAfterSave = _productRepository.save(product);
        productDto.setId(productAfterSave.getId());
        return productDto;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<ProductDto> getall(ProductDto p) {
        List<Product> products = _productRepository.findAll();
        List<ProductDto> productDtos = new ArrayList<>();
        products.forEach( product -> {
            ProductDto productDto = new ProductDto();
            productDto.setDescription(product.getDescription());
            productDto.setImageName(product.getImageName());
            productDto.setName(product.getName());
            productDto.setPrice(product.getPrice());
            productDtos.add(productDto);

        });
        return productDtos;
    }


    @Override
    public Page<ProductDto> getall(Pageable pageable) {
        return null;
    }
}
