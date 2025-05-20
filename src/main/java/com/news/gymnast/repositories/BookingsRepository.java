package com.news.gymnast.repositories;

import com.news.gymnast.models.Bookings;
import com.news.gymnast.models.Classes;
import com.news.gymnast.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookingsRepository extends JpaRepository<Bookings, Long> {
    void deleteById(int id);
    void deleteByCustomer(Customer customer);

    List<Bookings> findAllByCustomerAndClasses(Customer customer, Classes classes);

    @Override
    <S extends Bookings> S save(S entity);
}
