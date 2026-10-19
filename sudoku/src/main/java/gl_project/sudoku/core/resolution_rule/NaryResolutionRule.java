package gl_project.sudoku.core.resolution_rule;

import java.util.List;

import gl_project.sudoku.core.sudoku.Cell;
import gl_project.sudoku.core.sudoku.Grid;

public abstract class NaryResolutionRule extends ResolutionRule {

    private List<Cell> targets;

    public NaryResolutionRule(Grid grid, List<Cell> targets) {
        super(grid);
        this.targets = targets;
    }
}
