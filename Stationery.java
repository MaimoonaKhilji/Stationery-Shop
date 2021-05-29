import java.util.Scanner ;
class Stationery
{
	Scanner take = new Scanner ( System.in ) ;



	/* 	Arrays are declared and initialized. Arrays " Books" and "Supplies" 
		consist of String Names of available books and Stationery Supplies 
		respectively. Arrays " Books_Price" and "Supplies_Price" consist of 
		prices of books and supplies respectively. 	*/

	String [ ] Books = {"Alchemist","Black Beauty","The Hobbit","Peter Rabit",
					"Twilight Saga","Middle March","Dracula" } ;
	int [ ] Books_Price = { 500,800,700,900,400,600,500 } ;

	String [ ] Supplies =	{ "Pencils","Pen","Sharpener","Eraser","Ruler",
					"Notebook","Pattern Paper" } ;
	int [ ]  Supplies_Price = { 50,100,20,30,10,80,20 } ;



	/*	Here 2 arrays are declared. Array " ThingsToBuy" will store the 
		elements the customer will going to buy. Array "priceArray" 
		will store the price of each element respectively. 		*/

	String [ ] ThingsToBuy ;
	int [ ] priceArray ;
	int Total ;			// Variable "Total " will store the total purchasing amount .



	/* 	Constructor Without Parameter		
		It Simply prints the following statement as it is initialized.	*/

	Stationery ( )
	{
		System.out.println ( "\t\t\t Welcome To Stationey Shop" ) ;
		System.out.println ( " In which Corner do you want to go :" ) ;
		System.out.println ( " -Books \n -Supplies \n" ) ;
	}



	/* 	Constructor With Parameter		
		It takes three parameter  and prints the specific details according to category 	*/

	Stationery ( String  Category , String [ ] Books , String [ ] Supplies )
	{
		if  ( Category.equals ( "Books" ) )
		{
			for  ( int i = 0 ; i < Books.length ; i++ )
			{
				System.out.println ( "\t\t\t" + ( i+1) +"     "+ Books [ i ] ) ;
			}
		}
		else
		{
			for ( int i = 0 ; i < Supplies.length ; i++ )
			{
				System.out.println ( "\t\t\t" + ( i+1) +"     "+ Supplies [ i ] ) ;
			}
		}
	}



	/* 	Method used for buying a book		*/

	void BuyBooks ( int quantity )
	{
		ThingsToBuy = new String [ quantity ] ;
		priceArray = new int [ quantity ] ;

		Scanner str = new Scanner ( System.in ) ;
		for ( int i = 0 ; i < quantity ; i++ )
		{
			System.out.print ( "Name of " + (i+1) +"  thing:  " ) ;
			ThingsToBuy [ i ]  = str.nextLine ( ) ;
		
			for  ( int  j = 0 ; j < Books.length ; j++ )
			{
				if  ( ThingsToBuy [ i ].equals ( Books [ j ] )  )
				{	
					priceArray [ i ] = Books_Price [ j ] ;
					
				}
			}
		}
	}


	/* 	Method used for buying a book		*/
	
	void BuySupplies ( int quantity )
	{
		ThingsToBuy = new String [ quantity ] ;
		priceArray = new int [ quantity ] ;

		Scanner str = new Scanner ( System.in ) ;
		for  ( int i = 0 ; i < quantity ; i++ )
		{
			System.out.print ( "Name of "+ (i+1) +"  thing:  " ) ;
			ThingsToBuy [ i ]  = str.nextLine ( ) ;
		
			for  ( int  j = 0 ; j < Supplies.length ; j++ )
			{
				if  ( ThingsToBuy [ i ].equals ( Supplies [ j ] ) )
				{	
					priceArray [ i ] = Supplies_Price [ j ] ;
					
				}
			}
		}
	}
	

	/* 	Method Overloading		*/
	
	/*	This method will take two parameters and then it will call BuyBooks ( ) 
		or BuySupplies ( ) according to "Choice" that is Passed as parameter. 	*/
	
	void Buy ( String Choice , int quantity )
	{
		if  ( Choice.equals ("Books") )
		{
			BuyBooks ( quantity ) ;
		}
		else
		{
			BuySupplies ( quantity ) ;
		}
	}


	/*	This method is without parameters. It will print the list of things customer bought. 	*/
	
	void Buy ( )
	{
		System.out.println ( "\n\t\t Names"+ " \t\t Price " ) ; 

		for  ( int i = 0 ; i < ThingsToBuy.length ; i++ )
		{
			System.out.println ( "\t\t"+ThingsToBuy [ i ] +"\t\t"+ priceArray [ i ] ) ; 
		}
	}

	/*	This is int Data Type Method without parameters. It will calculate the Total price and will return it. 	*/
	int Bill ( )
	{
		for  ( int i =  0 ; i < priceArray.length ; i++ )
		{
			Total  = Total + priceArray [ i ] ;
		}
		return Total ; 
	}


	/*	This is String Data Type Method with parameters. It will take two arrays as parameter and will Print the BILL. 	*/

	String Bill ( String  [ ] ThingsToBuy , int [ ] priceArray )
	{		
		System.out.println ( "\n\t\t\t	 BILL" ) ;	      
		System.out.println ( "\t\t .______________________________________.\n" ) ;
		System.out.println ( "\t\t "+String.format("|%10s\t\t|", "Names"  ) 
					+String.format("|%10s\t|","Price" ) ) ;
		System.out.println ( "\t\t |--------------------------------------|" ) ;

		for  (int i = 0 ; i < ThingsToBuy.length ; i++ )
		{
			System.out.println ( "\t\t "+String.format ( "|%10s\t\t|", ThingsToBuy [ i ]  )
       						 +String.format ( "|%10d\t|", priceArray [ i ] ) ) ; 
		}
		System.out.println ( "\t\t |--------------------------------------|" ) ; 
		System.out.println ( "\t\t "+String.format ( "|%10s\t\t|", "Total "  ) 
					+ String.format ( "|%10d\t|",Bill ( ) ) ) ;
		System.out.println ( "\t\t |______________________________________|" ) ; 

		String end = "Thanks for shopping." ;
		return end ;
	}
	public static void main ( String [ ] args )
	{
		Scanner input = new Scanner ( System.in ) ;
		Stationery S = new Stationery( ) ;

		System.out.print ( "Corner :    " ) ;
		String  Choice = input.nextLine ( ) ;
		Stationery S1 = new Stationery ( Choice, S.Books, S. Supplies ) ;
	 
		System.out.print ( "\nHow many things do u want to buy?  " ) ;
		int wish = input.nextInt ( ) ;
		S1.Buy ( Choice, wish ) ; 
		S1.Buy ( ) ;

		System.out.println ( "\nHere is Your Bill: " ) ;
		System.out.println ( S1.Bill ( S1.ThingsToBuy, S1.priceArray ) ) ;	
	}
}
