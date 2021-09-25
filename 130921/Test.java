/*
class Test
{
	public static void main(String[]args)
	{
	byte b1=10;
	byte b2=20;
	byte b3=(byte)(b1+b2);
	 System.out.println(b3);
	}
}


class Test2
{
	public static void main(String[]args)
	{
	float x=49.99F;
	 System.out.println(x);
	}
}


class Test2
{
	public static void main(String[]args)
	{
	 int a=999;
	 if(a%2==0)

	System.out.println("even");
	else
	System.out.println("odd");

	}
}




class Test3
{
	public static void main(String[]args)
	{
	 int a=999;
	int b=3;
	int c=695;
	if*)
	 System.out.println(a%2==0 ? "EVEN NUMBER" : "ODD NUMBER");
	}
}

class Test4
{
	public static void main(String[]args)
	{
	 int a=999;
	int b=3;
	int c=999;
	if(a>=b && a>=c)
	 System.out.println(a+" is greater");
	else if (b>=a && b>=c)
	System.out.println(b+" is greater");
	else if(a==b && b==c)
	System.out.println(" all are equal");


	}
}


class Test5
{
	public static void main(String[]args)
	{
	char ch = 'a';

	switch (ch) 
	{
 	 case 'A':
	case 'a':
   	 System.out.println("a option");
   	 break;

 	case 'B':
	case 'b':
   	 System.out.println("b option");
   	 break;

	default:
	 System.out.println("enter a or b");
	 
 	
	}
}
}



import java.util.Scanner;
class Test6
{
	public static void main(String[]args)
	{
	Scanner sc = new Scanner(System.in);
	 System.out.print("Enter number:");
	int x = sc.nextInt();
	
	 if(x%2==0)
	System.out.println("The number is even");
	else
	System.out.println("The number is odd");


	}
}



import java.util.Scanner;
class Test7
{
	public static void main(String[]args)
	{
	int i=0;
	
	while(i<=5)
	{
	System.out.println("hello");
	i++;

	}
	System.out.println("end");

	}
}


class Test8
{
	public static void main(String[]args)
	{
	int i=0;
	
	do
	{
	System.out.println("hello");
	i++;
	}
	while(i<=5);
	System.out.println("end");

	}
}


class Test9
{
	public static void main(String[]args)
	{
	for(int i=0;i<5;i++)
		System.out.println("hello");
	//not possible since i is not accessible out side loop System.out.println(i)
	System.out.println("end");

	}
}





//pattern


class Test11
{
	public static void main(String[]args)
	{
	for(int i=0;i<=6;i++)
	{
	        for(int j=0;j<=i;j++)
		{
		
		System.out.print(j+" ");
	                      }
	System.out.println();
	}
	System.out.println("end");

	}
}


class Test12
{
	public static void main(String[]args)
	{
	String s ="qwertyuio";
	 System.out.println(s);
	}
}



class Test13
{
	public static void main(String[]args)
	{
	String s ="qwertyuio is the mainn";
	 System.out.println(s.indexOf('s'));
	 System.out.println(s.substring(2,5));
	}
}

class Test14
{
	public static void main(String[]args)
	{
	String s1 = new String("welcome");
	String s2 = new String("WELCOME");
	System.out.println(s1.equals(s2));
	if(s1.equalsIgnoreCase(s2))
	{
	System.out.println("Same");
	}
	else
	System.out.println("NOt Same");
		
	}
}


class Test15
{
	public static void main(String[]args)
	{
	StringBuffer sb = new StringBuffer("welcome");
//sb.reverse();
sb.delete(2,5);
sb.append("ddddddd");
System.out.println(sb);

}
*/
class Test16
{
public static void main(String[]args)
{
//int a[]={14,18,27,19,28};
int a[]=new int[5];
for(int i=0;i<a.length;i++)
{
System.out.println(a[i]);
}
}
}

class Test16
{
public static void main(String[]args)
{
//int a[]={14,18,27,19,28};
int a[]=new int[5];
for(int i=0;i<a.length;i++)
{
System.out.println(a[i]);
}
}
}
