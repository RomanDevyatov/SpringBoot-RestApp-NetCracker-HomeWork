package com.netcracker.Service;

import com.netcracker.entity.Customer;
import com.netcracker.entity.Purchase;
import com.netcracker.repository.CustomerRepository;
import com.netcracker.repository.PurchaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class PurchaseService {
    @Autowired
    private PurchaseRepository purchaseRepository;

    public List<Purchase> findAll(){
        return purchaseRepository.findAll();
    }

    public Purchase findById(long id){
        Optional<Purchase> optional = purchaseRepository.findById(id);
        return optional.orElse(new Purchase());
    }

    public List<Purchase> findByOrderNumber(String orderNumber){
        return purchaseRepository.findByOrderNumber(orderNumber);
    }

    public List<Purchase> findByDate(Date date){
        return purchaseRepository.findByDate(date);
    }

    public List<Purchase> findBySellerId(int sellerId){
        return purchaseRepository.findBySellerId(sellerId);
    }

    public List<Purchase> findByBookId(int bookId){
        return purchaseRepository.findByBookId(bookId);
    }
    public List<Purchase> findByAmount(int amount){
        return purchaseRepository.findByAmount(amount);
    }
    public List<Purchase> findByTotal(double total){
        return purchaseRepository.findByTotal(total);
    }

    public void save(Purchase purchase){
        purchaseRepository.save(purchase);
    }

    public void deleteById(long id){
        purchaseRepository.deleteById(id);
    }
}
