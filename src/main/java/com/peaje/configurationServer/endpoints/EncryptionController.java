package com.peaje.configurationServer.endpoints;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EncryptionController {
  
	@Autowired
	private PasswordEncoder encoder;
	
	
	@PostMapping("/encryption")
	public String encrypt(@RequestBody final String key) {
		return encoder.encode(key);
	}
}
