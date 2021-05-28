
public class Login {
	public static void main(String args[]) {
		String n = "admin@fiap.com.br";
		String s = "12345";
		
		boolean loginOk = validarLogin(n,s);
		
		System.out.println(loginOk);
		
	}
	
	public static boolean validarLogin(String email, String senha) {
		boolean retorno = false;
		
		if(email.equals("admin@fiap.com.br") && senha.equals("123456")) {
			retorno = true;
		}
		return true;
	}

}
