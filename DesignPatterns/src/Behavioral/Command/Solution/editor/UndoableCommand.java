package Behavioral.Command.Solution.editor;

public interface UndoableCommand extends Command{
    void unexecute();
}
