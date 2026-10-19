package gl_project.sudoku.core.resolution_rule;

import gl_project.sudoku.core.sudoku.Cell;
import gl_project.sudoku.core.sudoku.Grid;

public abstract class UnaryResolutionRule extends ResolutionRule {

    private Cell target;

    public UnaryResolutionRule(Grid grid, Cell target) {
        super(grid);
        this.target = target;
    }
}
