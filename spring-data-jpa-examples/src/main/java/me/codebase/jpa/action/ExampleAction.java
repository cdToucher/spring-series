package me.codebase.jpa.action;

import me.codebase.jpa.entity.User;
import me.codebase.jpa.repository.ExampleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * Created by chendong on 2017/5/19.
 */
@Service
public class ExampleAction {

    private final ExampleRepository repository;

    @Autowired
    public ExampleAction(ExampleRepository repository) {
        this.repository = repository;
    }

    @PostConstruct
    private void action() {
        User user = new User();
        user.setName("test");
        user.setPhone("124345567");
        user.setDescription("sdsdfsdf");
        user.setEmail("sdsdsdd");
        repository.save(user);
        User user1 = repository.getOne(1L);
        System.out.println(user1.toString());
    }
}
