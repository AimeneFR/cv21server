package fr.univrouen.cv21server.model;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "objectif")
@XmlAccessorType(XmlAccessType.FIELD)
public class Objectif {

    @XmlAttribute(name = "statut")
    private String statut;

    public Objectif() {
        statut=null;
    }

	public Objectif(String statut) {
		super();
		this.statut = statut;
	}

	public String getStatut() {
		return statut;
	}

	public void setStatut(String statut) {
		this.statut = statut;
	}

}
