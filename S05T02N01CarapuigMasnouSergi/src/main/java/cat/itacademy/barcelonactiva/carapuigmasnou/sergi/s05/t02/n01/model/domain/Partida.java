package cat.itacademy.barcelonactiva.carapuigmasnou.sergi.s05.t02.n01.model.domain;

import org.springframework.data.mongodb.core.mapping.Document;


import jakarta.persistence.Id;
@Document(collection = "partides")
public class Partida {

    @Id
    private int id;

    private int jugadorId;

    private int valorDau1;

    private int valorDau2;

    private int resultat;

    private boolean guanyada;

    public Partida() {
    	
    }
    public Partida(Integer jugadorId, int valorDau1, int valorDau2, int resultat, boolean guanyada) {
        this.jugadorId = jugadorId;
        this.valorDau1 = valorDau1;
        this.valorDau2 = valorDau2;
        this.resultat = resultat;
        this.guanyada = guanyada;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public int getJugadorId() {
        return jugadorId;
    }
    
    public void setJugadorId(Integer jugadorId) {
        this.jugadorId = jugadorId;
    }
    
    public int getValorDau1() {
        return valorDau1;
    }
    
    public void setValorDau1(int valorDau1) {
        this.valorDau1 = valorDau1;
    }
    
    public int getValorDau2() {
        return valorDau2;
    }
    
    public void setValorDau2(int valorDau2) {
        this.valorDau2 = valorDau2;
    }
    
    public int getResultat() {
        return resultat;
    }
    
    public void setResultat(int resultat) {
        this.resultat = resultat;
    }
    
    public boolean isGuanyada() {
        return guanyada;
    }
    
    public void setGuanyada(boolean guanyada) {
        this.guanyada = guanyada;
    }
}