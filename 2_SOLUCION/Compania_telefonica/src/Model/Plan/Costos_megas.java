package Model.Plan;

public class Costos_megas implements ICosto_megas{

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
