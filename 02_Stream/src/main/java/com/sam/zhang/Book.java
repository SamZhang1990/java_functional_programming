package com.sam.zhang;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Book {
    private Long id;

    private String name;

    private String category;

    private Integer scope;

    private String intro;

}
