
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> a= new ArrayList<>();
        a.add("Design an Outfit for Ellie");
        a.add("!Light in your Kitchen");
        a.add("Use the Twilio API");
        a.add("Submit a Challenge with Someone in your Guild");
        a.add("Write Code to Sort a List");
        a.add("Build a Data Visualization");
        a.add("Make a Logo for a Project");
        a.add("Explore Hardware (Emulators Welcome!)");
        a.add("Build a Battlesnake");
        a.add("Share a Meal with Someone in Your Guild");

        //Sorting the Array
        for (int i = 0; i < a.size()-1; i++) {
            for (int j=0;j<a.size()-i-1;j++){
                if (a.get(j).compareTo(a.get(j+1))>0){
                    String temp = a.get(j);
                    a.set(j,a.get(j+1));
                    a.set(j+1,temp);
                }
            }
        }

        System.out.println((a));
    }

    
}
