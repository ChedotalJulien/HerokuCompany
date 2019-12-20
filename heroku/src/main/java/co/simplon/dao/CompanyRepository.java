package co.simplon.dao;

import co.simplon.entities.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;



@CrossOrigin("*")
//@RepositoryRestResource
	public interface CompanyRepository extends JpaRepository<Company,Long> {
	
	}