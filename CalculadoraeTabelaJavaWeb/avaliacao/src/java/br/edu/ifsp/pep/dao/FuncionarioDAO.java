package br.edu.ifsp.pep.dao;

import br.edu.ifsp.pep.modelo.Funcionario;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class FuncionarioDAO {
    @PersistenceContext(unitName = "")
    EntityManager em;
    //inserir:
    public void inserirFuncionarioDAO(Funcionario funcionario){        
        em.persist(funcionario);
    }
    //remover:
    public void removerFuncionarioDAO(Funcionario funcionario){
        em.remove(funcionario);
    }
    //alterar:
    public void alterarFuncionarioDAO(Funcionario funcionario){
        em.merge(funcionario);
    }
    
    //buscando Funcionarios no banco:
    List<Funcionario> buscarTodos(){
        return em.createQuery("SELECT f FROM Funcionario f", 
                Funcionario.class).getResultList();
    }
}
