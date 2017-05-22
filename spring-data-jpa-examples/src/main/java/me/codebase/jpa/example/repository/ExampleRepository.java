package me.codebase.jpa.example.repository;


import me.codebase.jpa.example.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by chendong on 2017/5/19.
 */
public interface ExampleRepository extends JpaRepository<User, Long> {
}
