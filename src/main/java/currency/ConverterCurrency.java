package currency;

import com.google.gson.Gson;

public class ConverterCurrency {
    static String apiKey = "bb877d9f92c71989de858e30"; // Replace with your actual API key

    static Gson gson = new Gson();

    // Dólar (USD) para Peso Argentino (ARS)
    public static double convertUSDtoARS(double valorUSD) {
        String jsonResponse = new RequestManager().getExchangeRate(apiKey, "USD", "ARS");
        return processResponse(valorUSD, jsonResponse);
    }

    // Peso Argentino (ARS) para Dólar (USD)
    public static double convertARStoUSD(double valorARS) {
        String jsonResponse = new RequestManager().getExchangeRate(apiKey, "ARS", "USD");
        return processResponse(valorARS, jsonResponse);
    }

    // Dólar (USD) para Real (BRL)
    public static double convertUSDtoBRL(double valorUSD) {
        String jsonResponse = new RequestManager().getExchangeRate(apiKey, "USD", "BRL");
        return processResponse(valorUSD, jsonResponse);
    }

    // Real (BRL) para Dólar (USD)
    public static double convertBRLtoUSD(double valorBRL) {
        String jsonResponse = new RequestManager().getExchangeRate(apiKey, "BRL", "USD");
        return processResponse(valorBRL, jsonResponse);
    }

    // Dólar (USD) para Peso Colombiano (COP)
    public static double convertUSDtoCOP(double valorUSD) {
        String jsonResponse = new RequestManager().getExchangeRate(apiKey, "USD", "COP");
        return processResponse(valorUSD, jsonResponse);
    }

    // Peso Colombiano (COP) para Dólar (USD)
    public static double convertCOPtoUSD(double valorCOP) {
        String jsonResponse = new RequestManager().getExchangeRate(apiKey, "COP", "USD");
        return processResponse(valorCOP, jsonResponse);
    }

    // Função auxiliar para processar a resposta da API
    private static double processResponse(double valor, String jsonResponse) {
        ExchangeRateData data = gson.fromJson(jsonResponse, ExchangeRateData.class);
        if (data.conversion_rate == null) {
            throw new RuntimeException("Erro ao obter a taxa de câmbio");
        }

        double taxaCambio = data.conversion_rate;
        return valor * taxaCambio;
    }
}

class ExchangeRateData {
    public Double conversion_rate;
}
