package examen1p2lab_rigobertobarahona;

import java.util.ArrayList;

public class Personaje {
    String nameP;
    int vida;
    int escudo;
    ArrayList<Arma> arma = new ArrayList();

    public String getNameP() {
        return nameP;
    }

    public void setName(String nameP) {
        this.nameP = nameP;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getEscudo() {
        return escudo;
    }

    public void setEscudo(int escudo) {
        this.escudo = escudo;
    }

    public ArrayList<Arma> getArma() {
        return arma;
    }

    public void setArma(ArrayList<Arma> arma) {
        this.arma = arma;
    }

    public Personaje(String nameP, int vida, int escudo, ArrayList<Arma> arma) {
        this.nameP = nameP;
        this.vida = vida;
        this.escudo = escudo;
        this.arma = arma;
    }
    
    
}
