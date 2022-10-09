package com.company;

public class Main {

    public static void main(String[] args) {
        // 1, работа со строками (работать со строкой как с набором символов, уметь изменять код символа в строке)
        // любая строка массив char

        String t = "sdjgfjsdhgkjh";
        for (char c : t.toCharArray()) {
            System.out.println((int) c);
        }
        System.out.println(toUpperCase("asfsdDHfgfnmj,hj,+++&&!!!!"));
        ///////////////////
        double[] myList = {2.9, 2.8, 3.5, 4.8, 9.4};

        //выводим все элементы массива
        for (int i = 0; i < myList.length; i++) {
            System.out.println(myList[i]);
        }
        //или
        for (double element : myList) {
            System.out.println(element + ",");

        }
        // сумма элементов массива
        double total = 0;
        for (int i = 0; i < myList.length; i++) {
            total = total + myList[i];
        }
        System.out.println("Сумма всех чисел массива:" + total);

        //или
        double total1 = 0;
        for (double e : myList) {
            total1 = total1 + e;
        }
        System.out.println("Сумма всех чисел массива:" + total1);

        // находим наибольший элемент массива
        double max = myList[0];
        for (int i = 0; i < myList.length; i++) {
            if (myList[i] > max)
                max = myList[i];
        }
        System.out.println("Максимальный элемент - " + max);

        // количество элементов в массиве

        System.out.println("Количество элементов в массиве : " + myList.length);

        // находим наименьший элемент массива
        double min = myList[0];
        for (int i = 0; i < myList.length; i++) {
            if (myList[i] < min)
                min = myList[i];
        }
        System.out.println("Минимальный элемент - " + min);

        // Вывод четных элементов массива на экран.
        double[] myList1 = {2, 2.7, 3, 12, 23.8};

        System.out.print("Четные элементы массива myList: ");
        for (int i = 0; i < myList1.length; i++) {
            if(myList1[i] % 2 == 0){
                System.out.print(myList1[i] + ", ");
            }
        }
        System.out.println();
        // Вывод нечетных элементов массива на экран.
        System.out.print("Нечетные элементы массива myList: ");
        for (int i = 0; i < myList1.length; i++) {
            if(myList1[i] %2 != 0){
                System.out.print(myList1[i] + ", ");
            }
        }
        System.out.println();

        //элементы массива с четным индексом
        double[] myList2 = {2, 2.7, 3, 12, 23.8};
        for (int i = 0; i < myList2.length; i++) {
            if(i % 2 == 0) {
                System.out.print( "индекс " + i + "=" + myList2 [i] + ",");
            }
        }
        System.out.println();
        //элементы массива с нечетным индексом

        for (int i = 0; i < myList2.length; i++) {
            if(i % 2 != 0) {
                System.out.print( "индекс " + i + "=" + myList2 [i] + ",");
            }
        }

        // 2.дан массив любых целых чисел, особым образом его преобразовать, элементы менять местами
        // сортировка методом пузырька
        // Bubble sort
        // цикл в цикле
        int [] arr = {2,5,1,9,4,10,5,69,4};
        sort(arr);
        for (int e: arr) {
            System.out.println(e);
        }
    }

        ///////////////////
    public static String toUpperCase (String t){
        int offSet = 'a' - 'A';
        StringBuilder sb = new StringBuilder(t.length());
        for (char c:t.toCharArray()) {
            if (c >= 'a' && c <= 'z'){
                c -= offSet;
            }
            sb.append(c);
        }
        return sb.toString();

    }

    public static void sort (int [] toSort){
        for (int i = 0; i < toSort.length -1; i++) {
            for (int j = i + 1; j < toSort.length; j++) {
                if(toSort [i] > toSort [j]){
                    int tmp = toSort [i];
                    toSort [i] = toSort [j];
                    toSort [j] = tmp;
                }

            }

        }

    }
}
