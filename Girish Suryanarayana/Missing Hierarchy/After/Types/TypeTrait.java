package Missing_Hierarchy.Types;

import java.util.ArrayList;

public abstract class TypeTrait {
    	private String name;

    	public TypeTrait(String name) {
    		this.name = name;
    	}

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    	
	    public abstract ArrayList<String> getWeakness();

	    public abstract void setWeakness(ArrayList<String> weakness);

	    public abstract ArrayList<String> getEffectives();

	    public abstract void setEffectives(ArrayList<String> effectives);

}
