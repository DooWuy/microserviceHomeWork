package com.luma.session2.dto;

import lombok.Value;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * DTO for {@link com.luma.session2.entity.Product}
 */
@Value
public class ProductDto implements Serializable {
    Long id;
    String name;
    BigDecimal sellPrice;
}