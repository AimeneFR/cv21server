package fr.univrouen.cv21server.model;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "lv")
@XmlAccessorType(XmlAccessType.FIELD)
public class LV {

    @XmlAttribute
    private String cert;
    @XmlAttribute
    private String lang;
    @XmlAttribute
    private String nivs;
    @XmlAttribute
    private String nivi;

    public LV() {
        cert = "";
        lang="";
        nivs=null;
    }

    public String getCert() {
        return cert;
    }

    public void setCert(String cert) {
        this.cert = cert;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String getNivs() {
        return nivs;
    }

    public void setNivs(String nivs) {
        this.nivs = nivs;
    }

    public String getNivi() {
        return nivi;
    }

    public void setNivi(String nivi) {
        this.nivi = nivi;
    }
}
