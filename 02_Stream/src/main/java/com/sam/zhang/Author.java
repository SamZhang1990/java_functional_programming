package com.sam.zhang;

import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Setter
public class Author {
    private Long id;

    private String name;

    private Integer age;

    private String intro;

    private List<Book> books;
}
