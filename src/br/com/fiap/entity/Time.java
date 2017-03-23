package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="TB_TIME")
@SequenceGenerator(name="seqTime",
sequenceName="SQ_TB_TIME",allocationSize=1)
public class Time {
	
	@Id
	@Column(name="CD_TIME")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seqTime")
	private int codigo;
	
	@Column(name="NM_TIME")
	private String nome;
	
	@Column(name="DT_FUNDACAO")
	@Temporal(TemporalType.DATE)
	private Calendar fundacao;
	
	@Column(name="NR_TITULO")
	private int nrTitulo;
	
	@Column(name="CD_TECNICO")
	private int codigoTecnico;
	
	
}
