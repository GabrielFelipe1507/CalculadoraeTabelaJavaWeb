package br.edu.ifsp.pep.controller;

import br.edu.ifsp.pep.dao.FuncionarioDAO;
import br.edu.ifsp.pep.modelo.Funcionario;
import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named
@SessionScoped
public class FuncionarioController implements Serializable {

    private List<Funcionario> funcionarios;
    private Funcionario funcionario;
    private FuncionarioDAO funcionarioDAO;

    //constructors:
    public FuncionarioController(List<Funcionario> funcionarios, Funcionario funcionario, FuncionarioDAO funcionarioDAO) {
        this.funcionarios = funcionarios;
        this.funcionario = funcionario;
        this.funcionarioDAO = funcionarioDAO;
    }

    public FuncionarioController() {
    }

    //getters e setters:
    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public FuncionarioDAO getFuncionarioDAO() {
        return funcionarioDAO;
    }

    public void setFuncionarioDAO(FuncionarioDAO funcionarioDAO) {
        this.funcionarioDAO = funcionarioDAO;
    }

    //metodos:
    @PostConstruct
    public void criarFuncionarios() {
        this.funcionarios = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            //aqui estarei instanciando e criando um novo funcionario:

            //new arrayList
            
            //aqui ele está pegando um novo objeto (Funcionario) para adicionar no ArrayList:
            this.funcionarios.add(new Funcionario("Funcionario", 2000 + i));
        }
    }
}
