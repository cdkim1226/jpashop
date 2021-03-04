package jpabook.jpashop.domain;

import lombok.Getter;

import javax.persistence.Embeddable;

@Embeddable
@Getter
public class Address {

    private String city;
    private String street;
    private String zipcode;

    protected Address() {

    }

    public Address(String city, String street, String zipcode) { // setter 대신 사용 할 수 있는 객체를 생성해줌
        this.city = city;
        this.street = street;
        this.zipcode = zipcode;
    }
}
