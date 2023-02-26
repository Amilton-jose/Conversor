package challenger.conversor.model;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Moeda {

    private BigDecimal conversion_result;


    public BigDecimal getConversion_result() {
        return conversion_result;
    }

    public BigDecimal toBigDecimal(String valor) {
        try {
            return new BigDecimal(valor).setScale(2, RoundingMode.HALF_EVEN);
        } catch (Exception e) {
            return BigDecimal.ZERO;
        }
    }
}
