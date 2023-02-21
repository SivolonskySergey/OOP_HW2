public class SwimmingPoll {

    private final int distance;
    public String name = "бассейн";

    public SwimmingPoll(int distance) {
        this.distance = distance;
    }

    public boolean pass(CanSwim CanSwim) {
        return CanSwim.getSwim() >= distance;
    }

    public String getName() {
        return this.name;
    }
}
