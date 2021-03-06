package com.javasampleapproach.springrest.mongodb.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.javasampleapproach.springrest.mongodb.model.synonyme;
import com.javasampleapproach.springrest.mongodb.repo.SynonymeRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class SynonymeController {

	@Autowired
	SynonymeRepository repository;

	@GetMapping("/syn")
	public List<synonyme> getAllSynonyme() {
		

		List<synonyme> synonyme = new ArrayList<>();
		repository.findAll().forEach(synonyme::add);

		return synonyme;
	}
	/**

	@PostMapping("/synonyme/create")
	public synonyme postsynonyme(@RequestBody synonyme synonyme) {

		synonyme _syn = repository.save(new synonyme(synonyme.getCode(), synonyme.getDescription()));
		
		return _syn;
	}
	**/

	@DeleteMapping("/customers/{id}")
	public ResponseEntity<String> deleteCustomer(@PathVariable("id") String id) {
		System.out.println("Delete Customer with ID = " + id + "...");

		repository.deleteById(id);

		return new ResponseEntity<>("Customer has been deleted!", HttpStatus.OK);
	}

	@DeleteMapping("/synonyme/delete")
	public ResponseEntity<String> deleteAllsynonyme() {
		System.out.println("Delete All synonyme...");

		repository.deleteAll();

		return new ResponseEntity<>("All synonyme have been deleted!", HttpStatus.OK);
	}



	@PutMapping("/synonyme/{id}")
	public ResponseEntity<synonyme> updateCustomer(@PathVariable("id") String id, @RequestBody synonyme synonyme) {
		System.out.println("Update Customer with ID = " + id + "...");

		Optional<synonyme> synData = repository.findById(id);

		if (synData.isPresent()) {
			synonyme _syn = synData.get();
			_syn.setCode(synonyme.getCode());
			_syn.setDescription(synonyme.getDescription());
			
			return new ResponseEntity<>(repository.save(_syn), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
}
