package com.esprit.spring.service;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.esprit.spring.entity.Document;

import com.esprit.spring.entity.Etudiant;
import com.esprit.spring.repository.DocumentRepository;
import com.esprit.spring.repository.EtudiantRepository;

@Service
public class EtudiantServiceImpl implements IEtudiantService {
	
	
	@Autowired
	EtudiantRepository etudiantRepository;
	
	@Autowired
	DocumentRepository documentRepository;
	 private static final Logger L = LogManager.getLogger(EtudiantServiceImpl.class);

	@Override
	public void ajouterEtudiant(Etudiant etudiant) {
		etudiantRepository.save(etudiant);	
		
	}

	@Override
	public void affecterDocumentEtudiant(String idDoc, Long matricule) {
		Etudiant etudiant=etudiantRepository.findById(matricule).get();
		Document document=documentRepository.findById(idDoc).get();
		document.setEtudiant(etudiant);
		documentRepository.save(document);
		
	}

	

	@Override
	public void suppEtudiantAllDocs(Long matricule) {
		etudiantRepository.deleteById(matricule);
		
	}
	

}
