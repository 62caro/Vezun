package com.project.vezun.entity;

import jakarta.persistence.*;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "users")
public class UsersEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "order_items_seq")
    @SequenceGenerator(name = "order_items_seq", sequenceName = "order_items_seq", allocationSize = 1)
    private Long id;

    @Column(nullable = false)
    @NotNull(message = "Name cannot be null")
    private String username;

    @Column(nullable = false, unique = true)
    @Email(regexp = "[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,3}",
            flags = Pattern.Flag.CASE_INSENSITIVE)
    @Email(message = "Email should be valid")
    private String email;

    @Column(nullable = false)
    @NotNull(message = "Password cannot be null")
    private String password;

    @Column(nullable = false)
    private String full_name;

    @Column
    @Pattern(regexp = "^\\+375\\d{9}$")
    private String phone;

    @Column
    private String city;

    @Column
    private String gender;

    @Column
    private Integer age;

    @Column
    private Date created_at;

    public UsersEntity() {}

    public UsersEntity(String username, String email, String password, String full_name, String phone, String city, String gender, Integer age, Date created_at) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.full_name = full_name;
        this.phone = phone;
        this.city = city;
        this.gender = gender;
        this.age = age;
        this.created_at = created_at;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        UsersEntity that = (UsersEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(username, that.username) && Objects.equals(email, that.email) && Objects.equals(password, that.password) && Objects.equals(full_name, that.full_name) && Objects.equals(phone, that.phone) && Objects.equals(city, that.city) && Objects.equals(gender, that.gender) && Objects.equals(age, that.age) && Objects.equals(created_at, that.created_at);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, email, password, full_name, phone, city, gender, age, created_at);
    }

    @Override
    public String toString() {
        return "UsersEntity{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", full_name='" + full_name + '\'' +
                ", phone='" + phone + '\'' +
                ", city='" + city + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", created_at=" + created_at +
                '}';
    }
}
