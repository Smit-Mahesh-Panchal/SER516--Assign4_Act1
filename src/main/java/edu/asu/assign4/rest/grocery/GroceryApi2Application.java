package edu.asu.assign4.rest.grocery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// import to fail the checkstyle
import edu.asu.assign4.rest.grocery.model.GroceryItem;

@SpringBootApplication
public class GroceryApi2Application {

	public static void main(String[] args) {
		SpringApplication.run(GroceryApi2Application.class, args);
	}

}
