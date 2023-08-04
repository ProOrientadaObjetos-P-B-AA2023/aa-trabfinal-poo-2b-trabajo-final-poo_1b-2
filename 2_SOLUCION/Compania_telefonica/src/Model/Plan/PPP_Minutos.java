package Model.Plan;

public class PPP_Minutos extends Plan_movil {
    protected double min_Internacionales;
    protected double min_Nacionales;
    protected double costoMin_Internacional = 0.25;
    protected double costoMin_Nacional = 0.25;
    public Costos_min costos_min;

    public PPP_Minutos(double tarifa, double min_Internacionales, double min_Nacionales) {
        super(tarifa);
        this.min_Internacionales = min_Internacionales;
        this.min_Nacionales = min_Nacionales;
    }

    public double calcularExtra_min_Nacional() {
        return this.costos_min.calcularCosto_min(this.min_Nacionales,this.costoMin_Nacional,30);
    }

    public double calcularExtra_min_Internacional() {
        return this.costos_min.calcularCosto_min(this.min_Internacionales,this.costoMin_Internacional,30);
    }

    public void calcularTarifa() {
        this.tarifa = this.tarifa + calcularExtra_min_Nacional() + calcularExtra_min_Internacional();
    }
}
