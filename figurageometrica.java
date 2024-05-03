Interface FiguraGeometrica {
    public double calcularArea();
    public double calcularPerimetre();
}

abstract class Figura2D implements FiguraGeometrica {
    protected String nom;

      

public Figura2D(String nom) {
    this.nom = nom;
}

    

}