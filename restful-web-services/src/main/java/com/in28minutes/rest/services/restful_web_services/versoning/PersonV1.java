package com.in28minutes.rest.services.restful_web_services.versoning;

public class PersonV1 {
    private String name;
    public PersonV1(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
  public String toString() {
      return "PersonV1{" +
              "name='" + name + '\'' +
              '}';
  }




}
