package starter.Property;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class PropertyName {

public static Question<String> ProfileName() {
    return Actor -> TextContent.of(PropertyInfo.User_Info).viewedBy(net.serenitybdd.screenplay.Actor.named("Asheville MOB")).asString().trim();
}
}
