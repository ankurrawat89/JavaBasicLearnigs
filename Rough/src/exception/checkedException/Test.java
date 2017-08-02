package exception.checkedException;

import java.io.IOException;

public class Test {
	public void m() throws IOException{
		System.out.println("m1");
		throw new IOException();
		//System.out.println("m2");
	}
	public void n() throws IOException{
		System.out.println("n1");
		m();
		System.out.println("n2");
	}
	public void p() throws IOException{
		/*try{
			n();
		}catch(Exception e){
		System.out.println("exception propogated and handeled");	
		}*/
		System.out.println("p1");
		n();
		System.out.println("p2");
	}
	public static void main(String args[]) throws IOException{
		Test t = new Test();
		try{
		t.p();
		}
		catch(IOException e){
			System.out.println("catching inside main");
		}
		System.out.println("In Main");
	}}
