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
@Document(collection = "customers")
public class CustomerEntity {

    @Id
    @EqualsAndHashCode.Include
    private String id;

    @Field
    private String name;

    @Field
    private String surname;

    @Field
    private String state;
}
