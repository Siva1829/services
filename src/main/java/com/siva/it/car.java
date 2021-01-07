package com.siva.it;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Profile({"qa","default"})
//@ConfigurationProperties(prefix = "my.app")
@Data
public class car implements services {
	 @Value("${my.app.busName}")
	 private String busName;
;
		@Override 
		public void showServices() {
			
	   System.out.println("this is from car =>"+busName);
		}

}
