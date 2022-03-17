package Assignment6_3;

import java.util.Vector;

public class TestEmployee {

		public static void main(String[]args) {
			Vector<Employee> v=addInput();
			display(v);
		}
		public static Vector<Employee> addInput(){
			Employee e1=new Employee(101,"karthik","kadapa");
			Employee e2=new Employee(102,"vidya","pullivendala");
			Employee e3=new Employee(103,"subbu","rajampeta");
			Vector<Employee>v = new Vector<Employee>();
			v.add(e1);
			v.add(e2);
			v.add(e3);
			return v;



		}
		public static void display(Vector<Employee>v)
		{
			for(Employee e:v)
			{
				System.out.println(e.getEmpid()+"\t"+e.getEname()+"\t"+e.getAddress());
			}
		}

	}