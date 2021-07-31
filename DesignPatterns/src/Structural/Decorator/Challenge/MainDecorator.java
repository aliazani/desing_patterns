package Structural.Decorator.Challenge;

public class MainDecorator implements AbstractArtefact {
    private AbstractArtefact abstractArtefact;

    public MainDecorator(AbstractArtefact abstractArtefact) {
        this.abstractArtefact = abstractArtefact;
    }

    @Override
    public String render() {
        return abstractArtefact.render() + " [Main]";
    }
}
