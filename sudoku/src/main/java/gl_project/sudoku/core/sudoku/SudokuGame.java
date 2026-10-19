package gl_project.sudoku.core.sudoku;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import gl_project.sudoku.core.constraint.Constraints;
import gl_project.sudoku.core.resolution_rule.ResolutionRule;

public class SudokuGame {

    private int gridSize;
    private int missingCells;
    private boolean isGridEmpty;
    private int errorCount;

    private Grid grid;

    // Agrégation
    private List<Constraints> constraints;
    private Map<ResolutionRule, Boolean> resolutionRules;

    public SudokuGame(int gridSize) {
        this.gridSize = gridSize;
        this.grid = new Grid(gridSize);
        this.constraints = new ArrayList<>();
        this.resolutionRules = new HashMap<>();
        this.isGridEmpty = true;
    }

    public void startGame() {
        // TODO
    }
}
