package idea.tad;

public class Tad {

    //atributos
    private double Xa;
    private double Xb;
    private double Ya;
    private double Yb;
    private double Dab;

    //construtor
    public Tad(double xa, double ya, double xb, double yb){

        setXa(xa);
        setXa(ya);
        setXa(xb);
        setXa(yb);

    }

    //getters
    private double getXa() {return Xa; }
    private double getXb() {return Xb; }
    private double getYa() { return Ya; }
    private double getYb() { return Yb; }
    private double getDab() {
        calculoDab();
        return Dab; }

    // Método que calcule a distância euclidiana entre dois pontos
    private void calculoDab() { setDab(Math.sqrt(Math.pow(Xb - Xa, 2) + Math.pow(Yb - Ya, 2))); }

    //Setters
    private void setXa(double xa){ this.Xa = xa; }
    private void setXb(double xb){ this.Xb = xb; }
    private void setYa(double ya){ this.Ya = ya; }
    private void setYb(double yb){ this.Yb = yb; }
    private void setDab(double Dab){ this.Dab = Dab; }

    //To string
    public String toString() { return "O resultado é de: " + getDab(); }



}
