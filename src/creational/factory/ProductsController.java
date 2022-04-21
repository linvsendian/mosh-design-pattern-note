package creational.factory;

import creational.factory.matcha.Controller;
import creational.factory.sharp.SharpController;

import java.util.HashMap;
import java.util.Map;

public class ProductsController extends SharpController { // extends Controller
    public void listProducts(){
        // get products
        Map<String, Object> context = new HashMap<>();
        render("products.html",context);
    }
}
