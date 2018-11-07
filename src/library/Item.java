package library;

public abstract class Item {
	private int id;
	private String name;
	private static int maxID = 0;

	public Item(Item i) {
		this.id = ++maxID;
		this.name = i.name;
	}

	public Item(String name) {
		this.id = ++maxID;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {

		return "Item ID:" + id + ", Name: " + name;
	}

	public abstract double getLateFees(int days);

	@Override
	protected abstract Item clone();

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if(!(obj instanceof Item))
			return false;
		Item i = (Item) obj;
		return i.id == id;
	}

}
