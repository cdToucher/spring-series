package me.codebase.jpa.repository;


import me.codebase.jpa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

/**
 * Created by chendong on 2017/5/19.
 */
@NoRepositoryBean
public interface ExampleRepository extends JpaRepository<User, Long> {
}
