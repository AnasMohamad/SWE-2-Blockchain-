import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SignatureException;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws InvalidKeyException, NoSuchAlgorithmException, SignatureException, ClassNotFoundException, IOException {

		
		Wallet v = new Wallet("123");
		Wallet v2 = new Wallet("456");
		Wallet v3 = new Wallet("789");
		
		Peer2Peer p = new Peer2Peer(v, 200);
		Peer2Peer p2 = new Peer2Peer(v2, 3000);
		Peer2Peer miner = new Peer2Peer(v3, 6666);
		
		Vote s = new Vote("Savatage",v,"x");
		//Vote d = new Vote(753,"y",v2);
		
		System.out.println(Peer2Peer.nodes.size());
		//System.out.println(Peer2Peer.getPorts());
		
		p.connect();
		p2.connect();
		miner.connect();
		
		p.BroadcastVote(s);
		miner.ReciveVote();
	
		p.receiveBlock();
		p2.receiveBlock();
		




		
	}

}
