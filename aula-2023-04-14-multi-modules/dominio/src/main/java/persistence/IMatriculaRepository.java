package persistence;

import modelo.entidade.Matricula;
import java.util.List;

public interface IMatriculaRepository {

	void insert(Matricula matricula);

	List<Matricula> findAll();
  
}
