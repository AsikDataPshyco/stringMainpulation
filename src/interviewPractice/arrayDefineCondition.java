package interviewPractice;

public class arrayDefineCondition implements Comparable<arrayDefineCondition> {
	private int employeeId;
	private String employeeName;
	private int salaryCTC;
	
	
	
	public arrayDefineCondition(int employeeId, String employeeName, int salaryCTC) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salaryCTC = salaryCTC;
	}
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public int getSalaryCTC() {
		return salaryCTC;
	}
	public void setSalaryCTC(int salaryCTC) {
		this.salaryCTC = salaryCTC;
	}

	@Override
	public String toString() {
		return "arrayDefineCondition [employeeId=" + employeeId + ", employeeName=" + employeeName + ", salaryCTC="
				+ salaryCTC + "]";
	}

	@Override
	public int compareTo(arrayDefineCondition o) {
		
		return this.salaryCTC - o.salaryCTC;
	}
	
	
	

}
