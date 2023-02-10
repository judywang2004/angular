package demo.demo.controller;

import org.springframework.http.HttpRequest;
import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
// import io.jsonwebtoken.Jwts;
import com.nimbusds.jwt.JWTParser;

import java.nio.charset.StandardCharsets;

/**
 * Created by judy  on 2023 /02/08.
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @GetMapping("/getCurrentUser")
    public Object getCurrentUser(Authentication authentication, HttpRequest request) {
        // String header = request.getHeader("Authorization");
        // String token = StringUtils.subAfter(header, "bearer ", false);
       
        // return Jwts.parser()
        //         .setSigningKey("test_key".getBytes(StandardCharsets.UTF_8))
        //         .parseClaimsJws(token)
        //         .getBody();
        return "";
    }

}