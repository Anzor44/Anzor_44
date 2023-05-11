package javaCore7;

import java.io.IOException;
import java.util.Scanner;

public class WeatherViewer {

    public static void consoleView(WeatherResponse data){
        System.out.println(data);
    }

    public static void processCity() throws IOException {
        // ����������� ���� ������ ����� �� �������.
        while (true) {
            System.out.println("--= ������� ����� (��� ������ �� ��������� �������� 'exit') =--");
            Scanner sc = new Scanner(System.in);
            String city = sc.nextLine();
            if (city.equals("exit")) {
                break;
            } else {
                WeatherResponse weather = WeatherController.getWeatherFromCityV2(city);
                if (weather.isEmpty()) {
                    System.out.println("������ ������ ��� � OpenWeatherMap ��� ������ �� ���� �� ����� ���� �������������");
                } else {
                    consoleView(WeatherController.getWeatherFromCityV2(city));
                }
            }
        }
    }
}
