package banco;

/**
 * Tarea4 Contornos Desenvolvemento DAM B Distancia
 * 
 * @author Gonzalo Pulleiro
 * 
 */
public class CtaCorriente {

    /**
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre establecer nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta establecer cuenta
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return saldocuenta
     */
    public double getSaldocuenta() {
        return saldocuenta;
    }

    /**
     * @param saldocuenta establecer saldocuenta
     */
    public void setSaldocuenta(double saldocuenta) {
        this.saldocuenta = saldocuenta;
    }

    /**
     * @return interes
     */
    public double getInteres() {
        return interes;
    }

    /**
     * @param interes establecer el interes
     */
    public void setInteres(double interes) {
        this.interes = interes;
    }
    private String nombre;
    private String cuenta;
    private double saldocuenta;
    private double interes;

    /**
     * Crea una CuentaCorriente sin parámetros
     */
    public CtaCorriente() {
    }

    /**
     * Crea una CuentaCorriente con estos parámetros
     *
     * @param nombre establecer nombre
     * @param cuenta establecer cuenta
     * @param saldo establecer saldo
     * @param interes establecer intereses
     */
    public CtaCorriente(String nombre, String cuenta, double saldo, double interes) {
        this.nombre = nombre;
        this.cuenta = cuenta;
        this.saldocuenta = saldo;
        this.interes = interes;
    }

    /**
     * Recibe una cantidad y se llama al método setSaldocuenta si esta cantidad
     * es mayor de 0. Actualiza nuestro saldocuenta sumandole la cantidad
     * incluida por parámetro.
     *
     * @param cantidad
     * @throws AbstractMethodError
     *
     */
    public void ingresar(double cantidad) throws AbstractMethodError {
        if (cantidad < 0) {
            throw new AbstractMethodError("No se puede ingresar una cantidad negativa");
        }
        setSaldocuenta(getSaldocuenta() + cantidad);
    }

    /**
     * Recibe una cantidad y se llama al método setSaldocuenta si esta cantidad
     * es mayor de 0 y el saldo es mayor a la cantidad ingresada.
     * Actualiza nuestro saldocuenta restandole la cantidad incluida por parámetro.
     *
     * @param cantidad
     */
    public void retirar(double cantidad) {
        if (cantidad <= 0) {
            throw new ExceptionInInitializerError("No se puede retirar una cantidad negativa");
        }
        if (getSaldocuenta() < cantidad) {
            throw new AbstractMethodError("No se hay suficiente saldo");
        }
        setSaldocuenta(getSaldocuenta() - cantidad);
    }
}
