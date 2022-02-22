package com.esprit.spring.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esprit.spring.entity.Document;
import com.esprit.spring.repository.DocumentRepository;

@Service
public class DocumentServiceImpl  implements IDocumentService{
	@Autowired
	DocumentRepository documentRepository;
	 private static final Logger L = LogManager.getLogger(DocumentServiceImpl.class);

	@Override
	public void ajouterDoc(Document d) {
		documentRepository.save(d);
		
	}
	
	@Override
	public List<Document> findDocsByEtudiant(Long matricule) {
		return documentRepository.findDocsByEtudiant( matricule);
		
	}

}
