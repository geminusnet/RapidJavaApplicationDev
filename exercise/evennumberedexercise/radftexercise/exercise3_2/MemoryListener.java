package exercise3_2;

public interface MemoryListener extends java.util.EventListener {
  // Handler for sufficient memory
  public void sufficientMemory(MemoryEvent e);

  // Handler for insufficient memory
  public void insufficientMemory(MemoryEvent e);
}
