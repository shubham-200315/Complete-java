public class arrayckrotation {

  public static int   checkRotation(int chkr[]) {

    for(int i=0; i<chkr.length; i++)
    {
      if(chkr[i]>chkr[i+1])
      {
       return i+1;
      }
    }
    return 0;
  }

  public static void main(String[] args) {
    int chkr[] = { 5, 6, 1, 2, 3, 4 };
    checkRotation(chkr);
  }
}
