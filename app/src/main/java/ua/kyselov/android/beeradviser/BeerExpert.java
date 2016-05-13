package ua.kyselov.android.beeradviser;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ivan on 5/13/2016.
 */
public class BeerExpert {
    List<String> getBrands(String color){
        List<String> brands = new ArrayList<>();
        if(color.equals("Amber")){
            brands.add("Jack Amber");
            brands.add("Red Moose");
        }
        else if(color.equals("Light")){
            brands.add("Svetloe");
            brands.add("Chernigivskoe");
        }
        else if(color.equals("Brown")){
            brands.add("Oksamytove");
            brands.add("Temne");
        }
        else {
            brands.add("Jale Pale Ale");
            brands.add("Gout Stout");
        }
        return brands;
    }
}
