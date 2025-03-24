package com.example.agendator.services;

import java.time.Instant;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.oauth2.jwt.JwtClaimsSet;
import org.springframework.security.oauth2.jwt.JwtEncoder;
import org.springframework.security.oauth2.jwt.JwtEncoderParameters;
import org.springframework.stereotype.Service;

@Service
public class JwtService {

	@Autowired
	private JwtEncoder encoder;
	
	public String generateToken(Authentication authentication) {
		Instant now = Instant.now();
		long expiry = 86400L;
		
		List<String> authorities = authentication.getAuthorities().stream()
		        .map(GrantedAuthority::getAuthority)
		        .collect(Collectors.toList());
		
		var claims = JwtClaimsSet.builder().issuer("spring-security-jwt")
				.issuedAt(now)
				.expiresAt(now.plusSeconds(expiry))
				.subject(authentication.getName())
				.claim("authorities", authorities)
				.build();
				
		return encoder.encode(JwtEncoderParameters.from(claims)).getTokenValue();
	}
	
}
