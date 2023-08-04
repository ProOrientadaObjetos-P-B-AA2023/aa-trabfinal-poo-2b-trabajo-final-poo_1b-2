package Model.Plan;

public class PPP_Megas extends Plan_movil{
    protected double gigas;
    protected double costo_gigas = 0.20;
    public Costos_megas costos_megas;

    public PPP_Megas(double tarifa, double gigas) {
        super(tarifa);
        this.gigas = gigas;
    }

    public double calcularExtra_gigas() {
        return this.costos_megas.calcularCosto_megas(gigas, costo_gigas, 50);
    }

    public void calcularTarifa() {
        this.tarifa += calcularExtra_gigas();
    }
}
