package me.codebase.jpa.example.action;

import me.codebase.jpa.example.entity.User;
import me.codebase.jpa.example.repository.ExampleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
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

        //        repository.getOne(1L)  ?? 这里使用getOne 会报错!
        User user1 = repository.findOne(1L);
        System.out.println(user1.toString());
        User user2 = repository.findByName("test");
        System.out.println(user2.toString());
        Pageable pageable = new PageRequest(1, 5);
        Page<User> page = repository.findAllByName("test", pageable);
        System.out.println(page.getTotalElements());
    }
}
