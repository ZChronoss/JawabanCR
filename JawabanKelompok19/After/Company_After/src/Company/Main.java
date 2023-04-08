package Company;

import java.util.ArrayList;

public class Main {
	ArrayList<String> workerName = new ArrayList<>();
	ArrayList<Integer> workerSalary = new ArrayList<>();
	
	private Main() {
		workerName.add("Jack Anderson");
		workerName.add("Keila Rin");
		workerSalary.add(10000);
		workerSalary.add(11000);
		
		System.out.println(workerName.get(0) + "'s salary is Rp." + workerSalary.get(0));
		System.out.println(workerName.get(1) + "'s salary is Rp." + workerSalary.get(1));
	}
	
	public static void main(String[] args) {
		new Main();
		
	}
}
