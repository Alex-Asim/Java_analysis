package com.project.Book_Project.Service;

import com.project.Book_Project.Dto.BookDto;

public interface BookService {

    BookDto createBook(BookDto bookDto);
    BookDto getBookById(long id);
    BookDto updateBook(long id);
    void deleteMovieById(long id);

//    BookDto updateBook(long id);
}
