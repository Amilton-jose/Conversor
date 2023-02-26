package challenger.conversor.services;


public class ServiceConvertTemperature {

    public double ConvertCelsiusToFahrenheit(double valor) {
        return (valor * 1.8) + 32;
    }

    public double ConvertFahrenheitToCelsius(double valor) {
        return (valor - 32) / 1.8;
    }

    public double ConvertCelsiusToKelvin(double valor) {
        return valor + 273;
    }

    public double ConvertKelvinToCelsius(double valor) {
       return valor - 273;
    }

    public double ConvertFahrenheitTokelvin(double valor) {
        return (valor - 32) * 5 / 9 + 273;
    }

    public double ConvertKelvinToFahrenheit(double valor) {
        return (valor - 273) * 1.8 + 32;
    }
}
