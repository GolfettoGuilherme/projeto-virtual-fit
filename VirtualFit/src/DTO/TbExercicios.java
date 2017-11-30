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
@Table(name = "tbExercicios")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbExercicios.findAll", query = "SELECT t FROM TbExercicios t")
    , @NamedQuery(name = "TbExercicios.findById", query = "SELECT t FROM TbExercicios t WHERE t.id = :id")
    , @NamedQuery(name = "TbExercicios.findByIdAluno", query = "SELECT t FROM TbExercicios t WHERE t.idAluno = :idAluno")
    , @NamedQuery(name = "TbExercicios.findByNome", query = "SELECT t FROM TbExercicios t WHERE t.nome = :nome")
    , @NamedQuery(name = "TbExercicios.findByNumSerie", query = "SELECT t FROM TbExercicios t WHERE t.numSerie = :numSerie")
    , @NamedQuery(name = "TbExercicios.findByNumRepeticao", query = "SELECT t FROM TbExercicios t WHERE t.numRepeticao = :numRepeticao")})
public class TbExercicios implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "id_aluno")
    private int idAluno;
    @Basic(optional = false)
    @Column(name = "nome")
    private String nome;
    @Basic(optional = false)
    @Column(name = "num_serie")
    private int numSerie;
    @Basic(optional = false)
    @Column(name = "num_repeticao")
    private int numRepeticao;

    public TbExercicios() {
    }

    public TbExercicios(Integer id) {
        this.id = id;
    }

    public TbExercicios(Integer id, int idAluno, String nome, int numSerie, int numRepeticao) {
        this.id = id;
        this.idAluno = idAluno;
        this.nome = nome;
        this.numSerie = numSerie;
        this.numRepeticao = numRepeticao;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(int idAluno) {
        this.idAluno = idAluno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(int numSerie) {
        this.numSerie = numSerie;
    }

    public int getNumRepeticao() {
        return numRepeticao;
    }

    public void setNumRepeticao(int numRepeticao) {
        this.numRepeticao = numRepeticao;
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
        if (!(object instanceof TbExercicios)) {
            return false;
        }
        TbExercicios other = (TbExercicios) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DTO.TbExercicios[ id=" + id + " ]";
    }
    
}
