package com.esprit.spring.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
@Table(name="etudiant")
public class Etudiant implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long matricule;
	@Column(name="prenom")
	private String prenom;
	@Column(name="nom")
	private String nom;
	@Column(name="password")
	private String password;
	@Enumerated(EnumType.STRING)
	 typeEtudiant TypeEtudiant;
	@JsonIgnore
	@OneToMany( mappedBy="etudiant",cascade = CascadeType.ALL)
	private Set<Document> documents;

	
	
	 
	public Set<Document> getDocuments() {
		return documents;
	}
	public void setDocuments(Set<Document> documents) {
		this.documents = documents;
	}
	public long getMatricule() {
		return matricule;
	}
	public void setMatricule(long matricule) {
		this.matricule = matricule;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public typeEtudiant getTypeEtudiant() {
		return TypeEtudiant;
	}
	public void setTypeEtudiant(typeEtudiant typeEtudiant) {
		TypeEtudiant = typeEtudiant;
	}
	public Etudiant() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Etudiant(long matricule, String prenom, String nom, String password, typeEtudiant typeEtudiant) {
		super();
		this.matricule = matricule;
		this.prenom = prenom;
		this.nom = nom;
		this.password = password;
		TypeEtudiant = typeEtudiant;
	}
	
	
	

}
