package com.clinica.idat.clinica.model;

public class Detalle {

    Integer _ID_detalle;
    Integer _ID_Receta;
    Integer _ID_Medicamento;
    Integer _Cantidad;
    Integer _Unidad;
    String _Instrucciones;
    String _Dosis;

    public Detalle(Integer _ID_detalle, Integer _ID_Receta, Integer _ID_Medicamento, Integer _Cantidad, Integer _Unidad, String _Instrucciones, String _Dosis) {
        this._ID_detalle = _ID_detalle;
        this._ID_Receta = _ID_Receta;
        this._ID_Medicamento = _ID_Medicamento;
        this._Cantidad = _Cantidad;
        this._Unidad = _Unidad;
        this._Instrucciones = _Instrucciones;
        this._Dosis = _Dosis;
    }

    public Integer get_ID_detalle() {
        return _ID_detalle;
    }

    public void set_ID_detalle(Integer _ID_detalle) {
        this._ID_detalle = _ID_detalle;
    }

    public Integer get_ID_Receta() {
        return _ID_Receta;
    }

    public void set_ID_Receta(Integer _ID_Receta) {
        this._ID_Receta = _ID_Receta;
    }

    public Integer get_ID_Medicamento() {
        return _ID_Medicamento;
    }

    public void set_ID_Medicamento(Integer _ID_Medicamento) {
        this._ID_Medicamento = _ID_Medicamento;
    }

    public Integer get_Cantidad() {
        return _Cantidad;
    }

    public void set_Cantidad(Integer _Cantidad) {
        this._Cantidad = _Cantidad;
    }

    public Integer get_Unidad() {
        return _Unidad;
    }

    public void set_Unidad(Integer _Unidad) {
        this._Unidad = _Unidad;
    }

    public String get_Instrucciones() {
        return _Instrucciones;
    }

    public void set_Instrucciones(String _Instrucciones) {
        this._Instrucciones = _Instrucciones;
    }

    public String get_Dosis() {
        return _Dosis;
    }

    public void set_Dosis(String _Dosis) {
        this._Dosis = _Dosis;
    }
}
