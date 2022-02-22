package com.esprit.spring.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import com.esprit.spring.entity.Etudiant;

import com.esprit.spring.service.IEtudiantService;

@RestController
public class EtudiantRestController {
	@Autowired
	IEtudiantService etudiantService;
	
	// http://localhost:8081/SpringMVC/servlet/add-etudiant
	
	@PostMapping("/add-etudiant")
	@ResponseBody
	 public void ajouterEtudiant(@RequestBody Etudiant etudiant) {
		etudiantService.ajouterEtudiant(etudiant);
		
		
	}
	
	// http://localhost:8081/SpringMVC/servlet/affecterDocumentEtudiant
	@PostMapping("/affecterDocumentEtudiant")
	@ResponseBody
	public void affecterDocumentEtudiant(@RequestParam ("idDoc")String idDoc,@RequestParam("matricule") Long matricule) {
	 
		etudiantService.affecterDocumentEtudiant(idDoc, matricule);
		}
	
	// http://localhost:8081/SpringMVC/servlet/suppEtudiantAllDocs/{matricule}
		@DeleteMapping("/suppEtudiantAllDocs/{matricule}")
		@ResponseBody
	public void suppEtudiantAllDocs(@PathVariable("matricule")Long matricule) {
		etudiantService.suppEtudiantAllDocs(matricule);
	}
	
	
}
