import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.security.SignatureException;
import java.util.ArrayList;
import java.util.Base64;
import com.google.gson.GsonBuilder;

public class Main {

	public static void main(String[] args) throws InvalidKeyException, SignatureException, NoSuchAlgorithmException, UnsupportedEncodingException {

		
		BlockChain B = new BlockChain() ;
		
		Wallet A = new Wallet("22 abo treka");
		//Wallet B = new Wallet("cr7");
		System.out.println("Private and public keys:");

		System.out.println(A.getPK());
		System.out.println(A.getSK());
		
		
		Vote v1 = new Vote("777",A,"Fear of blank planet");
		Vote v2 = new Vote("999",A,"lightbulb sun");

		System.out.println(v1.verify());
		System.out.println(v2.verify());
		
		B.add_block(v1);
		B.add_block(v2);
	    B.Print_The_Chain();





		
	}

}
