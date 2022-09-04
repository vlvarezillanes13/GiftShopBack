import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity//This tells Hibernate to make a table out of this class User{
@Id
@GeneratedValue(strategy=GenerationType.AUTO)

	public class Usuario {
		
		private Integer IdUsuario;
		private String Nombre;
		private String Apellido;
		private String Username;
		private Integer Clave;
		private String Estado;
		
		public Usuario() {
			
		}
		public Integer getIdUsuario() {
			return IdUsuario;
		}
		public void setIdUsuario(Integer IdUsuario) {
			this.IdUsuario = IdUsuario;
		}
		public String getNombre() {
			return Nombre;
		}
		public void setNombre(String Nombre) {
			this.Nombre = Nombre;
		}
		public String getApellido() {
			return Apellido;
		}
		public void setApellido(String Apellido) {
			this.Apellido = Apellido;
		}
		public String getUsername() {
			return Username;
		}
		public void setUsername(String Username) {
			this.Username = Username;
		}
		public Integer getClave() {
			return Clave;
		}
		public void setClave (Integer Clave) {
			this.Clave = Clave;
		}
		public String getEstado() {
			return Estado;
		}
		public void setEstado(String Estado) {
			this.Estado = Estado;
		}
	}


