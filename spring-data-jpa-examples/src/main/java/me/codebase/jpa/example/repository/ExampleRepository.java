package me.codebase.jpa.example.repository;


import me.codebase.jpa.example.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by chendong on 2017/5/19.
 */
public interface ExampleRepository extends JpaRepository<User, Long> {

    User findByName(String userName);

    Page<User> findAllByName(String userName, Pageable pageable);

    @Transactional
    @Query
    int queryByMyself();
}
