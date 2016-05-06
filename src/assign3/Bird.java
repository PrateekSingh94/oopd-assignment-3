 package assign3;

import java.util.*;
import java.text.*;

public class Bird extends Pet implements Boardable{
	private boolean feathersClipped;
	private Date dateStart=null;
	private Date dateEnd=null;
	Bird(String name, String ownerName, String color) {
		super(name, ownerName, color);
		// TODO Auto-generated constructor stub
		this.feathersClipped = false;
	}
	boolean clipped()
	{
		return this.feathersClipped;
	}
	void setClipped()
	{
		this.feathersClipped = true;
	}
	@Override
	public String toString()
	{
		String s = this.getPetName()+" owned by "+this.getOwnerName()+"\nColor: "+this.getColor()+"\nGender: "+this.getGender()+"\nFeather Clipped: "+this.clipped()+"\n";
		return s;
	}
	@Override
	public void setBoardStart(int month, int day, int year) {
		// TODO Auto-generated method stub
		String s = year+"/"+month+"/"+day;
		SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
		try {
			dateStart = format.parse(s);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println(dateStart.toString());
	}
	@Override
	public void setBoardEnd(int month, int day, int year) {
		// TODO Auto-generated method stub
		String s = year+"/"+month+"/"+day;
		SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
		try {
			dateEnd = format.parse(s);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println(dateEnd.toString());
	}
	@Override
	public boolean boarding(int month, int day, int year) {
		// TODO Auto-generated method stub
		Date dateBoard = null;
		String s = year+"/"+month+"/"+day;
		SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
		try {
			dateBoard = format.parse(s);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*System.out.println(dateBoard.toString());
		System.out.println("Start "+dateStart.toString());
		System.out.println("End "+dateEnd.toString());*/
        return !(dateBoard.before(dateStart) || dateBoard.after(dateEnd));
		//return true;
	}
}
