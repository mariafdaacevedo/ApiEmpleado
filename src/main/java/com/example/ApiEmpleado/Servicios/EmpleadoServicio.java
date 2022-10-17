package com.example.ApiEmpleado.Servicios;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ApiEmpleado.Modelos.EmpleadoModelo;
import com.example.ApiEmpleado.Repositorios.EmpleadoRepo;

@Service
public class EmpleadoServicio {
    
    @Autowired
    EmpleadoRepo repositorio;

    public EmpleadoModelo guardaEmpleado(EmpleadoModelo empleado){
        return repositorio.save(empleado);
        }

    public ArrayList<EmpleadoModelo> consultarEmpleados(){
        return (ArrayList<EmpleadoModelo>) repositorio.findAll();        
        }
    
    public Optional<EmpleadoModelo> consultaPorId(Long id){
        return repositorio.findById(id);
           
        }

    public boolean eliminaEmpleado(Long id){
            if(repositorio.existsById(id)){
                repositorio.deleteById(id);
                return true;
            }
            else{
                return false;
            }
    
        } 
        
    }

