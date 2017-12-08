package Week09;

import java.util.ArrayList;

public class ChristmasClub {
    private ArrayList <Member> members;

    public ChristmasClub() {
        this.members = new ArrayList<>();
    }

    public void addMember (Member m) {
        this.members.add (m);
    }

    public String toString () {

        String s = "";

        for (Member m : this.members) {
            s += m.toString();
            s += "\n";
        }

        return s;

    }
    private int totalContribution () {

        int total = 0;

        for (Member m : this.members) {
            total += m.getContribution();
        }

        return total;
    }
    public static void main (String[] args) {
        System.out.println("Christmas Club:");
        Member gary = new Member("gary", 25);
        Member Tony = new Member("gary", 20);
        Member Rubiya = new Member("Rubiya", 22);
        Member Steve = new Member("Steve", 18);

        ChristmasClub cc = new ChristmasClub();

        cc.addMember(gary);
        cc.addMember(Tony);
        cc.addMember(Rubiya);
        cc.addMember(Steve);

        System.out.println(cc);
        System.out.println("The total contributions to the christmas club is: £" + cc.totalContribution());
        System.out.println("The total number of Turkeys that can be bought is: " + cc.totalContribution()/10);
        System.out.println("There is £" + cc.totalContribution()%10 + " Left over");
    }
}