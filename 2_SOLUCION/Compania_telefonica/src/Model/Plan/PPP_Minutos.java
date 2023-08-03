package Model.Plan;

public class PPP_Minutos extends Plan_movil {
    protected double min_internacionales;
    protected double costoMin_internacional = 0.25;

    public PPP_Minutos(double min, double min_internacionales) {
        super(min, 0);
        this.min_internacionales = min_internacionales;
    }

    public double calcularCosto_min_nacional() {
        double total;
        if (this.getMin() <= 10) {
            total = 10;
        } else {
            total = this.getMin() * this.getCosto_min();
        }
        return total;
    }

    @Override
    public void setTarifa() {

    }
}
