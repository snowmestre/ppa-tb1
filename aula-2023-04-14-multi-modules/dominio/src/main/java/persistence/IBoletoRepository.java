package persistence;

import java.util.List;

import modelo.entidade.Boleto;

public interface IBoletoRepository {
  Boolean insert(Boleto boleto);
  List<Boleto> findBoletosByCpf(String cpf);
  
}
