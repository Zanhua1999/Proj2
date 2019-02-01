import java.util.Scanner;
class caculator
{
public static void main(String[] args){
Scanner input=new Scanner(System.in);
Count count=new Count();
System.out.print("Voeg de 1ste getal toe:");
count.one=input.next();
System.out.print("Voeg de teken toe:");
count.te=input.next();
System.out.print("Voeg de 2de getal toe:");
count.two=input.next();
if(count.te.equals("+")){
count.outcome=Float.parseFloat(count.one)+Float.parseFloat(count.two)+"";

System.out.println(count);
}
}
class Count{
String one;
String two;
String te;
String outcome;
public String toString(){
return one+te+two+"="+outcome;
}
}
}
