public class SwimPollAdapter implements Obstacle {

    private final SwimmingPoll SwimmingPoll;

    public SwimPollAdapter(SwimmingPoll SwimmingPoll) {
        this.SwimmingPoll = SwimmingPoll;
    }

    @Override
    public boolean pass(Participant participant) {
        return SwimmingPoll.pass(participant);
    }

    public String getName() {
        return SwimmingPoll.name;
    }
}