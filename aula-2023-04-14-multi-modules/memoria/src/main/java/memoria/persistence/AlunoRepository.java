package memoria.persistence;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import modelo.entidade.Aluno;
import persistence.IAlunoRepository;

public class AlunoRepository implements IAlunoRepository {
  static Map<String, Aluno> alunos = new HashMap<>();


  @Override
  public Optional<Aluno> findByCpf(String cpf) {
    Aluno aluno = alunos.get(cpf);
    return Optional.ofNullable(aluno);
  }
  //INSERT
  public boolean insert(Aluno aluno) {
    alunos.put(aluno.getCpf(), aluno);
    return true;
  }
  //DELETE
  public boolean deleteByCpf(String cpf) {
    Aluno aluno = alunos.get(cpf);
    if(aluno.isEmpty()) return false;  
    alunos.put(aluno.getCpf(), aluno);
    return true;
  }

  public List<Aluno> findAll(){
    return new ArrayList<Aluno>(alunos.values());
  }
 
}
