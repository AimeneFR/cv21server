package fr.univrouen.cv21server.model;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

@XmlRootElement(name = "expe")
@XmlAccessorType(XmlAccessType.FIELD)
public class Expe {

    @XmlElement
    private String datedeb;
    @XmlElement
    private String datefin;
    @XmlElement
    private String titre;

    public Expe() {
        datedeb = "";
        titre = "";
    }

    public Expe(String datedeb, String titre) {
		super();
		this.datedeb = datedeb;
		this.titre = titre;
	}

    public Expe(String titre) {
		super();
		this.datedeb = "";
		this.titre = titre;
	}

    public String getDatedeb() {
        return datedeb;
    }

    public void setDatedeb(String datedeb) {
        this.datedeb = datedeb;
    }

    public String getDatefin() {
        return datefin;
    }

    public void setDatefin(String datefin) {
        this.datefin = datefin;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }
}
