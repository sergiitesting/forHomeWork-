package lesson10.part3;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestImdbMovies {


    @Test(dataProvider = "moviesData")
    public void testFirst100Charts(String href, String name, String rating, String years) throws InterruptedException {
        Selenide.open(href);
        Selenide.$("h1 > span")
                .shouldBe(Condition.text(name))
                .shouldBe(Condition.visible);
        Selenide.$("div[data-testid='hero-rating-bar__aggregate-rating__score'] span:first-child")
                .shouldBe(Condition.text(rating))
                .shouldBe(Condition.visible);
        Selenide.$("h1 + ul li:first-child a")
                .shouldBe(Condition.text(years))
                .shouldBe(Condition.visible);
    }


    @DataProvider(name = "moviesData")
    public Iterator<Object[]> moviesData() {
        String urlTop = "https://www.imdb.com/chart/top/";
        List<String> names = getNameOfTheMovie(urlTop);
        List<String> rating = getRatingOfTheMovie(urlTop);
        List<String> years = getYearsOfTheMovie(urlTop); // Получаем данные о годах

        List<Object[]> combinedList = new ArrayList<>();

//        int limit = Math.min(Math.min(names.size(), rating.size()), years.size());

        List<String> hrefs = getHrefOfTheMovie(urlTop);

        for (int i = 0; i < 100; i++) {
            Object[] rowData = new Object[]{hrefs.get(i), names.get(i), rating.get(i), years.get(i)};
            combinedList.add(rowData);
        }

        return combinedList.iterator();
    }

    public List<String> getNameOfTheMovie(String imdbUrl) {
        List<String> names = new ArrayList<>();
        Selenide.open(imdbUrl);
        Selenide.$$("ul h3").forEach(text -> {
            String movieName = text.getText();
            String[] parts = movieName.split("\\.");
            if (parts.length > 1) {
                names.add(parts[1].trim());
            }
        });
        return names;
    }

    public List<String> getHrefOfTheMovie(String imdbUrl) {
        List<String> hrefs = new ArrayList<>();
        Selenide.open(imdbUrl);
        Selenide.$$("a:has(h3)").forEach(text -> hrefs.add(text.attr("href")));
        return hrefs;
    }

    public List<String> getRatingOfTheMovie(String imdbUrl) {
        List<String> ratings = new ArrayList<>();
        Selenide.open(imdbUrl);
        Selenide.$$("span[data-testid='ratingGroup--imdb-rating']").forEach(text -> {
            String ratingText = text.attr("aria-label");
            String[] parts = ratingText.split(":");
            if (parts.length > 1) {
                ratings.add(parts[1].trim());
            }
        });
        return ratings;
    }
    public List<String> getYearsOfTheMovie(String imdbUrl) {
        List<String> years = new ArrayList<>();
        Selenide.open(imdbUrl);
        Selenide.$$("div[class='sc-1e00898e-7 hcJWUf cli-title-metadata'] span:first-child").forEach(text -> years.add(text.getText()));
        return years;
    }
    // не зміг обійти запуск 4 рази браузеру на початку тесту((
}
