package fr.univrouen.cv21server.model;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "diplome")
@XmlAccessorType(XmlAccessType.FIELD)
public class Diplome {

    @XmlAttribute
    private String niveau;
    @XmlElement
    private String date;
    @XmlElement
    private String titre;
    @XmlElement
    private String etab;

    public Diplome() {
    }

    public String getNiveau() {
        return niveau;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String discript) {
        this.titre = discript;
    }

    public String getEtab() {
        return etab;
    }

    public void setEtab(String etab) {
        this.etab = etab;
    }
}
