package gl_project.sudoku.core.resolution_rule;

import gl_project.sudoku.core.sudoku.Cell;
import gl_project.sudoku.core.sudoku.Grid;

public abstract class BinaryResolutionRule extends ResolutionRule {

    private Cell target1;
    private Cell target2;

    public BinaryResolutionRule(Grid grid, Cell target1, Cell target2) {
        super(grid);
        this.target1 = target1;
        this.target2 = target2;
    }
}
