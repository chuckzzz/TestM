package thread;
/**
 *@author:庹玲
 *@version:Jdk1.7
 *@日期：2016年11月29日 上午10:13:33
 */
public class ThreadTest1 extends Thread {
private String name;
private String name1;

public ThreadTest1(String name) {
	super();
	this.name = name;
}



@Override
public void run() {
	Thread thread=Thread.currentThread();
	for(int i=0;i<10;i++){
		System.out.println(name+":"+i);
		
	}
	System.out.println("乌龟 跑完了");
	
}



public static void main(String[] args) throws InterruptedException{
	ThreadTest1 test1=new ThreadTest1("乌龟");
	ThreadTest1 test2=new ThreadTest1("兔子");
	test1.setPriority(Thread.MAX_PRIORITY);//优先级
	System.out.println(test1.getPriority());
	
	System.out.println(test2.getPriority());
	test1.start();
	test2.start();
	test2.join();//阻塞线程异步执行
//	test2.join();
}




}

