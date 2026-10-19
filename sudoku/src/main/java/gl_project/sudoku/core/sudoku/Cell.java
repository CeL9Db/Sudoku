package gl_project.sudoku.core.sudoku;

public class Cell {

    private int value;
    private int maxValue;

    // Association "notes" / "domain" vers Domain
    private Domain domain;

    public Cell() {
        this.domain = new Domain();
    }
}
