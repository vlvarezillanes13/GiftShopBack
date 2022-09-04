package UsuarioModels;

	public class Usuario {
		
		private Integer IdUsuario;
		private String Nombre;
		private String Apellido;
		private String Username;
		private Integer Clave;
		private String Estado;
		
		public Usuario() {
			System.out.println(IdUsuario+ "" + Nombre + "" + Apellido + "" + Username +"" + Clave + "" + Estado);
			
		}
		public Integer getIdUsuario() {
			return IdUsuario;
		}
		public String getNombre() {
			return Nombre;
		}
		public String getApellido() {
			return Apellido;
		}
		public String getUsername() {
			return Username;
		}
		public Integer getClave() {
			return Clave;
		}
		public String getEstado() {
			return Estado;
		}
	}

