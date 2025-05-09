package com.in28minutes.rest.services.restful_web_services.user;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Component
public class UserDaoService {

    private static List<User> users = new ArrayList<>();

    static {
        users.add(new User(1,"Adam", LocalDate.now().minusYears(30)));
        users.add(new User(2,"Eve",LocalDate.now().minusYears(25)));
        users.add(new User(3,"Jim",LocalDate.now().minusYears(20)));
    }

    public List<User> findAll() {
        return users;
    }

    public User save(User user)
    {
        users.add(user);
        return user;
    }


    public User findOne(int id)
    {
        Predicate<User> predicate=user->user.getId().equals(id);
        return users.stream().filter(predicate).findFirst().orElse(null);
       // return users.stream().filter(i->i.getId().equals(id)).findFirst().orElse(null);
    }

    public void deleteById(int id)
    {
        Predicate<User> predicate=user->user.getId().equals(id);
        users.removeIf(predicate);
    }



}
