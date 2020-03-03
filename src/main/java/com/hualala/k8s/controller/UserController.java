package com.hualala.k8s.controller;

import com.hualala.k8s.bean.User;
import com.hualala.k8s.dao.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/insert")
    @ResponseBody
    public User insertInfo() {
        User user = new User();
        user.setPhone("123");
        user.setUserHead("123");
        user.setAge(31);
        user.setName("chenglinjava");
        return userRepository.save(user);
    }
    @RequestMapping(value="/get",method = RequestMethod.GET)
    public List<User> getAllTodos(){
        return userRepository.findAll();
    }

    @RequestMapping(value="/create",method = RequestMethod.POST)
    public User createTodo(@Valid @RequestBody User todo){
        return userRepository.save(todo);
    }

    @RequestMapping(value="/find/{id}", method = RequestMethod.GET)
    public ResponseEntity<User> find(@PathVariable("id") Long id){
        Optional<User> todo = userRepository.findById(id);
        if(todo.isPresent()){
            return new ResponseEntity<User>(todo.get(),HttpStatus.OK);
        }
        return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
    }
    @RequestMapping(value="/delete/{id}", method = RequestMethod.DELETE)
    public void deleteTodo(@PathVariable("id") Long id) {
        userRepository.deleteById(id);
    }
}
