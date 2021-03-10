package astreinte.secu;


import astreinte.entities.AppUser;
import astreinte.jwt.JwtProperties;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.core.Authentication;
import javax.servlet.FilterChain;


import org.springframework.security.authentication.AuthenticationManager;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.core.AuthenticationException;

import java.io.IOException;
import java.util.Date;

public class JwtAuthenticationFilter extends UsernamePasswordAuthenticationFilter {


    private AuthenticationManager authenticationManager;

    public JwtAuthenticationFilter(AuthenticationManager authenticationManager) {
        super();
        this.authenticationManager = authenticationManager;
    }

    @Override
    public Authentication attemptAuthentication(HttpServletRequest request,
                                                HttpServletResponse response) throws AuthenticationException {
        AppUser apusr = null;
        // www url encoded  format
        //  String username = request.getParameter("username") ;

        // serialisation Json
        try {
            apusr = new ObjectMapper().readValue(request.getInputStream(), AppUser.class);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("**************");
        System.out.println("username: " + apusr.getUsername());
        System.out.println("password: " + apusr.getPassword());

        return authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(apusr.getUsername(), apusr.getPassword()));
    }

    @Override
    protected void successfulAuthentication(HttpServletRequest rq,
                                            HttpServletResponse resp, FilterChain chain,
                                            Authentication authRes) throws IOException, ServletException {
        User spingUsr = (User) authRes.getPrincipal();
        String jwt = Jwts.builder()
                .setSubject(spingUsr.getUsername())
                .setExpiration(new Date(System.currentTimeMillis() + JwtProperties.EXPIRATION_TIME))
                .signWith(SignatureAlgorithm.HS256, JwtProperties.SECRET)
                .claim("roles", spingUsr.getAuthorities())
                .compact();

        resp.addHeader(JwtProperties.HEADER_STRING, JwtProperties.TOKEN_PREFIX + jwt);
    }

    /*   @Override*/
    /*   protected void successfulAuthentication(HttpServletRequest request,*/
    /*                                           HttpServletResponse response) throws IOException, ServletException{*/

    // }

}