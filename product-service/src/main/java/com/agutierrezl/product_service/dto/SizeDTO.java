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
public class SizeDTO {

    private String id;

    @NotNull
    private String name;

    private String description;

    @Builder.Default
    private Boolean status = true;
}
