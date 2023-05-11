package javaCore7;

import javaCore6.Weather;

import java.util.List;

// ���������� �����������������
public class SituateWeather {                 // �������� ��������

    /*
     * ����� � ��������� ����������������� ����, ������ ��� ��� ������� ������ ��� �� ����� ��������� �����������
     */
    Long dt;            // ��� ����
    Main main;
    List<Weather> weather;
    Clouds clouds;
    Wind wind;
    Integer visibility;
    Integer pop;
    Pod pod;
    String dt_txt;

    public SituateWeather() {
    }

    public Long getDt() {
        return dt;
    }

    public void setDt(Long dt) {
        this.dt = dt;
    }

    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }

    public Clouds getClouds() {
        return clouds;
    }

    public void setClouds(Clouds clouds) {
        this.clouds = clouds;
    }

    public Wind getWind() {
        return wind;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }

    public Integer getVisibility() {
        return visibility;
    }

    public void setVisibility(Integer visibility) {
        this.visibility = visibility;
    }

    public Integer getPop() {
        return pop;
    }

    public void setPop(Integer pop) {
        this.pop = pop;
    }

    public Pod getSys() {
        return pod;
    }

    public void setSys(Pod pod) {
        this.pod = pod;
    }

    public String getDt_txt() {
        return dt_txt;
    }

    public void setDt_txt(String dt_txt) {
        this.dt_txt = dt_txt;
    }

    public List<Weather> getWeather() {
        return weather;
    }

    public void setWeather(List<Weather> weather) {
        this.weather = weather;
    }

    @Override
    public String toString() {
        String result = "\n\t\t" + dt_txt +
                ": \t������� ����������� "+
                main.getTemp()+",\t ����� "+
                wind.getSpeed()+"�/�"+ ",\t ��������� - \""+
                weather+
                "\"";
        return result;
    }
}
