package day14.api.thread;

public class MainClass02 {
	
	public static void main(String[] args) {
		
		ThreadTest02 thread = new ThreadTest02();
		
		thread.setName("Thread_B"); //쓰레드명
		thread.start();
		
		try {
			thread.sleep(5000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		System.out.println("메인쓰레드 종료");
		
	}

}
