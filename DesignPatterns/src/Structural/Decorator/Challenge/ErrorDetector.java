package Structural.Decorator.Challenge;

public class ErrorDetector implements AbstractArtefact {
    private AbstractArtefact abstractArtefact;

    public ErrorDetector(AbstractArtefact abstractArtefact) {
        this.abstractArtefact = abstractArtefact;
    }

    @Override
    public String render() {
        return abstractArtefact.render() + " [Error]";
    }

}
