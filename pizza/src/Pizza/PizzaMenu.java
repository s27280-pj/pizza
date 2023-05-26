package Pizza;

import java.util.Collections;

public class PizzaMenu {
    PizzaPepperoni pepperoniSmall = new PizzaPepperoni("Pepperoni", Collections.singletonList("sos, ser, papryka, salami"), 2,"mała",30);
    PizzaPepperoni pepperoniMedium = new PizzaPepperoni("Pepperoni", Collections.singletonList("sos, ser, papryka, salami"), 2,"średnia",35);
    PizzaPepperoni pepperoniBig = new PizzaPepperoni("Pepperoni", Collections.singletonList("sos, ser, papryka, salami"), 2,"duża",40);
    PizzaCapriciosa capriciosaSmall = new PizzaCapriciosa("Capriciosa", Collections.singletonList("sos, ser, szynka, pieczarki"), 1,"mała",28);
    PizzaCapriciosa capriciosaMedium = new PizzaCapriciosa("Capriciosa", Collections.singletonList("sos, ser, szynka, pieczarki"), 1,"średnia",33);
    PizzaCapriciosa capriciosaBig = new PizzaCapriciosa("Capriciosa", Collections.singletonList("sos, ser, szynka, pieczarki"), 1,"duża",38);
    PizzaVege vegeSmall = new PizzaVege("Vege", Collections.singletonList("sos, ser, szpinak, pomidor"), 0,"mała",25);
    PizzaVege vegeMedium = new PizzaVege("Vege", Collections.singletonList("sos, ser, szpinak, pomidor"), 0,"średnia",30);
    PizzaVege vegeBig = new PizzaVege("Vege", Collections.singletonList("sos, ser, szpinak, pomidor"), 0,"duża",35);

    @Override
    public String toString() {
        return "Menu:"+ pepperoniSmall + pepperoniMedium + pepperoniBig + capriciosaSmall + capriciosaMedium + capriciosaBig + vegeSmall + vegeMedium + vegeBig;
    }
}
