package astreinte.service;


import astreinte.entities.AppRole;
import astreinte.entities.AppUser;

import java.util.List;

public interface AccountService {

    public AppUser saveUser(AppUser appUser);

    public AppRole saveRole(AppRole appRole);

    public void addRoleToUser(String usernanme, String role);

    public AppUser findUserByUsername(String username);

    public List<AppUser> findAll();
}
