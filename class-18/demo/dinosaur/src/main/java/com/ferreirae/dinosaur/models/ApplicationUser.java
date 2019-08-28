package com.ferreirae.dinosaur.models;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;

@Entity
public class ApplicationUser implements UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(unique = true)
    String username;
    String password;

    // normal, boring, one-to-many annotations
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "owner")
    List<Dinosaur> dinosaurs;

    public Long getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public List<Dinosaur> getDinosaurs() {
        return this.dinosaurs;
    }

    String fullName;

    public ApplicationUser(String username, String password, String fullName) {
        this.username = username;
        this.password = password;
        this.fullName = fullName;
    }

    public ApplicationUser() {}

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return this.password;
    }

    @Override
    public String getUsername() {
        return this.username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
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
