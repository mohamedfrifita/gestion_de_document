package com.esprit.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.esprit.spring.entity.Document;

import com.esprit.spring.service.IDocumentService;



@RestController
public class DocumentRestController  {
	@Autowired
	IDocumentService documentService;
	
	
	// http://localhost:8081/SpringMVC/servlet/add-doc
	
		@PostMapping("/add-doc")
		@ResponseBody
		 public void ajouterDoc(@RequestBody Document d) {
			documentService.ajouterDoc(d);
			
			
		}
		
		// http://localhost:8081/SpringMVC/servlet/findDocsByEtudiant/{matricule}
				@GetMapping("/findDocsByEtudiant/{matricule}")
				@ResponseBody
				public List<Document> findDocsByEtudiant(@PathVariable("matricule") Long matricule) {
				return documentService.findDocsByEtudiant(matricule);
				}

	

}
