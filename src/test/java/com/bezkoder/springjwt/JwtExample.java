package com.bezkoder.springjwt;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

import java.security.Key;

public class JwtExample {
    public static void main(String[] args) {
        // Generate a secure key
        Key key = Keys.secretKeyFor(SignatureAlgorithm.HS256);

        // Example JWT creation
        String jwt = Jwts.builder()
                .setSubject("example-user")
                .signWith(key)
                .compact();

        System.out.println("Generated JWT: " + jwt);
    }
}
