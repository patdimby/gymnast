package com.news.gymnast.dao.contracts;

import com.news.gymnast.models.Customer;

import java.util.List;

public interface ICustomerDao {
    List<Customer> getFullCustomerDetails(int id);

    boolean checkEmail(String email);

    Customer getCustomerByEmail(String email);

    boolean saveCustomer(Customer customer);

}
