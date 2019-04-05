import java.math.BigDecimal;

public class TestM2 {

	public static void main(String[] args) {
		//涉及钱的精确计算
		System.out.println(2.00-1.10);
		System.out.println(new BigDecimal("2.0").subtract(new BigDecimal("1.1")));
		//长整除
		final long M_DAY =  24*60*60*1000;
		System.out.println(M_DAY);
		final long W_DAY = 24L*60*60*1000*1000;
		System.out.println(W_DAY);
		System.out.println(W_DAY/M_DAY);
		
		//加法问题
		System.out.println(12345+5432l);
		//16进制问题
		System.out.println(Long.toHexString(0x100000000L+0xcafebabe));
		//转型扩展问题
		System.out.println((int)(char)(byte)-1);
		char c = (char)-1;
		int i = c&0xffff;//不会执行符号扩展
		int j = (short)c;//会执行
		System.out.println(i);
		System.out.println(j);
		//互换内容
		int x = 1984;
		int y = 2000;
		x^=y^=x^=y;
		System.out.println("x="+x+",y="+y );
		//冒号问号
		char k ='k';
		int p = 0;
		System.out.println(true?k:0);
		System.out.println(false?p:k);
		
		k=(char) (p+k);
		k+=p;
		//给出赋值表达式的两种情况
		short t =0;
		int o = 123456;
		System.out.println(t+=o);
		t+=o;
		//t=t+o;需要强制类型转换
		Object ob ="hello ";
		String st = "Effectiv Java!";
		ob = ob+st;
		
		System.out.println("2+2"+2+2+2+'@'+'h');
		//字符打印问题
		String letters= "ABC";
		char[] numbers = {'1','2','s','5'};
		System.out.println(letters+"fsadf"+numbers);
		System.out.println(letters+"fsadf"+String.valueOf(numbers));
		System.out.println(numbers);
		//重要的比较   操作符优先级和引用等价性等价性
		final String pig = "length: 10";
		final String dog = "length: "+pig.length();
		System.out.println(dog+"\n"+pig);
		System.out.println("Animals are equal:"+pig==dog);
		System.out.println("Animals are equal:"+(pig==dog));
		System.out.println("Animals are equal:"+pig.equals(dog));
		
	}
}
