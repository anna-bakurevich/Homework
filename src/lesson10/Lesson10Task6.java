package lesson10;
/*
Имеется текст. Следует составить для него частотный словарь.
 */

import java.util.*;

public class Lesson10Task6 {
    public static void main(String[] args) {
        String text = "Текст для определения частоты слов. Текст для определения частоты слов.";
        Map<String, Integer> wordsMap = new HashMap<>();

        //удаляем из текста все знаки пунктуации и формируем массив из отдельных слов (критерий разделения - пробел).
        String[] words = text.replaceAll("\\p{Punct}", "").split(" ");

        //Способ 1. При помощи алгоритмов Collections
        List<String> wordsList = new ArrayList<>(Arrays.asList(words));
        for (int i = 0; i < words.length; i++) {
            wordsMap.put(words[i], Collections.frequency(wordsList, words[i]));
        }
        System.out.println("Способ 1. Частотный словарь: " + wordsMap);

        //Способ 2. Последовательно сравниваем элементы отсортированного массива слов и подсчитываем кол-во одинаковых.
        Arrays.sort(words);
        int count = 1;
        for (int i = 0; i < words.length - 1; i++) {
            if (words[i].equals(words[i + 1])) {
                count++;
            } else {
                wordsMap.put(words[i], count);
                count = 1;
            }
        }
        //обрабатываем последнее слово
        if (words[words.length - 1].equals(words[words.length - 2])) {
            wordsMap.put(words[words.length - 2], count++);
        } else wordsMap.put(words[words.length - 1], 1);

        System.out.println("Способ 2. Частотный словарь: " + wordsMap);
    }
}

