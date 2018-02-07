package controllers;

import models.Currency;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.currencies.*;

import java.util.Set;

/**
 *  CurrencyController
 */
public class CurrencyController extends Controller {

    // show all the currencies available
    public Result index() {
        Set<Currency> currencies = Currency.allCurrencies();
        return ok(index.render(currencies));
    }

    public Result show(String id) {
        return TODO;
    }

    public Result create() {
        return TODO;
    }

    public Result edit(String id) {
        return TODO;
    }

    public Result update(){
        return TODO;
    }

    public Result save() {
        return TODO;
    }

    public Result delete(String id) {
        return TODO;
    }
}
