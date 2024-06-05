package tech.buildrun.picpay.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "carteira")
public class Carteira {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="nome_completo")
    private String nomeCompleto;

    @Column(name="cpf_cnpj", unique = true)
    private String cpfCnpj;

    @Column(name="email", unique = true)
    private String email;

    @Column(name="senha")
    private String senha;

    @Column(name="saldo")
    private BigDecimal saldo;

    @ManyToOne
    @JoinColumn(name = "tipo_carteira_id")
    private TipoCarteira tipoCarteira;

    public Carteira() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public TipoCarteira getTipoCarteira() {
        return tipoCarteira;
    }

    public void setTipoCarteira(TipoCarteira tipoCarteira) {
        this.tipoCarteira = tipoCarteira;
    }
}
