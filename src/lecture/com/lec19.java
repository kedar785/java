package lecture.com;
import java.io.*;
//file handling :-   crud(create read update delete)
public class lec19 {
    static    void   writeData(String data){
        try {
            FileWriter writer=new FileWriter("New.txt",true);
            writer.write(data);
            writer.close();

        } catch (Exception e) {
            System.out.println(e);
        }

    }
    static void FileRead(){
        try{
            FileReader reader = new FileReader ("new.tex");
            int ch;
            while((ch=reader.read())!=-1){
                System.out.println((char)ch);
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
    static void FileDelete(){
        try{
            File file=new File("new.txt");
            if(file.delete()){
                System.out.println("file delete");
            }else{
                System.out.println("noooo");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    static void  noteTaking(){
        try{
            File file =new File("new tex");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    // crud
    public static void main(String[] args) {
        writeData("hello old data  hiiiii");
        FileRead();
        FileDelete();



//        File file=new File("new.tex");
//        try{
//            if(file.createNewFile()){
//                System.out.println("file created: ");
//                System.out.println("file created"+file.getAbsoluteFile());
//            }
//            else{
//            System.out.println("file  already exist" );
//        }
//    }  catch(   Exception  e){
//            System.out.println(e);
//        }
 }
}
