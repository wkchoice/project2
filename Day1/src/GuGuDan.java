
public class GuGuDan {
	public static void main(String[] args) {
		int i=0,j=0;
		for (i=2;i<10;i++) {
			for (j=1;j<10;j++) {
				//System.out.println(i+"X"+j+"="+i*j);
				System.out.printf("%d X %d = %2d\n", i,j, i+j);
			}
		}
	}
}
