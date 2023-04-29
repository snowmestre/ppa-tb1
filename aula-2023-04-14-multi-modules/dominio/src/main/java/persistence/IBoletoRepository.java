package persistence;

import java.util.List;

import modelo.entidade.Boleto;

public interface IBoletoRepository {

  List<Boleto> findBoletosByCpf(String cpf);
  
}
