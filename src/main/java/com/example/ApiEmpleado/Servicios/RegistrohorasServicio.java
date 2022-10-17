package com.example.ApiEmpleado.Servicios;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ApiEmpleado.Modelos.RegistrohorasModelo;
import com.example.ApiEmpleado.Repositorios.RegistrohorasRepo;

@Service
public class RegistrohorasServicio {
    @Autowired
    RegistrohorasRepo repositorio;

    public RegistrohorasModelo guardaRegistro(RegistrohorasModelo registro){
        return repositorio.save(registro);
    }

    public ArrayList<RegistrohorasModelo> consultarRegistro(){
        return (ArrayList<RegistrohorasModelo>) repositorio.findAll();
    }

    public Optional<RegistrohorasModelo> consultarPorId(Long id){
        return repositorio.findById(id);
    }

    public boolean eliminarRegistro(Long id){
        if(repositorio.existsById(id)){
            repositorio.deleteById(id);
            return true;
        }
        else{
            return false;
        }
    }
}


