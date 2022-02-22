package com.esprit.spring.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;


import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
@Table(name="document")
public class Document implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	
	private String id_Doc;
	@Column(name="titre")
	private String titre;
	@Column(name="auteur")
	private String auteur;
	@Column(name="nbPages")
	private Integer nbPages;
	@Enumerated(EnumType.STRING)
	 typeDoc TypeDoc ;
	@JsonIgnore
	@ManyToOne
	Etudiant etudiant;
	
	
	
	public Etudiant getEtudiant() {
		return etudiant;
	}
	public void setEtudiant(Etudiant etudiant) {
		this.etudiant = etudiant;
	}
	
	public String getIdDoc() {
		return id_Doc;
	}
	public void setIdDoc(String idDoc) {
		this.id_Doc = idDoc;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getAuteur() {
		return auteur;
	}
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	public Integer getNbPages() {
		return nbPages;
	}
	public void setNbPages(Integer nbPages) {
		this.nbPages = nbPages;
	}
	public typeDoc getTypeDoc() {
		return TypeDoc;
	}
	public void setTypeDoc(typeDoc typeDoc) {
		TypeDoc = typeDoc;
	}
	public Document(String idDoc, String titre, String auteur, Integer nbPages, typeDoc typeDoc) {
		super();
		this.id_Doc = idDoc;
		this.titre = titre;
		this.auteur = auteur;
		this.nbPages = nbPages;
		TypeDoc = typeDoc;
	}
	public Document() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
