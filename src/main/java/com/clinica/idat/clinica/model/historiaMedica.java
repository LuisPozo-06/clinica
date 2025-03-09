package com.clinica.idat.clinica.model;

public class historiaMedica {
    private int idHistoria;
    private int idPaciente;
    private String diagnostico;
    private String fecha;
    private String tratamiento;

    public historiaMedica() {}

    public historiaMedica(int idHistoria, int idPaciente, String diagnostico, String fecha, String tratamiento) {
        this.idHistoria = idHistoria;
        this.idPaciente = idPaciente;
        this.diagnostico = diagnostico;
        this.fecha = fecha;
        this.tratamiento = tratamiento;
    }

    public int getIdHistoria() {
        return idHistoria;
    }

    public void setIdHistoria(int idHistoria) {
        this.idHistoria = idHistoria;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }
}
