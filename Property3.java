
interface CNG_Car
{
  
  void drive();
  void cng_kit();
}
interface Petrol_Car
{

  void drive();
  void petrol_kit();
}
class Hybrid_Car implements Petrol_Car, CNG_Car {
  public void drive()
  {
    System.out.println("Driving a Hybrid Car");
  }
  public void cng_kit()
  {
    System.out.println("Using the CNG kit for Hybrid Car");
  }
  public void petrol_kit()
  {
    System.out.println("Using the Petrol kit for Hybrid Car");
  }
}


class Property3 {
  public static void main(String args[]) {
   
    Hybrid_Car obj = new Hybrid_Car();

    obj.drive();
    obj.cng_kit();
    obj.petrol_kit();
  }
}