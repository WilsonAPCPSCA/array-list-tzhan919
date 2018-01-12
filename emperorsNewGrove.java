package emperorsNewGrove;
import java.util.ArrayList;
public class emperorsNewGrove {

	public static void main(String[] args) {
		ArrayList <String> emperorCast = new ArrayList <String>();
		emperorCast.add("Kuzco");
		emperorCast.add("Pacha");
		emperorCast.add("Yzma");
		emperorCast.add("Kronk");
		System.out.println(emperorCast);
		emperorCast.add(1,"Yzma");
		emperorCast.set(2, "Chaca");
		emperorCast.add(3, "Tipo");
		emperorCast.add("Bucky");
		emperorCast.add("Pacha");
		emperorCast.remove(4);	
		System.out.println(emperorCast);
		
		

	}

}
