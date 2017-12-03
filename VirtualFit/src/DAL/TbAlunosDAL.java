package DAL;

import DTO.TbAlunos;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class TbAlunosDAL {
    
    public EntityManager getEM(){
        return Persistence.createEntityManagerFactory("VirtualFitPU").createEntityManager();
    }
    
    public List<TbAlunos> buscarTodos(){
        EntityManager em = getEM();
        em.getTransaction().begin();
        List<TbAlunos> lista = em.createQuery("SELECT t FROM TbAlunos t").getResultList();
        em.close();
        return lista;
    }
    
    public int salvarAluno(TbAlunos dto){
        EntityManager em = getEM();
        em.getTransaction().begin();
        em.persist(dto);
        em.flush();
        em.getTransaction().commit();
        em.close();
        return dto.getId();
    }
    
    public void excluir(int id){
        EntityManager em = getEM();
        em.getTransaction().begin();
        TbAlunos alunoExcluir = (TbAlunos) em.createQuery("SELECT t FROM TbAlunos t WHERE t.id ="+ id).getSingleResult();
        em.remove(alunoExcluir);
        em.getTransaction().commit();
        em.close();
    }
    
    public TbAlunos buscarAluno(int id){
        EntityManager em = getEM();
        em.getTransaction().begin();
        TbAlunos dto = (TbAlunos) em.createQuery("SELECT t FROM TbAlunos t WHERE t.id ="+ id).getSingleResult();
        em.close();
        return dto;
    }
    
    public void updateAluno(TbAlunos dto){
        EntityManager em = getEM();
        em.getTransaction().begin();
        TbAlunos alunoAntigo = em.find(TbAlunos.class, dto.getId());
        alunoAntigo.setNome(dto.getNome());
        alunoAntigo.setAltura(dto.getAltura());
        alunoAntigo.setPeso(dto.getPeso());
        alunoAntigo.setImc(dto.getImc());
        alunoAntigo.setLogin(dto.getLogin());
        alunoAntigo.setSenha(dto.getSenha());
        em.merge(alunoAntigo);
        em.getTransaction().commit();
        em.close();
    }
    
}
