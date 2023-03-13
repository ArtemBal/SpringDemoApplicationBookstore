package com.example.springdemo.mapper;

import com.example.springdemo.dao.BookEntity;
import com.example.springdemo.model.Book;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BookToEntityMapper {
    BookEntity bookToBookEntity(Book book);
    Book bookEntityToBook(BookEntity bookEntity);
}