package me.codebase.jpa.example.action;

import me.codebase.jpa.example.entity.User;
import me.codebase.jpa.example.repository.ExampleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * Created by chendong on 2017/5/19.
 */
@Service
public class ExampleAction {

    private final ExampleRepository repository;

    @Autowired
    @Lazy
    public ExampleAction(ExampleRepository repository) {
        this.repository = repository;
    }

    @PostConstruct
    private void action() {
//        User user = new User();
//        user.setName("test");
//        user.setPhone("124345567");
//        user.setDescription("sdsdfsdf");
//        user.setEmail("sdsdsdd");
//        repository.save(user);
//        List<User> list = repository.findAll();
//        list.forEach(System.out::println);
        User user1 = repository.findOne(1L);
//        repository.getOne(1L)  ?? 这里使用getOne 会报错!
        System.out.println(user1.toString());
    }
}
