package persistence;

import java.util.Optional;

import modelo.entidade.Aluno;

public interface IAlunoRepository {

  Optional<Aluno> findByCpf(String cpf);

  boolean insert(Aluno aluno);
  
}
