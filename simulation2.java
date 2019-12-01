package dataStructure1;

public class simulation2 {
  static int numServers;
  static int numClients;
  static int numQueue;
  static int meanServiceTime;
  static int meanInterarrivalTime;
  static Server[] servers;
  static Client[] clients;
  static Queue queue = new ArrayQueue(numClients);
  static java.util.Random randomArrival;
  static java.util.Random randomService;
  public static void main(String[] args) {
	 int service=service();
	 int interval=interval();
	 int service1=service1();
	 int interval1=interval1();
    numServers = 5;
    numQueue=2;
    meanServiceTime = service;
    meanInterarrivalTime = interval;
  int  meanServiceTime1 = service1;
  int  meanInterarrivalTime1 = interval1;
    servers = new Server[numServers];
    clients = new Client[numClients];
    randomService = new ExponentialRandom(meanServiceTime);
    randomArrival = new ExponentialRandom(meanInterarrivalTime);
    

    queue = new ArrayQueue(numQueue);

    for (int j=0; j<numServers; j++)
    	
        servers[j] = new SimServer(j,randomService.nextInt());
      System.out.println("     Number of servers = " + numServers); 
      System.out.println("     Number of queue = " + numQueue); 
      System.out.println("     Mean service time = " + meanServiceTime); 
      System.out.println("Mean interarrival time = " + meanInterarrivalTime); 
      for (int j=0; j<numServers; j++)
        System.out.println("Mean service time for " + servers[j] + " = "+ servers[j].getMeanServiceTime());   
      
      for (int k=0; k<numServers; k++)
      	
          servers[k] = new SimServer(k,randomService.nextInt());
        System.out.println(" \n     Number of queue = " + numQueue); 
        System.out.println("     Mean service time = " + meanServiceTime1); 
        System.out.println("Mean interarrival time = " + meanInterarrivalTime1); 
        for (int k=0; k<numServers; k++)
        	 System.out.println("Mean service time for " + servers[k] + " = "+ servers[k].getMeanServiceTime());   
    }
  public static int service () {
	  int service=0;   
	  int max=45;
	   int min=30;
     service=min + (int)(Math.random() * ((max - min) + 1));
 return service;}
 public static int service1 () {
	  int service1=0;   
	  int max=45;
	   int min=30;
    service1=min + (int)(Math.random() * ((max - min) + 1));
return service1;
  }
  public static int  interval() {
	  int interval=0;   
	  int max=600;
	   int min=120;
     interval=min + (int)(Math.random() * ((max - min) + 1));
 return interval;
  }
  public static int  interval1() {
	  int interval1=0;   
	  int max=600;
	   int min=120;
     interval1=min + (int)(Math.random() * ((max - min) + 1));
 return interval1;
  }
  }
