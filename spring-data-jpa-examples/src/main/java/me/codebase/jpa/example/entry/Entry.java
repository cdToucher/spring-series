package me.codebase.jpa.example.entry;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by chendong on 2017/5/19.
 * <p>
 * this is the entry for this demo.
 */
public class Entry {

    public static void main(String[] args) {
        new AnnotationConfigApplicationContext(AppConfig.class).start();
    }
}
