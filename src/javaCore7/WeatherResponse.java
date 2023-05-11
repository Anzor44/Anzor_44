package javaCore7;

import java.util.List;

public class WeatherResponse {   // ������ ����� �� ����� 5 ��������
    String cod;
    Integer message;
    Integer cnt;
    List<SituateWeather> list;
    City city;

    // ������������ � �������
    public WeatherResponse() {
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public Integer getMessage() {
        return message;
    }

    public void setMessage(Integer message) {
        this.message = message;
    }

    public Integer getCnt() {
        return cnt;
    }

    public void setCnt(Integer cnt) {
        this.cnt = cnt;
    }

    public List<SituateWeather> getList() {
        return list;
    }

    public void setList(List<SituateWeather> list) {
        this.list = list;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public boolean isEmpty(){
        if (this.city==null||this.list==null){
            return true;
        } else {
            return false;
        }
    }

    // �������������� � ������
    @Override
    public String toString() {
        if (isEmpty()) return "";
        String result = "����� ������� ������:\n" +
                "\t�����: " + city + ".\n\t������� ������ �� 5 ���� (����������� 3 ����):\n"+ list;
        return result.replace("[","").replace("]","");
    }
}
