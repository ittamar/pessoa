import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.NoneScoped;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.flow.FlowScoped;
import javax.faces.view.ViewScoped;
@ManagedBean(name="meuBean")
@ApplicationScoped
public class MeuBean {
	
	private Pessoa p;
	private List<Pessoa> pessoa= new ArrayList<Pessoa>();

	
	public MeuBean(){
		p = new Pessoa();
		
	}
	public void add(){
		this.p = new Pessoa();
		pessoa.add(p);
					
	}

	public Pessoa getP() {
		return p;
	}

	public void setP(Pessoa p) {
		this.p = p;
	}

	public List<Pessoa> getPessoa() {
		
		return pessoa;
	}

	public void setPessoa(List<Pessoa> pessoa) {
		this.pessoa = pessoa;
	}

}
