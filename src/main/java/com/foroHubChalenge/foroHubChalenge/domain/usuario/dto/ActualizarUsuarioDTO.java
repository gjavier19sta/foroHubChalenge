package com.foroHubChalenge.foroHubChalenge.domain.usuario.dto;

import com.foroHubChalenge.foroHubChalenge.domain.usuario.Role;

public record ActualizarUsuarioDTO(
        String password,
        Role role,
        String nombre,
        String apellido,
        String email,
        Boolean enabled
) {
}