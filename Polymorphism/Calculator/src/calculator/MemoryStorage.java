package calculator;

import java.util.ArrayDeque;
import java.util.Deque;

public class MemoryStorage implements Operation{
    private Deque<Integer> memory;

    public MemoryStorage() {
        this.memory = new ArrayDeque<>();
    }

    @Override
    public void addOperand(int operand) {
        memory.push(operand);
    }

    @Override
    public int getResult() {
        return memory.pop();
    }

    @Override
    public boolean isCompleted() {
        return false;
    }
}
