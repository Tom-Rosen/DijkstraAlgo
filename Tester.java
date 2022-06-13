
public class Tester {

	public static void main(String[] args) {
		CS400Graph<String> graph;
		// TODO Auto-generated method stub
		graph = new CS400Graph<>();
        // insert vertices A-F
        graph.insertVertex("DEN");
        graph.insertVertex("LAS");
        graph.insertVertex("LAX");
        graph.insertVertex("SFO");
        graph.insertVertex("PHX");
        graph.insertVertex("DFW");
        graph.insertVertex("IAH");
        graph.insertVertex("ATL");
        graph.insertVertex("ORD");
        graph.insertVertex("JFK");
        // insert edges from Week 11. Shortest Path Activity
        graph.insertEdge("DEN","ORD",6);
        graph.insertEdge("ORD","JFK",2);
        graph.insertEdge("ORD","ATL",5);
        graph.insertEdge("ORD","DEN",1);
        graph.insertEdge("ATL","DEN",2);
        graph.insertEdge("ATL","IAH",3);
        graph.insertEdge("IAH","DFW",1);
        graph.insertEdge("DFW","DEN",3);
        graph.insertEdge("DEN","DFW",4);
        graph.insertEdge("DFW","ORD",1);
        graph.insertEdge("DFW","PHX",1);
        
        graph.insertEdge("PHX","LAS",3);
        graph.insertEdge("PHX","LAX",4);
        graph.insertEdge("LAX","SFO",1);
        graph.insertEdge("LAS","SFO",1);
        
        graph.insertEdge("SFO","LAS",3);
        graph.insertEdge("LAS","LAX",4);
        graph.insertEdge("LAX","PHX",1);
        graph.insertEdge("PHX","DEN",1);
        graph.insertEdge("PHX","DFW",1);
        
        FlightDataFrontEnd jf = new FlightDataFrontEnd();
        jf.gp = graph;
        String s1 = null;
        String s2 = null;
        jf.costAirports(s1, s2);
        

	}

}
