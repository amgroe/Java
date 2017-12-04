package basics;

public class Cities {

	public static void main(String[] args) {
		// Declare and define an Array
		String[] cities = {"New York", "San Francisco", "Miami", "Dallas"};
		
		System.out.println(cities[0]);
		System.out.println(cities[1]);
		System.out.println(cities[2]);
		System.out.println(cities[3]);
		
	/*	// Declare and define the array (Only Size)
		String[] states = new String[5];
		states[0] = "California";
		states[1] = "Ohio";
		states[2] = "New Jersey";
		states[3] = "Texas";
		states[4] = "Utah";
		System.out.println(states[0]);*/
		
		// Declare Array
		String[] countries;
		
		// Define Array
		countries = new String[3];
		countries[0] = "USA";
		countries[1] = "Canada";
		countries[2] = "UK";
		System.out.println(countries[2]);
		
		
		
// Loops
		// Declare and define the array (Only Size)
				String[] states = new String[5];
				states[0] = "California";
				states[1] = "Ohio";
				states[2] = "New Jersey";
				states[3] = "Texas";
				states[4] = "Utah";
				int i = 0;
				
				
				// Do Loop: enters loop THEN test condition
				System.out.println("*************************");
				System.out.println("Do Loop");
				do{
				System.out.println(states[i]);
				i++;
				}while (i < 5);
				
				
				// While Loop: test condition first THEN enters loop
				System.out.println("*************************");
				System.out.println("While Loop");
				int n = 0;
				boolean stateFound = false;
				while(!stateFound){
					String state = states[n];
					System.out.println(state);
					if (state == "Texas"){
						System.out.println("STATE FOUND!");
						stateFound = true;
					}
					n++;
				}
				
				
				
				// For Loop: best structure for iterating through an array
				System.out.println("*************************");
				System.out.println("For Loop");
				
				for (int x = 0; x < 5; x++){
					System.out.println(states[x]);
				}
				
	}

}
