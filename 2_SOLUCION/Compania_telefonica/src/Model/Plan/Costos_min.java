package Model.Plan;

public class Costos_min implements ICosto_min {

    @Override
    public double calcularCosto_min(double min, double costo_min, double max_min) {
        double total;
        if (min <= max_min) {
            total = 0;
        } else {
            total = min * costo_min;
        }
        return total;
    }

}
