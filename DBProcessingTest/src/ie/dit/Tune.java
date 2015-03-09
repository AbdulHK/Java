package ie.dit;

public class Tune 
{
	//right click<refactor<encapslute filed to create getters and setters.
	private	String title;
	private String SearchKey;  
	float ed;
	
	public Tune()
	{ //2 string method
	}
	public String toString()
	{
		return  title+ "\t"+SearchKey+ "\t" +  ed;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSearchKey() {
		return SearchKey;
	}

	public void setSearchKey(String searchKey) {
		SearchKey = searchKey;
	}
	}

