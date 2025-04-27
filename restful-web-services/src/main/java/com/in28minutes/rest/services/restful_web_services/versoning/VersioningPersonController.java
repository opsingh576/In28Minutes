package com.in28minutes.rest.services.restful_web_services.versoning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersioningPersonController {

    @GetMapping("v1/person")
    public PersonV1 getFirstVersionOfPerson(){
        return new PersonV1("Bob Charlie");
    }
    @GetMapping("v2/person")
    public PersonV2 getSecondVersionOFPerson(){
        return new PersonV2(new Name("Bob","Charlie"));
    }

    @GetMapping(path= "/person",params="version=1")
    public PersonV1 getFirstVersionOfPersonRequestParameter(){
        return new PersonV1("Bob Charlie");
    }
    @GetMapping(path = "/person",params="version=2")
    public PersonV2 getSecondVersionOfPersonRequestParameter(){
        return new PersonV2(new Name("Bob", "Charlie"));
    }

    @GetMapping(path="/person/header",headers = "X-API=1")
    public PersonV1 getFirstVersionOfPersonRequestHeader()
    {
        return new PersonV1("Bob Charlie");
    }

    @GetMapping(path="/person/header",headers = "X-API")
    public PersonV2 getSecondVersionOfPersonRequestHeader()
    {
        return new PersonV2(new Name("Bob","Charlie"));
    }

    //MediaType/content negotiation/Accept Header versioning

    @GetMapping(path="/person/accept",produces = "application/api-v1+json")
    public PersonV1 getFirstVersionOfPersonAcceptHeader()
    {
        return new PersonV1("Bob Charlie");
    }

    //@GetMapping(path="/person/accept",produces = "application/vnd.company.api-v2+json")
    @GetMapping(path="/person/accept",produces = "application/api-v2+json")
    public PersonV2 getSecondVersionOfPersonAcceptHeader()
    {
        return new PersonV2(new Name("Bob","Charlie"));
    }

}
