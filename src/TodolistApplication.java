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
