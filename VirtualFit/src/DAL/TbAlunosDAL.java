package DAL;

import DTO.TbAlunos;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class TbAlunosDAL {
    
    public EntityManager getEM(){
        return Persistence.createEntityManagerFactory("VirtualFitPU").createEntityManager();
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
    
    public void excluir(TbAlunos dto){
        EntityManager em = getEM();
        em.getTransaction().begin();
        TbAlunos alunoExcluir = em.find(TbAlunos.class, dto.getId());
        em.remove(alunoExcluir);
        em.getTransaction().commit();
        em.close();
    }
    
    public TbAlunos buscarAluno(String nome){
        EntityManager em = getEM();
        em.getTransaction().begin();
        TbAlunos dto = em.find(TbAlunos.class, nome);
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
