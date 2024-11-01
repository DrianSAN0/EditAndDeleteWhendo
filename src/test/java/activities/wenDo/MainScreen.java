package activities.wenDo;

import controls.AppiumControl;
import controls.Button;
import controls.Label;
import org.openqa.selenium.By;

public class MainScreen{
    public Button addButton = new Button(By.id("com.vrproductiveapps.whendo:id/fab"));

    public Label  boxLabel = new Label(By.xpath("//android.widget.ListView[@resource-id=\"com.vrproductiveapps.whendo:id/notesList\"]/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout"));
    public Label emptyTasksLabel = new Label(By.id("com.vrproductiveapps.whendo:id/noNotesText"));

    public String checkTittle(String tittle){
        return new Label(By.xpath("//android.widget.TextView[ @text='"+tittle+"']")).getText();
}

    public String checkNotas(String notas) {
        return new Label(By.id("com.vrproductiveapps.whendo:id/home_list_item_text2")).getText();

        }

}
