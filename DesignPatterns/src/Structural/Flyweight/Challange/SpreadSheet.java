package Structural.Flyweight.Challange;

public class SpreadSheet {
    // In a real app, these values should not be hardcoded here.
    // They should be read from a configuration file.
    private final int MAX_ROWS = 3;
    private final int MAX_COLS = 3;
    private CellContextFactory contextFactory;

    private Cell[][] cells = new Cell[MAX_ROWS][MAX_COLS];

    public SpreadSheet(CellContextFactory contextFactory) {
        this.contextFactory = contextFactory;

        generateCells();
    }

    public void setContent(int row, int col, String content) {
        ensureCellExists(row, col);

        cells[row][col].setContent(content);
    }

    private CellContext getDefaultContext() {
        return new CellContext("Times New Roman", 12, false);
    }

    public void setFontFamily(int row, int col, String fontFamily) {
        ensureCellExists(row, col);

        var cell = cells[row][col];
        var currentContext = cell.getContext();
        var context = contextFactory.getCellContext(fontFamily,
                currentContext.getFontSize(),
                currentContext.isBold());
        cells[row][col].setContext(context);
    }

    private void ensureCellExists(int row, int col) {
        if (row < 0 || row >= MAX_ROWS)
            throw new IllegalArgumentException();

        if (col < 0 || col >= MAX_COLS)
            throw new IllegalArgumentException();
    }

    private void generateCells() {
        for (var row = 0; row < MAX_ROWS; row++)
            for (var col = 0; col < MAX_COLS; col++)
                cells[row][col] = new Cell(row, col, getDefaultContext());

    }

    public void render() {
        for (var row = 0; row < MAX_ROWS; row++)
            for (var col = 0; col < MAX_COLS; col++)
                cells[row][col].render();
    }
}