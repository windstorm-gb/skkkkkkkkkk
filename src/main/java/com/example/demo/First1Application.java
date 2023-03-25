package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.dao.UserRepository;
import com.example.demo.model.User;

@SpringBootApplication
public class First1Application {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(First1Application.class, args);
		UserRepository userRepository=  context.getBean(UserRepository.class);
		
		
		
		User user2=new User();
		user2.setId(2);
		user2.setCity("nanded44");
		user2.setName("ganesh44");
		
		User user3=new User();
		user3.setId(3);
		user3.setCity("nanded344");
		user3.setName("ganesh344");
		
		ArrayList<User> arr=new ArrayList<>();
		arr.add(user2);
		arr.add(user3);
	
		  Iterable<User> it=userRepository.saveAll(arr);
		  it.forEach(sk->{
//			  System.out.println(sk);
		  });
		  
		  
//		 Optional<User> optional= userRepository.findById(3);
//		 User user4=optional.get();
//		 user4.setName("ankit");
//		 userRepository.save(user4);
//		 System.out.println(user4);
		 
		 
		 
//		List<User> users= userRepository.findByName("ganesh2");
//		users.forEach(sk->{
//			System.out.println(sk);
//		});
//		
		
//		List<User> userss= userRepository.getAll();
//		userss.forEach(sp->{
//			System.out.println(sp.getName());
//		});
//		 
//		
//		  List<User> users333=userRepository.getUserBYName("ganesh344");
//		  users333.forEach(pp->{
//			  System.out.println(pp.getCity());
//		  });
		  
		  
		List<User> users23= userRepository.getUsers();
		users23.forEach(yu->{
			System.out.println(yu.getCity());
		});
	}

}
