package co.simplon.web;


import co.simplon.dao.CompanyRepository;
import co.simplon.entities.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

	@RestController
	public class Controller {
		@Autowired
		CompanyRepository companyRepository;
		
		@GetMapping("/")
		String home() {
			return "Welcome ";
		}
		@GetMapping("/companies")
		List<Company> companies(){
			return companyRepository.findAll();
		}
		
	}