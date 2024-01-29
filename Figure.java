public abstract class Figure {
    protected  String nom;




    public abstract double calculerAire();

    public abstract double calculerPerimetre();

    public void afficherDetails(String nom,double air,double perimetre){
        System.out.println("Nom de la figure : " + nom);
        System.out.println("Aire de la figure : " + calculerAire());
        System.out.println("Périmètre de la figure : " + calculerPerimetre());

    }


}
