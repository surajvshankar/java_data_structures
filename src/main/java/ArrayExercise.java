public class ArrayExercise {
  // Challenge 1

  protected void arrayToUpperCase(String[] array) {
    for(int i=0; i < array.length; i++) {
      array[i] = array[i].toUpperCase();
    }
  }

  protected void incrementArray(int[] array) {
    for(int i=0; i < array.length; i++) {
      array[i] = array[i] + 1;
    }
  }
}
