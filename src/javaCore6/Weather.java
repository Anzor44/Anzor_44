package javaCore6;

import com.sun.net.httpserver.Request;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;

import java.io.IOException;


public class Weather {

    public static void main(String[] args) throws IOException{

        OkHttpClient client = new OkHttpClient();

        // Построение URL с помощью сайта Accuweather
        HttpUrl url = new HttpUrl.Builder()

                .scheme("http")
                .host("dataservice.accuweather.com")
                .addPathSegment("forecasts")
                .addPathSegment("v1")
                .addPathSegment("daily")
                .addPathSegment("5day")
                .addPathSegment("474212_PC")
                .addQueryParameter("apikey",("F3pMGTW8RFw2VynAhi0VNfMmn09WY2OR"))
                .addQueryParameter("language", "ru-ru")
                .addQueryParameter("metric", "true")
                .build();

        System.out.println(url.toString());

        Request requesthttp = new Request.Builder()
                .addHeader("accept", "application/json")
                .url(url)
                .build();

        String jsonResponse = client.newCall(requesthttp).execute().body().string();
        System.out.println(jsonResponse);
    }
}
