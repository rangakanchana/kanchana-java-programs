package com.main;

public class Stars {
	public static void main(String[] args) {
		/*int stars = 5;

		for(int i =1;i<=5;i++){
			System.out.println();
			for(int j=1;j<=stars;j++){
				System.out.print("*");
				}
			stars--;                                 //               *
		}*/                                          //             * *
		/*int spacecounter=4,starcounter=1;          //           * * *         
		for(int i =1;i<=5;i++){    //for no of rows  //         * * * *                        
			System.out.println();                   //        * * * * *
			for(int j =1;j<=spacecounter;j++){    //no of spaces
				System.out.print(" ");
			}
				for(int k=1;k<=starcounter;k++){   //no of stars
					System.out.print("*");
				}
			spacecounter--;
			starcounter++;
			}*/
		int spacecounter = 0,starcounter=5;    //   * * * * *
		                                         //   * * * *    
		for(int i=1;i<=5;i++){                    //    * * *     
			System.out.println();                  //     * *
			for(int j=1;j<=spacecounter;j++){        //     *
				System.out.print(" ");
			}
			for(int k=1;k<=starcounter;k++){
				System.out.print("*");
				}
			spacecounter++;
			starcounter--;
			
		}
		}
}
	
