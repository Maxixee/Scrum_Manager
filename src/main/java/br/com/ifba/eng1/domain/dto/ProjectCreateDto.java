package br.com.ifba.eng1.domain.dto;


import br.com.ifba.eng1.domain.entities.Users;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProjectCreateDto {

    private String name;
    private String description;
    private Users manager;

}
