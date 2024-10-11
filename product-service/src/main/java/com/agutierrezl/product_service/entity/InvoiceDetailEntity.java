package com.agutierrezl.product_service.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InvoiceDetailEntity {

    private int quantity;
    private ProductEntity product;
    private SizeEntity size;
}
