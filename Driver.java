public class Driver{
    //property class
    private String name;
    private String subject;
    private double salary;
    private int age;

    //constructor default
    public Driver(){
        name = "Bu Pasha";
        subject = "Produktif RPL";
        salary = 2000000;
        age = 20;
    }
    //constructor parameter
    public Driver(String name, String city, int age, double salary){
        this.name = name;
        this.subject = city;
        this.age = age;
        this.salary = salary;
    }

    //setter
    public void setName(String name){
        this.name = name;
    }
    public void setCity(String city){
        this.subject = city;
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