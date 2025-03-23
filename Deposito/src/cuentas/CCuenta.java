package cuentas;

/**
 * Representa una cuenta bancaria básica con operaciones de ingreso, retirada 
 * y consulta de saldo.
 * @author dv505
 */
public class CCuenta {

    /** Nombre del titular de la cuenta */
    private String nombre;
    /** Número de cuenta bancaria */
    private String cuenta;
    /** Saldo actual de la cuenta */
    private double saldo;
    /** Tipo de interés aplicado a la cuenta */
    private double tipoInterés;

    /**
     * Constructor vacío para crear una cuenta sin inicializar campos.
     */
    public CCuenta() {
    }

    /**
     * Constructor que inicializa todos los atributos de la cuenta.
     * @param nom Nombre del titular
     * @param cue Número de cuenta
     * @param sal Saldo inicial
     * @param tipo Tipo de interés aplicado
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        this.nombre = nom;
        this.cuenta = cue;
        this.saldo = sal;
        this.tipoInterés = tipo;
    }  

    /** @return el nombre del titular de la cuenta */
    public String getNombre() {
        return nombre;
    }

    /** @param nombre nuevo nombre del titular */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /** @return el número de cuenta */
    public String getCuenta() {
        return cuenta;
    }

    /** @param cuenta nuevo número de cuenta */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /** @return el saldo actual de la cuenta */
    public double getSaldo() {
        return saldo;
    }

    /** @param saldo nuevo saldo a asignar */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /** @return el tipo de interés aplicado */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /** @param tipoInterés nuevo tipo de interés */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

    /**
     * Obtiene el estado actual (saldo) de la cuenta.
     * @return saldo disponible
     */
    public double estado() {
        return saldo;
    }

    /**
     * Ingresa una cantidad positiva en la cuenta.
     * @param cantidad importe a ingresar (debe ser > 0)
     * @throws Exception si la cantidad es negativa
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        saldo += cantidad;
    }

    /**
     * Retira una cantidad de la cuenta si hay saldo suficiente.
     * @param cantidad importe a retirar (debe ser > 0)
     * @throws Exception si la cantidad es negativa o no hay saldo suficiente
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if (saldo < cantidad) {
            throw new Exception("No hay suficiente saldo");
        }
        saldo -= cantidad;
    }
}