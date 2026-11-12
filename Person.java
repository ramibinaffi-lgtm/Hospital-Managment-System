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
    Id = id;
  }

  public String getName() {
    return Name;
  }

  public void setName(String name) {
    Name = name;
  }

  public int getAge() {
    return Age;
  }

  public void setAge(int age) {
    Age = age;
  }

  public int getPhone() {
    return Phone;
  }

  public void setPhone(int phone) {
    Phone = phone;
  }

  public String getAddress() {
    return Address;
  }

  public void setAddress(String address) {
    Address = address;
  }

  abstract void display();
 

}
