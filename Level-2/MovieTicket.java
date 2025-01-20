//class MovieTicket
class MovieTicket{
    //private members movieName, seatNumber, and price
    private String movieName;
    private int seatNumber;
    private double price;

    //constructor
    public MovieTicket(String movieName,int seatNumber, double price){
        this.movieName=movieName;
        this.seatNumber=seatNumber;
        this.price=price;
    }
    public void display(){
        System.out.println("Movie ticket : ");
        System.out.println("------------------");
        System.out.println("Movie name : "+movieName);
        System.out.println("Seat number : "+seatNumber);
        System.out.println("Price : "+price);
        System.out.println("\n");
    }
}
//Main class
class UseMovieTicket {
    public static void main(String[] args) {
        //object creation
        MovieTicket ticket1=new MovieTicket("Pushpa",1,250);
        MovieTicket ticket2=new MovieTicket("SetaRamam",2,250);
        //displaying ticket details
        ticket1.display();
        ticket2.display();
    }
}