package org.example.structural.facade;

import com.ibm.icu.util.LocaleData;
import java.util.List;

public class DemoApp {
    public static void main(String[] args) {
        TravelFacade travelFacade = new TravelFacade();
        List<TravelRoute> travelRoutes =
            travelFacade.getTravelRoutes(LocaleData.getInstance(),LocaleData.getInstance());

        if(!travelRoutes.isEmpty()){
            travelFacade.bookTravelRoute(travelRoutes.getFirst());
        }
    }
}
