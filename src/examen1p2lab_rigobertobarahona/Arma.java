package examen1p2lab_rigobertobarahona;
import java.util.ArrayList;

public class Arma {
    String nameA;
    int dano;
    int presicion;

    public Arma() {
    }

    public String getName() {
        return nameA;
    }

    public void setNameA(String name) {
        this.nameA = name;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public int getPresicion() {
        return presicion;
    }

    public void setPresicion(int presicion) {
        this.presicion = presicion;
    }

    public Arma(String nameA, int dano, int presicion) {
        this.nameA = nameA;
        this.dano = dano;
        this.presicion = presicion;
    }

    @Override
    public String toString() {
        return "Arma{" + "nameA=" + nameA + ", dano=" + dano + ", presicion=" + presicion + '}';
    }
    
}
