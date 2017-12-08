package Week09;

public class Member {

    private String name;
    private int contribution;

    public Member(String name, int contribution) {
        this.name = name;
        this.contribution = contribution;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getContribution() {
        return contribution;
    }

    public void setContribution(int contribution) {
        this.contribution = contribution;
    }

    @Override
    public String toString() {
        return name + ", has contributed £" + contribution;
    }
}
