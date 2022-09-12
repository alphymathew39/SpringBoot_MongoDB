package com.example.SpringbootAndMongo.repository;

import com.example.SpringbootAndMongo.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;



public interface BookRepository extends MongoRepository<Book, Integer>{

}