package ThreaDEmo;

class NewThread extends Thread{
	Thread t;
	NewThread(){
		t=  new Thread(this,"New Thread");
		t.start();
	}
	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			try {
				System.out.println(t+" "+i);
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
}
public class Threading {
	public static void main(String[] args) {
		new NewThread();
		Thread t =new Thread();
		System.out.println(t.currentThread());
		t.setName("MyThread");
		System.out.println(t);
		//MIN - 0
		//NORM - 5
		//MAX - 10
		for(int i=1;i<=5;i++) {
			try {
				System.out.println(t+" "+i);
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
