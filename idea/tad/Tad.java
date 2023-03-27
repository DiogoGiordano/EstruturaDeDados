package idea.tad;

public class Tad {

    public double xa;
    public double xb;
    public double ya;
    public double yb;
    public double Dab;

    public Tad(double xa, double xb, double ya, double yb){

        this.xa = xa;
        this.xb = xb;
        this.ya = ya;
        this.yb = yb;

    }

    public double getXa() {
        return xa;
    }

    public double getXb() {
        return xb;
    }

    public double getYa() {
        return ya;
    }

    public double getYb() {
        return yb;
    }

    public double getDab(){
        return Dab;
    }

    public void setXa(double xa){
        this.xa = xa;
    }

    public void setXb(double xb){
        this.xb = xb;
    }

    public void setYa(double ya){
        this.ya = ya;
    }

    public void setYb(double yb){
        this.yb = yb;
    }

    public void setDab(double Dab){
        this.Dab = Dab;
    }

    public void CalculoDaDistancia (){
        setDab(Math.sqrt(Math.pow(xb - xa, 2) + Math.pow(yb - ya, 2)));
    }



}
