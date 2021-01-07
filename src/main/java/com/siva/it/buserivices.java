package com.siva.it;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Profile("default")
@Data
public class buserivices implements services {
	 @Value("${my.app.busName}")
	 private String busName;
	@Override
	public void showServices() {
		
   System.out.println("this is from bus =>"+busName);
	}

}
