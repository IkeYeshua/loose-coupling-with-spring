package dependencyinjection;

public class ScienceCheat implements Cheat{
    @Override
    public void cheat() {
        System.out.println("Caught cheating on science");
    }
}
