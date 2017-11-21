package lis_lab3;


public class Stroka {

    public static void main(String[] args) {

        String str = "Java - строго типизированный объектно-ориентированный язык программирования, разработанный компанией Sun Microsystems в последующем приобретённой компанией Oracle";
        String strEqv = "Строка для сравнения";

        //1. Получить длину строки
        System.out.println(str.length());

        //2. Сравнить 2 строки без учета регистра
        System.out.println(str.equalsIgnoreCase(strEqv));

        //3. Создать новую строку с помощью конструктора и занести ее в пул литералов
        String strPul = "Создано конструктором";
        String strConstr = new String("Создано конструктором");
        strConstr = strConstr.intern();

        //4. Объединить 2 строки при которых новый объект будет создан
        String str1 = str;
        str1 = str1 + " ";
        str1 = str1 + strEqv;

        //5. Объединить 2 строки при которых новый объект НЕ будет созданы
        String str2 = str;
        str2 = str2.concat(" ");
        str2 = str2.concat(strEqv);

        //6. Получить из строки массив символов
        char[] strMas = str.toCharArray();

        //7. Получить из строки массив байтов
        byte[] strBMas = str.getBytes();


        //8. Привести строку к верхнему регистру
        System.out.println(str.toUpperCase());
             //str = str.toUpperCase();**********

        //System.out.println(str);

        //9. Найти первую позицию символа "а" в строке
        System.out.println(str.indexOf("a"));

        //10. Найти последнюю позицию символа "а" в строке
        System.out.println(str.lastIndexOf("a"));

        //11. Проверить содержит-ли строка слово "Sun"
        if (str.contains("Sun")){
            System.out.println("содержит");
        }
        else {
            System.out.println("не содержит");
        }

        //12. Проверить оканчивается-ли строка на "Oracle"
        System.out.println(str.endsWith("Oracle") ? "оканчивается" : "не оканчивается");

        //13. Проверить начинается-ли строка на "Java"
        System.out.println(str.startsWith("Java") ? "начинается" : " не начинается");

        //14. Заменить все символы "а" в строке на символ "о"
        System.out.println(str.replace("a","o"));

        //15. Получить подстроку с 44 символа по 90 символ
        System.out.println(str.substring(44,90));

        //16. Разбить строку по символу пробел (т.е. чтобы каждое слово было отдельным элементом массива)
        String[] strSplitSp = str.split(" ");
        for (String aa : strSplitSp){
            System.out.println(aa);
        }


        //17. Сделать с из строки str строку типа StringBuilder
        StringBuilder strBu1 = new StringBuilder(str);
        System.out.println(strBu1);

        //18. Добавить в конец строки StringBuilder символ точки
        strBu1.append(".");
        System.out.println(strBu1);

        //19. Удалить из строки StringBuilder подстроку ", разработанный компанией Sun Microsystems в последующем приобретённой компанией Oracle"
        strBu1.delete(strBu1.indexOf(","),strBu1.lastIndexOf("Oracle")+6);
                    //ИЛИ
        strBu1.delete(strBu1.indexOf(","),strBu1.length());

        System.out.println(strBu1);

        //20. Поменять последовательность символов в строке на обратную.
        strBu1.reverse();
        System.out.println(strBu1);
    }

}
