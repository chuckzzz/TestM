package more;



public class TestThread3 {

	
	public static void main(String[] args) throws InterruptedException {
		
		new TestThread3().tuzi("3");
		new TestThread3().wugui("1");
	}
	
	public void wugui(final String name){
		new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i=0;i<10;i++){
					System.out.println(name+"1");
				}
				System.out.println("2");
			}
		}).start();
	}
	public void tuzi(final String name){
		
		Thread t = new Thread(){
			@Override
			public void run() {
				for(int i=0;i<10;i++){
					System.out.println(name+"3");
				}
				System.out.println("4");
			}
		};
		t.start();
	}
}
