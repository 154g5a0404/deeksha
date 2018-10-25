package ass.four;
import java.util.*;
public class TestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    StuArray sa = new StuArray();
    sa.setNames();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter name to search");
    String ab =sc.next();
    System.out.println("Enter name to remove");
    String ab1 =sc.next();
    System.out.println("Enter index to print");
    int a1 =sc.nextInt();
   
    sa.searchName(ab);
    sa.searchName1(a1);
    System.out.println("printing arraylist using iterator");
	
    sa.printNames();
    sa.removeName(ab1);
	}

}
