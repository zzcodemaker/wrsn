package WRSN;
import java.lang.Math;
public class Sensor {

public	int position_x;
public  int position_y;
public  int cluster_id;  
    float rate;
    float energy;
  public Sensor()
    {
	   position_x=1+(int)(Math.random()*100);
	   position_y=1+(int)(Math.random()*100);
       System.out.println(position_x+":"+position_y);
	  // System.out.println(position_y); 
	 
	};
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     // Sensor s1=new Sensor();
      
      
	}

}