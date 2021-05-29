# Stationery-Shop
A complete java code for stationery shop with use of concepts of method overloading and constructor overloading.

This program is for Stationery Shop. First It will Print the details of available books and supplies. Then it will ask customer to enter the names of books and supplies which he wants to buy. Then it will print the Bill.


**Constructor Overloading** \
Explaining Constructors along their purpose:

<pre>
Constructor: 	Stationery ( )	
Purpose:      	It is a constructor Without Parameter. It Simply prints the Welcome statement as it is initialized.
              	i.e. “Welcome to the Stationery Shop 
              	In which Corner do you want to go :  
                 -  Books 
                 - Supplies 
</pre>

<pre>
Constructor: 	Stationery ( String  Category ,  String [ ] Books , String [ ] Supplies )	
Purpose:      	It is constructor with Parameter. It takes three parameter and prints the 
		specific details according to category. Category may be Books or Supplies. 
</pre>
--------------------------------------------------------------------------- 

**Methods** \
Explaining Methods along their purpose: 

<pre>
Method: 	void BuyBooks ( int quantity )	
Type:     	void	
Purpose:  	Quantity = Number of items Customer want to Buy. Quantity will be passed as parameter. 
          	It will ask for Books name and store it in an array and their respective prices in price Array.
</pre>

<pre>
Method:   	void BuySupplies ( int quantity )	
Type:     	void	
Purpose:  	Quantity will be passed as parameter. It will ask for Supplies name and store it in an array 
		and their respective prices in price Array.
</pre>


**Method Overloading** 

<pre>
Method:   	void Buy ( String Choice , int quantity )	
Type:     	Void
Purpose:  	Choice = “books” or” supplies” 
          	Quantity = Number of items Customer want to Buy
          	This method will take two parameters and then it will call BuyBooks ( ) 
	       	or BuySupplies ( ) according to "Choice" that is Passed as parameter.
</pre>

<pre>
Method:   void Buy ( )	
Type:     Void	
Purpose:  This method is without parameters. It will print the list of things customer bought.
</pre>


<pre>
Method:   int Bill ( )	
Type:     Int 	
Purpose:  This is int Data Type Method without parameters. It will calculate the Total price and will return it.
</pre>

<pre>
Method:   String Bill ( String  [ ] ThingsToBuy , int [ ] priceArray )	
Type:     String	
Purpose:  This is String Data Type Method with parameters. It will take two arrays as parameter and will Print the BILL.
</pre>
