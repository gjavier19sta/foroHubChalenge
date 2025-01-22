package com.foroHubChalenge.foroHubChalenge.domain.topico.dto;

import com.foroHubChalenge.foroHubChalenge.domain.topico.Estado;

public record ActualizarTopicoDTO(
        String titulo,
        String mensaje,
        Estado estado,
        Long cursoId
) {
}