import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class lec2_4 {
    public static void main(String[] args) {
        String line = "empty";
        try {
            String pathProject = System.getProperty("user.dir");
            String pathFile = pathProject.concat("/file.txt");
            File file = new File(pathFile);

            if (file.createNewFile()) {
                // файл создан
                System.out.println("file.created");
                FileWriter fileWriter = new FileWriter(file, true);
                //запись в файл
                fileWriter.write("new line");
                fileWriter.append(System.lineSeparator());
                fileWriter.write("new line"); 
                fileWriter.append("new line");
                fileWriter.flush();
                fileWriter.close();
            }
            else {
                // файл существует
                System.out.println("file.existed");
                // чтение строки файла
                BufferedReader bufReader = new BufferedReader(new FileReader(file)); 
                line = bufReader.readLine();
                // вывод строки в консоль
                System.out.println(line);
                bufReader.close();
            }
        } catch (Exception e) {
            System.out.println("catch");
        } finally {
            
        System.out.println("finally");
        }
        
    }
}
