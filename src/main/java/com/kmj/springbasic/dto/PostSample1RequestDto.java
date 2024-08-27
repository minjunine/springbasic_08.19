package com.kmj.springbasic.dto;

import org.hibernate.validator.constraints.Length;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PostSample1RequestDto {

    @NotBlank
    @Length(max=10)
    private String sampleId;

    @NotNull
    private Integer sampleColumn;

    public Integer getSampleTable1Entity(String sampleId2, Integer sampleColumn2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getSampleTable1Entity'");
    }
}
