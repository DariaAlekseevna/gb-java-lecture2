import java.io.File;

public class lec2_3 {
    public static void main(String[] args) {
        
        String pathProject = System.getProperty("user.dir"); // мой cd - директория, создаем путь до директории
        String pathFile = pathProject.concat("/file.txt"); // вводим имя файла, его может и не существовать и соединяем с путем
        File f3 = new File(pathFile); // преобразует строку пути в абстрактный путь
        System.out.println(f3.getAbsolutePath()); // печатаем в консоль путь файла относительно моего cd

        // System.out.println(pathFile); // печатаем путь
        File f1 = new File("file.txt"); // относительный путь
        File f2 = new File("C:\\Users\\HP\\Desktop\\даша\\geekbrains\\java_classes\\lectures\\lec2\\file.txt");
        System.out.println(f1.getAbsolutePath());
        System.out.println(f2.getAbsolutePath());
    }
}
