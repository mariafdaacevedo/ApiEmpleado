package com.example.ApiEmpleado.Repositorios;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.ApiEmpleado.Modelos.RegistrohorasModelo;

@Repository
public interface RegistrohorasRepo extends CrudRepository<RegistrohorasModelo,Long>{
    ArrayList<RegistrohorasModelo> findByNombre(String nombre);    
}
