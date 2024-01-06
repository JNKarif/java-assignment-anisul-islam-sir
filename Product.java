 //Assignment 1:
// public class Product{
//     public static void main(String[] args){
//       
//         //System.out.println("id: 101, \rtitle: iphone15,  \tprice: 1895 euros, \rcategory: phone,");
       


//     }
// }

// Assignment 2:
// public class Product{
//     public static void main(String[] args){
//         // variable declaration:
//         int id;
//         String title;
//         String price;
//         String description;
//         String category;

//         // variable initialization:
//         id = 101;
//         title = "iphone15";
//         price = "1895 euros";
//         description = "perfect product with best image quality";
//         category = "phone";



//         //print the date:
//         System.out.println("id: "+id+",");
//         System.out.println("title: "+title+",");
//         System.out.println("price: "+price+",");
//         System.out.println("description: "+description+",");
//         System.out.println("category: "+category);

//     }
// }

//Assignment 3: 
import java.util.Scanner;


public class Product {
    public static void main(String[] args){
        int id;
        String title;
        int price;
        String description;
        String category;
        
        //product ID
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter your product id: ");
       
        id = userInput.nextInt();// nextInt for integers
         
        userInput.nextLine(); // it is a common practice to start new line taking string input
        
        //product Title
        System.out.println("Enter your product title: ");
        title = userInput.nextLine(); // next() or nextLine() for string
//        userInput.nextLine(); we dont need this when our next user input is integers or not strings
        
        
        //product price
        System.out.println("Enter your product price: ");
        price = userInput.nextInt();
        
        
        //product description 
        userInput.nextLine(); // we have to use this code because next input is string;
        System.out.println("Enter your product description: ");
        description = userInput.nextLine();
        
        
        //product category
//        userInput.nextLine(); this is not required here
        System.out.println("Enter your product category: ");
        category = userInput.nextLine();
        
        
        userInput.close(); // it is good practice to close the Scanner by close() method
        System.out.println(); // to make a vertical gap with user input and final output
        System.out.println();
        System.out.println();
        System.out.println("Product Details: ");
        System.out.println("Product id: "+id);
        System.out.println("Product name: "+title);
        System.out.println("("+title+") price: "+price);
        System.out.println("("+title+") description: "+description);
        System.out.println("("+title+") category: "+category);
        
        
        
    }
}