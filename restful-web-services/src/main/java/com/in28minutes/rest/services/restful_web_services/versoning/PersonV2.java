package com.in28minutes.rest.services.restful_web_services.versoning;

public class PersonV2 {

    private  Name name;
    public PersonV2(Name name) {
        this.name = name;
    }

    public Name getName() {
        return name;
    }

    @Override
    public String toString() {
        return "PersonV2{" +
                "name=" + name +
                '}';
    }



}
