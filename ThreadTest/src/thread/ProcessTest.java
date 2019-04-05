package thread;

import java.io.File;
import java.io.IOException;

/**
 *@author:庹玲
 *@version:Jdk1.7
 *@日期：2016年11月29日 上午9:26:07
 */
public class ProcessTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		//创建进程对象
		ProcessBuilder builder=new ProcessBuilder("C:"+File.separator+"Program Files (x86)"+File.separator+"Tencent"+File.separator+"QQ"+File.separator+"Bin"+File.separator+"QQScLauncher.exe");
		//启动进程
		Process process=builder.start();
		process.destroy();//结束进程
		process.waitFor();//等待进程结束
	}

}
