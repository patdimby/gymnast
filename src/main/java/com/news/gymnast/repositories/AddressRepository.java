package com.news.gymnast.repositories;

import com.news.gymnast.models.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {

    @Override
    void delete(Address entity);
}
