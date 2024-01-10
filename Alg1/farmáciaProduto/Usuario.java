package farmáciaProduto;

import java.util.Objects;

public class Usuario{
	
	private String usuario;
	private String senha;
	
	public String getUsuario() {
		return usuario;
	}
	
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(senha, usuario);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(senha, other.senha) && Objects.equals(usuario, other.usuario);
	}

	@Override
	public String toString() {
		return "Cliente [usuario=" + usuario + ", senha=" + senha + "]";
	}

	public Usuario(String usuario, String senha) {
		super();
		this.usuario = usuario;
		this.senha = senha;
	}
	
	
}
