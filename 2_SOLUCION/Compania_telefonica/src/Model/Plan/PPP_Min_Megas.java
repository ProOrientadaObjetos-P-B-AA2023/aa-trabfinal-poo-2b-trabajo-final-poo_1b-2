package Model.Plan;

public class PPP_Min_Megas extends Plan_movil_Minutos_Megas {

    public PPP_Min_Megas(double tarifa, double min, double megas_gigas) {
        super(tarifa, min, megas_gigas);
    }

    @Override
    public double calcularExtra_min() {
        return this.costos_megas.calcularCosto_megas(this.megas_gigas,this.costo_gigas,2);
    }

    @Override
    public double calcularExtra_gigas() {
        return costos_min.calcularCosto_min(this.min,this.costo_min,30);
    }

    @Override
    public void calcularTarifa() {
        this.tarifa += calcularExtra_gigas() + calcularExtra_min();
    }
}
