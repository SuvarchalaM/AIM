package starter.verifyaccount;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class AccountData {
    public static Question<String> currentProfileName() {
         return actor -> TextContent.of(AccountOverview.USER_INFO).viewedBy(actor).asString().trim();
    }
}
