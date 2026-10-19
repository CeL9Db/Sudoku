package gl_project.sudoku.core.sudoku;

import java.util.ArrayList;
import java.util.List;

public class Grid {

    private int size;

    // Composition : une grille possède ses cellules
    private Cell[][] cells;

    public Grid(int size) {
        this.size = size;
        this.cells = new Cell[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                this.cells[i][j] = new Cell();
            }
        }
    }

    public List<Cell> getLine(int index) {
        // TODO
        return new ArrayList<>();
    }

    public List<Cell> getColumn(int index) {
        // TODO
        return new ArrayList<>();
    }

    public List<Cell> getBox(int row, int column) {
        // TODO
        return new ArrayList<>();
    }
}
