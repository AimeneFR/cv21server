package fr.univrouen.cv21server.model;


import javax.xml.bind.annotation.*;

@XmlRootElement(name = "cv")
@XmlAccessorType(XmlAccessType.FIELD)
public class ResumeCV {

    @XmlAttribute
    private long id;
    @XmlElement
    private Identite identite;
    @XmlElement
    private Objectif objectif;

    public ResumeCV() {
    }

    public ResumeCV(long id, Identite identite, Objectif objectif) {
        this.id = id;
        this.identite = identite;
        this.objectif = objectif;
    }

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
}
