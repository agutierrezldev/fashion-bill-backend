package com.agutierrezl.product_service.dto;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductDTO {

    private String id;

    @NotNull
    private String name;

    private String description;

    @NotNull
    private SizeDTO size;

    @Builder.Default
    private Boolean status = true;
}
