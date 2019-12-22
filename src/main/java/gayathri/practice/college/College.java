package gayathri.practice.college;

public abstract class College {
	protected String collegeName ;
	protected int noOfStudents ;
	protected long collegeFees ;
	
	public double calculateRevenue() {
		return noOfStudents * collegeFees ;
		
	}
	
	

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}



	public void setNoOfStudents(int noOfStudents) {
		this.noOfStudents = noOfStudents;
	}



	public void setCollegeFees(long collegeFees) {
		this.collegeFees = collegeFees;
	}



	public String getCollegeName() {
		return collegeName;
	}

	public int getNoOfStudents() {
		return noOfStudents;
	}

	public long getCollegeFees() {
		return collegeFees;
	}

	public abstract void collegeLibrary(); 

}
