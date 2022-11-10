/**
 * 
 */
package serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * @author ${S546518 Nikhila Chowdary Vaitla}
 *
 */
public class EmployeeDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
            Employee emp1 =new Employee(25,"Nik");
            Employee emp2 =new Employee(30,"Harry");
            FileOutputStream fout=new FileOutputStream("output.txt");
            ObjectOutputStream out=new ObjectOutputStream(fout);
            out.writeObject(emp1);
            out.writeObject(emp2);
            out.flush();
            out.close();
            System.out.println("Successfully");
     }
     catch(Exception e){
            System.out.println(e);
            }
	}

}
