package com.agutierrezl.product_service.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Document(collection = "products")
public class ProductEntity {

    @Id
    @EqualsAndHashCode.Include
    private String id;

    @Field
    private String name;

    @Field
    private String description;

    @Field
    private SizeEntity size;

    @Field
    private String state;
}
