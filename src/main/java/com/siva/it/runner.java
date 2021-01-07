package com.siva.it;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import lombok.ToString;
@ToString
@Component
public class runner implements CommandLineRunner {
    @Autowired
	private services ser;
    
	@Override
	public void run(String... args) throws Exception {
		ser.showServices();
		System.out.println(this);
	}

}
