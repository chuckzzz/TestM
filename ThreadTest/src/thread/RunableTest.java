package thread;
/**
 *@author:庹玲
 *@version:Jdk1.7
 *@日期：2016年11月30日 下午6:04:57
 */
public class RunableTest implements Runnable {
	private String name;

	public RunableTest(String name) {
		super();
		this.name = name;
	}

	public static void main(String[] args) {

		Thread thread =new Thread( new RunableTest("乌龟"));
		Thread thread1 = new Thread(new RunableTuZi("兔子"));
		thread1.start();
		thread.start();

	}

	@Override
	public void run() {

		

		for (int i = 0; i < 5; i++) {

			System.out.println(name + ":" + i);

		}
		System.out.println("乌龟完成比赛");

	}

}

class RunableTuZi implements Runnable {
	private String tuziname;

	public RunableTuZi(String name) {
		super();
		this.tuziname = name;
	}


	@Override
	public void run() {

		for (int i = 0; i < 5; i++) {

			System.out.println(tuziname + ":" + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		System.out.println("兔子完成比赛");

	}


}
