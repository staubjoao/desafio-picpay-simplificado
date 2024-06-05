package tech.buildrun.picpay.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tipo_carteira")
public class TipoCarteira {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="descricao")
    private String descricao;

    public TipoCarteira() {
    }

    public TipoCarteira(Long id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public enum Enum {

        USUARIO(1L, "usuario"),
        LOJISTA(2L, "lojista");

        Enum(Long id, String descricao) {
            this.id = id;
            this.descricao = descricao;
        }

        private Long id;
        private String descricao;

        public TipoCarteira get() {
            return new TipoCarteira(id, descricao);
        }
    }
}
