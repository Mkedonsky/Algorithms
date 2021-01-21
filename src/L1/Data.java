package L1;

public class Data {
    String referential = " Это строка и есть ссылочная переменная";
    int primitive = 10;
    public static long runTime;
    public static int toEqual = 5;
    private static int field = 30;


    public Data(int field) {
        Data.field = field;
    }


    public int getField() {
        return field;
    }

    public static boolean isEqual(int... vars){
        runTime = System.nanoTime();
        for (int i : vars){
            if (i== toEqual)
                return true;
        }
        return false;
    }

    public static void main(String[]args){
        Data data = new Data(field);
        System.out.println("Примитивная переменная :" + data.primitive);
        System.out.println("Ссылочная переменная :"+ data.referential);
        System.out.println("Переменная своего класса: " + data.getField());
        System.out.println("Сравнение " + data.primitive +
                " и "+ toEqual + " = "+ isEqual(data.primitive)+
                "  время на расчет - "
                + (System.nanoTime()-runTime)/10000f + " секунд");
    }
}

