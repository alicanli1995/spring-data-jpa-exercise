package com.example.classfive;

import com.example.classfive.model.Cart;
import com.example.classfive.model.Item;
import com.example.classfive.repository.CartRepository;
import com.example.classfive.repository.ItemRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class ClassFiveApplication {

	public static void main(String[] args) {
		var appContext = SpringApplication.run(ClassFiveApplication.class, args);

		var itemRepository = appContext.getBean(ItemRepository.class);
		var cartRepository = appContext.getBean(CartRepository.class);

		var cart = new Cart();

		var item = new Item();
		item.setSerialNumber("1234545");
		item.setCart(cart);

		var item2 = new Item();
		item2.setSerialNumber("12345433");
		item2.setCart(cart);

		var itemList = Arrays.asList(item,item2);

		cart.setName("Shopping");
		cart.setItems(itemList);
		cartRepository.save(cart);


	}

}
