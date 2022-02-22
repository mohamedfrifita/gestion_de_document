package com.esprit.spring.service;

import java.util.List;

import com.esprit.spring.entity.Document;

public interface IDocumentService {
	public void ajouterDoc (Document d) ;
	public List<Document>findDocsByEtudiant( Long matricule);

}
