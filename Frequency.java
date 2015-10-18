
import java.util.Arrays;
import java.util.Comparator;
public class Frequency
{
    
    
   
    

   /**
      Returns an array of the frequencies of each element in a.
      That is, if the returned array is f, then a[i] occurs f[i]
      times in a.
      @return the frequency array
      
      
   */
	
	
   public static int[] frequencyOfElements(int[] a)
   {
	   int tmp[][]=new int[a.length][2];
	   int frequency[]=new int[a.length];
	   
	   for(int i=0;i<a.length;i++){
		   tmp[i][0]=a[i];
		   tmp[i][1]=i;
	   }
	   Comparator c= new Comparator<int[]>() {
		    public int compare(int[] a, int[] b) {
		        return Integer.compare(a[0], b[0]);
		    }
	   };
	  

	   Arrays.sort(tmp, c);
	   
	   //System.out.println(Arrays.toString(tmp));
	   
	  
	   
	   int current, frequency1=0;
	   current=tmp[0][0];
	   for(int i=0;i<a.length;i++){
		   if(current==tmp[i][0])
			   frequency1++;
		   else{
			   
			   int back=i-1;
			   System.out.println(back);
			   while( back >=0){
				   if(tmp[back][0]!=current)
					   break;
				   frequency[tmp[back][1]]=frequency1;
				   back--;
			   }
			   current=tmp[i][0];
			   frequency1=1;
			   
		   }
		   
	   }
	   
	   int back=a.length-1;
	   while( back >=0){
		   if(tmp[back][0]!=current)
			   break;
		   frequency[tmp[back][1]]=frequency1;
		   back--;
	   }
	   
	   
	   
	   

	return frequency;
      
   }
   
 
}

