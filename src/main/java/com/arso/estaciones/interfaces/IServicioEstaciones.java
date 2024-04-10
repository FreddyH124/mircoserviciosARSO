package com.arso.estaciones.interfaces;

import com.arso.estaciones.model.DTO.*;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IServicioEstaciones {
    //Servicios a gestor
    String altaEstacion(AltaEstacionDTO dto);

    String altaBicicleta(AltaBicicletaDTO dto);

    void bajaBicicleta(BajaBicicletaDTO dto);

    Page<BicicletaDTO> getAllBiciletas(String idEstacion, Pageable pageable);


    //Servicios a todos los usuarios
    Page<EstacionDTO> getAllEstaciones(Pageable pageable);

    EstacionDTO getEstacion(String idEstacion);

    Page<BicicletaDTO> getBicicletasDisponibles(String idEstacion, Pageable pageable);

    void estacionarBicicleta(EstacionarBicicletaDTO dto);
}