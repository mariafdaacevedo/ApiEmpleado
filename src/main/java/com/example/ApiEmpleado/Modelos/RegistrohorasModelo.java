package com.example.ApiEmpleado.Modelos;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name=("registroHoras"))
public class RegistrohorasModelo {
   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique =true, nullable=false)
    private Long id;
    private String nombre;
    private String cedula;
    private String cargo;
    private Date fecha;
    private Long horastrabajadas;
    private String estado;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCedula() {
        return cedula;
    }
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public Date getFecha(){
        return fecha;
    }

    public void setFecha(Date fecha){
        this.fecha=fecha;
    }

    public Long getHorastrabajadas() {
        return horastrabajadas;
    }
    public void setHorastrabajadas(Long horastrabajadas) {
        this.horastrabajadas = horastrabajadas;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }


    
}


