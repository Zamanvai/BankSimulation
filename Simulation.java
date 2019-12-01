package dataStructure1;

public class Simulation {
  static int numServers;
  static int numClients;
  static int meanServiceTime;
  static int meanInterarrivalTime;
  static Server[] servers;
  static Client[] clients;
  static Queue queue = new ArrayQueue(numClients);
  static java.util.Random randomArrival;
  static java.util.Random randomService;
  public static void main(String[] args) {
   /* init(args);
  }  
static void init(String[] args) {
    if (args.length<4) {
      System.out.println("Usage: java Simulation <numServers> "
      + "<numClients> <meanServiceTime> <meanInterarrivalTime>");
      System.out.println(" e.g.: java Simulation 3 100 12 4");
      System.exit(0);
    }*/
	 int service=service();
	 int interval=interval();
    numServers = 10;
    numClients = 100;
    meanServiceTime = service;
    meanInterarrivalTime = interval;
    servers = new Server[numServers];
    clients = new Client[numClients];
    randomService = new ExponentialRandom(meanServiceTime);
    randomArrival = new ExponentialRandom(meanInterarrivalTime);
    

    queue = new ArrayQueue(numClients);

    for (int j=0; j<numServers; j++)
    	
        servers[j] = new SimServer(j,randomService.nextInt());
      System.out.println("     Number of servers = " + numServers); 
      System.out.println("     Number of clients = " + numClients); 
      System.out.println("     Mean service time = " + meanServiceTime); 
      System.out.println("Mean interarrival time = " + meanInterarrivalTime); 
      for (int j=0; j<numServers; j++)
        System.out.println("Mean service time for " + servers[j] + " = "+ servers[j].getMeanServiceTime());   
      
    }
  public static int service () {
	  int service=0;   
	  int max=45;
	   int min=30;
     service=min + (int)(Math.random() * ((max - min) + 1));
 return service;
  }
  public static int  interval() {
	  int interval=0;   
	  int max=600;
	   int min=120;
     interval=min + (int)(Math.random() * ((max - min) + 1));
 return interval;
  }
  
  }
