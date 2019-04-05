package thread;

import javax.swing.Box;

/**
 *@author:庹玲
 *@version:Jdk1.7
 *@日期：2016年11月29日 上午11:18:35
 */
public class SwapThread extends Thread{

	private Box box;

private SwapThread(Box box){
	this.box=box;
	
}
public void run(){
	for(int i=0;i<1000;i++){
//		box.swap();
	}
}
	public static void main(String[] args) throws InterruptedException{
		final Box box=new Box(0);
		Thread t1=new SwapThread(box);
		Thread t2=new SwapThread(box);
		t1.start();
		t1.join();//将异步执行改为顺序执行
		t2.start();
		t2.join();
		System.out.println(box);
	}

}
