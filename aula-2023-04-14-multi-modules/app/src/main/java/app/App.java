package app;

import java.util.Optional;

import memoria.persistence.AlunoRepository;
import memoria.persistence.BoletoRepository;
import memoria.persistence.CursoRepository;
import memoria.persistence.MatriculaRepository;
import memoria.persistence.ParametroRepository;
import modelo.entidade.Tecnico;
import modelo.service.MatriculaService;
import modelo.service.ServiceException;
import persistence.IAlunoRepository;
import persistence.IBoletoRepository;
import persistence.ICursoRepository;
import persistence.IMatriculaRepository;
import persistence.IParametroRepository;
import persistence.Repository;

public class App {
    
    public static void main(String[] args) {

        IAlunoRepository alunoRepository = new AlunoRepository();
        ICursoRepository cursoRepository = new CursoRepository();
        IParametroRepository paramRepository = new ParametroRepository();
        IBoletoRepository boletoRepository = new BoletoRepository();
        IMatriculaRepository matriculaRepository = new MatriculaRepository();
        

        MatriculaService matriculaService = new MatriculaService(
            alunoRepository, 
            cursoRepository,
            paramRepository,
            boletoRepository,
            matriculaRepository);
      //  Matricula m = matriculaService.matricular("12345678901", 123);

        try {
            matriculaService.matricular("12345678912", 123);
        } catch (ServiceException se) {
            System.err.println(se); // CPF não existe
        }


        Tecnico t = new Tecnico();
        t.setCodigo(123L);
        t.setNome("Geraldo dos Santos");
        t.setAtivo(true);


        Repository<Tecnico, Long> repo = new Repository<>(Tecnico.class);  

        //repo.delete(123L);
        //repo.save(t);

        Optional<Tecnico> find = repo.findById(123L);

        System.out.println(find);



         /* 
         * Chamado c = new Chamado();
         * c.setAutor("Marcio");
         * 
         * Repository<Chamado> repoChamado = new Repository<>();
         * repoChamado.save(c); // insert into chamado (autor, etc) values (?, ?)
         * 
         * 
         * TecnicoRepository tecnicoRepository =
         * new TecnicoRepository();
         * //tecnicoRepository.save(t);
         * 
         * tecnicoRepository.findAll()
         * .forEach(tec ->
         * System.out.println(tec.getNome()));
         */
    }

}
