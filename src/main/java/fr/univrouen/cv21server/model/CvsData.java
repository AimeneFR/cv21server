package fr.univrouen.cv21server.model;


import fr.univrouen.cv21server.exceptions.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CvsData {
    private List<CV> cvsList= new ArrayList<CV>();
    private String _id;
    private String _rev;
    private int id ;
    public CvsData(){}
    public List<CV> getCvs(){
        return cvsList;
    }
    public CV getCVById(int id) throws CVNotFoundException{
        return cvsList.stream().filter(CV -> CV.getId()==id).findFirst().orElseThrow(()-> new CVNotFoundException("L'id : "+id+" cherché est introuvable"));
    }
    public void insertCvs(CV CV){
        CV.setId(nextId());
        cvsList.add(CV);
        id++;
    }
    public void deleteCv(int id) throws CVNotFoundException{
        CV CV = getCVById(id);
        cvsList.remove(CV);
    }
    public void updateCv(int id, CV CV) throws CVNotFoundException{
        deleteCv(id);
        CV.setId(id);
        insertCvs(CV);
    }
    public int nextId(){
        return id;
    }
}
