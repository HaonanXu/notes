public class Quine {

	public static void main(String[] args)
	{	
		char [] s = new char[]
		                     {'S','y','s','t','e','m','.','o','u','t','.','p','r','i','n','t','(',
				'"', 'c','h','a','r',' ','[',']', ' ', 's','=','n','e','w',' ','c','h','a','r',
				'[',']','{','"',')',';','f','o','r','(','c','h','a','r',' ','c',':','s',')','{',
				'S','y','s','t','e','m','.','o','u','t','.','p','r','i','n','t','(','(','c','h','a','r',')','3','9',')',';',
				'S','y','s','t','e','m','.','o','u','t','.','p','r','i','n','t','(','(','c',')',';',
				'S','y','s','t','e','m','.','o','u','t','.','p','r','i','n','t','(','(','c','h','a','r',')','3','9',')',';',
				'S','y','s','t','e','m','.','o','u','t','.','p','r','i','n','t','(','(','c','h','a','r',')','4','4',')',';','}',';',
				'S','y','s','t','e','m','.','o','u','t','.','p','r','i','n','t','(','"','}',';','"',')',';',
				'S','y','s','t','e','m','.','o','u','t','.','p','r','i','n','t','(','s',')',';','}','}'
		                     
		                     };
		System.out.print("char [] s = new char[]{");
		for(char c: s)
		{	System.out.print((char) 39);
			System.out.print((char)c);
			System.out.print((char) 39);
			System.out.print((char)44);
		};
		System.out.print("};");
		System.out.print(s);
	}
}
