package com.esprit.spring.service;

import java.util.List;

import com.esprit.spring.entity.Document;
import com.esprit.spring.entity.Etudiant;

public interface IEtudiantService {
	public void ajouterEtudiant (Etudiant etudiant);
	public void affecterDocumentEtudiant (String idDoc, Long matricule);
	
	public void suppEtudiantAllDocs (Long matricule);


}
