public class ProjectClass{
    String name; // declare attribute
    String desc;

    public ProjectClass(){ // Constructor 
        System.out.println("I have no parameters!");
    }

    public ProjectClass(String n){ // Constructor
        this.name = n;
        System.out.println(this.name);

    }
    
    public ProjectClass(String n, String d){ // Constructor
        this.name = n;
        this.desc = d;
        System.out.println(this.name + ": " + this.desc);

    }



    public String elevatorPitch(String n, String d) { // Method
        this.name = n;
        this.desc = d;
        System.out.println(this.name + ": " + this.desc);
        return this.name + ": " + this.desc;
    }
    public String getName(){
        return this.name;
    }

    public void setName(String n){
        this.name = n;
    }
}