package creational.factory.sharp;

import creational.factory.matcha.Controller;
import creational.factory.matcha.ViewEngine;

public class SharpController extends Controller {
    @Override
    protected ViewEngine createViewEngine() {
        return new SharpViewEngine();
    }
}
