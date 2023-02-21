public class Wall {

    private final int height;
    public String name = "прыжки через стену";

    public Wall(int height) {
        this.height = height;
    }

    public boolean pass(CanJump canJump) {
        return canJump.getJump() >= height;
    }

    public String getName() {
        return this.name;
    }

}
