package DAL;

import DTO.TbExercicios;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class tbExerciciosDAL {
    
    public EntityManager getEM(){
        return Persistence.createEntityManagerFactory("VirtualFitPU").createEntityManager();
    }
    
    public int salvar(TbExercicios dto){
        EntityManager em = getEM();
        em.getTransaction().begin();
        em.persist(dto);
        em.flush();
        em.getTransaction().commit();
        em.close();
        return dto.getId();
    }
    
    public void excluirTodosDoAluno(int idAluno){
        List<TbExercicios> lista = this.buscarExercicios(idAluno);
        for(TbExercicios ex : lista){
            this.excluir(ex);
        }
    }
    
    public void excluir(TbExercicios dto){
        EntityManager em = getEM();
        em.getTransaction().begin();
        TbExercicios bitRemover = em.find(TbExercicios.class, dto.getId());
        em.remove(bitRemover);
        em.getTransaction().commit();
        em.close();
    }
    
    public List<TbExercicios> buscarExercicios(int idAluno){
        EntityManager em = getEM();
        em.getTransaction().begin();
        List<TbExercicios> exercicios = em.createQuery("SELECT t FROM TbExercicios t where t.idAluno = " + idAluno).getResultList();
        em.close();
        return exercicios;
    }
    
    public void update(TbExercicios dto){
        EntityManager em = getEM();
        em.getTransaction().begin();
        TbExercicios dtoUpd = em.find(TbExercicios.class, dto.getId());
        em.merge(dtoUpd);
        em.getTransaction().commit();
        em.close();
    }
}
