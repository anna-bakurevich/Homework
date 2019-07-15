package lesson9;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@Getter
public class IntegerDoubleT<T extends Number> {
private T a1;
private T a2;

    public int sumInt(){
        return a1.intValue()+a2.intValue();

    }
    public double sumDouble(){
        return a1.doubleValue()+a2.doubleValue();

    }

    public BigDecimal sumBigDecimal(){
        return new BigDecimal(a1.doubleValue()).add(new BigDecimal(a2.doubleValue()));
    }

    public int multiplyInt() {
        return a1.intValue()*a2.intValue() ;
    }

    public double multiplyDouble() {
        return a1.doubleValue()*a2.doubleValue();
    }

    public BigDecimal multiplyBigDecimal() {
        return new BigDecimal(a1.doubleValue()).multiply(new BigDecimal(a2.doubleValue()));
    }




}

