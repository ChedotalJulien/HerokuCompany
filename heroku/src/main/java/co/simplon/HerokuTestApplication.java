package co.simplon;

import co.simplon.dao.CompanyRepository;
import co.simplon.entities.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HerokuTestApplication implements CommandLineRunner {
	@Autowired
	private CompanyRepository companyRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(HerokuTestApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		companyRepository.save(new Company(null,"Airbus",true));
		companyRepository.save(new Company(null,"Facebook",true));
		companyRepository.save((new Company(null,"Google",true)));
		companyRepository.findAll().forEach(e->{
			System.out.println(e);
		});
		
	}
	
}