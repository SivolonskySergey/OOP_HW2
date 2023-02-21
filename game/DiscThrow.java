public class DiscThrow {

    private final int distance;
    public final String name = "бросание диска";

    public DiscThrow(int distance) {
        this.distance = distance;
    }

    public boolean pass(CanRun canRun) {
        return canRun.getRun() >= distance;
    }

    public String getName() {
        return this.name;
    }
}