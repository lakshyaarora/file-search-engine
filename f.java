import java.io.*;
import java.util.*;
/*class thread extends Thread
{
  String filename;
  File directory;
 thread(File dir, String s)
 {
  filename=s;
  directory=dir;

  }
void start()
{
 findfile( directory, filename);


}

public void findfile(File dir,String file)
{
//System.out.println("searching in directory : "+dir.getParent());

 File[] listfile=dir.listFiles();
if(listfile!=null)
{
 for(File ff:listfile)
 {
  
  if(file.equalsIgnoreCase(ff.getName()))
 {

  System.out.println("file found "+ff.getParent());
 }


 }
}


}


}*/
class filesearch extends Thread
{
 
public void start(File dir,String file)
{
 //System.out.println("new thread "+dir.toString());
 findfile(dir,file);

}


public void findfile(File dir,String file)
{
//System.out.println("searching in directory : "+dir.getParent());

 File[] listfile=dir.listFiles();
if(listfile!=null)
{
 for(File ff:listfile)
 {
  if(ff.isDirectory())
   {
     filesearch t=new filesearch();
     t.start(ff,file);
    //findfile(ff,file);

   }
 else if(file.equalsIgnoreCase(ff.getName()))
 {

  System.out.println("file found "+ff.getParent());
  try
  {Thread.sleep(2);}
 catch(Exception e)
   {  }
 }


 }
}

}



}
/*
class search
{

 public static void main(String args[])
{


Scanner scan=new Scanner(System.in);
System.out.println("file name");
String filename=scan.next();
System.out.println("directory");
String  directory=scan.next();
filesearch s=new filesearch();
s.findfile(new File(directory),filename);

//s.start();
}


}
*/
 