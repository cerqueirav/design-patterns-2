package br.edu.ifba.inf011.aval2.utils;
import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.List;

public class Utils {
	public static List<DayOfWeek> daysRestAbcd(){
		List<DayOfWeek> daysOfRest = new ArrayList<>();
		daysOfRest.add(DayOfWeek.FRIDAY);
		daysOfRest.add(DayOfWeek.SATURDAY);
		daysOfRest.add(DayOfWeek.SUNDAY);
		return daysOfRest;
	}
	
	public static List<DayOfWeek> daysRestFullWorkoutOrCardio(){
		List<DayOfWeek> daysOfRest = new ArrayList<>();
		daysOfRest.add(DayOfWeek.TUESDAY);
		daysOfRest.add(DayOfWeek.THURSDAY);
		daysOfRest.add(DayOfWeek.SATURDAY);
		daysOfRest.add(DayOfWeek.SUNDAY);
		return daysOfRest;
	}
}
