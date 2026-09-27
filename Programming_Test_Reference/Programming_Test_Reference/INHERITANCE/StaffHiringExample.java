interface iStaff {
    public int getStaffNumber();
    public String getStaffLocation();
    public String getStaffHiringProcess();
}

abstract class Staff implements iStaff {
    protected int staffNumber;
    protected String staffLocation;

    public Staff(int staffNumber, String staffLocation) {
        this.staffNumber = staffNumber;
        this.staffLocation = staffLocation;
    }

    public int getStaffNumber() {
        return staffNumber;
    }

    public String getStaffLocation() {
        return staffLocation;
    }

    public String getStaffHiringProcess() {
        if (staffNumber < 20) {
            return "Hiring must occur.";
        } else {
            return "No hiring required.";
        }
    }
}

class StaffHiring extends Staff {
    public StaffHiring(int staffNumber, String staffLocation) {
        super(staffNumber, staffLocation);
    }

    public void printStaffHiring() {
        System.out.println("Staff Number: " + getStaffNumber());
        System.out.println("Staff Location: " + getStaffLocation());
        System.out.println("Hiring Process: " + getStaffHiringProcess());
    }
}

public class StaffHiringExample {
    public static void main(String[] args) {
        StaffHiring staff = new StaffHiring(15, "Cape Town");
        staff.printStaffHiring();
    }
}
