package structure;

import org.antlr.v4.codegen.model.ArgAction;

import java.util.ArrayList;

public class Inventory 
{
	
	private ArrayList<Pickup> items;
	//------------------------------------
	public Inventory()
	{
		this.items = new ArrayList<Pickup>();
	}
	//------------------------------------
	public String toString()
	{	
		String out = "";		
		for(Pickup p : items)
		{
			if(p!=null)
			{
				out += p+",";
			}
		}
		if(out.isEmpty()) out = "nothing";
		return out;
	}

	public boolean isEmpty() {
		return this.items.isEmpty();
	}

	//------------------------------------
	public Pickup remove(String id)
	{
		Pickup p = this.select(id);

		this.items.remove(p);			

		return p;
	}
	//------------------------------------
	public Pickup select(String id)
	{
		for(Pickup p : this.items)
		{
			System.out.println("Item's ID: " + p.getId() + ", Given ID: " + id);
			if (p!=null && p.compareID(id))
			{
				return p;
			}
		}
		return null;
	}
	//------------------------------------
	public void add(Pickup p)
	{
		this.items.add(p);
	}
	//------------------------------------
	public void remove(Pickup p)
	{
		this.items.remove(p);
	}
	//------------------------------------

	public ArrayList<Pickup> getItemList() {
		return this.items;
	}

	public Pickup[] getItems()
	{
		Pickup[] items = new Pickup[this.items.size()];
		for(int i=0;i<items.length;i++)
		{
			items[i] = this.items.get(i);
		}
		return items;
	}
}


