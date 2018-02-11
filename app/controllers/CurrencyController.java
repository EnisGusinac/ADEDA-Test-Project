package controllers;

import models.Currency;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;
import repositories.CurrencyRepository;
import views.html.currencies.*;
import javax.inject.Inject;

/**
 *  CurrencyController
 */
public class CurrencyController extends Controller {
    @Inject
    FormFactory formFactory;

    // show all the currencies availables
    public Result index() {
        return ok(show.render(CurrencyRepository.allCurrencies()));
    }

    public Result show(String id) {
        if (id == null){
            return notFound("Currency not found");
        }
        return ok(showOneCurrency.render(CurrencyRepository.findById(id)));
    }

    public Result create() {
        Form<Currency> currencyForm = formFactory.form(Currency.class);
        return ok(create.render(currencyForm));
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
