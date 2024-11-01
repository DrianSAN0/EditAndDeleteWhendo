package testSuite.whenDo;

import activities.wenDo.CreateTask;
import activities.wenDo.EditDelete;
import activities.wenDo.MainScreen;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



public class EditAndDelete extends  BaseWhenDo{
    MainScreen mainScreen = new MainScreen();
    CreateTask createTask = new CreateTask();
    EditDelete editAndDelete = new EditDelete();
    @Test
    public void createtask(){
      String  title  = "Cr7";
      String notas = "estoy cansado";
      String editar = "A POR EL 100";

      mainScreen.addButton.click();
      createTask.createTask(title,notas);
        Assertions.assertEquals(title,mainScreen.checkTittle(title),"Error");
        Assertions.assertEquals(notas,mainScreen.checkNotas(notas),"Error");
      mainScreen.boxLabel.click();
      editAndDelete.editTask(editar,editar);

        Assertions.assertEquals(editar,mainScreen.checkTittle(editar),"error");
        mainScreen.boxLabel.click();
        editAndDelete.deleteTask();
        String expectedResult = "No tasks added";
        Assertions.assertEquals(expectedResult,mainScreen.emptyTasksLabel.getText(),"error");

    }
}
