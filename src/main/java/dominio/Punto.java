package dominio;

public class Punto {
    private int x;
    private int y;

    public Punto(int x, int y){
        this.x = x;
        this.y = y;
    }
    public Punto(){
        setX(0);
        setY(0);
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

    public double calcularDistancia(Punto P2) {
        int x2=P2.getX();
        int y2=P2.getY();
        int x1=this.x;
        int y1=this.y;
        double Distancia = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        return Distancia;
    }


    @Override
    public String toString(){
        return "P("+this.x+","+this.y+")";
    }
}
