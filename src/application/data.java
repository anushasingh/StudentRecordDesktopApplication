package application;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.FloatProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleFloatProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class data {
	private final StringProperty Test_Name;
	private final IntegerProperty bla ;
	private final IntegerProperty Obt_Marks ;
	private final DoubleProperty percentage_obtained;
	private final FloatProperty Time_Taken ;
	private final IntegerProperty Attempt_no;
	private final StringProperty Test_Branch ;
	private final StringProperty Date_Time ;


	public data(String Test_Name, Integer bla, Integer Obt_Marks, Double percentage_obtained, Float Time_Taken, Integer Attempt_no, String Test_Branch, String Date_Time)
	{
		super();
		this.Test_Name=new SimpleStringProperty(Test_Name);
		this.bla=new SimpleIntegerProperty(bla);
		this.Obt_Marks=new SimpleIntegerProperty(Obt_Marks);
		this.percentage_obtained=new SimpleDoubleProperty(percentage_obtained);
		this.Time_Taken=new SimpleFloatProperty(Time_Taken);
		this.Attempt_no=new SimpleIntegerProperty(Attempt_no);
		this.Test_Branch=new SimpleStringProperty(Test_Branch);
		this.Date_Time=new SimpleStringProperty(Date_Time);

	}

	public String getTest_Name() {
		return Test_Name.get();
	}

	public void setTest_Name(String Test_Name) {
		this.Test_Name.set(Test_Name);
	}

	public Integer getMax_Marks() {
		return bla.get();
	}

	public void setMax_Marks(Integer bla) {
		this.bla.set(bla);
	}

	public Integer getObt_Marks() {
		return Obt_Marks.get();
	}

	public void setObt_Marks(Integer Obt_Marks) {
		this.Obt_Marks.set(Obt_Marks);
	}

	public Double getpercentage_obtained() {
		return percentage_obtained.get();
	}

	public void setpercentage_obtained(Integer percentage_obtained) {
		this.percentage_obtained.set(percentage_obtained);
	}

	public Float getTime_Taken() {
		return  Time_Taken.get();
	}

	public void setTime_Taken(Float Time_Taken) {
		this.Time_Taken.set(Time_Taken);
	}

	public Integer getAttempt_no() {
		return Attempt_no.get();
	}

	public void setAttempt_no(Integer Attempt_no) {
		this.Attempt_no.set(Attempt_no);
	}

	public String getTest_Branch() {
		return Test_Branch.get();
	}

	public void setTest_Branch(String Test_Branch) {
		this.Test_Branch.set(Test_Branch);
	}

	public String getDate_Time() {
		return Date_Time.get();
	}

	public void setDate_Time(String Date_Time) {
		this.Date_Time.set(Date_Time);
	}



}
