package controllers;

import models.Currency;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;
import repositories.CurrencyRepository;
import views.html.currencies.*;
import views.html.index;

import javax.inject.Inject;

/**
 *  CurrencyController
 */
public class CurrencyController extends Controller {
    @Inject
    FormFactory formFactory;

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
        Form<Currency> currencyForm = formFactory.form(Currency.class).bindFromRequest();
        Currency currency = currencyForm.get();
        CurrencyRepository.add(currency);
        return ok(index.render("New Currency created"));
    }

    public Result delete(String id) {
        return TODO;
    }
}
