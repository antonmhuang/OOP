public class ProjectClassTest{
    public static void main(String[] args){
        ProjectClass np = new ProjectClass("Anton");

        np.elevatorPitch("Bob", "He likes to code");
        String newName = "Bob";
        np.setName(newName);
        System.out.println(np.getName());
    }
}