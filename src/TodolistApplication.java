import java.util.concurrent.StructureViolationException;

public class TodolistApplication {

  public static String[] model = new String[10];

  public static void main(String[] args) {
    testShowTodolist();
  }

  /**
   * Menampilkan todo list
   */
  public static void showTodoList() {
    for (int i = 0; i < model.length; i++) {
      String todo = model[i];
      int no = i + 1;

      if (todo != null) {
        System.out.println(no + ". " + todo);
      }
    }
  }

  public static void testShowTodolist() {
    model[0] = "Belajar Java Dasar";
    model[1] = "Studi Kasus Java Dasar : Aplikasi Todolist";
    showTodoList();
  }

  /**
   * Menambah todo ke list
   */
  public static void addTodoList(String todo) {
    //Mengecek apakah model isFull?
    var isFull = true;
    for (int i = 0; i < model.length; i++) {
      if (model[i] == null) {
        //model masih ada yang kosong
        isFull = false;
        break;
      }
    }

    //jika isFull, kita resize ukuran array 2x lipat
    if (isFull) {
      var temp = model;
      model = new String[model.length*2];

      for (int i = 0; i < temp.length; i++) {
        model[i] = temp[i];
      }
    }

    //tambahkan ke posisi yang data array nya NULL
    for (int i = 0; i < model.length; i++) {
      if (model[1] == null) {
        model[i] = todo;
        break;
      }
    }
  }

  /**
   * Menghapus todo dari list
   */
  public static void removeTodoList() {

  }

  /**
   * Menampilkan view todo list
   */
  public static void viewShowTodoList() {

  }

  /**
   * Menampilkan view menambahkan todo list
   */
  public static void viewAddTodoList() {

  }

  /**
   * Menampilkan view menghapus todo list
   */
  public static void viewRemoveTodoList() {

  }
}
