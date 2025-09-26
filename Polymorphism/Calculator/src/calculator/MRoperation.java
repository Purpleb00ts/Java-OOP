package calculator;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class MRoperation implements Operation{

    private MemoryStorage memoryStorage;

    public MRoperation(MemoryStorage memoryStorage) {
        this.memoryStorage = memoryStorage;
    }
    @Override
    public void addOperand(int operand) {

    }

    @Override
    public int getResult() {
        return this.memoryStorage.getResult();
    }

    @Override
    public boolean isCompleted() {
        return true;
    }
}
