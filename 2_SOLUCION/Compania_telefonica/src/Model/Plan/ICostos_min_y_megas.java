package Model.Plan;

public interface ICostos_min_y_megas {
    double calcularCosto_min(double min, double costo_min, double max_min);
    double calcularCosto_megas(double megas, double costo_megas, double max_megas);
    double calcularTatifa_total(double tarifa);
}
