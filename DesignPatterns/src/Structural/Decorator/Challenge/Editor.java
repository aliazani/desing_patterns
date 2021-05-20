package Structural.Decorator.Challenge;

public class Editor {
    public void openProject(String path) {
        AbstractArtefact[] artefacts = {
                new Artefact("Main"),
                new Artefact("Demo"),
                new Artefact("EmailClient"),
                new Artefact("EmailProvider"),
        };

        artefacts[0] = new ErrorDetector(new MainDetector(artefacts[0]));
        artefacts[2] = new ErrorDetector(artefacts[2]);

        for (var artefact : artefacts)
            System.out.println(artefact.render());
    }
}
