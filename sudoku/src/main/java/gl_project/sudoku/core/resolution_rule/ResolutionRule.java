package gl_project.sudoku.core.resolution_rule;

import gl_project.sudoku.core.sudoku.Grid;

public abstract class ResolutionRule {

    private boolean isActive;
    private Grid grid;

    public ResolutionRule(Grid grid) {
        this.grid = grid;
        this.isActive = false;
    }

    public void activate() {
        this.isActive = true;
    }

    public void desactivate() {
        this.isActive = false;
    }

    public abstract void apply();

    public abstract String getName();
}
