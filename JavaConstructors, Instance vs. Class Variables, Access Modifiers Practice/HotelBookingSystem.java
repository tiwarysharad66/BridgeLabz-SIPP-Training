package constructors;
public class HotelBookingSystem {
    String GuestName;
    String RoomType;
    int nights;

    HotelBookingSystem(){
         GuestName = " Sharad Kumar ";
        RoomType = "Deluxeas";
         nights = 2;
    }
    HotelBookingSystem(String guestName,String roomType,int  nights){
         this.GuestName = guestName;
         this.RoomType = roomType;
         this.nights = nights;
    }
    HotelBookingSystem(HotelBookingSystem other){
this.GuestName  = other.GuestName;
this.RoomType = other.RoomType;
this.nights = other.nights;
    }
void display(){

    System.out.println(GuestName + "," + RoomType + "," + nights );
}
    public static void main(String[] args) {
//        HotelBookingSystem b1  = new HotelBookingSystem("sharad","normal",10);
        HotelBookingSystem b2 = new HotelBookingSystem();
        b2.display();
    }
}
