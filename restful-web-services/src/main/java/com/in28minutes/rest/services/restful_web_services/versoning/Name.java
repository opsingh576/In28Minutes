package com.in28minutes.rest.services.restful_web_services.versoning;

public class Name {

    private String FirstName;
    private String LastName;

    public Name(String firstName, String lastName) {
        FirstName = firstName;
        LastName = lastName;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    @Override
    public String toString() {
        return "PersonV2{" +
                "FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                '}';
    }


}
