package gl_project.sudoku.core.sudoku;

import java.util.HashMap;
import java.util.Map;

public class Domain {

    private Map<Integer, Boolean> values;

    public Domain() {
        this.values = new HashMap<>();
    }
}
