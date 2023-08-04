package Model.Plan;

public abstract class Plan_movil_Minutos_Megas extends Plan_movil {
    protected double min;
    protected double costo_min = 0.10;
    protected double megas_gigas;
    protected double costo_gigas = 0.20;
    public Costos_min costos_min;
    public Costos_megas costos_megas;

    public Plan_movil_Minutos_Megas(double tarifa, double min, double megas_gigas) {
        super(tarifa);
        this.min = min;
        this.megas_gigas = megas_gigas;
    }

    public double getMin() {
        return min;
    }

    public void setMin(double min) {
        this.min = min;
    }

    public double getCosto_min() {
        return costo_min;
    }

    public void setCosto_min(double costo_min) {
        this.costo_min = costo_min;
    }

    public double getMegas_gigas() {
        return megas_gigas;
    }

    public void setMegas_gigas(double megas_gigas) {
        this.megas_gigas = megas_gigas;
    }

    public double getCosto_gigas() {
        return costo_gigas;
    }

    public void setCosto_gigas(double costo_gigas) {
        this.costo_gigas = costo_gigas;
    }

    public abstract double calcularExtra_min();

    public abstract double calcularExtra_gigas();

    public abstract void calcularTarifa();

}
