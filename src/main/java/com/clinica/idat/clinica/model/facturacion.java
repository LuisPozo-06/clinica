package com.clinica.idat.clinica.model;

public class facturacion {
    private int idFacturacion;
    private int idPaciente;
    private int idAdministrativo;
    private String fechaFacturacion;
    private double monto;
    private String estadoPago;

    public facturacion() {}

    public facturacion(int idFacturacion, int idPaciente, int idAdministrativo, String fechaFacturacion, double monto, String estadoPago) {
        this.idFacturacion = idFacturacion;
        this.idPaciente = idPaciente;
        this.idAdministrativo = idAdministrativo;
        this.fechaFacturacion = fechaFacturacion;
        this.monto = monto;
        this.estadoPago = estadoPago;
    }

    public int getIdFacturacion() {
        return idFacturacion;
    }

    public void setIdFacturacion(int idFacturacion) {
        this.idFacturacion = idFacturacion;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public int getIdAdministrativo() {
        return idAdministrativo;
    }

    public void setIdAdministrativo(int idAdministrativo) {
        this.idAdministrativo = idAdministrativo;
    }

    public String getFechaFacturacion() {
        return fechaFacturacion;
    }

    public void setFechaFacturacion(String fechaFacturacion) {
        this.fechaFacturacion = fechaFacturacion;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getEstadoPago() {
        return estadoPago;
    }

    public void setEstadoPago(String estadoPago) {
        this.estadoPago = estadoPago;
    }
}
