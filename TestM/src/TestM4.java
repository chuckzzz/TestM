import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



//输入用户名和密码存到文件中




public class TestM4 {
	private String user;
	private static String pw;
	public static List<String> users = new ArrayList<>();
	
	public TestM4() {
		
	}
	//登陆
	private void login() {
		readuser();
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入用户名：");
		String u =scan.nextLine();
		int i =0;
		
		while(selectuser(u)) {
			System.out.println("请输入密码：");
			pw =scan.nextLine();
			
			i++;
			if(i>3) {
				break;
			}
		}
	}
	
	//新增user
	public static void adduser() {
		readuser();
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入用户名：");
		String u =scan.nextLine();
		int i =0;
		boolean b = selectuser(u);
		while(b) {
			System.out.println("用户名重复，请重新输入:");
			u =scan.nextLine();
			b = selectuser(u);
			i++;
			if(i>3) {
				break;
			}
		}
		if(i<=3) {
			System.out.println("请输入密码：");
			
			
			while(Pattern.matches("^.+[0-9a-zA-Z]",(pw =scan.nextLine()))) {
				System.out.println("格式不规范，请重新输入密码：");
				if(pw.length()<12&&pw.length()>6) {
					String s = u+" "+pw;
					users.add(s);
					save();
					System.out.println("成功添加！");
					break;
				}
			}
			
			
			
		}else {
			System.out.println("添加失败！");
		}
		
	}
	
	
	//查找user
	public static boolean selectuser(String user) {
		
		
		for(String u :users) {
			int p = u.indexOf(" ");
			if(p>0) {
				String a =u.substring(0, p);
				if(a.equals(user)) {
					return true;
				}
			}
			
		}
		return false;
	}
	
	static void foreach(){
		for(String u:users) {
			System.out.println(u);
		}
	}
	//读txt文件中的数据
	private static void readuser() {
		try {
			FileInputStream fis = new FileInputStream("E://a.txt");
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader br = new BufferedReader(isr);
			String s =null;
			while((s =br.readLine())!=null) {
				users.add(s);
			}
			
			br.close();
			isr.close();
			fis.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
	//数据保存到txt中
	public static void save() {
		try {
			
			FileOutputStream fos = new FileOutputStream("E://a.txt");
			OutputStreamWriter dos = new OutputStreamWriter(fos);
			BufferedWriter bw = new BufferedWriter(dos);
			for(String s :users) {
				bw.write(s,0, s.length());
				bw.newLine();
			}
			bw.flush();
			bw.close();
			dos.close();
			fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args)  {
		
		adduser();
		foreach();
	}
}
