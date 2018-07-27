package JavaProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;

class EmployeeVo {
	 int empid;
	 String empname;
	 double annualIncome;
	 double incomeTax=0;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public double getAnnualIncome() {
		return annualIncome;
	}
	public void setAnnualIncome(double annualIncome) {
		this.annualIncome = annualIncome;
	}
	public double getIncomeTax() {
		return incomeTax;
	}
	public void setIncomeTax(double incomeTax) {
		this.incomeTax = incomeTax;
	}
	public EmployeeVo(int empid, String empname, double annualIncome) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.annualIncome = annualIncome;
		
	}
	@Override
	public String toString() {
		return "EmployeeVo [empid=" + empid + ", empname=" + empname + ", annualIncome=" + annualIncome + ", incomeTax="
			+ incomeTax + "]";
		
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(annualIncome);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + empid;
		result = prime * result + ((empname == null) ? 0 : empname.hashCode());
		temp = Double.doubleToLongBits(incomeTax);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeVo other = (EmployeeVo) obj;
		if (Double.doubleToLongBits(annualIncome) != Double.doubleToLongBits(other.annualIncome))
			return false;
		if (empid != other.empid)
			return false;
		if (empname == null) {
			if (other.empname != null)
				return false;
		} else if (!empname.equals(other.empname))
			return false;
		if (Double.doubleToLongBits(incomeTax) != Double.doubleToLongBits(other.incomeTax))
			return false;
		return true;
	}
	
}

class EmployeeBo{
	public void calincomeTax(EmployeeVo evo)
	{
		double incomeTax= evo.getAnnualIncome()*0.3;
		evo.setIncomeTax(incomeTax);
	}
}

class Emplyeesort implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
		 EmployeeVo e1=(EmployeeVo)o1;
		 EmployeeVo e2=(EmployeeVo)o2;
		 int retval=0;
		 if(e1.getIncomeTax()<e2.getIncomeTax())
			 retval=1;
		 else
			 if(e1.getIncomeTax()>e2.getIncomeTax())
				 retval=-1;
			 else
				 retval=0;
			return retval;
	}
	
}

public class Problem2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int n;
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter no of employees: ");
		n=Integer.parseInt(br.readLine());
		EmployeeVo ev[]=new EmployeeVo[n];
		
		for(int i=0;i<n;i++) {
		
		
		System.out.println("Enter employee id: ");
		int num=Integer.parseInt(br.readLine());
		
		System.out.println("Enter name: ");
		String name=(br.readLine());
		
		System.out.println("Enter annual income: ");
		double income =Double.parseDouble(br.readLine());
		
		ev[i]= new EmployeeVo(num, name, income);
		}
		
		
		// Let's call the method to calculate the it
		EmployeeBo ebo=new EmployeeBo();
		
		for (int i=0;i<n;i++)
		{
			
			
			ebo.calincomeTax(ev[i]);
			System.out.println(ev[i]);
			
		}
		
	}

}
