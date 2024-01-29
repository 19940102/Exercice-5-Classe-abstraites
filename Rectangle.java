public class Rectangle extends Figure {
    private  double longueur;
    private  double largeur;

    public Rectangle() {
    }

    public Rectangle(double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    @Override
    public double calculerAire() {
        return(longueur * largeur);
    }

    @Override
    public double calculerPerimetre() {
        return(2 * (longueur + largeur)) ;
    }
}
