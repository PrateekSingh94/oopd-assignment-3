package assign3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Dog extends Pet implements Boardable
{
	private String size;
	private Date dateStart;
	private Date dateEnd;
	public Dog(String name, String ownerName, String color, String size) {
		super(name, ownerName, color);
		// TODO Auto-generated constructor stub
		this.size = size;
	}
	String getSize()
	{
		return this.size;
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
		//System.out.println(dateBoard.toString());
        return !(dateBoard.before(dateStart) || dateBoard.after(dateEnd));
		//return true;
	}
	@Override
	public String toString(){
		String s = this.getPetName()+" owned by "+this.getOwnerName()+"\nColor: "+this.getColor()+"\nGender: "+this.getGender()+"\nSize: "+this.getSize()+"\n";
		return s;
	}
}
