import java.util.Scanner;
class student
{
int id;
String name;
void insert(int r,String n)
{
id=r;
name=n;
}
void display()
{
System.out.println("id:"+id+"\tname of student:"+name);
}

}
class student1
{
public static void main(String []args)
{
 Scanner s=new Scanner(System.in);
student s1=new student();
student s2=new student();
for(int i=0;i<2;i++)
System.out.println("enter detail for"+i+"\tstudent roll and then name");
int n=s.nextInt();
String p=s.nextString();
int m=s.nextInt();
String q=s.nextString();

s1.insert(n,p);
s2.insert(m,q);
s1.display();
s2.display();

}

}