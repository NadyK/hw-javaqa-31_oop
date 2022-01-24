package domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    // Установка текущей станции
    @Test
    void shouldRadio1() {
        Radio radio1 = new Radio();
        radio1.setCurrentStation(11);
        int expected = 0;
        int actual = radio1.getCurrentStation();
        assertEquals(expected, actual);
        System.out.println("станция " + radio1.getCurrentStation());
    }

    @Test
    void shouldRadio11() {
        Radio radio1 = new Radio();
        radio1.setCurrentStation(5);
        radio1.setCurrentStation(-1);
        int expected = 5;
        int actual = radio1.getCurrentStation();
        assertEquals(expected, actual);
        System.out.println("станция " + radio1.getCurrentStation());
    }

    //Увеличение Текущей станции
    @Test
    void setNext() {
        Radio radio2 = new Radio();
        radio2.setCurrentStation(9);
        radio2.setNext();
        int expected = 0;
        int actual = radio2.getCurrentStation();
        assertEquals(expected, actual);
        System.out.println("станция " + radio2.getCurrentStation());
    }

    @Test
    void setNext1() {
        Radio radio2 = new Radio();
        radio2.setCurrentStation(8);
        radio2.setNext();
        int expected = 9;
        int actual = radio2.getCurrentStation();
        assertEquals(expected, actual);
        System.out.println("станция " + radio2.getCurrentStation());
    }

    @Test
    void setNext11() {
        Radio radio2 = new Radio();
        radio2.setCurrentStation(9);
        radio2.setNext();
        int expected = 0;
        int actual = radio2.getCurrentStation();
        assertEquals(expected, actual);
        System.out.println("станция " + radio2.getCurrentStation());
    }

    @Test
    void setNext2() {
        Radio radio2 = new Radio();
        radio2.setCurrentStation(11);
        radio2.setNext();
        int expected = 1;
        int actual = radio2.getCurrentStation();
        assertEquals(expected, actual);
        System.out.println("станция " + radio2.getCurrentStation());
    }

    @Test
    void setNext3() {
        Radio radio2 = new Radio();
        radio2.setCurrentStation(-2);
        radio2.setNext();
        int expected = 1;
        int actual = radio2.getCurrentStation();
        assertEquals(expected, actual);
        System.out.println("станция " + radio2.getCurrentStation());
    }

    // Уменьшение текущей станции
    @Test
    void setPrev() {
        Radio radio3 = new Radio();
        radio3.setCurrentStation(0);
        radio3.setPrev();
        int expected = 9;
        int actual = radio3.getCurrentStation();
        assertEquals(expected, actual);
        System.out.println("станция " + radio3.getCurrentStation());
    }

    @Test
    void setPrev1() {
        Radio radio3 = new Radio();
        radio3.setCurrentStation(1);
        radio3.setPrev();
        int expected = 0;
        int actual = radio3.getCurrentStation();
        assertEquals(expected, actual);
        System.out.println("станция " + radio3.getCurrentStation());
    }

    // Увеличение уровня громкости
    @Test
    void increaseVolume() {
        Radio radio4 = new Radio();
        radio4.setCurrentVolume(10);
        radio4.increaseVolume();
        int expectedV = 10;
        int actualV = radio4.getCurrentVolume();
        assertEquals(expectedV, actualV);
        System.out.println("громкость " + radio4.getCurrentVolume());
    }

    @Test
    void increaseVolume1() {
        Radio radio4 = new Radio();
        radio4.setCurrentVolume(9);
        radio4.increaseVolume();
        int expectedV = 10;
        int actualV = radio4.getCurrentVolume();
        assertEquals(expectedV, actualV);
        System.out.println("громкость " + radio4.getCurrentVolume());
    }

    //Уменьшение уровня громкости
    @Test
    void decreaseVolume() {
        Radio radio5 = new Radio();
        radio5.setCurrentVolume(0);
        radio5.decreaseVolume();
        int expectedV = 0;
        int actualV = radio5.getCurrentVolume();
        assertEquals(expectedV, actualV);
        System.out.println("громкость " + radio5.getCurrentVolume());
    }

    @Test
    void decreaseVolume1() {
        Radio radio5 = new Radio();
        radio5.setCurrentVolume(1);
        radio5.decreaseVolume();
        int expectedV = 0;
        int actualV = radio5.getCurrentVolume();
        assertEquals(expectedV, actualV);
        System.out.println("громкость " + radio5.getCurrentVolume());
    }

}