package br.com.gs.Energy.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter@Getter
@Schema(description = "Informações para cadastro de Post")
public class UserForm {
    @Schema(description = "Título do Post")
    private String username;
    private String password;
    private String cpf;
    private String email;

    private List<String> roles;
}
