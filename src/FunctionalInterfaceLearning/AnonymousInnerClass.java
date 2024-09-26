package FunctionalInterfaceLearning;

public class AnonymousInnerClass {

	public static void main(String[] args) {

		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {

				for (int i = 0; i < 2; i++) {

					System.out.println("Child thread");
				}
			}
		});

		thread.start();
		for (int i = 0; i < 2; i++)

			System.out.println("main thread");

	}

}
