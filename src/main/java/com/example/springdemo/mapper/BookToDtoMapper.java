package com.example.springdemo.mapper;

import com.example.springdemo.model.Book;
import com.example.springdemo.model.BookRequest;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BookToDtoMapper {
    Book AddBookRequestToBook(BookRequest bookRequest);
}
