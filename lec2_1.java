/**
 * lec2_
 */

/*
 * Почему вы не можете не использовать API?
 *  в большинстве случаев под API понимается сторонний сервис и правила взаимодействия с ним
 * 
 * Что с точки зрения API предоставляет платформа JAVA
 * Это возможноти, которые предоставляют разработчики языка для удобного взаимод. с ним.
 * 
 * эффективность StringBuilder по сравнению с конкатенацией
 */
public class lec2_1 {

    public static void main(String[] args) {
        var s = System.currentTimeMillis();
        String str = "";
        // StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10_000; i++) {
            str += "+";
            // sb.append("+");
        }
        System.out.println(System.currentTimeMillis() - s); // 45 - StringBuiler(при 1млн), 82 - конкатенация(при 10 000)
    }

}