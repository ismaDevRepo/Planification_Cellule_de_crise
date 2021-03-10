package astreinte;

import astreinte.entities.AppRole;
import astreinte.entities.AppUser;
import astreinte.repositories.RoleRepository;
import astreinte.repositories.UserRepository;
import astreinte.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.Optional;
import java.util.stream.Stream;

@SpringBootApplication//(exclude = { SecurityAutoConfiguration.class })
public class Application implements CommandLineRunner {
	@Autowired
	private UserRepository userDao;

	@Autowired
	private AccountService accountService;

	@Autowired
	private RoleRepository roleDao;

	@Bean
	public BCryptPasswordEncoder getBPCE(){
		return new BCryptPasswordEncoder();
	}
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//userDao.deleteAll();
		/*Stream.of("ismail","yohan","stephane","manon").forEach(t-> {
					userDao.save(new AppUser(null, t, "1234", 1));
		});
			Stream.of("ADMIN","AGENT","GESTIONNAIRE").forEach(t-> {
						roleDao.save(new AppRole(null, t));
						userDao.flush();
			});*/
		// Dump existing data for test purpose
		userDao.deleteAll();
		roleDao.deleteAll();
		userDao.flush();
		roleDao.flush();
		// End dump existing data for test purpose

		Stream.of("ADMIN","AGENT","GESTIONNAIRE").forEach(t->{
			roleDao.save(new AppRole(null,t));
		});

		Stream.of("ismail","yohan","stephane","manon").forEach(t->{
			accountService.saveUser(new AppUser(null,t,"123"));
		});

		accountService.saveUser(new AppUser(null,"julien","0"));

		/*accountService.saveRole(new AppRole(null,"AGENT"));
		accountService.saveRole(new AppRole(null,"ADMIN"));
		accountService.saveRole(new AppRole(null,"GESTIONNAIRE"));*/

		accountService.addRoleToUser("ismail","AGENT");
		accountService.addRoleToUser("ismail","GESTIONNAIRE");
		accountService.addRoleToUser("stephane","ADMIN");
		accountService.addRoleToUser("yohan","GESTIONNAIRE");
		accountService.addRoleToUser("manon","GESTIONNAIRE");
		accountService.addRoleToUser("julien","GESTIONNAIRE");


		AppUser u = userDao.findByUsername("stephane");
		u.getRoles().add(roleDao.findByRoleName("ADMIN"));
		userDao.save(u);

		/*Optional<AppUser> u = Optional.ofNullable(userDao.findByUsername("stephane"));
		u.getRoles().add(roleDao.findByRoleName("ADMIN"));
		userDao.save(u);*/


	}
}
