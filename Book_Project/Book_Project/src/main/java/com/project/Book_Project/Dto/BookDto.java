package com.project.Book_Project.Dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class BookDto {

    private long id;

    @NotEmpty
    @Size(min=4, message="Book title should have at least 4 characters!")
    private String title;

    @NotEmpty
    @Size(min=2, message = "Author name should have at least 2 characters!")
    private String author;

}
