package me.codebase.jpa.entity;


import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by chendong on 2017/5/19.
 * <p>
 * user bean
 */
@Entity
@Table(name = "user_info")
public class User implements Serializable {

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    @Id
    @GeneratedValue
    private long id;

    @Column
    private String name, email, phone, description;

}
