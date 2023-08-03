package Model.Plan;

public class PPP_MinutosMegasEconomico extends Plan_movil {
    protected double descuento;

    public PPP_MinutosMegasEconomico(double min, double megas, double descuento) {
        super(min, megas);
        this.descuento = descuento;
    }

    @Override
    public void setTarifa() {
        this.tarifa = (calcularExtra_min_nacional() + calcularExtra_megas()) + ((this.tarifa / 100) * (100-this.descuento));
    }

    public double calcularExtra_min_nacional() {
        return this.iCostos_min_y_megas.calcularCosto_min(this.min,this.costo_min,30);
    }

    public double calcularExtra_megas() {
        return this.iCostos_min_y_megas.calcularCosto_megas(this.megas,this.costo_mega,2);
    }
}
