package astreinte.controllers;

import astreinte.entities.AppUser;
import astreinte.repositories.RoleRepository;
import astreinte.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UtilisateurController {

    @Autowired
    public AccountService ac;

    @Autowired
    public RoleRepository roleDao;

    @RequestMapping(value="/register", method=RequestMethod.POST)
    public ResponseEntity<AppUser> privateUilisateur(@RequestBody RegisterForm rfUsr){

        if(!rfUsr.getPassword().equals(rfUsr.getRePassword()))
            throw new RuntimeException("You must confirm your password");

        AppUser uz = ac.findUserByUsername(rfUsr.getUsername());
        if(uz!=null) throw new RuntimeException("this user already exists!");

        AppUser usr = new AppUser();
        usr.setPassword(rfUsr.getPassword());
        usr.setUsername(rfUsr.getUsername());
        AppUser savedUser = ac.saveUser(usr);

        if (savedUser != null) {
           // CustomerDTO customerDTO = mapCustomerToCustomerDTO(customerResponse);
            return new ResponseEntity(savedUser, HttpStatus.CREATED);
        }
        ac.addRoleToUser(rfUsr.getUsername(),"AGENT");

        return new ResponseEntity("Product is created successfully",
                HttpStatus.CREATED);
    }

    @RequestMapping(value="/users")
    //@PreAuthorize("hasAnyRole('ADMIN', 'AGENT', 'GESTIONNAIRE')")
    public ResponseEntity<AppUser> getUsers(){

        return new ResponseEntity( ac.findAll(), HttpStatus.OK);


    }


    @GetMapping("/api")
    //@PreAuthorize("hasAnyRole('ADMIN')")
    public String privateUilisateur(){

        return "private!";
    }


}
