package Other;

import java.util.Scanner;
import java.lang.String;

public class marks {
    public static void main (String[] args) {
        Scanner dd = new Scanner(System.in);
        System.out.print("Enter the Students name: ");
        String name = dd.nextLine();
        System.out.print("Enter the total number of results: ");
        int Number_of_results = dd.nextInt();
        int[] Results = new int[Number_of_results];

        for (int i = 0; i < Results.length; i++) {
            System.out.print("Enter the next result: ");
            Results[i] = dd.nextInt();
        }
        int Total = 0;
        for(int i = 0 ; i < Results.length; i++) {
            Total += Results[i];
        }
        int Grade = (Total/Number_of_results);

        if(Grade > 70){
            System.out.print("Congratulations " + name + " aced it! \n they got " + Grade + "%");
        }
        else if(Grade > 50){
            System.out.print("Congratulations " + name + " passed! \n they got " + Grade + "%");
        }
        else{
            System.out.print("Sadly " + name + " didn't pass this exam \n they got " + Grade + "%");
        }
    }
}
