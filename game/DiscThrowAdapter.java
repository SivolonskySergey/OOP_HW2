public class DiscThrowAdapter implements Obstacle {

    private final DiscThrow DiscThrow;

    public DiscThrowAdapter(DiscThrow DiscThrow) {
        this.DiscThrow = DiscThrow;
    }

    @Override
    public boolean pass(Participant participant) {
        return DiscThrow.pass(participant);
    }

    public String getName() {
        return DiscThrow.name;
    }

}