package Model.Datos;

public class Celular {
    private String marca;
    private String modelo;
    private String numeroCel;

    public Celular(String marca, String modelo, String numeroCel) {
        this.marca = marca;
        this.modelo = modelo;
        this.numeroCel = numeroCel;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNumeroCel() {
        return numeroCel;
    }

    public void setNumeroCel(String numeroCel) {
        this.numeroCel = numeroCel;
    }
}
