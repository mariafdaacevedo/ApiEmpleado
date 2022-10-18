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

import com.example.ApiEmpleado.Modelos.RegistrohorasModelo;
import com.example.ApiEmpleado.Servicios.RegistrohorasServicio;

@RestController
@RequestMapping("/registro")
public class RegistrohorasControlador {
    @Autowired
    RegistrohorasServicio servicio;

    @PostMapping("/guardar")
    public RegistrohorasModelo guardaRegistro(@RequestBody RegistrohorasModelo registro){
        return servicio.guardaRegistro(registro);
    }

    @GetMapping("/vertodos")
    public ArrayList<RegistrohorasModelo> consultarRegistros(){
        return servicio.consultarRegistro();
    }

    @GetMapping("/consulta/{id}")
    public Optional<RegistrohorasModelo> consultarPorId(@PathVariable("id") Long id){
        return servicio.consultarPorId(id);
 
    }

    @GetMapping("/consulta/{cedula}")
    public Optional<RegistrohorasModelo> consultarPorCedula(@PathVariable("cedula") String cedula){
        return servicio.consultarPorCedula(cedula);
    }


    @DeleteMapping("/eliminar/{id}")
    public boolean eliminarRegistro(@PathVariable("id") Long id){
        return servicio.eliminarRegistro(id);
    }

}


