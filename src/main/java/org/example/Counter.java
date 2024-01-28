package org.example;

public class Counter implements AutoCloseable {
    private int count;
    public Counter() {
        count = 0;
    }
    public void add() {
        count++;
    }
    public int getCount() {
        return count;
    }
    @Override
    public void close() throws Exception {
        if (count == 0) {
            throw new Exception("Ошибка  работа с объектом\n" +
                    "типа счетчик была не в ресурсном try и/или ресурс остался открыт.");
        }
    }
}
