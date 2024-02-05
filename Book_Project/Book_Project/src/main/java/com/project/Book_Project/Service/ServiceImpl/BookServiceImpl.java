package com.project.Book_Project.Service.ServiceImpl;

import com.project.Book_Project.Dto.BookDto;
import com.project.Book_Project.Entity.Book;
import com.project.Book_Project.Exception.ResourceNotFoundException;
import com.project.Book_Project.Repository.BookRepository;
import com.project.Book_Project.Service.BookService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.*;
import java.util.Objects;

@Service
@AllArgsConstructor
public class BookServiceImpl implements BookService {

    private BookRepository bookRepository;

    private ModelMapper modelMapper;

    @Override
    public BookDto createBook(BookDto bookDto) {
//        create Dto to entity
        Book book = mapTOEntity(bookDto);
        Book newbook = bookRepository.save(book);

//        create entity to Dto
        BookDto bookResponse = mapTODTO(newbook);
        return bookResponse;
    }

    @Override
    public BookDto getBookById(long id) {
        Book book = bookRepository.findById(id).orElseThrow(
                ()-> new ResourceNotFoundException("Book","id",id));
        return mapTODTO(book);
    }

//    @Override
    @Autowired
    public BookDto updateBook(BookDto bookDto, long id) {
        Book book = bookRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Book","id",id));

//        Update all fields as needed - Refresh

        existingBook.setTitle(updateBook.getTitle());
//        At this spot you can add the fields you want to update

//        Save the update order
        return bookRepository.save(existingBook);
//    }


    @Override
    public void deleteMovieById(long id) {
        Book book = bookRepository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("Book","id",id));
        bookRepository.delete(book);
    }

//    convert from Dto to Entity
    private BookDto mapTODTO(Book book){
        BookDto bookDto = modelMapper.map(book, BookDto.class);
        return bookDto;
    }

    private Book mapTOEntity(BookDto bookDto){
        Book book = modelMapper.map(bookDto, Book.class);
        return book;
    }

}
