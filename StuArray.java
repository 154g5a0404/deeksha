package ass.four;
import java.util.*;

public class StuArray {
	
public static String n1,n2,n3,n4;
ArrayList<String>al = new ArrayList<>();
public void setNames() {
	Scanner sc =new Scanner(System.in);
	System.out.println("enter name for index 0 ");
	n1=sc.next();
	System.out.println("enter name for index 1 ");
	n2=sc.next();
	System.out.println("enter name for index 2");
	n3=sc.next();
	System.out.println("enter name for index 3 ");
	n4=sc.next();
	
	al.add(n1);
	al.add(n2);
	al.add(n3);
	al.add(n4);
	System.out.println("The array List is: ");
	System.out.println(al);
}
public void searchName(String stuName) {
	System.out.println("The student name Searched is present :");
	System.out.println(al.contains(stuName));
}

public void searchName1(int index) {
	System.out.println("The student having index "+index+" is :");
	System.out.println(al.get(index));
}

public void printNames() {
Iterator itr =al.iterator();
    while(itr.hasNext()) {
    
    	System.out.println(itr.next());
    }
   	
}
public void removeName(String stuName) {
	al.remove(stuName);
	System.out.println("Arraylist after removing studentname "+stuName);
	
	System.out.println(al);
}

 
 
}
