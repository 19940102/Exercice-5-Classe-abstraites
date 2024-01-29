public class Cercle extends Figure {

    private double rayon;
    private double π;
    public Cercle() {
    }

    public Cercle(String nom,double rayon) {
        this.rayon = rayon;
        this.nom=nom;
    }

    @Override
    public double calculerAire() {

        double v = π * (rayon * rayon);
        return v;
    }

    @Override
    public double calculerPerimetre() {
        return (2 * π * rayon);
    }
}





