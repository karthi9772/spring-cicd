package com.example.spring_learn;

import java.util.Collection;
import java.util.HashMap;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import data.ImgData;
import data.Img;

@RestController
public class Cont {
	
	
	@GetMapping("/")
	public String hello() {
		return "hello World!";
	}
	
	@GetMapping("/img")
	public Collection<data.Img> getImg() {
		return ImgData.db.values();
	}
	@GetMapping("/img/{id}")
	public Img getById(@PathVariable Integer id) {
		Img img=ImgData.db.get(id);
		if(img==null) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND);
		}
		return img;
		
	}
	

}
