package com.foroHubChalenge.foroHubChalenge.domain.respuesta.validations.update;

import com.foroHubChalenge.foroHubChalenge.domain.respuesta.dto.ActualizarRespuestaDTO;

public interface ValidarRespuestaActualizada {
    void validate(ActualizarRespuestaDTO data, Long respuestaId);
}