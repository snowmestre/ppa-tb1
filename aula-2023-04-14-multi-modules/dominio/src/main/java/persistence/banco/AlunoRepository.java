package persistence.banco;

import java.util.Optional;

import modelo.entidade.Aluno;
import persistence.IAlunoRepository;

public class AlunoRepository implements IAlunoRepository {

  @Override
  public Optional<Aluno> findByCpf(String cpf) {
    return Optional.empty();
  }
  
}
