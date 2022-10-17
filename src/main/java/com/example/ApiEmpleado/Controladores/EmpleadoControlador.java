package com.example.ApiEmpleado.Controladores;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ApiEmpleado.Modelos.EmpleadoModelo;
import com.example.ApiEmpleado.Servicios.EmpleadoServicio;

@RestController
@RequestMapping("/empleado")
public class EmpleadoControlador {
    @Autowired
    EmpleadoServicio servicio;

    @PostMapping("/guardar")
    public EmpleadoModelo guardaEmpleado(@RequestBody EmpleadoModelo empleado){
        return servicio.guardaEmpleado(empleado);
    }

    @GetMapping("/vertodos")
    public ArrayList<EmpleadoModelo> consultarEmpleados(){
        return servicio.consultarEmpleados();
    }

    @GetMapping("/consulta/{id}")
    public Optional<EmpleadoModelo> consultaPorId(@PathVariable("id") Long id){
        return servicio.consultaPorId(id);
    }

    @DeleteMapping("/eliminar/{id}")
    public boolean eliminaEmpleado(@PathVariable("id") Long id){
        return servicio.eliminaEmpleado(id);
    }

    }

