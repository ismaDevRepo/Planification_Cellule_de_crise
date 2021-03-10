package astreinte.service;

import astreinte.entities.AppUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;

@Service("userDetailsService")
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private AccountService accountService;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        AppUser usr = accountService.findUserByUsername(s);

        if(usr==null) throw new UsernameNotFoundException(s);

        Collection<GrantedAuthority> authorities = new ArrayList<>();

        usr.getRoles().forEach(r->{
            authorities.add(new SimpleGrantedAuthority(r.getRoleName()));
        });
        return new User(usr.getUsername(),usr.getPassword(),authorities);
    }
}
