package com.news.gymnast.requests;

public class BookingPostRequest {
    public String name;
    public int age;

    @Override
    public String toString() {
        return "BookingPostRequest{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
