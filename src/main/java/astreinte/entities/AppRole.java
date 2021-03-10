package astreinte.entities;


import javax.persistence.*;
import java.util.*;

@Entity
public class AppRole {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAppRole;

    @Column
    private String roleName;

    @ManyToMany
    @JoinTable( name = "T_Users_Roles_Associations",
            joinColumns = @JoinColumn( name = "idAppRole" ),
            inverseJoinColumns = @JoinColumn( name = "idAppUser" ) )
    private List<AppUser> users = new ArrayList<>();

    @ManyToOne
    private CelluleUser roIdCelluleUser;


    /* -------Accesseurs--------------- */

    public Long getIdAppRole() {
        return idAppRole;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public List<AppUser> getUsers() {
        return users;
    }

    public void setUsers(List<AppUser> users) {
        this.users = users;
    }

    public CelluleUser getRoIdCelluleUser() {
        return roIdCelluleUser;
    }

    public void setRoIdCelluleUser(CelluleUser roIdCelluleUser) {
        this.roIdCelluleUser = roIdCelluleUser;
    }


    /* Constructeurs */
    public AppRole(Long o, String role) {
        this.idAppRole=o;
        this.roleName=role;
        // this.ro_idCelluleUser=ro;
    }

    public AppRole() {    }
    /* End Constructeurs */



}
