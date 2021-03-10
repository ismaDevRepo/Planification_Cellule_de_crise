package astreinte.entities;

import astreinte.secu.ValidEmail;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;


@Entity
public class AppUser {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idAppUser;

	/*Champs profil_user fixes système*/

 	@Column(unique = true)
	private String username;


	@Column
	private String prenom;

	@Column
	private String password;

	@Column
	private int active;

	@Column
	private String permissions = "";

	@ValidEmail
	@NotNull
	@NotEmpty
	@Column
	private String email;

	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable( name = "T_Users_Roles_Associations",
			joinColumns = @JoinColumn( name = "idAppUser" ),
			inverseJoinColumns = @JoinColumn( name = "idAppRole" ) )
	private List<AppRole> roles = new ArrayList<>();


	/* Champs ajout en fonction du client (ex. EDF ici) */

	@OneToMany(targetEntity = UserProperties.class, mappedBy = "upIdUser")
	private List<UserProperties> u_idUP = new ArrayList<>();


	@OneToMany(targetEntity = CelluleUser.class, mappedBy = "cuUsr")
	private List<CelluleUser> celluleUserList = new ArrayList<>();

	@OneToMany(targetEntity = UserMedia.class, mappedBy = "umUserId")
	private List<UserMedia> userMediaList = new ArrayList<>();


	/* Constructeurs */

	public AppUser(Long id, String username, String password) {
		this.idAppUser = id;
		this.username = username;
		this.password=password;
		this.active=1;
	}

	public AppUser(String username, int active) {
		this.username = username;
		this.active=active;

	}

	public AppUser() {	}

	/* End Constructeurs */

	/* -------Accesseurs--------------- */

	public Long getIdAppUser() {
		return idAppUser;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	@JsonIgnore
	public String getPassword() {
		return password;
	}

	@JsonSetter
	public void setPassword(String password) {
		this.password = password;
	}

	public int getActive() {
		return active;
	}

	public void setActive(int active) {
		this.active = active;
	}

	public String getPermissions() {
		return permissions;
	}

	public void setPermissions(String permissions) {
		this.permissions = permissions;
	}

	public List<AppRole> getRoles() {
		return roles;
	}

	public void setRoles(List<AppRole> roles) {
		this.roles = roles;
	}

}
