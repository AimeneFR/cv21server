package fr.univrouen.cv21server.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@XmlRootElement(name = "cv21")
@XmlAccessorType(XmlAccessType.FIELD)
@Document(collection="cv")
public class CV {
	
	@Id
	@XmlElement
	private long id;
	@XmlElement
	private Identite identite;
	@XmlElement
    private Objectif objectif;
    @XmlElement
    private Prof prof;
    @XmlElement
    private Competences competences;
	@XmlElement
    private Divers divers;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Identite getIdentite() {
		return identite;
	}

	public void setIdentite(Identite identite) {
		this.identite = identite;
	}

	public Objectif getObjectif() {
		return objectif;
	}

	public void setObjectif(Objectif objectif) {
		this.objectif = objectif;
	}

	public Prof getProf() {
		return prof;
	}

	public void setProf(Prof prof) {
		this.prof = prof;
	}

	public Competences getCompetences() {
		return competences;
	}

	public void setCompetences(Competences competences) {
		this.competences = competences;
	}

	public Divers getDivers() {
		return divers;
	}

	public void setDivers(Divers divers) {
		this.divers = divers;
	}

	public CV(long id, Identite identite, Objectif objectif, Prof prof, Competences competences) {
		super();
		this.id = id;
		this.identite = identite;
		this.objectif = objectif;
		this.prof = prof;
		this.competences = competences;
	}

	public CV() {
		super();
	}
	

	

}
