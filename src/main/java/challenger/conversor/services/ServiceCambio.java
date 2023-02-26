package challenger.conversor.services;

import challenger.conversor.model.Moeda;
import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.net.HttpURLConnection;
import java.net.URL;

public class ServiceCambio {
    private static final String URL_API = "https://v6.exchangerate-api.com/v6/cf36311a4edf6e681746d372/pair/";

    private static Moeda moeda;

    public static BigDecimal converter(String origem, String destino, BigDecimal valor) throws Exception {
        String urlParaChamada = URL_API + origem + "/" + destino + "/" + valor;


        URL url = new URL(urlParaChamada);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");

        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuilder content = new StringBuilder();
        while ((inputLine = in.readLine()) != null) {
            content.append(inputLine);
        }
        in.close();
        con.disconnect();

        Gson gson = new Gson();

        moeda = gson.fromJson(content.toString(), Moeda.class);

        return new BigDecimal(String.valueOf(moeda.getConversion_result())).setScale(2,RoundingMode.HALF_EVEN);
    }

    public static BigDecimal converterCambio(String orgiem, String destino, BigDecimal valor) {
        BigDecimal valor1;
        try {
            valor1 = converter(orgiem, destino, valor);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return valor1;
    }
}


