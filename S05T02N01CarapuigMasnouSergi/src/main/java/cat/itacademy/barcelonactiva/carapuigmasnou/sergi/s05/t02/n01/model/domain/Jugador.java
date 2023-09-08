package cat.itacademy.barcelonactiva.carapuigmasnou.sergi.s05.t02.n01.model.domain;

import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;
import jakarta.persistence.Id;

@Document(collection = "jugadors") 
public class Jugador { 
	
	@Id
    private int id;
    
    private String nom;
    
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dataDeRegistre;
    
    public Jugador() {
    	
    }

    public Jugador(int id, String nom, Date dataDeRegistre) {
        this.id = id;
        this.nom = nom;
        this.dataDeRegistre = dataDeRegistre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Date getDataDeRegistre() {
        return dataDeRegistre;
    }

    public void setDataDeRegistre(Date dataDeRegistre) {
        this.dataDeRegistre = dataDeRegistre;
    }

    @Override
    public String toString() {
        return "Jugador [id=" + id + ", nom=" + nom + ", dataDeRegistre=" + dataDeRegistre + "]";
    }
}