import java.util.ArrayList;
import java.util.Scanner;

public class Movie {

    Scanner cin = new Scanner(System.in);
    ArrayList<String> Name = new ArrayList<>();
    ArrayList<String> ID = new ArrayList<>();
    ArrayList<String> Type = new ArrayList<>();
    ArrayList<String> Language = new ArrayList<>();

    public Movie() {
        addMovie("Godzilla", "M001", "Action", "English");
        addMovie("Titanic", "M002", "Romance", "English");
        addMovie("Doraemon", "M003", "Animation", "Japanese");
    }

    public void addMovie(String Name, String ID, String Type, String Language) {
        this.Name.add(Name);
        this.ID.add(ID);
        this.Type.add(Type);
        this.Language.add(Language);
    }

    public void setMovie() {
        System.out.println("How many movie you want add?");
        int addMovie = cin.nextInt();
        cin.nextLine();
        if (addMovie >= 1) {
            for (int i = 0; i < addMovie; i++) {
                System.out.print("Movie Name : ");
                String MovieName = cin.nextLine();
                Name.add(MovieName);

                System.out.print("Movie ID : ");
                String MovieID = cin.nextLine();
                if (MovieId.lengt<4) {
                    
                } 
                for(char c:MovieID.toCharArray()){

                 }

                 ID.add(MovieID);
                System.out.print("Movie Type : ");
                String MovieType = cin.nextLine();
                Type.add(MovieType);

                System.out.print("Movie Language : ");
                String MovieLan = cin.nextLine();
                Language.add(MovieLan);

                System.out.println("\n\nYour Movie has been add");
                System.out.println("Movie Name= "+MovieName);
                System.out.println("Movie Name= "+MovieID);
                System.out.println("Movie Name= "+MovieType);
                System.out.println("Movie Name= "+MovieLan);
            }
        } else
            return;
    }

    public void clearMovie(String id){
        System.out.println("Delete Movie List");
        System.out.print("Movie ID delete: ");
        id=cin.nextLine();
        int index=ID.indexOf(id);
        if (index!=-1) {
            Name.remove(index);
            ID.remove(index);
            Type.remove(index);
            Language.remove(index);
            System.out.println("Movie"+Name.get(index)+"have been deleted");
            return;
        }else{
            System.out.println("System can't find the Movie Details");
            return;
        }
        

        
    }
}
