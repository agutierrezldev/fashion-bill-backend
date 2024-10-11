package com.agutierrezl.product_service.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Document(collection = "invoices")
public class InvoiceEntity {

    @Id
    @EqualsAndHashCode.Include
    private String id;

    @Field
    private String description;

    @Field
    private List<InvoiceDetailEntity> details;

    @Field
    private String state;
}
