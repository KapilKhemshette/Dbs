class Array
{
public static void main(String x[])
{//int a1[][]=new int[3][5];
int a1[][]={{1,22,25,26,0},{2,3,4,5,6},{43,34,55,53,4}};
int a2[][]={{1,22,25,26,0},{2,3,4,5,6},{43,34,55,53,4}};
int a3[][]=new int[3][5];
for(int i=0;i<3;i++)
{for(int j=0;j<5;j++)
{
//a3[i][j]=a1[i][j]+a2[i][j];
 System.out.print(a1[i][j]+"	");

 }
System.out.println();
}

System.out.println("second Array:");
for(int i=0;i<3;i++)
{for(int j=0;j<5;j++)
	{ //System.out.print(a3[i][j]+"	");
 System.out.print(a2[i][j]+"	");
 }
 System.out.println();
}
System.out.println("sum of the ARRAY is:"");
for(int i=0;i<3;i++)
{for(int j=0;j<5;j++)
{
a3[i][j]=a1[i][j]+a2[i][j];
 System.out.print(a3[i][j]+"	");

 }
System.out.println();
}
}
}


