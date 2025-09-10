public class Driver{
    //property class
    private String name;
    private String subject;
    private double salary;
    private int age;
    //constructor parameter
    public Driver(String name, String subject, int age, double salary){
        this.name = name;
        this.subject = subject;
        this.age = age;
        this.salary = salary;
    }

    //setter
    public void setName(String name){
        this.name = name;
    }
    public void setCity(String city){
        this.subject = subject;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }

    //getter
    public String getName(){
        return name;
    }
    public String getCity(){
        return subject;
    }
    public int getAge(){
        return age;
    }
    public double getSalary(){
        return salary;
    }
    //method
    public void Print(){
        System.out.println("Nama Guru : " + name);
        System.out.println("Mata Pelajaran : " + subject);
        System.out.println("Umur : " + age);
        System.out.println("Gaji : " + salary);
    }

}
