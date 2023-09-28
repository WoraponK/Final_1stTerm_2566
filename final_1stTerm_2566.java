//65022780 Worapon Klabsri

import java.util.ArrayList;

public class final_1stTerm_2566 {

    public static void main(String[] args) {
        //Employee Objects
        Employee e1 = new Employee("Tom", 20, "UX/UI", "0001");
        Employee e2 = new Employee("Tim", 20, "FrontEnd", "0002");
    
        //Project Objects
        Project p1 = new Project("Web A", "Developing a web application");
        Project p2 = new Project("Mobile app A", "Developing a mobile app");
    
        //Add Projects to Employees
        e1.addProject(p1);
        e1.addProject(p2);

        e2.addProject(p1);

        //Show Details
        e1.ShowDetails();
        e2.ShowDetails();
    }

}

interface Person {
    String getName();
    void setName(String Name);
    int getAge();
    void setAge(int Age);
}

interface Job {
    String getPosition();
    void setPosition(String Position);
    String getEmpID();
    void setEmpID(String empID);
}

class Employee implements Person, Job{
    private String Name;
    private int Age;
    private String Position;
    private String empID;
    protected ArrayList<Project> Myproject;

    public Employee(String Name, int Age, String Position, String empID){
        this.Name = Name;
        this.Age = Age;
        this.Position = Position;
        this.empID = empID;
        this.Myproject = new ArrayList<Project>();
    }

    public void addProject(Project project) {
        this.Myproject.add(project);
    }

    public void ShowDetails() {
        System.out.println("************************************");
        System.out.println("Name : " + Name);
        System.out.println("Position : " + Position);
        System.out.println("EmpID : " + empID);
        System.out.println("Projects");

        for (int i = 0 ; i < this.Myproject.size(); i++) {
            System.out.println(this.Myproject.get(i).getProject());
        }
    }

    public ArrayList<Project> getProject() {
        return this.Myproject;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public String getPosition() {
        return Position;
    }

    public void setPosition(String Position) {
        this.Position = Position;
    }

    public String getEmpID() {
        return empID;
    }

    public void setEmpID(String empID) {
        this.empID = empID;
    }
}

class Project {
    private String projectName;
    private String Description;

    public Project(String projectName, String Description) {
        this.projectName = projectName;
        this.Description = Description;
    }

    public String getProject() {
        return "\t" + projectName + " : " + Description;
    }
}