package fr.univrouen.cv21server.model;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "autre")
@XmlAccessorType(XmlAccessType.FIELD)
public class Autre {

    @XmlAttribute
    private String comment;
    @XmlAttribute
    private String titre;

    public Autre() {
        comment = "";
        titre="";
    }

	public Autre(String comment, String titre) {
		super();
		this.comment = comment;
		this.titre = titre;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

}
