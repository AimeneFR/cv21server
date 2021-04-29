package fr.univrouen.cv21server.model;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "prof")
@XmlAccessorType(XmlAccessType.FIELD)
public class Prof {

    @XmlElement(name = "expe")
    private List<Expe> expes;

    public Prof() {
        this.expes = new ArrayList<Expe>();
    }

    public List<Expe> getExpe() {
        return expes;
    }

    public void setExpe(List<Expe> expes) {
        this.expes = expes;
    }
    public void addExpe(Expe expe){
        expes.add(expe);
    }
}
