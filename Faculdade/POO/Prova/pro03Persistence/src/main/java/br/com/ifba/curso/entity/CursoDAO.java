package br.com.ifba.curso.entity;

import br.com.ifba.curso.entity.CursoEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import java.util.List;

public class CursoDAO {
    private EntityManagerFactory emf;
    private EntityManager em;

    public CursoDAO() {
        emf = Persistence.createEntityManagerFactory("PersistencePU");
        em = emf.createEntityManager();
    }
    
    // Método para listar todos os cursos
    public List<CursoEntity> listarCursos() {
        em.getTransaction().begin();
        Query query = em.createQuery("SELECT c FROM Curso c");
        List<CursoEntity> cursos = query.getResultList();
        em.getTransaction().commit();
        return cursos;
    }
    
    // Método para salvar um curso
    public void salvarCurso(CursoEntity curso) {
        em.getTransaction().begin();
        em.persist(curso);
        em.getTransaction().commit();
    }
    
    // Método para remover um curso pelo ID
    public void removerCurso(int idCurso) {
        em.getTransaction().begin();
        CursoEntity curso = em.find(CursoEntity.class, idCurso);
        if (curso != null) {
            em.remove(curso);
        }
        em.getTransaction().commit();
    }
    
     // Método para buscar um curso pelo nome
    public List<CursoEntity> buscarCursoPorNome(String nome) {
        em.getTransaction().begin();
        Query query = em.createQuery("SELECT c FROM Curso c WHERE c.nome LIKE :nome");
        query.setParameter("nome", "%" + nome + "%");
        List<CursoEntity> cursos = query.getResultList();
        em.getTransaction().commit();
        return cursos;
    }
    
    // Método para buscar um curso pelo ID
    public CursoEntity buscarCursoPorId(Long id) {
        em.getTransaction().begin();
        CursoEntity curso = em.find(CursoEntity.class, id);
        em.getTransaction().commit();
        return curso;
    }
    
    // Método para editar item pelo ID
    public void editarCurso(CursoEntity cursoAtualizado) {
        em.getTransaction().begin();
        CursoEntity curso = em.find(CursoEntity.class, cursoAtualizado.getId());
        if (curso != null) {
            curso.setNome(cursoAtualizado.getNome());
            curso.setQtd(cursoAtualizado.getQtd());
            curso.setAtivo(cursoAtualizado.isAtivo());
            em.merge(curso);
        }
        em.getTransaction().commit();
    }

    // Método para fechar o EntityManager e o EntityManagerFactory
    public void fechar() {
        em.close();
        emf.close();
    }
}