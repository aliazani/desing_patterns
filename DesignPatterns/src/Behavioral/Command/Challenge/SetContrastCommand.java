package Behavioral.Command.Challenge;

public class SetContrastCommand extends AbstractUndoableCommand {
    private final float prevContrast;
    private final float contrast;

    public SetContrastCommand(VideoEditor videoEditor, History history, float contrast) {
        super(videoEditor, history);

        prevContrast = videoEditor.getContrast();
        this.contrast = contrast;
    }

    @Override
    protected void doExecute() {
        videoEditor.setContrast(contrast);
    }

    @Override
    public void undo() {
        videoEditor.setContrast(prevContrast);
    }
}
