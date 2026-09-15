package com.example.springbootdemo.service;

import com.example.springbootdemo.api.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

      private List<User> userslist;

      public UserService(){

          userslist=new ArrayList<User>();

          User user=new User("Michael",1,22,"@gmail.com");

          userslist.add(user);

      }

      public Optional<User> getUser(int id) {

          Optional optional = Optional.empty();

          for (User user : userslist) {
              if (id == user.getId()) {
                  optional = Optional.of(user);
                  return optional;
              }
          }
          return optional;
      }


}
