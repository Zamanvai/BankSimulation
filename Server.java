package dataStructure1;

public interface Server{
  public int getMeanServiceTime();
  public int getStopTime();
  public boolean isIdle();
  public void startServing(Client client, int t);
  }  
