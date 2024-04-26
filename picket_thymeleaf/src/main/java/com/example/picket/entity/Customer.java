package com.example.picket.entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Table(name = "customer")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Setter
@Entity
public class Customer implements UserDetails {
    @Id
    @Column(name = "id")
    private String id;
    @Column(name = "password", nullable = false)
    private String password;
    @Column(name = "email", nullable = false)
    private String email;
    @Column(name= "name", nullable = false)
    private String name;
    @Column(name = "birthdate", nullable = false)
    private String birthdate;
    @Column(name="tel", unique = true, nullable = false)
    private String tel;
    @Column(name = "point")
    private Long point;

    @Builder
    public Customer(String id, String password, String email, String name, String birthdate, String tel, Long card, Long balance, Long point){
        this.id = id;
        this.password = password;
        this.email = email;
        this.name = name;
        this.birthdate = birthdate;
        this.tel = tel;
        this.point = (point != null) ? point : 0L;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Collections.singleton(new SimpleGrantedAuthority("ROLE_CUSTOMER"));
    }

    @Override
    public String getUsername(){
        return id;
    }
    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true ;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
