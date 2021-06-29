package dominio;

public class Punto {
    private int x;
    private int y;
    private double calcularDistancia;

    public Punto(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public Punto(double calcularDistancia) {
        this.calcularDistancia = calcularDistancia;
    }
    
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double getCalcularDistancia() {
        return calcularDistancia;
    }
    public void setCalcularDistancia(Punto P2) {
        int x2=P2.getX();
        int y2=P2.getY();
        int x1=this.x;
        int y1=this.y;
        this.calcularDistancia = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
    }


    @Override
    public String toString(){
        return "P("+this.x+","+this.y+")";
    }
}
