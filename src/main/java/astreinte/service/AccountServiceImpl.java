package astreinte.service;

import astreinte.entities.AppRole;
import astreinte.entities.AppUser;
import astreinte.repositories.RoleRepository;
import astreinte.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class AccountServiceImpl implements AccountService{

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    private UserRepository userDao;

    @Autowired
    private RoleRepository roleDao;

    @Override
    public AppUser saveUser(AppUser appUser) {
        String hashPwd = bCryptPasswordEncoder.encode(appUser.getPassword());
        appUser.setPassword(hashPwd);
        return userDao.save(appUser);
    }

    @Override
    public AppRole saveRole(AppRole appRole) {

        return roleDao.save(appRole);
    }

    @Override
    public void addRoleToUser(String username, String roleName) {
        AppRole roler = roleDao.findByRoleName(roleName);
        AppUser useer = userDao.findByUsername(username);
        useer.getRoles().add(roler);
    }


    @Override
    public AppUser findUserByUsername(String username) {

        return userDao.findByUsername(username);
    }

    @Override
    public List<AppUser> findAll() {
        return userDao.findAll();
    }
}
