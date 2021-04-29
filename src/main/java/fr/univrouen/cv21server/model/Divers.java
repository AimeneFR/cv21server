package fr.univrouen.cv21server.model;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "divers")
@XmlAccessorType(XmlAccessType.FIELD)
public class Divers {

    @XmlElement
	private LV lv;
    @XmlElement
   	private Autre autre;
    
	public Divers() {
		super();
	}
	public Divers(LV lv, Autre autre) {
		super();
		this.lv = lv;
		this.autre = autre;
	}
	public LV getLv() {
		return lv;
	}
	public void setLv(LV lv) {
		this.lv = lv;
	}
	public Autre getAutre() {
		return autre;
	}
	public void setAutre(Autre autre) {
		this.autre = autre;
	}
   	
}
