package com.patronus47;

/**
 * Created by Student on 27.05.2016.
 */
public class Main {
    public static void main(String[] args) {
//        for (int i = 1; i < 10; i++){
//            for (int j = 1; j < 10; j++){
//                System.out.print(j * i + "\t");
//            }
//            System.out.println(" ");


//        // Циклы - это конструкции, выполняющиеся ПОКА условие верно
//        int i = 0; // i, j, k; счетчик
//        while (i < 10) {
//            // код выполняется, пока условие верно
//            // итерация - один проход цикла
//            System.out.println("Hello" + i);
//            i = i + 1;
//        }
//        for (int j = 0; j < 10; j = j + 1) {
//            System.out.println("Hello for " + j);
//            //  у for всегда три параметра
//            // 1) инициализация счетчика
//            // 2) условие (также как у while)
//            // 3) операция, которая выполняется в конце КАЖДОЙ итерации
//            // Параметры 1 и 3 необязательны.
//            // for (; условие;) {}
//            // while и for взаимозаменяемы.
//
//            // Область видимости переменной. Переменная, объявленная внутри определенных фигурных скобок, будет
//            // доступна в этих фигурных скобках после ее объявления, а также во всех внутренних
//            // фигурных скобках
//            // Область видимости переменной - это часть кода, в которой можно обратиться к переменной
//            // В рамках while нельзя создать переменную, которая не повлияет на дальнейший код.
//            // while применяется в случаях, когда неизвестно, сколько итераций будет у кода
//        }
    // массивы
    // это структура данных, которая позволяет хранить много похожих по своему смыслу данных
        int[] intArray = new int[10];// это инициализация массива. У нас массив с 10 ячейками. 11 элемент вставить нельзя
        // это означает, что даже если ячейки не заполнены, они резервируются в оперативной памяти.
//        intArray[0] = 5456; // мы записали в ячейку определенное число. порядковый номер ячейки начинается с нуля
        // как быстро заполнить массив
        // можно с помощью цикла for
    for(int i = 0; i < intArray.length; i++) {
        intArray[i] = (int) (Math.random() * (-1243) - 1280);
            System.out.print(intArray[i] + " ");
        }

// - 1280 до -37
    // 0 1
        // массивы можно выводить только поэлементно. Соответственно, для того, чтобы вывести массив, это нужно делать
        // через цикл
        // массивы могут быть любых типов, необязательно цикл
        // массивы могут хранить только однотипные данные (только целые числа, только строки и т. д.)
        // у любого массива есть свойство intArray.length
//    int rand = (int) (Math.random() * 100); // math.random генерирует дробное число [0.0;1.0). Если хотим от нуля до 100
        // умножаем на 100
        // почему нужны скобки - потому что math.random не генерирует число больше 1
        // как сделать диапазон [-50.0;50). отнять от произведения 50 int rand = (int) (Math.random() * 100 - 50)
    }
}


