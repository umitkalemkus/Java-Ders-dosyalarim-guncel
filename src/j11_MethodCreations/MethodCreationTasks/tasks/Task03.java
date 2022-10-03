package j11_MethodCreations.MethodCreationTasks.tasks;

public class Task03 {

	public static void main(String[] args) {
		// Saati saniyeye, mil'i kilometreye, kilogrami gram'a 
		// ceviren bir method yaziniz.
		System.out.println(SaniyeHesaplama(2));
		System.out.println(GramHesaplama(3));
		System.out.println(kilometreHesaplama(7));


	}//main sonu

	private static int kilometreHesaplama(double mil) {

		double kg = mil * 1.6;

		return (int) kg;



	}

	private static int GramHesaplama(int kg) {

		int gr = kg * 1000;

		return gr;





	}

	private static int SaniyeHesaplama(int saat) {

		int dakika = saat * 60;
		int saniye= dakika * 60;

         return saniye;



	}









}

