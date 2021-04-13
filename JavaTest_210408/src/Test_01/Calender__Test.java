package Test_01;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Calender__Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 2021_04_06 (화)
		// ◇ 과제_01 = 3개월 간 가로 달력 프로그램(메소드) 구현. 
		
		// 1. 사용자로부터 입력 받을 달력 연도와 월(달) 저장 변수.
				int SelYear, SelMonth;

		// 2. 사용자가 값을 입력 할 수 있도록 Scanner 객체 생성.
				Scanner sc = new Scanner(System.in);
				GregorianCalendar gc = new GregorianCalendar();

		// 3. 일주일(1일 ~ 7일)
				int weekInt[] = { 1, 2, 3, 4, 5, 6, 7 };

		// 4. 각 월별 마지막(종료) 날짜 배열 변수
				int monInt[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

				int week[] = new int[12];

				int[][][] month = new int[12][6][7];

		// 5. 사용자로부터 검색 하고자 하는 달력 연도 와 월<달> 을 입력 받아서 저장하기.
				System.out.print("◎ 검색하고자 하는 연도를 입력하여 주십시오 =  ");
				SelYear = sc.nextInt();

				System.out.print("◎ 검색하고자 하는 월/달을 입력하여 주십시오 =  ");
				SelMonth = sc.nextInt();

		// 6. 달력 윤년 구하기.
				if (SelYear % 4 == 0 && SelYear % 100 != 0 || SelYear % 400 == 0) {

					monInt[1] = 29;

				}

		// 1월
				gc.set(SelYear, Calendar.JANUARY, 1);

				week[0] = weekInt[gc.get(Calendar.DAY_OF_WEEK) - 1];

		// 2월
				gc.set(SelYear, Calendar.FEBRUARY, 1);

				week[1] = weekInt[gc.get(Calendar.DAY_OF_WEEK) - 1];

		// 3월
				gc.set(SelYear, Calendar.MARCH, 1);

				week[2] = weekInt[gc.get(Calendar.DAY_OF_WEEK) - 1];

		// 4월
				gc.set(SelYear, Calendar.APRIL, 1);

				week[3] = weekInt[gc.get(Calendar.DAY_OF_WEEK) - 1];

		// 5월
				gc.set(SelYear, Calendar.MAY, 1);

				week[4] = weekInt[gc.get(Calendar.DAY_OF_WEEK) - 1];

		// 6월
				gc.set(SelYear, Calendar.JUNE, 1);

				week[5] = weekInt[gc.get(Calendar.DAY_OF_WEEK) - 1];

		// 7월
				gc.set(SelYear, Calendar.JULY, 1);

				week[6] = weekInt[gc.get(Calendar.DAY_OF_WEEK) - 1];

		// 8월
				gc.set(SelYear, Calendar.AUGUST, 1);

				week[7] = weekInt[gc.get(Calendar.DAY_OF_WEEK) - 1];

		// 9월
				gc.set(SelYear, Calendar.SEPTEMBER, 1);

				week[8] = weekInt[gc.get(Calendar.DAY_OF_WEEK) - 1];

		// 10월
				gc.set(SelYear, Calendar.OCTOBER, 1);

				week[9] = weekInt[gc.get(Calendar.DAY_OF_WEEK) - 1];

		// 11월
				gc.set(SelYear, Calendar.NOVEMBER, 1);

				week[10] = weekInt[gc.get(Calendar.DAY_OF_WEEK) - 1];

		// 12월
				gc.set(SelYear, Calendar.DECEMBER, 1);

				week[11] = weekInt[gc.get(Calendar.DAY_OF_WEEK) - 1];
				  
				  int count = 1;

					// 월
					for (int plane = 0; plane < 12; plane++) {

						// 월의 행
						for (int row = 0; row < 6; row++) {

							// 월의 열
							for (int col = 0; col < 7; col++) {

								if (col + 1 < week[plane] && row == 0) {

									month[plane][row][col] = 0;

								} else {

									if (count - 1 < monInt[plane]) {

										// 배열에 날짜 입력 하기.
										month[plane][row][col] = count;

										count++;

									}

								}

								// 'count' 값이 매월 마지막날을 초과 or 6행 3열 경우 if문 탈출하기.
								if (count - 1 > monInt[plane] || (row == 5 && col == 2)) {

									count = 1;

									break;

								} // System.out.print(month[plane][row][col] + " ");

							}

						} // System.out.println("\n");

					}

		System.out.println("====================================<" + SelYear + "년" + ">====================================");		  
				  
		// 1월 달 입력 할 경우 => 1월 - 2월 - 3월 형식으로 출력.
		if(SelMonth == 1 || SelMonth == 2 || SelMonth == 3) {
			System.out.println("         1월                     2월                     3월        ");
			System.out.print("SU MO TU WE TH FR SA");
			System.out.print("\t SU MO TU WE TH FR SA");
			System.out.print("\t SU MO TU WE TH FR SA \n");
			
			for(int row=0 ; row<6 ; row++){						//행의 수 

				for(int plane=0 ; plane<3; plane++){			//면 = 월

					for(int col=0 ; col<7 ; col++){				//월의 열

						if(month[plane][row][col]==0){			//month배열에 0값이 있으면

								System.out.print("   ");		//블랭크로 출력

						}else{									//아니면

							if(month[plane][row][col]<10){

								System.out.print(" " + month[plane][row][col]+" ");

							}else{

								System.out.print(month[plane][row][col]+" ");

							}

						}

					}if(plane<2){System.out.print("\t");}else{System.out.print("\n");}
				}
			}
}


		// 4월 달 입력 할 경우 => 4월 - 5월 - 6월 형식으로 출력.
		if(SelMonth == 4 || SelMonth == 5 || SelMonth == 6) {
System.out.println("         4월                     5월                     6월        ");

System.out.print("SU MO TU WE TH FR SA");
System.out.print("\t SU MO TU WE TH FR SA");
System.out.print("\t SU MO TU WE TH FR SA \n");



for(int row=0 ; row<6 ; row++){						//행의 수 

	for(int plane=3 ; plane<6; plane++){			//면 = 월

		for(int col=0 ; col<7 ; col++){				//월의 열

			if(month[plane][row][col]==0){			//month배열에 0값이 있으면

					System.out.print("   ");		//블랭크로 출력

			}else{									//아니면

				if(month[plane][row][col]<10){

					System.out.print(" " + month[plane][row][col]+" ");

				}else{

					System.out.print(month[plane][row][col]+" ");

				}

			}

		}if(plane<5){System.out.print("\t");}else{System.out.print("\n");}

	}

}


}

		// 7월 달 입력 할 경우 => 7월 - 8월 - 9월 형식으로 출력.
if(SelMonth == 7 || SelMonth == 8 || SelMonth == 9) {
System.out.println("         7월                     8월                     9월        ");

System.out.print("SU MO TU WE TH FR SA");
System.out.print("\t SU MO TU WE TH FR SA");
System.out.print("\t SU MO TU WE TH FR SA \n");



for(int row=0 ; row<6 ; row++){						//행의 수 

	for(int plane=6 ; plane<9; plane++){			//면 = 월

		for(int col=0 ; col<7 ; col++){				//월의 열

			if(month[plane][row][col]==0){			//month배열에 0값이 있으면

					System.out.print("   ");		//블랭크로 출력

			}else{									//아니면

				if(month[plane][row][col]<10){

					System.out.print(" " + month[plane][row][col]+" ");

				}else{

					System.out.print(month[plane][row][col]+" ");

				}

			}

		}if(plane<8){System.out.print("\t");}else{System.out.print("\n");}

	}

}


}

// 10월 달 입력 할 경우 => 10월 - 11월 - 12월 형식으로 출력.
if(SelMonth == 10 || SelMonth == 11 || SelMonth == 12) {
System.out.println("        10월                    11월                    12월        ");

System.out.print("SU MO TU WE TH FR SA");
System.out.print("\t SU MO TU WE TH FR SA");
System.out.print("\t SU MO TU WE TH FR SA \n");



for(int row=0 ; row<6 ; row++){						//행의 수 

	for(int plane=9 ; plane<12; plane++){			//면 = 월

		for(int col=0 ; col<7 ; col++){				//월의 열

			if(month[plane][row][col]==0){			//month배열에 0값이 있으면

					System.out.print("   ");		//블랭크로 출력

			}else{									//아니면

				if(month[plane][row][col]<10){

					System.out.print(" " + month[plane][row][col]+" ");

				}else{

					System.out.print(month[plane][row][col]+" ");

				}

			}

		}if(plane<11){System.out.print("\t");}else{System.out.print("\n");}

	}

}

}

	  
System.out.println("================================================================================");		  
	
	}

}
