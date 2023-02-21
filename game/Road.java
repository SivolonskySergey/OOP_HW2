public class Road {

    private final int distance;
    public String name = "беговую дорожку";

    public Road(int distance) {
        this.distance = distance;
    }

    public boolean pass(CanRun canRun) {
        return canRun.getRun() >= distance;
    }

    public String getName() {
        return this.name;
    }
}
