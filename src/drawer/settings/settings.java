
package drawer.settings;


import raven.drawer.component.SimpleDrawerBuilder;
import raven.drawer.component.footer.SimpleFooterData;
import raven.drawer.component.header.SimpleHeaderData;
import raven.drawer.component.menu.MenuAction;
import raven.drawer.component.menu.MenuEvent;
import raven.drawer.component.menu.SimpleMenuOption;
import raven.drawer.component.menu.data.Item;
import raven.drawer.component.menu.data.MenuItem;
import raven.swing.AvatarIcon;

public class settings extends SimpleDrawerBuilder{

    @Override
    public SimpleHeaderData getSimpleHeaderData() {
        return new SimpleHeaderData()
                .setIcon(new AvatarIcon(getClass().getResource("/raven/image/Profile1.png"), 60, 60, 999))
                .setTitle("Jethro")
                .setDescription("demoncollar@gmail.com");
                
    }   

    
    @Override
    public SimpleMenuOption getSimpleMenuOption() {
           MenuItem menus[] = new MenuItem[]{
            new Item.Label("MAIN"),
            new Item("Dashboard", "dashboard.svg"),
            new Item.Label("WEB APP"),
            new Item("Email", "email.svg")
            .subMenu("Inbox")
            .subMenu("Read")
            .subMenu(
            new Item("Group Read")
            .subMenu("Read 1")
            .subMenu("Read 2")
            .subMenu(
            new Item("Group Item")
            .subMenu("Item 1")
            .subMenu("Item 2")
            .subMenu("Item 3")
            .subMenu("Item 4")
            .subMenu("Item 5")
            .subMenu("Item 6")
            )
            .subMenu("Read 3")
            .subMenu("Read 4")
            .subMenu("Read 5")
            )
            .subMenu("Compost"),
            new Item("Chat", "chat.svg"),
            new Item("Calendar", "calendar.svg"),
            new Item.Label("COMPONENT"),
            new Item("Advanced UI", "ui.svg")
            .subMenu("Cropper")
            .subMenu("Owl Carousel")
            .subMenu("Sweet Alert"),
            new Item("Forms", "forms.svg")
            .subMenu("Basic Elements")
            .subMenu("Advanced Elements")
            .subMenu("SEditors")
            .subMenu("Wizard"),
            new Item.Label("OTHER"),
            new Item("Charts", "chart.svg")
            .subMenu("Apex")
            .subMenu("Flot")
            .subMenu("Sparkline"),
            new Item("Icons", "icon.svg")
            .subMenu("Feather Icons")
            .subMenu("Flag Icons")
            .subMenu("Mdi Icons"),
            new Item("Special Pages", "page.svg")
            .subMenu("Blank page")
            .subMenu("Faq")
            .subMenu("Invoice")
            .subMenu("Profile")
            .subMenu("Pricing")
            .subMenu("Timeline"),
            new Item("Logout", "logout.svg")
           };
           
           
           

        return new SimpleMenuOption()
                .setMenus(menus)
                 .addMenuEvent(new MenuEvent() {
               public void selected(MenuAction action, int [] index ) {
                   System.out.println("Menu selected " + index );
                   if(index.length == 1){
                       System.out.println("Selected 1");
                   }
                   
               }
           });
    }

    @Override
    public SimpleFooterData getSimpleFooterData() {
        return new SimpleFooterData()
        .setTitle("Budget Tracker")
                .setDescription("Version 1.0");
    }
    
    
}
