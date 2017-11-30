/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Guilherme
 */
@Entity
@Table(name = "tbAlunos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbAlunos.findAll", query = "SELECT t FROM TbAlunos t")
    , @NamedQuery(name = "TbAlunos.findById", query = "SELECT t FROM TbAlunos t WHERE t.id = :id")
    , @NamedQuery(name = "TbAlunos.findByNome", query = "SELECT t FROM TbAlunos t WHERE t.nome = :nome")
    , @NamedQuery(name = "TbAlunos.findByPeso", query = "SELECT t FROM TbAlunos t WHERE t.peso = :peso")
    , @NamedQuery(name = "TbAlunos.findByAltura", query = "SELECT t FROM TbAlunos t WHERE t.altura = :altura")
    , @NamedQuery(name = "TbAlunos.findByImc", query = "SELECT t FROM TbAlunos t WHERE t.imc = :imc")
    , @NamedQuery(name = "TbAlunos.findByLogin", query = "SELECT t FROM TbAlunos t WHERE t.login = :login")
    , @NamedQuery(name = "TbAlunos.findBySenha", query = "SELECT t FROM TbAlunos t WHERE t.senha = :senha")})
public class TbAlunos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "nome")
    private String nome;
    @Basic(optional = false)
    @Column(name = "peso")
    private float peso;
    @Basic(optional = false)
    @Column(name = "altura")
    private float altura;
    @Basic(optional = false)
    @Column(name = "imc")
    private float imc;
    @Basic(optional = false)
    @Column(name = "login")
    private String login;
    @Basic(optional = false)
    @Column(name = "senha")
    private String senha;

    public TbAlunos() {
    }

    public TbAlunos(Integer id) {
        this.id = id;
    }

    public TbAlunos(Integer id, String nome, float peso, float altura, float imc, String login, String senha) {
        this.id = id;
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
        this.imc = imc;
        this.login = login;
        this.senha = senha;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getImc() {
        return imc;
    }

    public void setImc(float imc) {
        this.imc = imc;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbAlunos)) {
            return false;
        }
        TbAlunos other = (TbAlunos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DTO.TbAlunos[ id=" + id + " ]";
    }
    
}
