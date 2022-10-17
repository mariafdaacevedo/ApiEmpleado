package com.example.ApiEmpleado.Repositorios;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.ApiEmpleado.Modelos.EmpleadoModelo;

@Repository
public interface EmpleadoRepo extends CrudRepository<EmpleadoModelo,Long> {
    ArrayList<EmpleadoModelo> findByNombre(String nombre);
    
}
