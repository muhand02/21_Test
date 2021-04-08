package Test_01;

import java.util.Scanner;

public class Calender_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year, month;
		System.out.print("년 월 입력하세요: "); //2010 5
		Scanner sc = new Scanner(System.in);
		year = sc.nextInt();
		month = sc.nextInt();
		createCalendar(year, month);
	}
	
	public static void createCalendar(int year, int month)
	{
    //시작 요일과 마지막 날짜를 구하는 메서드
		int dayOfWeek = getDayOfWeek(year, month);
		int lastDay = getLastDay(year, month);
		printCalender(year, month, dayOfWeek, lastDay);
	}
	public static void drawLine(int n) //단순 선 긋는 함수
	{
		for (int i = 0; i < n; i++) 
      System.out.print('-');
		System.out.println();
	}
	
	public static void printCalender(int year, int month, int dayOfWeek, int lastDay) {
		System.out.printf("\t\t%d년 %d월\n",year,month);
		String week = "일월화수목금토";
		drawLine(50);
		for (int i = 0; i < 7; i++)
			System.out.printf("%c \t", week.charAt(i));
		System.out.println();
		drawLine(50);
    drawLine(50);
    
		int cnt=0;
		for (int i = 0; i < dayOfWeek; i++)
		{
			System.out.print('\t');
			cnt++;
    } //시작 요일 수만큼 공백을 준다.  
    
		for (int d = 1; d <= lastDay; d++)
		{
			System.out.printf("%d \t", d);
			if(cnt%7==6)
				System.out.println();
			cnt++;
		} //차례대로 요일 출력 1~30
 }

	public static int getDayOfWeek(int year, int month) {
		int totDays = (year-1)*365 + (year-1)/4 - (year-1)/100 + (year-1)/400;
		for (int i = 1; i < month; i++) 
		{
			totDays+=getLastDay(year, i);
		}
		totDays+=1;

		return totDays%7;
	}
	
	public static int getLastDay(int year, int month) {
		int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		return isleapyear(year) && month==2 ? 29 : days[month-1];
	}

	public static boolean isleapyear(int year) {
		return year%100!=0 && year%4==0 || year%400==0 ? true : false;
	}
}
