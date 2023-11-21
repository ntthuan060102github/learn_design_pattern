package CreationalPatterns.Prototype;

public class Documentation implements Cloneable {
    private int numOfPages;
    private String title;

    public Documentation(int numOfPages, String title) {
        this.numOfPages = numOfPages;
        this.title = title;
    }

    @Override
    public Cloneable clone() {
        return new Documentation(this.numOfPages, this.title);
    }

    public void showContent() {
        System.out.println(this.numOfPages);
        System.out.println(this.title);
    }
}
