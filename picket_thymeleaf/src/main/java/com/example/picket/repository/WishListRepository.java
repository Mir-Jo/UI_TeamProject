package com.example.picket.repository;

import com.example.picket.entity.WishList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface WishListRepository extends JpaRepository<WishList, Long> {

    @Query(value = "select * from Wish_List where customer_id = :customer_Id", nativeQuery=true)
    List<WishList> findByAllCustomerId(@Param("customer_Id") String customer_Id);

    @Query(value = "delete from Wish_List where customer_id = :customer_Id AND title = :title", nativeQuery = true)
    void deleteWish(@Param("customer_Id") String customer_Id, @Param("title") String title);
}
