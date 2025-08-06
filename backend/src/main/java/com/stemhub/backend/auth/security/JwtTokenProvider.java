//package com.stemhub.backend.auth.security;
//
//import io.jsonwebtoken.Jwts;
//import io.jsonwebtoken.security.Keys;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Component;
//
//import java.security.Key;
//import java.util.Date;
//
//@Component
//public class JwtTokenProvider {
//
//    @Value("${jwt.secret}")
//    private String secretKey;
//
//    @Value("${jwt.expiration}")
//    private long expirationMs;
//
//    private Key getSigningKey() {
//        return Keys.hmacShaKeyFor(secretKey.getBytes());
//    }
//
//    public String generateToken(String username) {
//        Date now = new Date();
//        Date expiryDate = new Date(now.getTime() + expirationMs);
//    }
//
//}
