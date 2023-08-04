package Model.Plan;

public class PPP_MinutosMegasEconomico extends Plan_movil_Minutos_Megas{
    protected double descuento;

    public PPP_MinutosMegasEconomico(double tarifa, double min, double megas_gigas, double descuento) {
        super(tarifa, min, megas_gigas);
        this.descuento = descuento;
    }

    @Override
    public double calcularExtra_min() {
        return costos_min.calcularCosto_min(this.min,this.costo_min,30);
    }

    @Override
    public double calcularExtra_gigas() {
        return this.costos_megas.calcularCosto_megas(this.megas_gigas,this.costo_gigas,2);
    }

    @Override
    public void calcularTarifa() {
        this.tarifa = (calcularExtra_min() + calcularExtra_gigas()) + ((this.tarifa / 100) * (100-this.descuento));
    }
}
