package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="TB_TECNICO")
@SequenceGenerator(name="seqTecnico",
sequenceName="SQ_TB_TECNICO",allocationSize=1)
public class Tecnico {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="seqTecnico")
	@Column(name="CD_TECNICO")
	private int codigo;
	
	@Column(name="NM_TECNICO")
	private String nome;
	
}
