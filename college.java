public class college {
    int id;
    String name;
    String branch;
    int age;
    long year;
    public void setDetails(int id, String name, String branch, int age, long year)
    {
        this.id = id;
        this.name = name;
        this.branch = branch;
        this.age = age;
        this.year = year;
    }
    public void getDetails()
    {
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        System.out.println("Branch: " + branch);
        System.out.println("Age: " + age);
        System.out.println("Year: " + year);
        System.out.println("  ");
    }
    public static void main(String[] args) {
        college obj1 = new college();
        college obj2 = new college();
        obj1.setDetails(1, "jagadeesh", "AI & DS", 20, 2025);
        obj2.setDetails(2, "asif", "CSE", 20, 2025);
        obj1.getDetails();
        obj2.getDetails();
    }
}
