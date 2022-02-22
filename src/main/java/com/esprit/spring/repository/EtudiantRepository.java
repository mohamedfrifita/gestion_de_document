package com.esprit.spring.repository;







import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;


import com.esprit.spring.entity.Etudiant;

@Repository
public interface EtudiantRepository extends JpaRepository<Etudiant,Long>{
	
	

	

}


