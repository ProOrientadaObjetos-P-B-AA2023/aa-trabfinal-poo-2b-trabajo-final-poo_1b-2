package Model.Plan;

public abstract class Plan_movil {
    protected double tarifa;

    public Plan_movil() {
    }

    public Plan_movil(double tarifa) {
        this.tarifa = tarifa;
    }

    public double getTarifa() {
        return tarifa;
    }

}
