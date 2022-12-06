import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Main {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();

        File dirSrc = new File("/Users/andreybelkin/Desktop/Games/src");
        if (dirSrc.mkdir()) {
            System.out.println("Каталог создан");
        } else {
            System.out.println("Неудачная попытка создания каталога");
        }


        File dirRes = new File("/Users/andreybelkin/Desktop/Games/res");
        if (dirRes.mkdir()) {
            System.out.println("Каталог создан");
        } else {
            System.out.println("Неудачная попытка создания каталога");
        }


        File dirSaveGames = new File("/Users/andreybelkin/Desktop/Games/savegames");
        if (dirSaveGames.mkdir()) {
            System.out.println("Каталог создан");
        } else {
            System.out.println("Неудачная попытка создания каталога");
        }

        File dirTmp = new File("/Users/andreybelkin/Desktop/Games/temp");
        if (dirTmp.mkdir()) {
            System.out.println("Каталог создан");
        } else {
            System.out.println("Неудачная попытка создания каталога");
        }

        File dirSrcMain = new File("/Users/andreybelkin/Desktop/Games/src/main");
        if (dirSrcMain.mkdir()) {
            System.out.println("Каталог создан");
        } else {
            System.out.println("Неудачная попытка создания каталога");
        }

        File dirSrcTest = new File("/Users/andreybelkin/Desktop/Games/src/test");
        if (dirSrcTest.mkdir()) {
            System.out.println("Каталог создан");
        } else {
            System.out.println("Неудачная попытка создания каталога");
        }

        File dirResDraw = new File("/Users/andreybelkin/Desktop/Games/res/drawables");
        if (dirResDraw.mkdir()) {
            System.out.println("Каталог создан");
        } else {
            System.out.println("Неудачная попытка создания каталога");
        }

        File dirResVector = new File("/Users/andreybelkin/Desktop/Games/res/vectors");
        if (dirResVector.mkdir()) {
            System.out.println("Каталог создан");
        } else {
            System.out.println("Неудачная попытка создания каталога");
        }

        File dirResIcons = new File("/Users/andreybelkin/Desktop/Games/res/icons");
        if (dirResIcons.mkdir()) {
            System.out.println("Каталог создан");
        } else {
            System.out.println("Неудачная попытка создания каталога");
        }

        File fileMain = new File("/Users/andreybelkin/Desktop/Games/src/main/Main.java");
        try {
            if (fileMain.createNewFile())
                System.out.println("Файл создан");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        File fileUtils = new File("/Users/andreybelkin/Desktop/Games/src/main/Utils.java");
        try {
            if (fileUtils.createNewFile())
                System.out.println("Файл создан");

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        File fileTemp = new File("/Users/andreybelkin/Desktop/Games/temp/temp.txt");
        try {
            if (fileTemp.createNewFile())
                System.out.println("Файл создан");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        sb.append("Создан файл или каталог " + dirSrc + "\n" +
                dirRes + "\n" + dirSaveGames + "\n" + dirTmp + "\n" +
                dirSrcMain + "\n" + dirSrcTest + "\n" + dirResDraw + "\n" +
                dirResVector + "\n" + dirResIcons + "\n" + fileMain + "\n" +
                fileUtils + "\n" + fileTemp + "\n");

        String text = sb.toString();
        try (FileOutputStream toFile = new FileOutputStream("/Users/andreybelkin/Desktop/Games/temp/temp.txt")) {
            byte[] bytes = text.getBytes(StandardCharsets.UTF_8);
            toFile.write(bytes, 0, bytes.length);
        } catch (IOException ex) {
            System.out.println("Что то пошло не так");
            System.out.println(ex.getMessage());
        }

    }
}
