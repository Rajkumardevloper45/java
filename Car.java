public class Car{
int carnumber;
String carname;
String fueltype;

public Car(int carnumber,String carname){
this.carnumber=carnumber;
this.carname=carname;
}
public Car(int carnumber,String carname,String fueltype){
this.carnumber=carnumber;
this.carname=carname;
this.fueltype=fueltype;
}

void display(){
System.out.println("CarNumber:   "+carnumber);
System.out.println("CarName:   "+carname);
System.out.println("FuelType:   "+fueltype);
}
public static void main(String[] args){
Car c2=new Car(4707,"TOYOTA","Diesel");

c2.display();
}
}
