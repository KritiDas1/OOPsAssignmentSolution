
	

	 class SuperDepartment{
		public String departmentName() {
		   String departmentName = "Super Department";
			return departmentName;
		
					
		}
		
		public String getTodaysWork() {
			String todaysWork = "No Work as of now";
			return todaysWork;
		}
		
		public String getWorkDeadline() {
			String deadline="Nil";
			return deadline;
		}
		
		public String isTodayAHoliday() {
			String holiday="Today is not a holiday";
			return holiday;
		}
	}
	
	
	
	class AdminDepartment extends SuperDepartment{
		
		public String departmentName() {
			String departmentName="Admin Department ";
			return departmentName;
		}
		
		public String getTodaysWork() {
			String todaysWork="Complete your documents Submission";
			return todaysWork;
			
		}
		
		public String getWorkDeadline() {
			String deadline="Complete by EOD ";
			return deadline;
			
		}
	
	}
	
	class HRDepartment extends SuperDepartment{
		
		public String departmentName() {
			String departmentName = "Hr Department";
			return departmentName;
		}
	    public String getTodaysWork() {
	    	String todaysWork = "Fill today’s worksheet and mark your attendance";
	    	return todaysWork;
	    }
	    public String getWorkDeadline() {
	    	String deadline="Complete by EOD ";
	    	return deadline;
	    }
	    public String doActivity() {
	    	String activity = "Team Lunch";
	    	return activity;
	    }}
	
	
    class TechDepartment extends SuperDepartment{
    	
    	public String departmentName() {
    		String departmentName="Tech Department ";
    		return departmentName;
    	}
    	
    	public String getTodaysWork() {
    		String todaysWork="Complete coding of module 1";
    		return todaysWork;
    	}
    	
    	public String getWorkDeadline() {
    		String deadline="Complete by EOD ";
    		return deadline;
    	}
		
    	public String getStackInformation() {
    		String info="core Java";
    		return info;
    	}
    }
    
    public class Main{
	
     public static void main(String[] args) {
    	AdminDepartment admin=new AdminDepartment();
    	String adminDetails="Welcome to "+ admin.departmentName();
    	System.out.println(adminDetails);
    	System.out.println(admin.getTodaysWork());
		System.out.println(admin.getWorkDeadline());
		System.out.println(admin.isTodayAHoliday());
		System.out.println();
		HRDepartment hr=new HRDepartment();
		String hrDetails = "Welcome to "+hr.departmentName();
		System.out.println(hrDetails);
		System.out.println(hr.doActivity());
		System.out.println(hr.getTodaysWork());
		System.out.println(hr.getWorkDeadline());
		System.out.println(hr.isTodayAHoliday());
		System.out.println();
		TechDepartment techie = new TechDepartment();
		String techDetails= "Welcome to "+techie.departmentName();
		System.out.println(techDetails);
		System.out.println(techie.getTodaysWork());
		System.out.println(techie.getWorkDeadline());
		System.out.println(techie.getStackInformation());
		System.out.println(techie.isTodayAHoliday());
     }
     }