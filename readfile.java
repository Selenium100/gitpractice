import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

//This class is to read external text files
public class readfile {


    public static void main(String[] args) {

        File f=new File("./nitya.txt");
        BufferedReader br=new BufferedReader(new FileReader(f));
    
       String content;
        while((content=br.readLine)!=null){
         
            System.out.println(br);    //Priniting data
    
        }
    
        
    }


   
     
   




   
    
}

