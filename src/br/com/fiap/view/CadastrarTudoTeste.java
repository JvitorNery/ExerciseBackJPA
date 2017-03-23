package br.com.fiap.view;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import javax.persistence.EntityManager;

import br.com.fiap.dao.GrupoAmDAO;
import br.com.fiap.dao.impl.GrupoAmDAOImpl;
import br.com.fiap.entity.Aluno;
import br.com.fiap.entity.GrupoAm;
import br.com.fiap.entity.Professor;
import br.com.fiap.entity.ProjetoAm;
import br.com.fiap.exception.CommitException;
import br.com.fiap.singleton.EntityManagerFactorySingleton;

public class CadastrarTudoTeste {

	public static void main(String[] args) {
		
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		
		GrupoAmDAO dao = new GrupoAmDAOImpl(em);
		GrupoAm grupo = new GrupoAm();
		ProjetoAm proj = new ProjetoAm(0,"lll",new GregorianCalendar(2017,Calendar.MAY,05),10,"project disruptive");
		
		grupo.setProjeto(proj);
		proj.setGrupo(grupo);
		grupo.addAluno(new Aluno("Lucas Ximira"));
		grupo.addAluno(new Aluno("Josefaz suco"));
		grupo.addAluno(new Aluno("Maria Ximira"));
		grupo.addAluno(new Aluno("Luis eagua"));
		grupo.addAluno(new Aluno("Xemera"));
		
		List<Professor> professores = new ArrayList<>();
		professores.add(new Professor( "humberto",new GregorianCalendar(2012,Calendar.APRIL, 1)));
		professores.add(new Professor("Rita",new GregorianCalendar(1996,Calendar.MAY, 23)));
		
		for(Aluno aluno : grupo.getAlunos()){
			aluno.setProfessores(professores);
		}
		
		dao.insert(grupo);
		try {
			dao.save();
		} catch (CommitException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			em.close();
			System.out.println("sucess!");
			System.exit(0);
		
		
		
	}

}
