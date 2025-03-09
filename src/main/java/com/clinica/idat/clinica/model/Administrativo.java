package com.clinica.idat.clinica.model;

public class Administrativo {
     Integer _id_administrativa;
     String _nombres_apellidos;
     String _cargo;
     Integer _telefono;
     String _correo;

    public Administrativo(Integer _id_administrativa, String _nombres_apellidos, String _cargo, Integer _telefono, String _correo) {
        this._id_administrativa = _id_administrativa;
        this._nombres_apellidos = _nombres_apellidos;
        this._cargo = _cargo;
        this._telefono = _telefono;
        this._correo = _correo;
    }

    public Integer get_id_administrativa() {
        return _id_administrativa;
    }

    public void set_id_administrativa(Integer _id_administrativa) {
        this._id_administrativa = _id_administrativa;
    }

    public String get_nombres_apellidos() {
        return _nombres_apellidos;
    }

    public void set_nombres_apellidos(String _nombres_apellidos) {
        this._nombres_apellidos = _nombres_apellidos;
    }

    public String get_cargo() {
        return _cargo;
    }

    public void set_cargo(String _cargo) {
        this._cargo = _cargo;
    }

    public Integer get_telefono() {
        return _telefono;
    }

    public void set_telefono(Integer _telefono) {
        this._telefono = _telefono;
    }

    public String get_correo() {
        return _correo;
    }

    public void set_correo(String _correo) {
        this._correo = _correo;
    }
}
