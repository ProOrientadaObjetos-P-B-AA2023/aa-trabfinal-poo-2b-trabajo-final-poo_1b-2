package Model.Plan;

public abstract class Plan_movil {
    protected double min;
    protected double megas;
    protected static double costo_min = 0.10;
    protected static double costo_mega = 1;
    protected ICostos_min_y_megas iCostos_min_y_megas;
    protected double tarifa;

    public Plan_movil(double min, double megas) {
        this.min = min;
        this.megas = megas;
    }

    public double getTarifa() {
        return tarifa;
    }

    public double getMin() {
        return min;
    }

    public double getMegas() {
        return megas;
    }

    public static double getCosto_min() {
        return costo_min;
    }

    public static double getCosto_mega() {
        return costo_mega;
    }

    public void setMin(double min) {
        this.min = min;
    }

    public void setMegas(double megas) {
        this.megas = megas;
    }

    public abstract void setTarifa();
}
