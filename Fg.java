import java.util.Scanner;
class Fg { //suuuuuuu
public static int indexOfSmallest(int[]array){
int f=0;
if(array[0]<array[1] && array[0]<array[2] && array[0]<array[3] &&  array[0]<array[4] )
{ f=array[0];

}
if(array[1]<array[0] && array[1]<array[2] && array[1]<array[3] &&  array[1]<array[4] )
{ f=array[1];
}
if(array[2]<array[1] && array[2]<array[0] && array[2]<array[3] &&  array[2]<array[4]   )
{ f=array[2];
}
if(array[3]<array[1] && array[3]<array[2] && array[3]<array[0] &&  array[3]<array[4] )
{ f=array[3];
}
if(array[4]<array[1] && array[4]<array[2] && array[4]<array[3] &&  array[4]<array[0]  )
{ f=array[4];
}
if(array[5]<array[1] && array[5]<array[2] && array[5]<array[3] &&  array[5]<array[4] && array[5]<array[0])
{ f=array[5];
}
return f;


}

public static void main(String[]args)
{
Scanner oo =new Scanner(System.in);
System.out.println("enter the 5 no");
int[]array=new int[4];
for(int i=0;i<array.length;i++){
array[i]=oo.nextInt();
}
System.out.println("the smallest is" +  indexOfSmallest(array) + "the length is" + array.length);
}

}
