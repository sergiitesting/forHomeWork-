package lesson10;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byXpath;

public class TranslateStringV2 {
    String textAreTranslating = "Я круто вивчу TestNG";
    String urlWithText = "https://translate.google.com/?sl=auto&text="+ textAreTranslating +"&op=translate";

    @Test(dataProvider = "locales", threadPoolSize = 4)
    public void transeleteWihtParam(String locale, String expectedText){
        String newUrl = urlWithText + "&tl=" + locale;
        Selenide.open(newUrl);
        SelenideElement translationElement = Selenide.$(byXpath("//span[@lang='" + locale + "']"));
        translationElement
                .shouldBe(visible)
                .shouldHave(text(expectedText));
    }
    @DataProvider(name = "locales", parallel = true)
    public Object[][] locales(){
        return new Object[][]{
                {"es","Estudiaré testng genial"},
                {"ar","سأدرس testng بارد"},
                {"en","I will study TESTNG cool"},
                {"de","Ich werde testng cool studieren"},
                {"pt","Vou estudar testng legal"},
                {"it","Studierò Testng Cool"},
                {"ko","나는 테스트를 시원하게 공부할 것이다"},
                {"fr","J'étudierai le test."},
                {"ms","Saya akan belajar testng sejuk"},
                {"kk","Мен тестілеуді керемет түрде оқимын"},
                {"sr","Ја ћу проучити тестнг цоол"},
                {"la","Ego studere testng refrigescant"},
                {"fi","Opiskelen testiä viileänä"},
                {"tl","Mag -aaral ako ng testng cool"},
                {"ja","テストをクールに勉強します"},
                {"hu","Tanulni fogom a tesztng cool -ot"},
                {"is","Ég mun læra testng flott"},
                {"ne","म टेस्ट cholt चिसो अध्ययन गर्नेछु"},
                {"fa","من testng خنک را مطالعه خواهم کرد"},
                {"tk","Testnget-i gowy öwrenerin"}
        };
    }


}
