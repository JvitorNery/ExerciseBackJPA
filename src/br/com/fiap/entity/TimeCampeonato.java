package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="TB_TIME_CAMPEONATO")
@SequenceGenerator(name="seqTimeCampeonato",sequenceName="SEQ_TB_TIME_CAMPEONATO",allocationSize=1)
public class TimeCampeonato {
	
	@Id
	@Column(name="CD_TIME_CAMPEONATO")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="seqTimeCampeonato")
	private int timeCampeonato;
	
	
}
