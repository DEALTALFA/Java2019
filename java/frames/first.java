// Java program to create a  
// frame using inheritance(). 
import javax.swing.*; 
  
// inheriting JFrame 
public class first 
{ 
    
     public static void main(String[] args) 
    { 
       JFrame frame=new JFrame(); 
	   
        frame.setTitle("this is also a title"); 
  
        // create button 
        JButton button = new JButton("click"); 
  
        button.setBounds(165, 135, 115, 55); 
          
        // adding button on frame 
        frame.add(button); 
 
        // setting close operation 
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
  
        frame.setSize(400,500); 
        frame.setLayout(null); 
        frame.setVisible(true); 
    } 
} 