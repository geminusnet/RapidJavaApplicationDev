package exercise3_2;

public class MemoryEvent extends java.util.EventObject {
  private Runtime runtime = Runtime.getRuntime();

  public MemoryEvent(Object o) {
    super(o);
  }

  public long freeMemory() {
    return runtime.freeMemory();
  }

  public long totalMemory() {
    return runtime.totalMemory();
  }
}