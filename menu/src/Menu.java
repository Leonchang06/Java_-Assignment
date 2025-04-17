import java.util.Scanner;

public class Menu {
    public static void main(String[] args) throws Exception {
        User[] u1 = new User[10];
        u1[0] = new User("leon", 'M', 19, "Leon0618", "leon@gmail.com");
        Scanner cin = new Scanner(System.in);
        Movie movie = new Movie();
        System.out.println("Cinema Ticket Booking");
        System.out.println("\n1. Register\n2. Login\n3. Logout");
        int Selected = cin.nextInt();
        switch (Selected) {
            case 1:
                break;
            default:
                System.out.println("invalid selected");
                break;
        }
        
        System.out.println("Select Your Movie");

        movie.setMovie();
        movie.getMovie();
        movie.clearMovie();

        cin.close();
    }
}
