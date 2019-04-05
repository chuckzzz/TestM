package thread;
/**
 *@author:庹玲
 *@version:Jdk1.7
 *@日期：2016年11月29日 上午10:34:35
 */
public class ThreadTest3 {

	public static void main(String[] args) {
		new ThreadTest3().fristThread();
		new ThreadTest3().secondTest();

	}
	public void fristThread(){
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				Thread thread=Thread.currentThread();//返回当前线程实例
				System.out.println(thread.isAlive());//判断线程是否有效
//				thread.setDaemon(true);//判断当前线程是否为当前线程
				for(int i=0;i<10;i++){
					System.out.println("乌龟:"+i);
				}
				System.out.println("乌龟跑完啦!");
				
			}
		}).start();//启动线程
	}
	public void secondTest(){
		new Thread(){

			@Override
			public void run() {
				Thread thread=Thread.currentThread();
				System.out.println(thread.isAlive());
				for(int i=0;i<10;i++){
					System.out.println("兔子:"+i);
				}
				System.out.println("兔子你输了");
			}
			
		}.start();
		
	}	

}
