package fr.univrouen.cv21server.model;


import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "competences" )
@XmlAccessorType(XmlAccessType.FIELD)
public class Competences {

    @XmlElement(name = "diplome")
    private Diplome[] diplomes;

    @XmlElement(name = "certif")
    private List<Certif> certifs;

    @XmlElement(name = "lv")
    private LV[] lvs;
    @XmlElementWrapper(name = "info")
    @XmlElement(name = "langage")
    private List<Langage> langages;


    public Competences() {
        diplomes = new Diplome[5];
        certifs = new ArrayList<Certif>();
        lvs = new LV[5];
        langages = new ArrayList<Langage>();
    }

    public Diplome[] getDiplomes() {
        return diplomes;
    }

    public void setDiplomes(Diplome[] competences) {
        this.diplomes = competences;
    }

    public List<Certif> getCertif() {
        return certifs;
    }

    public void setCertif(List<Certif> certifs) {
        this.certifs = certifs;
    }

    public LV[] getLv() {
        return lvs;
    }

    public void setLv(LV[] lv) {
        this.lvs = lv;
    }

    public List<Langage> getInfo() {
        return langages;
    }

    public void setInfo(List<Langage> langages) {
        this.langages = langages;
    }
}
