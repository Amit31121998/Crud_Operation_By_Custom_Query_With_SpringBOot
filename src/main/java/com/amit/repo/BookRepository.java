package com.amit.repo;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.amit.entity.Book;

public interface BookRepository extends CrudRepository<Book, Integer> {

	@Modifying
	@Query(value = "insert into Book(book_Id,book_Name,book_Price) values(:id,:name,:price)", nativeQuery = true)
	@Transactional
	void insertBook(@Param("id") Integer id, @Param("name") String name, @Param("price") Double price);

	@Modifying
	@Query(value = "update Book set book_Name= :name where book_Id= :id",nativeQuery = true)
	@Transactional
	Integer updateBookName(@Param("id") Integer id,@Param("name") String name);
	
	@Modifying
	@Query(value = "delete from Book where book_Id= :id",nativeQuery = true)
	@Transactional
	Integer deleteBookId(@Param("id") Integer id);
	

}
