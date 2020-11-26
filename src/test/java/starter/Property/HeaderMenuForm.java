package starter.Property;

import net.serenitybdd.core.annotations.findby.By;

public class HeaderMenuForm {
    public static By raul_header = (By) By.id("raul-header-menu-button");
    public static By leftnav = (By) By.className("raul-left-navigation-item-display");
    public static By menuid = (By) By.id("Entity.Asset");
    public static By propertyname = (By) By.name("//a[text()='Asheville MOB']");
    public static By propertyprofile = (By) By.xpath("//*[@id=\"entity-menu\"]/div[1]");

}
