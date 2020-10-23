package dream.team.cetriolo.sprintbootapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Set;

@Entity
@Table(name = "per_permissao")
public class Permissao {
 
    @Id
    @Column(name = "per_id")
    private Long id;

    @Column(name = "per_nome")
    private String nome;

    @JsonIgnore
    @OneToMany(mappedBy = "permissao", fetch = FetchType.LAZY)
    private Set<Usuario> usuarios;

    public Long getId() {
        return this.id;
    }

    public String getNome() {
        return this.nome;
    }

    public Set<Usuario> getUsuarios() {
        return this.usuarios;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setUsuarios(Set<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

}