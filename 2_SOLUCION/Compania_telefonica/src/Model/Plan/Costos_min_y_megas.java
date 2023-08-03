package Model.Plan;

public class Costos_min_y_megas implements ICostos_min_y_megas {

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

    @Override
    public double calcularCosto_megas(double megas, double costo_megas, double max_megas) {
        double total;
        if (megas <= max_megas) {
            total = 0;
        } else {
            total = megas * costo_megas;
        }
        return total;
    }

}
