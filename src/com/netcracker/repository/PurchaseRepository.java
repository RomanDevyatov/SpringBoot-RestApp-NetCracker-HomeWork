package com.netcracker.repository;

import com.netcracker.entity.Purchase;
import com.netcracker.entity.Purchase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface PurchaseRepository extends JpaRepository<Purchase, Long> {
    List<Purchase> findByDate(Date date);
    List<Purchase> findBySeller(int sellerId);
    List<Purchase> findByBook(int bookId);
    List<Purchase> findByCustomer(int customerId);
    List<Purchase> findByAmount(int amount);
    List<Purchase> findByTotal(double total);
    List<Purchase> findByOrderNumber(String orderNumber);

    void deleteById(long id);

    @Query(value = "select distinct t.date from purchase t", nativeQuery = true)
    List<Date> retrieveDate();
}
