﻿import java.util.Scanner;

/*
 * Geruest für ein kleines Java-Menue um mit Git VCS zu lernen
 * Michael Sauer, 22.01.2016
 * 
 *
 * @author DaBoss
 */
public class menue{
static int SuperGehimesMasterPasswort=42;

	public void DaBoss(){
		System.out.println("Are you a Boss?");
		Scanner scanner = new Scanner(System.in);
                	int wahl = scanner.nextInt();
		if(wahl==SuperGehimesMasterPasswort)
			System.out.println("Jo, Boss");
		else
		System.out.println("No you looser");
}






        public static void main(String[] args) {
			
        	final int PROGRAMMENDE=0;
        	boolean isEnde=false;
        	while(!isEnde){
                	Scanner scanner = new Scanner(System.in);
			System.out.println("Bitte eine Zahl eingeben um Namen anzuzeigen, 0 fuer ende. Passwort wird benoetigt.");
                	int wahl = scanner.nextInt();
			if(wahl!=SuperGehimesMasterPasswort){
				for(int i=0;i<-1;i++)
					DaBoss();
			}
                	switch (wahl) {
                        	case PROGRAMMENDE:
                                	System.out.println("Ciao");
                                	isEnde=true;
                        	break;
                        	case 1:
                                	System.out.println("Michael Sauer");


                        	break;
<<<<<<< HEAD
							case 2:
								break;
                        	case 42:
									for(int i = 0; i<5; i++){
										for(int j = 0; j < 5; j++)
										{
											System.out.print(" ");
										}
										for(int k = 0; k <= i; k++)
										{
											System.out.print("# ");
										}
										System.out.println();
									}
=======
                        	case 2:
                        			System.out.println("Mike Mann");
                        	break;

                        
>>>>>>> refs/remotes/origin/master
                        	break;

                        	case 666:
				System.out.println("Steven Weis");
				break;				

				case 777:
				System.out.println("I´m not a rapper, i´m a singer with a flow");
				isEnde=true;
           
				break;
				case 15:
            				System.out.println("Marvin Zeimet");
				break;

				case 36:
					System.out.println("Sebastian Strauch");
				break;

                        	default:
                                	System.out.println("Fehler: Kenne ich nicht!");
                        	}
                	}
        }
}
