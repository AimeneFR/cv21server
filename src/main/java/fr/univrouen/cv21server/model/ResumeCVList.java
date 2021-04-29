package fr.univrouen.cv21server.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "cvlist")
@XmlAccessorType(XmlAccessType.FIELD)
public class ResumeCVList {
    @XmlElement(name = "cv" )
    private List<ResumeCV> cvList = new ArrayList<ResumeCV>();

    public ResumeCVList() {
    }
    public ResumeCVList(List<CV> cvList) {
        for (CV cvi : cvList){
            ResumeCV resumeCV = new ResumeCV();
            resumeCV.setId(cvi.getId());
            resumeCV.setIdentite(cvi.getIdentite());
            resumeCV.setObjectif(cvi.getObjectif());
            this.cvList.add(resumeCV);
        }
    }

    public List<ResumeCV> getCVSList() {
        return cvList;
    }
}
