package modelo.entidade;

import java.time.LocalDate;

public class Curso {

  private Integer codigo;
  private String nome;
  private String ementa;
  private Integer cargaHoraria;
  private Integer vagas;
  private Integer inscritos;
  private LocalDate dataInicio;
  private Integer idadeMinima;

  public Curso(Integer codigo, String nome, String ementa, Integer cargaHoraria, Integer vagas, Integer inscritos, LocalDate dataInicio, Integer idadeMinima) {
    this.codigo = codigo;
    this.nome = nome;
    this.ementa = ementa;
    this.cargaHoraria = cargaHoraria;
    this.vagas = vagas;
    this.inscritos = inscritos;
    this.dataInicio = dataInicio;
    this.idadeMinima = idadeMinima;
  }

  public Integer getCodigo() {
    return codigo;
  }
  public void setCodigo(Integer codigo) {
    this.codigo = codigo;
  }
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }
  public String getEmenta() {
    return ementa;
  }
  public void setEmenta(String ementa) {
    this.ementa = ementa;
  }
  public Integer getCargaHoraria() {
    return cargaHoraria;
  }
  public void setCargaHoraria(Integer cargaHoraria) {
    this.cargaHoraria = cargaHoraria;
  }
  public Integer getVagas() {
    return vagas;
  }
  public void setVagas(Integer vagas) {
    this.vagas = vagas;
  }
  public Integer getInscritos() {
    return inscritos;
  }
  public void setInscritos(Integer inscritos) {
    this.inscritos = inscritos;
  }

  public LocalDate getDataInicio() {
    return dataInicio;
  }

  public void setDataInicio(LocalDate dataInicio) {
    this.dataInicio = dataInicio;
  }
  
  public Integer getIdadeMinima() {
    return idadeMinima;
  }

  public void setIdadeMinima(Integer idadeMinima) {
    this.idadeMinima = idadeMinima;
  }

  @Override
  public String toString() {
    return "Curso [codigo = " + codigo + ", nome = " + nome + ", ementa = " + ementa + ", cargaHoraria = " + cargaHoraria
        + ", vagas = " + vagas + ", inscritos = " + inscritos + ", dataInicio = " + dataInicio + ", idadeMinima = "
        + idadeMinima + "]";
  }
}
