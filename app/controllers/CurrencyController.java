package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import repositories.CurrencyRepository;
import views.html.currencies.*;

/**
 *  CurrencyController
 */
public class CurrencyController extends Controller {

    // showAll all the currencies availables
    public Result index() {
        return ok(showAll.render(CurrencyRepository.allCurrencies()));
    }

    public Result show(String id) {
        if (id == null){
            return notFound("Currency not found");
        }
        return ok(showOne.render(CurrencyRepository.findById(id)));
    }
}
