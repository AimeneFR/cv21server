package fr.univrouen.cv21server.model;



import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "response")
@XmlAccessorType(XmlAccessType.FIELD)
public class Response {

    @XmlElement
    private Integer id;
    @XmlElement
    private String status;
    @XmlElement
    private String description;

    public Response() {
    }

    public Response(int id, String status) {
        this.id = id;
        this.status = status;
    }
    public Response( String status,String description) {
        this.description = description;
        this.id = null;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
