
public class Login {
	public static void main(String args[]) {
		String emailDigitado = "admin@fiap.com.br";
		String senhaDigitada = "12345";
		String tokenDigitado = "beatriz";
		
		boolean loginOk = validarLogin(emailDigitado,tokenDigitado,senhaDigitada);
		
		System.out.println(loginOk);
		
	}
	
	public static boolean validarLogin(String email,String token, String senha) {
		boolean retorno = false;
		
		if(email.equals("admin@fiap.com.br") && senha.equals("123456") && token.equals("beatriz")) {
			retorno = true;
		}
		return true;
	}

}
