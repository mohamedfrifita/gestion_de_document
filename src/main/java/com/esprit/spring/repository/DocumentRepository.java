package com.esprit.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import com.esprit.spring.entity.Document;

@Repository
public interface DocumentRepository extends JpaRepository<Document,String> {
	
	
	@Query("SELECT d FROM Document d join d.etudiant e where e.matricule=:matricule")
	public List<Document> findDocsByEtudiant(@Param("matricule") Long matricule);

}
