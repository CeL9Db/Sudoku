package gl_project.sudoku.core.constraint;

import java.util.List;

import gl_project.sudoku.core.sudoku.Cell;

public interface Constraints {

    boolean isValid(List<Cell> cells);
}
