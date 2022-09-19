package sub1;


public class Subthread extends Thread {
	
	private String name;
	
	public Subthread(String name) {
		this.name = name; 
	}
	
	
	@Override
	public void run() {
		for(int i=1; i<=10; i++) {
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println(name+ "스레드 실행...");
		}
		
		System.out.println(name+"스레드 종료...");
	}
}
