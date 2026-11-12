public abstract class Person
{
    private int Id;
    private String Name;
    private int Age;
    private int Phone;
    private String Address;



    public Person(int id, String name, int age, int phone ,String address ) {
        this.Id = id;
        this.Name = name;
        this.Age = age;
        this.Phone = phone;
        this.Address = address;

    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        if (id < 0 || id > 9999)
            System.out.println("pleas enter the reight id");
        else Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        if (name == null)
            System.out.println("pleas enter your name");
        else Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 120)
            System.out.println("pleas enter the reight age");
        else Age = age;
    }

    public int getPhone() {
        return Phone;
    }

    public void setPhone(int phone) {
        if (phone<0 || phone>999999999)
            System.out.println("pleas enter the reight number");
        else Phone = phone;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        if (address == null)
            System.out.println("pleas enter your address");
        else Address = address;
    }

    abstract void display();


}


