package Structural.Decorator.Challenge;

public class ErrorDecorator implements AbstractArtefact {
    private AbstractArtefact abstractArtefact;

    public ErrorDecorator(AbstractArtefact abstractArtefact) {
        this.abstractArtefact = abstractArtefact;
    }

    @Override
    public String render() {
        return abstractArtefact.render() + " [Error]";
    }

}
