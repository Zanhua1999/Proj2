public class Main {
    public static void main(String[] args) {
        Igor igor = new Igor();
        System.out.println("is op slot?: "+igor.getIsOpSlot());
        igor.OpenDeur();
        System.out.println("is op slot?: "+igor.getIsOpSlot());
    }
}
