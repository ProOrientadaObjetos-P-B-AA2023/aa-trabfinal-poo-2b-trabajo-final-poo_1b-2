package Model.Plan;

public class PPP_MinutosMegasEconomico extends Plan_movil_Minutos_Megas{
    protected double descuento;

    public PPP_MinutosMegasEconomico(double tarifa, double min, double megas_gigas, double descuento) {
        super(tarifa, min, megas_gigas);
        this.descuento = descuento;
    }

    public double calcularExtra_min_nacional() {
        return costos_min.calcularCosto_min(this.min,this.costo_min,30);
    }

    public double calcularExtra_megas() {
        return this.costos_megas.calcularCosto_megas(this.megas_gigas,this.costo_gigas,2);
    }

    @Override
    public void calcularTarifa() {
        this.tarifa = (calcularExtra_min_nacional() + calcularExtra_megas()) + ((this.tarifa / 100) * (100-this.descuento));
    }
}
