package br.edu.unoesc.ads.produtos.entities;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produto {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String nome;
private BigDecimal quantidade;
private BigDecimal valor;

public Produto() { }
public Produto(long id, String nome, BigDecimal quantidade, BigDecimal valor) {
this.id = id;
this.nome = nome;
this.quantidade = quantidade;
this.valor = valor;
}

public long getId() { return id; }
public void setId(Long id) { this.id = id; }
public String getNome() { return nome; }
public void setNome(String nome) { this.nome = nome; }
public BigDecimal getQuantidade() { return quantidade; }
public void setQuantidade(BigDecimal quantidade) { this.quantidade = quantidade; }
public BigDecimal getValor() { return valor; }
public void setValor(BigDecimal valor) { this.valor = valor; }
}