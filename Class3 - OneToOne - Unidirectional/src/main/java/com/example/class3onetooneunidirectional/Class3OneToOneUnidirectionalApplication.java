package com.example.class3onetooneunidirectional;

import com.example.class3onetooneunidirectional.model.Address;
import com.example.class3onetooneunidirectional.model.User;
import com.example.class3onetooneunidirectional.repository.AddressRepository;
import com.example.class3onetooneunidirectional.repository.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Class3OneToOneUnidirectionalApplication {

	public static void main(String[] args) {
		var appConfigContext = SpringApplication.run(Class3OneToOneUnidirectionalApplication.class, args);

		var userRepository = appConfigContext.getBean(UserRepository.class);
		var addressRepository = appConfigContext.getBean(AddressRepository.class);

		var address = new Address();
		address.setStreet("Mimar Sinan Mahallesi");
		addressRepository.save(address);

		var user = new User();
		user.setName("Ali CANLI");
		user.setAddress(address);
		userRepository.save(user);
	}

}
