package com.news.gymnast.requests;

import com.news.gymnast.models.Customer;
import lombok.Data;

@Data
public class CustomerAndUrl {

    private Customer customer;

    private String url;

}
