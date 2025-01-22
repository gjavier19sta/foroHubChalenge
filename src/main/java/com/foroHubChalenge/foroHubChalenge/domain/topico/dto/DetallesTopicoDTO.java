package com.foroHubChalenge.foroHubChalenge.domain.topico.dto;

import com.foroHubChalenge.foroHubChalenge.domain.curso.Categoria;
import com.foroHubChalenge.foroHubChalenge.domain.topico.Estado;
import com.foroHubChalenge.foroHubChalenge.domain.topico.Topico;

import java.time.LocalDateTime;

public record DetallesTopicoDTO(
        Long id,
        String titulo,
        String mensaje,
        LocalDateTime fechaCreacion,
        LocalDateTime ultimaActualizacion,
        Estado estado,
        String usuario,
        String curso,
        Categoria categoriaCurso

) {

    public DetallesTopicoDTO(Topico topico) {
        this(topico.getId(),
                topico.getTitulo(),
                topico.getMensaje(),
                topico.getFechaCreacion(),
                topico.getUltimaActualizacion(),
                topico.getEstado(),
                topico.getUsuario().getUsername(),
                topico.getCurso().getName(),
                topico.getCurso().getCategoria()
        );
    }
}