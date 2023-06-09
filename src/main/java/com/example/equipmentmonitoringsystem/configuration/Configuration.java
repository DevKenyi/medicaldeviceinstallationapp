package com.example.equipmentmonitoringsystem.configuration;

import com.example.equipmentmonitoringsystem.enums.ROLES;
import com.example.equipmentmonitoringsystem.model.User;
import com.example.equipmentmonitoringsystem.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.Collection;
import java.util.stream.Collectors;

@org.springframework.context.annotation.Configuration
@EnableWebSecurity
public class Configuration implements UserDetailsService {
    @Autowired
    private UserRepo repo;

    // AUTHENTICATION HERE

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User user = repo.findUserByEmail(email);
        if(user==null){
            throw new UsernameNotFoundException("User with this "+ email+"is not registered on our system");
        }
        return   org.springframework.security.core.userdetails.User.builder()
                .username(user.getEmail())
                .password(user.getPassword())
                .disabled(false)
                .accountLocked(false)
                .accountExpired(false)
                .authorities(mapAuthorities(user.getRoles()))
                .build();
    }

    public Collection<? extends GrantedAuthority> mapAuthorities(Collection<ROLES> roles){
        return roles.stream()
                .map(role->new SimpleGrantedAuthority("ROLE_"+role.getAuthorities())).collect(Collectors.toList());
    }

    // AUTHORIZATION HERE




}
