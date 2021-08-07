package jspdemo;

public class CountBean {
  private int count = 0;

  /**Return count property*/
  public int getCount() {
    return count;
  }

  /**Set count property*/
  public void setCount(int count) {
    this.count = count;
  }

  /**Increase count*/
  public void increaseCount() {
    count++;
  }
}