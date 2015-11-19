package multiThreading;

public class ThreaderExample extends Thread {
String a ;
	public ThreaderExample(String a){
		this.a = a;
	}
	public void run(){
		int i =0;
		while(i<10){
			System.out.print(a);
			i++;
		}
	}
}
