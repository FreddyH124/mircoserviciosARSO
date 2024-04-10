package com.arso.estaciones.model.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AltaBicicletaDTO {
    private String modelo;
    private String idEstacion;
}