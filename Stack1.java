import java.util.Stack;

public class StackRfun {
    public static void main(String[] args) {
    Stack<String> games = new Stack<String>();
    games.add("Call of Duty");
    games.add("Subway Surfers");
    games.add("PUBG");
    System.out.println(games.peek());
    System.out.println(games.pop());
    System.out.println(games);
    System.out.println(games.get(0));
    System.out.println(games.set(1, "Block Blast"));
    System.out.println(games);
    System.out.println(games.size());


}
}
