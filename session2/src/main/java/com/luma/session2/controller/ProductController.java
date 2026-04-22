package com.luma.session2.controller;

import com.luma.session2.dto.ProductDto;
import com.luma.session2.entity.ProductEntity;
import com.luma.session2.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/products")
public class ProductController {
    private  final ProductRepository productRepository ;

    @GetMapping("/{id}")

    public ProductDto getProductForCustomers(@PathVariable Long id ) {

        ProductEntity product = productRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Product_not found")) ;
        return new ProductDto(
                product.getId(),
                product.getName(),
                product.getSellPrice()
        );
    }




}
