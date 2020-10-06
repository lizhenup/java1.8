package com.lz.pojo;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author ：lizhen
 * @date ：Created in 2020/8/30 17:25
 * @description：
 * @modified By：
 * @version: $
 */
public class Address {
    @Autowired
    private String address;

    public Address() {
    }

    public Address(String address) {

        this.address = address;
    }

    public String getAddress() {

        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Address{" +
                "address='" + address + '\'' +
                '}';
    }
}
