package memoria.persistence;

import java.util.ArrayList;
import java.util.List;

import modelo.entidade.Boleto;
import persistence.IBoletoRepository;

public class BoletoRepository implements IBoletoRepository {
  static List<Boleto> boletos = new ArrayList<Boleto>();


  @Override
  public List<Boleto> findBoletosByCpf(String cpf) {
    return boletos.stream().filter(b->b.getCpf().equals(cpf)).toList();
  }
   //INSERT
   public boolean insert(Boleto boleto) {
    if(!(boleto.getCpf() != null && (boleto.getCpf().length() > 0 && boleto.getCpf().length() < 11))) 
      return false;
    
    boletos.add(boleto);
    return true;
  }
  //DELETE
  public boolean deleteByCpf(String cpf) {
    boletos.removeIf(b->b.getCpf().equals(cpf));
    return true;
  }

  public List<Boleto> findAll(){
    return boletos;
  } 
}
