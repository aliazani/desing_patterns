package Structural.Decorator.Challenge;

public class MainDetector implements AbstractArtefact {
    private boolean isMain;
    private AbstractArtefact abstractArtefact;

    public MainDetector(AbstractArtefact abstractArtefact) {
        this.abstractArtefact = abstractArtefact;
    }

    @Override
    public String render() {
        return abstractArtefact.render() + " [Main]";
    }
}
